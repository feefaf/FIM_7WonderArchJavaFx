package com.example.fim_7wonderarchjavafx;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.fim_7wonderarchjavafx.ChoosePlayerWonderController.getChoosenWonder;
import static com.example.fim_7wonderarchjavafx.NbrOfPlayerController.getNbrOfPlayers;
import static com.example.fim_7wonderarchjavafx.NbrOfPlayerController.minusNbrOfPlayers;


//je dois importer l'array de player
public class ConfigurePlayerController implements Initializable {


    public ImageView wonderImageSlot;
    public TextField SelectedName;
    public Spinner selectedAge;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            HashMap<String, String> WonderDeckImageUrl = new HashMap<>();

            WonderDeckImageUrl.put("alexandrie", "images/decks/deck-alexandrie.png");
            WonderDeckImageUrl.put("babylon", "images/decks/deck-babylon.png");
            WonderDeckImageUrl.put("cizeh", "images/decks/deck-cizeh.png");
            WonderDeckImageUrl.put("ephese", "images/decks/deck-ephese.png");
            WonderDeckImageUrl.put("halicarnasse", "images/decks/deck-halicarnasse.png");
            WonderDeckImageUrl.put("olympie", "images/decks/deck-olympie.png");
            WonderDeckImageUrl.put("rhodes", "images/decks/deck-rhodes.png");

            wonderImageSlot.setImage(chargeImage(WonderDeckImageUrl.get(getChoosenWonder())));

        }catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public void onValidateClick(MouseEvent event) throws IOException {
        name = SelectedName.getText();
        //age = selectedAge.getValue();
        switch(getChoosenWonder()){
            case "Warrior":
            default:
                System.out.println("Y'a un gros problème dans Validate Player");
        }
        if (getNbrOfPlayers() <= 1){//Si on a fini d'ajouter les héros.
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/javafxrpgmaizafares/CombatScene-view.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{//Si il reste des heros a rajouter
            minusNbrOfPlayers(1);//on retire 1 au compteur de héros a rajouter
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("src/main/resources/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }



    public static Image chargeImage(String url) throws Exception{
        //Image image = new Image(Objects.requireNonNull(HelloApplication.class.getResource(url)).openStream());
        //System.out.println(image);
        File file = new File(url);
        Image image = new Image(file.toURI().toString());
        return image;
    }

    private String name;
    private int age;

    private Stage stage;
    private Scene scene;
    private Parent root;


}



