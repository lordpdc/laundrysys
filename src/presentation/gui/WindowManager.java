package presentation.gui;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import javax.swing.*;
import java.io.IOException;

public class WindowManager {
    private JFrame inventory;

    public WindowManager() {
        setSystemProperties();
    }

    public void showInventory(){
        inventory = new JFrame("Inventario");

        final JFXPanel fxPanel = new JFXPanel();
        inventory.add(fxPanel);
        inventory.setSize(900, 640);
        inventory.setLocationRelativeTo(null);
        inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inventory.setVisible(true);

        Platform.runLater(new Runnable() {

            @Override
            public void run() {
                try {
                    inventory.setVisible(true);
                    FXMLLoader loader = new FXMLLoader();
                    Parent root = loader.load(getClass().getResource("../inventory/Inventory.fxml").openStream());
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    private void setSystemProperties(){
        // take the menu bar off the jframe
        System.setProperty("apple.laf.useScreenMenuBar", "true");

        // set the name of the application menu item
        System.setProperty("apple.awt.application.name", "Lavanderia");

        // set the look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

    }

}
