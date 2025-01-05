package application;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CustomersController implements Initializable {

    @FXML
    private Button AddcustomerButton;

    @FXML
    private TableColumn<?, ?> CidColMain;

    @FXML
    private Button CustomerClearAllButton;

    @FXML
    private Button DeleteCustomerButton;

    @FXML
    private AnchorPane EmployeeWindow;

    @FXML
    private Button UpdateCustomerButton;

    @FXML
    private BorderPane ViewSupplierWindow;

    @FXML
    private ComboBox<String> attributeSelection;

    @FXML
    private Button carsButton;

    @FXML
    private Button clientButton;

    @FXML
    private TableColumn<?, ?> customerAddressCol;

    @FXML
    private TableColumn<?, ?> customerAgeCol;

    @FXML
    private TableColumn<?, ?> customerLidCol;

    @FXML
    private TableColumn<?, ?> customerNameCol;

    @FXML
    private TextField customerSearch;

    @FXML
    private TableView<?> customersTable;

    @FXML
    private Button dashBoardButton;

    @FXML
    private Button employeesButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button suppliersButton;

    @FXML
    private Button transactionButton;

    @FXML
    private TextField txt_enter_customerAge;

    @FXML
    private TextField txt_enter_customerLID;

    @FXML
    private TextField txt_enter_customerName;

    @FXML
    private TextField txt_enter_customerPhone;

    @FXML
    private Button warehousesButton;

    @FXML
    void switchForm(ActionEvent event) throws IOException {
    	
    	 if (event.getSource()==dashBoardButton) {
    	 		
  			Parent root = FXMLLoader.load(getClass().getResource("DashBoard.fxml"));
  			Scene scene = new Scene(root);
  			Stage regStage = new Stage();
  
  			regStage.setScene(scene);
  			regStage.show();
  
  			dashBoardButton.getScene().getWindow().hide();
  			
  		}
     	 
     	 else if (event.getSource()==warehousesButton) {
     		 
     		 Parent root = FXMLLoader.load(getClass().getResource("Warehouses.fxml"));
   			Scene scene = new Scene(root);
   			Stage regStage = new Stage();
   
   			regStage.setScene(scene);
   			regStage.show();
   
   			warehousesButton.getScene().getWindow().hide();
     		 
     	 }
    	 
     	 else if (event.getSource()==clientButton) {
     		 
     		 Parent root = FXMLLoader.load(getClass().getResource("Customers.fxml"));
   			Scene scene = new Scene(root);
   			Stage regStage = new Stage();
   
   			regStage.setScene(scene);
   			regStage.show();
   
   			clientButton.getScene().getWindow().hide();
     		 
     	 }
    	 
    	 
     	 else if (event.getSource()==carsButton) {
     		 
     		 Parent root = FXMLLoader.load(getClass().getResource("Cars.fxml"));
   			Scene scene = new Scene(root);
   			Stage regStage = new Stage();
   
   			regStage.setScene(scene);
   			regStage.show();
   
   			carsButton.getScene().getWindow().hide();
     		 
     	 }
    	 else if (event.getSource()==employeesButton) {

				Parent root = FXMLLoader.load(getClass().getResource("Employees.fxml"));
				Scene scene = new Scene(root);
				Stage regStage = new Stage();
				
				regStage.setScene(scene);
				regStage.show();
				
				employeesButton.getScene().getWindow().hide();
    	 }
    	 
    	 
    	 
     	 else if (event.getSource()==transactionButton) {
     		 
     		 Parent root = FXMLLoader.load(getClass().getResource("Transaction.fxml"));
   			Scene scene = new Scene(root);
   			Stage regStage = new Stage();
   
   			regStage.setScene(scene);
   			regStage.show();
   
   			transactionButton.getScene().getWindow().hide();
     		 
     	 }
    	 

     	 else if (event.getSource()==suppliersButton) {
     		 
     		 Parent root = FXMLLoader.load(getClass().getResource("Suppliers.fxml"));
   			Scene scene = new Scene(root);
   			Stage regStage = new Stage();
   
   			regStage.setScene(scene);
   			regStage.show();
   
   			suppliersButton.getScene().getWindow().hide();
     		 
     	 }
     	else if (event.getSource()==exitButton) {
    		 
    		 Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
  			Scene scene = new Scene(root);
  			Stage regStage = new Stage();
  
  			regStage.setScene(scene);
  			regStage.show();
  			exitButton.getScene().getWindow().hide();
    		 
    	 }



    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        attributeSelection.setItems(FXCollections.observableArrayList("customerID",  "name", "address","age", "licence id"));


    }
}
