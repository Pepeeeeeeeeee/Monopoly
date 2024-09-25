module kdg.monopoly {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.ikonli.javafx;
    requires com.almasb.fxgl.all;

    opens kdg.monopoly to javafx.fxml;
    exports kdg.monopoly;
}