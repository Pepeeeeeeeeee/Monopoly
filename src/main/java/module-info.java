module kdg.monopoly {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;
    requires java.desktop;
    requires annotations;
    requires java.sql;

    opens kdg.monopoly to javafx.fxml;
    exports kdg.monopoly;

    opens kdg.monopoly.controllers to javafx.fxml;
    exports kdg.monopoly.controllers;
    opens kdg.monopoly.models to javafx.fxml;
    exports kdg.monopoly.models;
    exports kdg.monopoly.managers;
    opens kdg.monopoly.managers to javafx.fxml;
}