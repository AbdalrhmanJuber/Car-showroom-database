package application;
import java.sql.*;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class mysqlconnect {

    @SuppressWarnings("exports")
	Connection conn = null;

	@SuppressWarnings("exports")
	public static Connection ConnectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AL_Motamad_Auto", "root", "11819810");
			System.out.println("Connected to database successfully.");
			return conn;
		} catch (Exception e) {
			System.out.println("Failed to connect to database: " + e);
			return null;
		}
	}
	

    
    public static ObservableList<employees> getDataEmployee() {
        ObservableList<employees> list = FXCollections.observableArrayList();
        Connection conn = ConnectDB(); // Get database connection
		if (conn == null) {
			System.out.println("Failed to connect to database.");
			return list;
		}
		
		try {
			// Prepare and execute the query
			String query = "SELECT * FROM employee";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			// Iterate through the result set and populate the ObservableList
			while (rs.next()) {
				list.add(new employees(rs.getInt("Eid"),
						rs.getInt("salary"), 
						rs.getString("name"),
						rs.getString("address")
				));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage());
		}
		return list;
  
    }
    
    public static ObservableList<employeePhones> getDataEmployeephone() {
        ObservableList<employeePhones> list = FXCollections.observableArrayList();
        Connection conn = ConnectDB(); // Get database connection
		if (conn == null) {
			JOptionPane.showMessageDialog(null, "Failed to connect to database.");
			return list;
		}
		
		try {
			// Prepare and execute the query
			String query = "SELECT * FROM Employeephone";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			// Iterate through the result set and populate the ObservableList
			while (rs.next()) {
				list.add(new employeePhones(rs.getInt("Eid"),
						rs.getString("phoneNumber")
				));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage());
		}
		return list;
  
    }
    
    public static ObservableList<Transaction> getDataTransaction() {
		ObservableList<Transaction> list = FXCollections.observableArrayList();
		Connection conn = ConnectDB(); // Get database connection
		if (conn == null) {
			JOptionPane.showMessageDialog(null, "Failed to connect to database.");
            return list;
        }
		
		try {
			// Prepare and execute the query
			String query = "SELECT * FROM transaction";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			// Iterate through the result set and populate the ObservableList
			while (rs.next()) {
				list.add(new Transaction(rs.getInt("Transaction_Id"), rs.getInt("emp_id"), rs.getInt("Car_Id"),
						rs.getInt("Customer_Id"), rs.getDate("Date").toLocalDate(), rs.getString("Pay_Type"),
						rs.getDouble("price"), rs.getDouble("Discount"), rs.getDouble("Paid_Amount")));
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage());
		}
		return list;
    }
    
    public static ObservableList<Transaction> getDataTransactionprice() {
        ObservableList<Transaction> list = FXCollections.observableArrayList();
        Connection conn = ConnectDB(); // Get database connection
        if (conn == null) {
            JOptionPane.showMessageDialog(null, "Failed to connect to database.");
            return list;
        }

        try {
            // Prepare and execute the query
            String query = "SELECT Transaction_Id, emp_id, Car_Id, Customer_Id, Date, Pay_Type, price, Discount, Paid_Amount, " +
                           "(price  - Discount) AS TotalPrice, " +
                           "((price  - Discount) - Paid_Amount) AS Remaining " +
                           "FROM transaction";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            // Iterate through the result set and populate the ObservableList
            while (rs.next()) {
                list.add(new Transaction(
                    rs.getInt("Transaction_Id"),
                    rs.getInt("emp_id"),
                    rs.getInt("Car_Id"),
                    rs.getInt("Customer_Id"),
                    rs.getDate("Date").toLocalDate(),
                    rs.getString("Pay_Type"),
                    rs.getDouble("price"),
                    rs.getDouble("Discount"),
                    rs.getDouble("Paid_Amount"),
                    rs.getDouble("TotalPrice"),
                    rs.getDouble("Remaining")
                ));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error retrieving data: " + e.getMessage());
        }
        return list;
    }
}
