module com.example.fim_7wonderarchjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.example.fim_7wonderarchjavafx to javafx.fxml;
    exports com.example.fim_7wonderarchjavafx;
}