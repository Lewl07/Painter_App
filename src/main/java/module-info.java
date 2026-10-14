module leo.painter_app {
    requires javafx.controls;
    requires javafx.fxml;

    opens leo.painter_app to javafx.fxml;
    exports leo.painter_app;
}
