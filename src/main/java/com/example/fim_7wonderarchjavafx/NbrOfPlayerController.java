package com.example.fim_7wonderarchjavafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class NbrOfPlayerController {

    static public int nbrOfPlayers;

    @FXML
    public void on2PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 2;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void on3PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 3;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void on4PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 4;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void on5PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 5;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void on6PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 6;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void on7PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 7;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static int getNbrOfPlayers() {
        return nbrOfPlayers;
    }

    public static void minusNbrOfPlayers(int minus) {
        nbrOfPlayers -= minus;
    }

    private Stage stage;
    private Scene scene;
    private Parent root;
}
