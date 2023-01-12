package com.example.fim_7wonderarchjavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ChoosePlayerWonderController {

    public Label OrderLabel;

    public Button alexandrieButton;
    public Button babylonButton;
    public Button cizehButton;
    public Button epheseButton;
    public Button halicarnasseButton;
    public Button olympiaButton;
    public Button rhodesButton;


    private static String choosenWonder;

    public void onAlexandrieClick(MouseEvent event) throws IOException {
        setChoosenWonder("alexendrie");
        alexandrieButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onBabylonClick(MouseEvent event) throws IOException {
        setChoosenWonder("babylon");
        babylonButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onCizehClick(MouseEvent event) throws IOException {
        setChoosenWonder("cizeh");
        cizehButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onEpheseClick(MouseEvent event) throws IOException {
        setChoosenWonder("ephese");
        epheseButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onHalicarnasseClick(MouseEvent event) throws IOException {
        setChoosenWonder("halicarnasse");
        halicarnasseButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onOlympiaClick(MouseEvent event) throws IOException {
        setChoosenWonder("olympia");
        olympiaButton.setDisable(true);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onRhodesClick(MouseEvent event) throws IOException {
        setChoosenWonder("rhodes");

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


    public static String getChoosenWonder(){
        return choosenWonder;
    }

    public void setChoosenWonder(String wonder){
        choosenWonder = wonder;
    }

    private Stage stage;
    private Scene scene;
    private Parent root;
}
