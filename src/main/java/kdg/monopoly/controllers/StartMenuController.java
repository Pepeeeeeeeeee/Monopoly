package kdg.monopoly.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;

import java.net.URL;
import java.util.ResourceBundle;

public class StartMenuController implements Initializable {
    @FXML
    public AnchorPane main;
    @FXML
    private ImageView background;

    double sizeX;
    double sizeY;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        sizeX = screenBounds.getHeight();
        sizeY = screenBounds.getWidth();

        background.setFitWidth(sizeX);
        background.setFitHeight(sizeY);
    }
}
