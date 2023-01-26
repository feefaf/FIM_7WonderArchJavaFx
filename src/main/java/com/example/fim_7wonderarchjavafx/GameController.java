package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.CardDecks;
import com.example.fim_7wonderarchjavafx.domain.Player;
import com.example.fim_7wonderarchjavafx.domain.TokenProgress;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.File;
import java.net.URL;
import java.util.*;

import static com.example.fim_7wonderarchjavafx.domain.CardDecks.*;
import static com.example.fim_7wonderarchjavafx.listPlayer.listPlayers;

public class GameController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            turn = -1;
            //On commence par trier les joueurs en fonction de leurs Age
            Collections.sort(listPlayers, new AgeComparator());
            //Nombre de joueurs
            nbrOfPlayers = listPlayers.size();

            HashMap<String, String> WonderDeckImageUrl = new HashMap<>();

            WonderDeckImageUrl.put("alexandrie", "src/main/resources/images/decks/deck-alexandrie.png");
            WonderDeckImageUrl.put("babylon", "src/main/resources/images/decks/deck-babylon.png");
            WonderDeckImageUrl.put("gizeh", "src/main/resources/images/decks/deck-cizeh.png");
            WonderDeckImageUrl.put("ephese", "src/main/resources/images/decks/deck-ephese.png");
            WonderDeckImageUrl.put("halicarnasse", "src/main/resources/images/decks/deck-halicarnasse.png");
            WonderDeckImageUrl.put("olympie", "src/main/resources/images/decks/deck-olympie.png");
            WonderDeckImageUrl.put("rhodes", "src/main/resources/images/decks/deck-rhodes.png");

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

                    PlayerPositionSlotList.get(i).setImage(chargeImage(WonderDeckImageUrl.get(listPlayers.get(i).getWonder().getName())));
                    //WonderJavaFXDisplayer(listPlayers.get(i), (float) PlayerPositionSlotList.get(i).getX(),(float) PlayerPositionSlotList.get(i).getY()  );
                    //=============================================================================
                    //FONCTION NON FONCTIONNELLE
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
                GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void GameProcess(ArrayList<ImageView> PlayerPositionSlotList, Label InfosPrompterLabel,
                                   Label ActionPrompterLabel){
        addTurn();
        ActionPrompterLabel.setText("C'est le tour de "+ listPlayers.get(turn).getName());
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
        int chosenCard;
        do{
            chosenCard =(int)(Math.floor(Math.random() * boardDeck.size()));
        }while(boardDeck.get(chosenCard).quantity < 1);

        boardDeck.get(chosenCard).minusCard();
        String cardNameSelected = boardDeck.get(chosenCard).getCardType().getCardName();
        System.out.println(cardNameSelected);
        if (cardNameSelected == "emperor"){
            listPlayers.get(turn).gainPartyPoint(3);
        }

        listPlayers.get(turn).add_ressources(cardNameSelected);

        InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + boardDeck.get(chosenCard).getCardType().getCardName());
        GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);
    }


    public void onGetPlayer1Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(0).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(0).getName()+" Ressources :\n"+
                "brick : "+ PlayerRessources.get("brick")+"\n"+
                "wood : "+ PlayerRessources.get("wood")+"\n"+
                "stone : "+ PlayerRessources.get("stone")+"\n"+
                "paper : "+ PlayerRessources.get("paper")+"\n"+
                "glass : "+ PlayerRessources.get("glass")+"\n"+
                "gold : "+ PlayerRessources.get("gold")+"\n"+
                "law : "+ PlayerRessources.get("law")+"\n"+
                "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                "architect : "+ PlayerRessources.get("architect")+"\n"+
                "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                "archer : "+ PlayerRessources.get("archer")+"\n"+
                "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }
    public void onGetPlayer2Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(1).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(1).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }
    public void onGetPlayer3Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(2).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(2).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }
    public void onGetPlayer4Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(3).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(3).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );

    }

    public void onGetPlayer5Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(4).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(4).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }
    public void onGetPlayer6Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(5).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(5).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }

    public void onGetPlayer7Infos(MouseEvent event) {
        HashMap<String, Integer> PlayerRessources = listPlayers.get(6).getRessourceList();
        PlayerInfosPrompter.setText(
                listPlayers.get(6).getName()+" Ressources :\n"+
                        "brick : "+ PlayerRessources.get("brick")+"\n"+
                        "wood : "+ PlayerRessources.get("wood")+"\n"+
                        "stone : "+ PlayerRessources.get("stone")+"\n"+
                        "paper : "+ PlayerRessources.get("paper")+"\n"+
                        "glass : "+ PlayerRessources.get("glass")+"\n"+
                        "gold : "+ PlayerRessources.get("gold")+"\n"+
                        "law : "+ PlayerRessources.get("law")+"\n"+
                        "mechanic : "+ PlayerRessources.get("mechanic")+"\n"+
                        "architect : "+ PlayerRessources.get("architect")+"\n"+
                        "barbarian : "+ PlayerRessources.get("barbarian")+"\n"+
                        "centurion : "+ PlayerRessources.get("centurion")+"\n"+
                        "archer : "+ PlayerRessources.get("archer")+"\n"+
                        "emperor : "+ PlayerRessources.get("emperor")+"\n"
        );
    }


    public void onPlayer1DeckClicked(MouseEvent event) {
        int playerIndex = 0;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
        || turn == playerIndex
        || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
    }

    public void onPlayer2DeckClicked(MouseEvent event) {
        int playerIndex = 1;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }

    }

    public void onPlayer3DeckClicked(MouseEvent event) {
        int playerIndex = 2;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
    }

    public void onPlayer4DeckClicked(MouseEvent event) {
        int playerIndex = 3;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
    }

    public void onPlayer5DeckClicked(MouseEvent event) {
        int playerIndex = 4;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
    }

    public void onPlayer6DeckClicked(MouseEvent event) {
        int playerIndex = 5;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
    }

    public void onPlayer7DeckClicked(MouseEvent event) {
        int playerIndex = 6;
        if(turn ==((playerIndex==0)? listPlayers.size()-1 : playerIndex-1)
                || turn == playerIndex
                || turn ==((playerIndex == listPlayers.size()-1)?0:playerIndex+1)){
            int chosenCard;
            do{
                chosenCard =(int)(Math.floor(Math.random() * PlayerGameDeckList.get(playerIndex).size()));
            }while(PlayerGameDeckList.get(playerIndex).get(chosenCard).quantity < 1);

            PlayerGameDeckList.get(playerIndex).get(chosenCard).minusCard();
            String cardNameSelected = PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName();
            System.out.println(cardNameSelected);
            if (cardNameSelected == "emperor"){
                listPlayers.get(turn).gainPartyPoint(3);
            }

            listPlayers.get(turn).add_ressources(cardNameSelected);

            InfosPrompterLabel.setText(listPlayers.get(turn).getName()+" a pioché une carte " + PlayerGameDeckList.get(playerIndex).get(chosenCard).getCardType().getCardName());
            GameProcess(PlayerPositionSlotList, InfosPrompterLabel, ActionPrompterLabel);

        }
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

    public void WonderJavaFXDisplayer(Player player, float x, float y) throws Exception {
        //Cette fonction permettra d'afficher la merveille en fonction de
        //sa localisation sur l'ecran, de sa localisation
        String wonderName = player.getWonder().getName();
        switch (wonderName) {
            case "alexandrie":
                System.out.println(x);
                System.out.println(y);

                ImageView alexandrie01 = new ImageView();
                alexandrie01.setImage(chargeImage( (player.getWonder().getPieceList().get(0).getStatus())?
                        player.getWonder().getPieceList().get(0).getFrontImageUrl():
                        player.getWonder().getPieceList().get(0).getBackImageUrl()));
                alexandrie01.setX(x);
                alexandrie01.setY(y-10);
                alexandrie01.setFitWidth((50));
                alexandrie01.setFitHeight(73);
                sceneBoard.getChildren().add(alexandrie01);

                ImageView alexandrie02= new ImageView();
                alexandrie02.setImage(chargeImage( (player.getWonder().getPieceList().get(1).getStatus())?
                        player.getWonder().getPieceList().get(1).getFrontImageUrl():
                        player.getWonder().getPieceList().get(1).getBackImageUrl()));
                alexandrie02.setX(x);
                alexandrie02.setY(y-5);
                alexandrie02.setFitWidth((50));
                alexandrie02.setFitHeight(73);
                sceneBoard.getChildren().add(alexandrie02);

                ImageView alexandrie03= new ImageView();
                alexandrie03.setImage(chargeImage( (player.getWonder().getPieceList().get(2).getStatus())?
                        player.getWonder().getPieceList().get(2).getFrontImageUrl():
                        player.getWonder().getPieceList().get(2).getBackImageUrl()));
                alexandrie03.setX(x);
                alexandrie03.setY(y);
                alexandrie03.setFitWidth((50));
                alexandrie03.setFitHeight(73);
                sceneBoard.getChildren().add(alexandrie03);

                ImageView alexandrie04= new ImageView();
                alexandrie04.setImage(chargeImage( (player.getWonder().getPieceList().get(3).getStatus())?
                        player.getWonder().getPieceList().get(3).getFrontImageUrl():
                        player.getWonder().getPieceList().get(3).getBackImageUrl()));
                alexandrie04.setX(x);
                alexandrie04.setY(y+5);
                alexandrie04.setFitWidth((50));
                alexandrie04.setFitHeight(73);
                sceneBoard.getChildren().add(alexandrie04);

                ImageView alexandrie05= new ImageView();
                alexandrie04.setImage(chargeImage( (player.getWonder().getPieceList().get(4).getStatus())?
                        player.getWonder().getPieceList().get(4).getFrontImageUrl():
                        player.getWonder().getPieceList().get(4).getBackImageUrl()));
                alexandrie05.setX(x);
                alexandrie05.setY(y+10);
                alexandrie05.setFitWidth((50));
                alexandrie05.setFitHeight(73);
                sceneBoard.getChildren().add(alexandrie05);


                break;
            case "gizeh":

            default:


        }
    }

    public static void sameTurn(){
        turn -=1;
    }
    public static void addTurn(){
        turn += (turn == listPlayers.size()-1)?(-turn):1;
    }


    private ArrayList<ImageView> alexandrieImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> babylonImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> epheseImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> gizehImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> halicarnasseImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> olympieImagePieces = new ArrayList<ImageView>();
    private ArrayList<ImageView> rhodesImagePieces = new ArrayList<ImageView>();
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

    private static int turn;

    //FXML ATTRIBUTES
    public AnchorPane sceneBoard;
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
