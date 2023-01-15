package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.CardDecks;
import com.example.fim_7wonderarchjavafx.domain.Player;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.net.URL;
import java.util.*;

import static com.example.fim_7wonderarchjavafx.WonderHash.isWonderAvailable;
import static com.example.fim_7wonderarchjavafx.domain.CardDecks.*;
import static com.example.fim_7wonderarchjavafx.listPlayer.listPlayers;

public class GameController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            //On commence par trier les joueurs en fonction de leurs Age
            Collections.sort(listPlayers, new AgeComparator());

            //Je liste tout les attribut FXML dans des arraylist pour les récuperer dynamiquement

            //Les Peace Token
            PeaceTokenList.add(PeaceToken1);
            PeaceTokenList.add(PeaceToken2);
            PeaceTokenList.add(PeaceToken3);
            PeaceTokenList.add(PeaceToken4);
            PeaceTokenList.add(PeaceToken5);
            PeaceTokenList.add(PeaceToken6);

            //Les ImagesView des slot des joueurs
            PlayerPositionSlotList.add(PlayerPositionSlot1);
            PlayerPositionSlotList.add(PlayerPositionSlot2);
            PlayerPositionSlotList.add(PlayerPositionSlot3);
            PlayerPositionSlotList.add(PlayerPositionSlot4);
            PlayerPositionSlotList.add(PlayerPositionSlot5);
            PlayerPositionSlotList.add(PlayerPositionSlot6);
            PlayerPositionSlotList.add(PlayerPositionSlot7);

            //Les Labels du nom des joueurs
            PlayerNameLabelList.add(PlayerNameLabel1);
            PlayerNameLabelList.add(PlayerNameLabel2);
            PlayerNameLabelList.add(PlayerNameLabel3);
            PlayerNameLabelList.add(PlayerNameLabel4);
            PlayerNameLabelList.add(PlayerNameLabel5);
            PlayerNameLabelList.add(PlayerNameLabel6);
            PlayerNameLabelList.add(PlayerNameLabel7);

            //La liste des decks des joueurs
            PlayerDeckList.add(PlayerDeck1);
            PlayerDeckList.add(PlayerDeck2);
            PlayerDeckList.add(PlayerDeck3);
            PlayerDeckList.add(PlayerDeck4);
            PlayerDeckList.add(PlayerDeck5);
            PlayerDeckList.add(PlayerDeck6);
            PlayerDeckList.add(PlayerDeck7);


            //la liste des progress Token
            progressTokenList.add(progressTokenSlot1);
            progressTokenList.add(progressTokenSlot2);
            progressTokenList.add(progressTokenSlot3);

            //J'apporte tout les decks
            wonderDecks.put("alexandrie", deckCardQuantities_Alexandrie);
            wonderDecks.put("babylon", deckCardQuantities_Babylon);
            wonderDecks.put("cizeh", deckCardQuantities_Gizeh);
            wonderDecks.put("ephese", deckCardQuantities_Ephese);
            wonderDecks.put("halicarnasse", deckCardQuantities_Halicarnasse);
            wonderDecks.put("olympie", deckCardQuantities_Olympie);
            wonderDecks.put("rhodes", deckCardQuantities_Rhodes);


            List<CardDecks.CardTypeQuantity> tempDecks;
            //
            for (int i = 0; i < 7; i++) {
                if(i > listPlayers.size()){
                    //=============================================================================
                    //ICI JE DOIS UTILISER LA METHODE QUE MATTHIEU VA FAIRE!!!!!!!!!!!!!!!!!!!!!!!!
                    //=============================================================================

                    //PlayerPositionSlotList.get(i)
                    PlayerNameLabelList.get(i).setText(listPlayers.get(i).getName());
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



    //Classic Java Methods
    public static Image chargeImage(String url) throws Exception{
        //Image image = new Image(Objects.requireNonNull(HelloApplication.class.getResource(url)).openStream());
        //System.out.println(image);
        File file = new File(url);
        Image image = new Image(file.toURI().toString());
        return image;
    }



    //FXML METHODS
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
    private HashMap<String,List<CardDecks.CardTypeQuantity>> wonderDecks;

    private List<CardDecks.CardTypeQuantity> PlayerGameDeck1;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck2;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck3;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck4;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck5;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck6;
    private List<CardDecks.CardTypeQuantity> PlayerGameDeck7;

    private ArrayList<List<CardDecks.CardTypeQuantity>> PlayerGameDeckList;
    //FXML ATTRIBUTES
    public ImageView boardDeck;
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

    private ArrayList<ImageView> progressTokenList;

    public ImageView militaryVictoryStack;

    //Cette classe va me permettre de trier les joueurs
    class AgeComparator implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            return p1.getAge() - p2.getAge();
        }
    }


}
