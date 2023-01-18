package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.Piece;
import com.example.fim_7wonderarchjavafx.domain.Wonder;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.fim_7wonderarchjavafx.WonderHash.isWonderAvailable;
import static com.example.fim_7wonderarchjavafx.WonderHash.wondersHash;

public class NbrOfPlayerController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        isWonderAvailable.put("alexandrie", true);
        isWonderAvailable.put("babylon", true);
        isWonderAvailable.put("gizeh", true);
        isWonderAvailable.put("ephese", true);
        isWonderAvailable.put("halicarnasse", true);
        isWonderAvailable.put("olympie", true);
        isWonderAvailable.put("rhodes", true);

        alexandrie.add(new Piece("Alexandrie01", "alexandrie", 4, 0, 1,false, "src/main/resources/images/wonders/alexandrie/piece-back-alexandrie-1.png","src/main/resources/images/wonders/alexandrie/piece-front-alexandrie-1.png",2,false));
        alexandrie.add(new Piece("Alexandrie02", "alexandrie", 3, 0, 2,true, "src/main/resources/images/wonders/alexandrie/piece-back-alexandrie-2.png","src/main/resources/images/wonders/alexandrie/piece-front-alexandrie-2.png",2,true));
        alexandrie.add(new Piece("Alexandrie03", "alexandrie", 6, 0, 3,false, "src/main/resources/images/wonders/alexandrie/piece-back-alexandrie-3.png","src/main/resources/images/wonders/alexandrie/piece-front-alexandrie-3.png",3,false));
        alexandrie.add(new Piece("Alexandrie04", "alexandrie", 5, 0, 4,true, "src/main/resources/images/wonders/alexandrie/piece-back-alexandrie-4.png","src/main/resources/images/wonders/alexandrie/piece-front-alexandrie-4.png",3,true));
        alexandrie.add(new Piece("Alexandrie05", "alexandrie", 7, 0, 5,false, "src/main/resources/images/wonders/alexandrie/piece-back-alexandrie-5.png","src/main/resources/images/wonders/alexandrie/piece-front-alexandrie-5.png",4,false));


        babylon.add(new Piece("Babylone01", "babylon", 3, 0, 1,false, "src/main/resources/images/wonders/babylon/piece-back-babylon-1.png","src/main/resources/images/wonders/babylon/piece-front-babylon-1.png",2,false));
        babylon.add(new Piece("Babylone02", "babylon", 0, 0, 2,false, "src/main/resources/images/wonders/babylon/piece-back-babylon-2.png","src/main/resources/images/wonders/babylon/piece-front-babylon-2.png",2,true));
        babylon.add(new Piece("Babylone03", "babylon", 5, 0, 3,false, "src/main/resources/images/wonders/babylon/piece-back-babylon-3.png","src/main/resources/images/wonders/babylon/piece-front-babylon-3.png",3,false));
        babylon.add(new Piece("Babylone04", "babylon", 5, 0, 4,false, "src/main/resources/images/wonders/babylon/piece-back-babylon-4.png","src/main/resources/images/wonders/babylon/piece-front-babylon-4.png",3,true));
        babylon.add(new Piece("Babylone05", "babylon", 7, 0, 4,false, "src/main/resources/images/wonders/babylon/piece-back-babylon-5.png","src/main/resources/images/wonders/babylon/piece-front-babylon-5.png",4,false));

        ephese.add(new Piece("Ephese01","ephese",3,0,1,false,"src/main/resources/images/wonders/ephese/piece-back-ephese-1.png","src/main/resources/images/wonders/ephese/piece-front-ephese-1.png",2,false));
        ephese.add(new Piece("Ephese02","ephese",3,0,2,true,"src/main/resources/images/wonders/ephese/piece-back-ephese-2.png","src/main/resources/images/wonders/ephese/piece-front-ephese-2.png",2,true));
        ephese.add(new Piece("Ephese03","ephese",4,0,2,true,"src/main/resources/images/wonders/ephese/piece-back-ephese-3.png","src/main/resources/images/wonders/ephese/piece-front-ephese-3.png",3,false));
        ephese.add(new Piece("Ephese04","ephese",5,0,2,true,"src/main/resources/images/wonders/ephese/piece-back-ephese-4.png","src/main/resources/images/wonders/ephese/piece-front-ephese-4.png",3,true));
        ephese.add(new Piece("Ephese05","ephese",7,0,3,false,"src/main/resources/images/wonders/ephese/piece-back-ephese-5.png","src/main/resources/images/wonders/ephese/piece-front-ephese-5.png",4,false));

        gizeh.add(new Piece("Gizeh01","gizeh",4,0,1,false,"src/main/resources/images/wonders/giseh/piece-back-giseh-1.png","src/main/resources/images/wonders/giseh/piece-front-giseh-1.png",2,false));
        gizeh.add(new Piece("Gizeh02","gizeh",5,0,2,false,"src/main/resources/images/wonders/giseh/piece-back-giseh-2.png","src/main/resources/images/wonders/giseh/piece-front-giseh-2.png",2,true));
        gizeh.add(new Piece("Gizeh03","gizeh",6,0,3,false,"src/main/resources/images/wonders/giseh/piece-back-giseh-3.png","src/main/resources/images/wonders/giseh/piece-front-giseh-3.png",3,false));
        gizeh.add(new Piece("Gizeh04","gizeh",7,0,4,false,"src/main/resources/images/wonders/giseh/piece-back-giseh-4.png","src/main/resources/images/wonders/giseh/piece-front-giseh-4.png",3,true));
        gizeh.add(new Piece("Gizeh05","gizeh",8,0,5,false,"src/main/resources/images/wonders/giseh/piece-back-giseh-5.png","src/main/resources/images/wonders/giseh/piece-front-giseh-5.png",4,false));

        halicarnasse.add(new Piece("Halicarnasse01","halicarnasse",3,0,1,false,"src/main/resources/images/wonders/halicarnasse/piece-back-halicarnasse-1.png","src/main/resources/images/wonders/halicarnasse/piece-front-halicarnasse-1.png",2,false));
        halicarnasse.add(new Piece("Halicarnasse02","halicarnasse",3,0,2,true,"src/main/resources/images/wonders/halicarnasse/piece-back-halicarnasse-2.png","src/main/resources/images/wonders/halicarnasse/piece-front-halicarnasse-2.png",2,true));
        halicarnasse.add(new Piece("Halicarnasse03","halicarnasse",6,0,3,false,"src/main/resources/images/wonders/halicarnasse/piece-back-halicarnasse-3.png","src/main/resources/images/wonders/halicarnasse/piece-front-halicarnasse-3.png",3,false));
        halicarnasse.add(new Piece("Halicarnasse04","halicarnasse",5,0,3,true,"src/main/resources/images/wonders/halicarnasse/piece-back-halicarnasse-4.png","src/main/resources/images/wonders/halicarnasse/piece-front-halicarnasse-4.png",3,true));
        halicarnasse.add(new Piece("Halicarnasse05","halicarnasse",7,0,4,false,"src/main/resources/images/wonders/halicarnasse/piece-back-halicarnasse-5.png","src/main/resources/images/wonders/halicarnasse/piece-front-halicarnasse-5.png",4,false));

        olympie.add(new Piece("Olympie01","olympie",3,0,1,false,"src/main/resources/images/wonders/olympie/piece-back-olympie-1.png","src/main/resources/images/wonders/olympie/piece-front-olympie-1.png",2,false));
        olympie.add(new Piece("Olympie02","olympie",2,0,2,true,"src/main/resources/images/wonders/olympie/piece-back-olympie-2.png","src/main/resources/images/wonders/olympie/piece-front-olympie-2.png",2,true));
        olympie.add(new Piece("Olympie03","olympie",5,0,2,false,"src/main/resources/images/wonders/olympie/piece-back-olympie-3.png","src/main/resources/images/wonders/olympie/piece-front-olympie-3.png",3,false));
        olympie.add(new Piece("Olympie04","olympie",5,0,3,true,"src/main/resources/images/wonders/olympie/piece-back-olympie-4.png","src/main/resources/images/wonders/olympie/piece-front-olympie-4.png",3,true));
        olympie.add(new Piece("Olympie05","olympie",7,0,4,false,"src/main/resources/images/wonders/olympie/piece-back-olympie-5.png","src/main/resources/images/wonders/olympie/piece-front-olympie-5.png",4,false));

        rhodes.add(new Piece("Rhodes01","rhodes",4,0,1,false,"src/main/resources/images/wonders/rhodes/piece-back-rhodes-1.png","src/main/resources/images/wonders/rhodes/piece-front-rhodes-1.png",2,false));
        rhodes.add(new Piece("Rhodes02","rhodes",4,1,1,false,"src/main/resources/images/wonders/rhodes/piece-back-rhodes-2.png","src/main/resources/images/wonders/rhodes/piece-front-rhodes-2.png",2,true));
        rhodes.add(new Piece("Rhodes03","rhodes",5,0,2,false,"src/main/resources/images/wonders/rhodes/piece-back-rhodes-3.png","src/main/resources/images/wonders/rhodes/piece-front-rhodes-3.png",3,false));
        rhodes.add(new Piece("Rhodes04","rhodes",6,1,3,false,"src/main/resources/images/wonders/rhodes/piece-back-rhodes-4.png","src/main/resources/images/wonders/rhodes/piece-front-rhodes-4.png",3,true));
        rhodes.add(new Piece("Rhodes05","rhodes",7,0,4,false,"src/main/resources/images/wonders/rhodes/piece-back-rhodes-5.png","src/main/resources/images/wonders/rhodes/piece-front-rhodes-5.png",4,false));

        wondersHash.put("alexandrie", new  Wonder("alexandrie", alexandrie));
        wondersHash.put("babylon",new Wonder("babylon", babylon));
        wondersHash.put("ephese",new Wonder("ephese", ephese));
        wondersHash.put("gizeh", new Wonder("gizeh", gizeh));
        wondersHash.put("halicarnasse", new Wonder("halicarnasse", halicarnasse));
        wondersHash.put("olympie", new Wonder("olympie", olympie));
        wondersHash.put("rhodes", new Wonder("rhodes", rhodes));


    }

    @FXML
    public void on2PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 2;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void on3PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 3;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
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
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void on6PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 6;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    public void on7PlayerSelected(MouseEvent event) throws IOException {
        nbrOfPlayers = 7;
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/fim_7wonderarchjavafx/ChoosePlayerWonder-View.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    static public int nbrOfPlayers;

    public static int getNbrOfPlayers() {
        return nbrOfPlayers;
    }

    public static void minusNbrOfPlayers(int minus) {
        nbrOfPlayers -= minus;
    }

    private Stage stage;
    private Scene scene;
    private Parent root;



    ArrayList<Piece> alexandrie = new ArrayList<>();
    ArrayList<Piece> babylon = new ArrayList<>();
    ArrayList<Piece> ephese = new ArrayList<>();
    ArrayList<Piece> gizeh = new ArrayList<>();
    ArrayList<Piece> halicarnasse = new ArrayList<>();
    ArrayList<Piece> olympie = new ArrayList<>();
    ArrayList<Piece> rhodes = new ArrayList<>();
}
