package kdg.monopoly.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import kdg.monopoly.MainApplication;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Objects;


public class StartMenuController {
    @FXML
    public AnchorPane main;
    public Button buttonOpen;
    public Button buttonInfo;
    public Button buttonSettings;
    public Button buttonStats;
    public Button buttonStart;
    @FXML
    private ImageView background;

    private Stage stage;
    private Scene scene;
    private Parent root;
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

    public void endGame(){
        stage = (Stage) main.getScene().getWindow();
        stage.close();
    }

    public void startGame() throws IOException, NullPointerException {
        try{
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("game.fxml"));
        root = fxmlLoader.load();
        stage = (Stage) buttonStart.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        catch(NullPointerException e){
            System.err.println(e.getMessage());
        }
    }
    //TODO: Change all functions bellow according to startGame()
    public void rules(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rulesScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void settings(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("settingsScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void info(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("infoScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void stats(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("statsScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void account(ActionEvent e) throws IOException {
        root = FXMLLoader.load(getClass().getResource("accountScene.fxml"));
        stage = (Stage)((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
