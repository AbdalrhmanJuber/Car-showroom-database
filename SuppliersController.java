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
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class SuppliersController implements Initializable {

    @FXML
    private Button AddSupplierButton;

    @FXML
    private Button DeleteSupplierButton;

    @FXML
    private AnchorPane EmployeeWindow;

    @FXML
    private TableColumn<?, ?> SidColMain;

    @FXML
    private Button UpdateSupplierButton;

    @FXML
    private BorderPane ViewSupplierWindow;

    @FXML
    private ComboBox<String> attributeSelection;

    @FXML
    private Button carsButton;

    @FXML
    private Button clientButton;

    @FXML
    private Button dashBoardButton;

    @FXML
    private Button employeesButton;

    @FXML
    private Button exitButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button supplierClearAllButton;

    @FXML
    private TableColumn<?, ?> supplierCountryCol;

    @FXML
    private TableColumn<?, ?> supplierNameCol;

    @FXML
    private TableColumn<?, ?> supplierRateCol;

    @FXML
    private TextField supplierSearch;

    @FXML
    private TableColumn<?, ?> supplierrPhoneCol;

    @FXML
    private Button suppliersButton;

    @FXML
    private TableView<?> suppliersTable;

    @FXML
    private Button transactionButton;

    @FXML
    private TextField txt_enter_supplierCountry;

    @FXML
    private TextField txt_enter_supplierName;

    @FXML
    private TextField txt_enter_supplierPhone;

    @FXML
    private TextField txt_enter_supplierRate;

    @FXML
    private Button warehousesButton;

    @FXML
	void switchForm(ActionEvent event) throws IOException {
	    Map<Button, String> buttonToFXMLMap = new HashMap<>();
	    buttonToFXMLMap.put(dashBoardButton, "DashBoard.fxml");
	    buttonToFXMLMap.put(warehousesButton, "Warehouses.fxml");
	    buttonToFXMLMap.put(clientButton, "Customers.fxml");
	    buttonToFXMLMap.put(carsButton, "Cars.fxml");
	    buttonToFXMLMap.put(employeesButton, "Employees.fxml");
	    buttonToFXMLMap.put(transactionButton, "Transaction.fxml");
	    buttonToFXMLMap.put(suppliersButton, "Suppliers.fxml");
	    buttonToFXMLMap.put(exitButton, "Login.fxml");
	
	    Button sourceButton = (Button) event.getSource();
	    String fxmlFile = buttonToFXMLMap.get(sourceButton);
	
	    if (fxmlFile != null) {
	        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
	        Scene scene = new Scene(root);
	        Stage regStage = new Stage();
	        regStage.setScene(scene);
	        regStage.show();
	        sourceButton.getScene().getWindow().hide();
	    }
	}
    
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        attributeSelection.setItems(FXCollections.observableArrayList("supplierID",  "name", "phone number", "country", "rating"));

    }
}
