package kdg.monopoly;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class HelloController {
    @FXML
    public AnchorPane main;
    public Button buttonOpen;
    public Button buttonInfo;
    public Button buttonSettings;
    public Button buttonStats;
    @FXML
    private ImageView background;

    private boolean hidden = true;

    public void test(Stage stage) {
        stage.widthProperty().addListener((obs, oldVal, newVal) -> {
            background.setFitWidth(stage.getWidth());
            System.out.println(stage.getWidth());
        });

        stage.heightProperty().addListener((obs, oldVal, newVal) -> {
            background.setFitHeight(stage.getHeight());
            System.out.println(stage.getHeight());
        });
//        Runnable helloRunnable = new Runnable() {
//            public void run() {
//                sizeX = stage.getWidth();
//                sizeY = stage.getHeight();
//
//                System.out.println(sizeX + " " + sizeY);
//
//                background.setFitWidth(sizeX);
//                background.setFitHeight(sizeY);
//            }
//        };
//
//        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
//        executor.scheduleAtFixedRate(helloRunnable, 0, 500, TimeUnit.MILLISECONDS);
    }

    public void show(){
        if(hidden){
            buttonInfo.setVisible(true);
            buttonSettings.setVisible(true);
            buttonStats.setVisible(true);
            hidden = false;
        }
        else{
            buttonInfo.setVisible(false);
            buttonSettings.setVisible(false);
            buttonStats.setVisible(false);
            hidden = true;
        }
    }

    public void startGame(){

    }

    public void endGame(){

    }

    public void rules(){

    }

    public void settings(){

    }

    public void info(){

    }

    public void stats(){

    }
    public void account(){

    }
}
