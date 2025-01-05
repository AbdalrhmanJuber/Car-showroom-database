package application;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DashboardController implements Initializable{

    @FXML
    private BorderPane Bpane;

    @FXML
    private Button CarButton;

    @FXML
    private Button CustomerButton;

    @FXML
    private Label Nocustomerslbl;

    @FXML
    private Label Noempslbl;

    @FXML
    private Label Noincomelbl;

    @FXML
    private Label Nosupplierslbl;

    @FXML
    private TableView<?> Outstock_tbv;

    @FXML
    private ComboBox<String> PMonthcbx;

    @FXML
    private ComboBox<String> PYearcbx;

    @FXML
    private TableColumn<?, ?> Prodid_col;

    @FXML
    private TableColumn<?, ?> Prodname_col;

    @FXML
    private CategoryAxis PurchaseXAxis;

    @FXML
    private LineChart<?, ?> Purchaselinechart;

    @FXML
    private TableColumn<?, ?> Remaining_col;

    @FXML
    private ComboBox<?> SMonthcbx;

    @FXML
    private ComboBox<?> SYearcbx;

    @FXML
    private CategoryAxis SalesXAxis;

    @FXML
    private TableView<?> Sales_tbv;

    @FXML
    private LineChart<?, ?> Saleslinechart;

    @FXML
    private StackPane Stack_pane;

    @FXML
    private TableColumn<?, ?> TodaysOrdertot_col;

    @FXML
    private TableColumn<?, ?> Todaysorderid_col;

    @FXML
    private Button TransactionButton;

    @FXML
    private TableColumn<?, ?> customerid_col;

    @FXML
    private Button employeesButton;

    @FXML
    private Button exitButton;

    @FXML
    private AnchorPane inside_Anch_left;

    @FXML
    private Button suppliersButton;

    @FXML
    private AnchorPane top_anch;

    @FXML
    private TableView<?> unpaid_tbv;

    @FXML
    private TableColumn<?, ?> unpaidid_col;

    @FXML
    private TableColumn<?, ?> unpaidprice_col;

    @FXML
    private Button warehousesButton;
    
    @FXML
    private Button dashBoardButton;

    @FXML
    void UpdatePchart(ActionEvent event) {

    }

    @FXML
    void UpdateSchart(ActionEvent event) {

    }

    @FXML
	void switchForm(ActionEvent event) throws IOException {
	    Map<Button, String> buttonToFXMLMap = new HashMap<>();
	    buttonToFXMLMap.put(dashBoardButton, "DashBoard.fxml");
	    buttonToFXMLMap.put(warehousesButton, "Warehouses.fxml");
	    buttonToFXMLMap.put(CustomerButton, "Customers.fxml");
	    buttonToFXMLMap.put(CarButton, "Cars.fxml");
	    buttonToFXMLMap.put(employeesButton, "Employees.fxml");
	    buttonToFXMLMap.put(TransactionButton, "Transaction.fxml");
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
    public void initialize (URL url, ResourceBundle rb){
    	PMonthcbx.setItems(FXCollections.observableArrayList("Product ID", "Product Name"));
    }

}
