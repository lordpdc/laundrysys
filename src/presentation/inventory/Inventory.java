package presentation.inventory;

import business.entities.Provider;
import data.dao.ProviderDao;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.*;

/**
 * Created by cesar on 01/10/16.
 */
public class Inventory implements Initializable{
    private ProviderDao dao;
    private JFrame registerProvider;
    private ObservableList<Provider> data;

    @FXML private TextField providerSearchField;
    @FXML private Button registerButton;
    @FXML private TableView<Provider> providersTable;
    @FXML private TableColumn providerId;
    @FXML private TableColumn providerName;
    @FXML private TableColumn providerPhone;
    @FXML private TableColumn providerAddress;
    @FXML private TableColumn providerEmail;

    private RegisterProvider saveDiag;

    public Inventory(){
        System.out.println(this.toString());
        dao = new ProviderDao();
        data = FXCollections.observableArrayList(dao.readAll());

    }

    public void updateObsList(Provider p){
        data.add(p);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        providerId.setCellValueFactory(new PropertyValueFactory<Provider,String>("id"));
        providerName.setCellValueFactory(new PropertyValueFactory<Provider,String>("name"));
        providerAddress.setCellValueFactory(new PropertyValueFactory<Provider,String>("address"));
        providerPhone.setCellValueFactory(new PropertyValueFactory<Provider,String>("phoneNumber"));
        providerEmail.setCellValueFactory(new PropertyValueFactory<Provider,String>("email"));

        providersTable.setItems(data);

        assert providerSearchField != null : "fx:id=\"provider_search_field\" was not injected: check your FXML file 'simple.fxml'.";
        assert registerButton !=null : "registerButton was not injected :( sad face panda";

        providerSearchField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(event.toString());
            }
        });

        Inventory mua = this;
        registerButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (registerProvider==null){
                    registerProvider = new JFrame("Registrar Proveedor");
                    JFXPanel jfxPanel = new JFXPanel();
                    registerProvider.add(jfxPanel);
                    registerProvider.setSize(520,300);
                    registerProvider.setLocationRelativeTo(null);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                registerProvider.setVisible(true);
                                FXMLLoader leLoder = new FXMLLoader();
                                Parent root = leLoder.load(getClass().getResource("RegisterProvider.fxml").openStream());
                                Scene scene = new Scene(root, 600, 400);
                                jfxPanel.setScene(scene);
                                RegisterProvider actrl = leLoder.getController();
                                actrl.setFrame(registerProvider);
                                actrl.setMainCtrl(mua);
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                }else{
                    registerProvider.setVisible(true);
                }
            }
        });

    }

}
