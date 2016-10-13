package presentation.gui;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class WindowManager {
    private JFrame inventory;

    public WindowManager(){

    }

    public void showInventory(){

        inventory = new JFrame("Inventario");

        final JFXPanel fxPanel = new JFXPanel();
        inventory.add(fxPanel);
        inventory.setSize(900, 640);
        inventory.setLocationRelativeTo(null);
        inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                try {
                    inventory.setVisible(true);
                    FXMLLoader loader = new FXMLLoader();
                    Parent root = loader.load(getClass().getResource("../inventory/Inventory.fxml").openStream());
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);
                    //mainCtrl = loader.getController();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });

    }

}
