module kdg.monopoly {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires annotations;

    opens kdg.monopoly to javafx.fxml;
    exports kdg.monopoly;

    opens kdg.monopoly.controllers to javafx.fxml;
    exports kdg.monopoly.controllers;
    exports kdg.monopoly.models;
    exports kdg.monopoly.classes;
}