package com.example.fim_7wonderarchjavafx;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.fim_7wonderarchjavafx.WonderHash.isWonderAvailable;
import static com.example.fim_7wonderarchjavafx.WonderHash.wondersHash;

public class ChoosePlayerWonderController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if ( !isWonderAvailable.get("alexandrie")){
        alexandrieButton.setDisable(true);
        }
        if ( !isWonderAvailable.get("babylon")){
            babylonButton.setDisable(true);
        }
        if ( !isWonderAvailable.get("gizeh")) {
            System.out.println("j'y passe");
            cizehButton.setDisable(true);
        }
        if ( !isWonderAvailable.get("ephese")) {
            epheseButton.setDisable(true);
        }
        if (!isWonderAvailable.get("halicarnasse")) {
            halicarnasseButton.setDisable(true);
        }
        if (!isWonderAvailable.get("olympie")) {
            olympiaButton.setDisable(true);
        }
        if (!isWonderAvailable.get("rhodes")) {
            rhodesButton.setDisable(true);
        }

    }
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
        setChoosenWonder("alexandrie");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onBabylonClick(MouseEvent event) throws IOException {
        setChoosenWonder("babylon");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onCizehClick(MouseEvent event) throws IOException {
        setChoosenWonder("gizeh");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onEpheseClick(MouseEvent event) throws IOException {
        setChoosenWonder("ephese");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onHalicarnasseClick(MouseEvent event) throws IOException {
        setChoosenWonder("halicarnasse");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onOlympiaClick(MouseEvent event) throws IOException {
        setChoosenWonder("olympie");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onRhodesClick(MouseEvent event) throws IOException {
        setChoosenWonder("rhodes");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ConfigurePlayer.fxml")));
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
