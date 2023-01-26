package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.CardDecks;
import com.example.fim_7wonderarchjavafx.domain.Player;
import com.example.fim_7wonderarchjavafx.domain.TokenProgress;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.URL;
import java.util.*;

import static com.example.fim_7wonderarchjavafx.domain.CardDecks.*;
import static com.example.fim_7wonderarchjavafx.listPlayer.listPlayers;

public class GameController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            //On commence par trier les joueurs en fonction de leurs Age
            Collections.sort(listPlayers, new AgeComparator());
            //Nombre de joueurs
            nbrOfPlayers = listPlayers.size();

            //Creation de la liste de tout les token progress
            progressTokenDeck = new ArrayList<>();
            progressTokenDeck.add(new TokenProgress("Architecture", "src/main/resources/images/tokens-progress/token-architecture.png"));
            progressTokenDeck.add(new TokenProgress("Economie", "src/main/resources/images/tokens-progress/token-economy.png"));
            progressTokenDeck.add(new TokenProgress("Tactique", "src/main/resources/images/tokens-progress/token-tactic.png"));
            progressTokenDeck.add(new TokenProgress("Urbanisme", "src/main/resources/images/tokens-progress/token-urbanism.png"));
            progressTokenDeck.add(new TokenProgress("Artisanat", "src/main/resources/images/tokens-progress/token-artsAndCrafts.png"));
            progressTokenDeck.add(new TokenProgress("Joaillerie", "src/main/resources/images/tokens-progress/token-jewelry.png"));
            progressTokenDeck.add(new TokenProgress("Science", "src/main/resources/images/tokens-progress/token-science.png"));
            progressTokenDeck.add(new TokenProgress("Propagande", "src/main/resources/images/tokens-progress/token-propaganda.png"));
            progressTokenDeck.add(new TokenProgress("Ingenierie", "src/main/resources/images/tokens-progress/token-ingeniery.png"));
            progressTokenDeck.add(new TokenProgress("Decoration", "src/main/resources/images/tokens-progress/token-decoration.png"));
            progressTokenDeck.add(new TokenProgress("Politique", "src/main/resources/images/tokens-progress/token-politic.png"));
            progressTokenDeck.add(new TokenProgress("Strategie", "src/main/resources/images/tokens-progress/token-strategy.png"));
            progressTokenDeck.add(new TokenProgress("Education", "src/main/resources/images/tokens-progress/token-green-token2.png"));
            progressTokenDeck.add(new TokenProgress("Culture", "src/main/resources/images/tokens-progress/token-culture.png"));


            //Je liste tout les attribut FXML dans des arraylist pour les récuperer dynamiquement

            //Les ImagesView des slot des joueurs
            PlayerPositionSlotList = new ArrayList<>();
            PlayerPositionSlotList.add(PlayerPositionSlot1);
            PlayerPositionSlotList.add(PlayerPositionSlot2);
            PlayerPositionSlotList.add(PlayerPositionSlot3);
            PlayerPositionSlotList.add(PlayerPositionSlot4);
            PlayerPositionSlotList.add(PlayerPositionSlot5);
            PlayerPositionSlotList.add(PlayerPositionSlot6);
            PlayerPositionSlotList.add(PlayerPositionSlot7);

            //Les Labels du nom des joueurs
            PlayerNameLabelList = new ArrayList<>();
            PlayerNameLabelList.add(PlayerNameLabel1);
            PlayerNameLabelList.add(PlayerNameLabel2);
            PlayerNameLabelList.add(PlayerNameLabel3);
            PlayerNameLabelList.add(PlayerNameLabel4);
            PlayerNameLabelList.add(PlayerNameLabel5);
            PlayerNameLabelList.add(PlayerNameLabel6);
            PlayerNameLabelList.add(PlayerNameLabel7);

            //La liste des decks des joueurs
            PlayerDeckList = new ArrayList<>();
            PlayerDeckList.add(PlayerDeck1);
            PlayerDeckList.add(PlayerDeck2);
            PlayerDeckList.add(PlayerDeck3);
            PlayerDeckList.add(PlayerDeck4);
            PlayerDeckList.add(PlayerDeck5);
            PlayerDeckList.add(PlayerDeck6);
            PlayerDeckList.add(PlayerDeck7);


            //la liste des progress Token
            progressTokenImagesList = new ArrayList<>();
            progressTokenImagesList.add(progressTokenSlot1);
            progressTokenImagesList.add(progressTokenSlot2);
            progressTokenImagesList.add(progressTokenSlot3);

            //Les Peace Token
            PeaceTokenList = new ArrayList<>();

            PeaceToken1.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
            PeaceTokenList.add(PeaceToken1);
            PeaceToken2.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
            PeaceTokenList.add(PeaceToken2);
            PeaceToken3.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
            PeaceTokenList.add(PeaceToken3);
            if(nbrOfPlayers >= 4){
                PeaceToken4.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
                PeaceTokenList.add(PeaceToken4);
                if(nbrOfPlayers >=5){
                    PeaceToken5.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
                    PeaceTokenList.add(PeaceToken5);
                    if(nbrOfPlayers >=6){
                        PeaceToken6.setImage(chargeImage("src/main/resources/images/tokens/token-conflict-peace.png"));
                        PeaceTokenList.add(PeaceToken6);
                    }
                }
            }

            //J'apporte tout les decks
            wonderDecks = new HashMap<>();
            wonderDecks.put("alexandrie", deckCardQuantities_Alexandrie);
            wonderDecks.put("babylon", deckCardQuantities_Babylon);
            wonderDecks.put("gizeh", deckCardQuantities_Gizeh);
            wonderDecks.put("ephese", deckCardQuantities_Ephese);
            wonderDecks.put("halicarnasse", deckCardQuantities_Halicarnasse);
            wonderDecks.put("olympie", deckCardQuantities_Olympie);
            wonderDecks.put("rhodes", deckCardQuantities_Rhodes);

            boardDeck = new ArrayList<>();
            boardDeck = deckCardQuantities_Extra;

            List<CardTypeQuantity> tempDecks;
            //
            PlayerGameDeckList = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                if(i < nbrOfPlayers){
                    //=============================================================================
                    //ICI JE DOIS UTILISER LA METHODE QUE MATTHIEU VA FAIRE!!!!!!!!!!!!!!!!!!!!!!!!
                    //=============================================================================

                    //PlayerPositionSlotList.get(i)
                    PlayerNameLabelList.get(i).setText(listPlayers.get(i).getName());
                    System.out.println(listPlayers.get(i));
                    tempDecks = wonderDecks.get(listPlayers.get(i).getWonder().getName());
                    Collections.shuffle(tempDecks);
                    PlayerGameDeckList.add(tempDecks);

                    PlayerDeckList.get(i).setImage(chargeImage( tempDecks.get(0).geturl() ));

                }else{
                    PlayerPositionSlotList.get(i).setDisable(true);
                    PlayerNameLabelList.get(i).setDisable(true);
                    PlayerDeckList.get(i).setDisable(true);

                }

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void GameProcess(ArrayList<ImageView> PlayerPositionSlotList){


    }



    //Classic Java Methods
    public static Image chargeImage(String url) throws Exception{
        //Image image = new Image(Objects.requireNonNull(HelloApplication.class.getResource(url)).openStream());
        //System.out.println(image);
        File file = new File(url);
        Image image = new Image(file.toURI().toString());
        return image;
    }




    //FXML METHODS

    public void WonderJavaFXDisplayer(Player player, int x, float y){
        //Cette fonction permettra d'afficher la merveille en fonction de
        //sa localisation sur l'ecran, de sa localisation
        String wonderName = player.getWonder().getName();
        switch (wonderName){
            case "alexandrie":
        }



    }
    public void onBoardDeckClicked(MouseEvent event) {

    }


    public void onGetPlayer1Infos(MouseEvent event) {
    }
    public void onGetPlayer2Infos(MouseEvent event) {
    }
    public void onGetPlayer3Infos(MouseEvent event) {
    }
    public void onGetPlayer4Infos(MouseEvent event) {
    }

    public void onGetPlayer5Infos(MouseEvent event) {
    }
    public void onGetPlayer6Infos(MouseEvent event) {
    }

    public void onGetPlayer7Infos(MouseEvent event) {
    }


    public void onPlayer1DeckClicked(MouseEvent event) {
    }

    public void onPlayer2DeckClicked(MouseEvent event) {
    }

    public void onPlayer3DeckClicked(MouseEvent event) {
    }

    public void onPlayer4DeckClicked(MouseEvent event) {
    }

    public void onPlayer5DeckClicked(MouseEvent event) {
    }

    public void onPlayer6DeckClicked(MouseEvent event) {
    }

    public void onPlayer7DeckClicked(MouseEvent event) {
    }



    public void onHiddenProgressTokenDeckClicked(MouseEvent event) {
    }

    public void onProgressTokenSlot1Clicked(MouseEvent event) {
    }

    public void onProgressTokenSlot2Clicked(MouseEvent event) {
    }

    public void onProgressTokenSlot3Clicked(MouseEvent event) {
    }


    //Game Attributes

    private int nbrOfPlayers;
    private ArrayList<TokenProgress> progressTokenDeck;
    private List<CardDecks.CardTypeQuantity> boardDeck;
    private HashMap<String, List<CardTypeQuantity>> wonderDecks;

    private List<CardDecks.CardTypeQuantity> PlayerGameDeck1;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck2;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck3;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck4;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck5;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck6;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck7;

    private ArrayList<List<CardTypeQuantity>> PlayerGameDeckList;
    //FXML ATTRIBUTES
    public ImageView boardDeckImage;
    public ImageView PeaceToken1;
    public ImageView PeaceToken2;
    public ImageView PeaceToken3;
    public ImageView PeaceToken4;
    public ImageView PeaceToken5;
    public ImageView PeaceToken6;

    private ArrayList<ImageView> PeaceTokenList;

    //Labels D'infos
    public Label ActionPrompterLabel;
    public Label InfosPrompterLabel;
    public Label PlayerInfosPrompter;


    public ImageView PlayerPositionSlot1;
    public ImageView PlayerPositionSlot2;
    public ImageView PlayerPositionSlot3;
    public ImageView PlayerPositionSlot4;
    public ImageView PlayerPositionSlot5;
    public ImageView PlayerPositionSlot6;
    public ImageView PlayerPositionSlot7;

    private ArrayList<ImageView> PlayerPositionSlotList;


    public Label PlayerNameLabel1;
    public Label PlayerNameLabel2;
    public Label PlayerNameLabel3;
    public Label PlayerNameLabel4;
    public Label PlayerNameLabel5;
    public Label PlayerNameLabel6;
    public Label PlayerNameLabel7;

    private ArrayList<Label> PlayerNameLabelList;



    public ImageView PlayerDeck1;
    public ImageView PlayerDeck2;
    public ImageView PlayerDeck3;
    public ImageView PlayerDeck4;
    public ImageView PlayerDeck5;
    public ImageView PlayerDeck6;
    public ImageView PlayerDeck7;

    private ArrayList<ImageView> PlayerDeckList;


    public ImageView hiddenProgressTokenDeck;
    public ImageView progressTokenSlot1;
    public ImageView progressTokenSlot2;
    public ImageView progressTokenSlot3;

    private ArrayList<ImageView> progressTokenImagesList;

    public ImageView militaryVictoryStack;

    //Cette classe va me permettre de trier les joueurs
    class AgeComparator implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            return p1.getAge() - p2.getAge();
        }
    }


}
