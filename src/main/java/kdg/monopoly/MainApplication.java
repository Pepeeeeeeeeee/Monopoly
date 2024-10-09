package kdg.monopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws NullPointerException, IOException {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());

            HelloController controller = fxmlLoader.getController();
            controller.test(stage);

            File f = new File("src\\main\\resources\\kdg\\monopoly\\style\\game.css");
            scene.getStylesheets().clear();
            scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));

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