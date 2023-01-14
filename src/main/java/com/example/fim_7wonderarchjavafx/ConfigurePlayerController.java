package com.example.fim_7wonderarchjavafx;
import com.example.fim_7wonderarchjavafx.domain.Player;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import static com.example.fim_7wonderarchjavafx.WonderHash.isWonderAvailable;
import static com.example.fim_7wonderarchjavafx.WonderHash.wondersHash;
import static com.example.fim_7wonderarchjavafx.listPlayer.listPlayers;


//je dois importer l'array de player
public class ConfigurePlayerController implements Initializable {


    public ImageView wonderImageSlot;
    public TextField SelectedName;
    public Spinner<Integer> selectedAge;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try{
            SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(3,99);
            valueFactory.setValue(16);

            selectedAge.setValueFactory(valueFactory);

            HashMap<String, String> WonderDeckImageUrl = new HashMap<>();

            WonderDeckImageUrl.put("alexandrie", "src/main/resources/images/decks/deck-alexandrie.png");
            WonderDeckImageUrl.put("babylon", "src/main/resources/images/decks/deck-babylon.png");
            WonderDeckImageUrl.put("cizeh", "src/main/resources/images/decks/deck-cizeh.png");
            WonderDeckImageUrl.put("ephese", "src/main/resources/images/decks/deck-ephese.png");
            WonderDeckImageUrl.put("halicarnasse", "src/main/resources/images/decks/deck-halicarnasse.png");
            WonderDeckImageUrl.put("olympie", "src/main/resources/images/decks/deck-olympie.png");
            WonderDeckImageUrl.put("rhodes", "src/main/resources/images/decks/deck-rhodes.png");

            System.out.println(getChoosenWonder());
            System.out.println(WonderDeckImageUrl.get(getChoosenWonder()));
            wonderImageSlot.setImage(chargeImage(WonderDeckImageUrl.get(getChoosenWonder())));

        }catch (Exception e) {
            throw new RuntimeException(e);

        }
    }

    public void onValidateClick(ActionEvent event) throws IOException {
        name = SelectedName.getText();
        age = selectedAge.getValue();

        //CREATING THE PLAYER
        //tempPlayer = new Player(name, age, wondersHash.get(getChoosenWonder()));
        isWonderAvailable.put(getChoosenWonder(), false);
        //listPlayers.add(tempPlayer);

        System.out.println(getNbrOfPlayers());

        if (getNbrOfPlayers() <= 1){//Si on a fini d'ajouter les joueurs.
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/javafxrpgmaizafares/CombatScene-view.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }else{//Si il reste des heros a rajouter
            minusNbrOfPlayers(1);//on retire 1 au compteur de joueurs a rajouter
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
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

    private Player tempPlayer;
    private String name;
    private int age;

    private Stage stage;
    private Scene scene;
    private Parent root;


}



