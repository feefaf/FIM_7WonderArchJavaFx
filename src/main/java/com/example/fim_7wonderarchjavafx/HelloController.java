package com.example.fim_7wonderarchjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public void onPlayClicked(MouseEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/NbrOfPlayer-View.fxml")));
        stage =(Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onQuitClicked(MouseEvent event) {
        //je sais toujours pas faire ça, cliquez juste sur la croix rouge
    }

    private Stage stage;
    private Scene scene;
    private Parent root;
}