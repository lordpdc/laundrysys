package presentation.inventory;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.*;
import java.io.IOException;

public class InventoryMain {
    private InventoryMainCtrl mainCtrl;

    public InventoryMain() {
        JFrame frame = new JFrame("Inventario");
        final JFXPanel fxPanel = new JFXPanel();
        frame.add(fxPanel);
        frame.setSize(900, 640);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    frame.setVisible(true);
                    FXMLLoader loader = new FXMLLoader();
                    Parent root = loader.load(getClass().getResource("InventoryMain.fxml").openStream());
                    Scene scene = new Scene(root);
                    fxPanel.setScene(scene);
                    mainCtrl = loader.getController();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        new InventoryMain();
    }

}
