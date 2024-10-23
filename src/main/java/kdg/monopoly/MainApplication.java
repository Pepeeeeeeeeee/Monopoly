package kdg.monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;
import java.io.IOException;
import kdg.monopoly.controllers.StartMenuController;
import kdg.monopoly.managers.DatabaseManager;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws NullPointerException, IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("menu.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            StartMenuController controller = fxmlLoader.getController();
            controller.test(stage);

            File f = new File("src\\main\\resources\\kdg\\monopoly\\style\\game.css");
            scene.getStylesheets().clear();
            scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));

            DatabaseManager databaseManager = new DatabaseManager();
            databaseManager.test();

            stage.setTitle("Monopoly");
            stage.setScene(scene);
            stage.getWidth();
            stage.show();
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}