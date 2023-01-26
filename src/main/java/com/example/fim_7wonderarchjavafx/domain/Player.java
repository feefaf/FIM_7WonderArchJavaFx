package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    public Player(String nom, int age, Wonder wonder){
        name = nom;
        this.age = age;
        this.wonder = wonder;
        partyPoint = 0;
        militaryPoint = 0;
        shieldNb = 0;
        controlCat = false;
        this.ressourceList = new HashMap<String, Integer>();
        this.ressourceList.put("brick", 0);
        this.ressourceList.put("wood", 0);
        this.ressourceList.put("stone", 0);
        this.ressourceList.put("paper", 0);
        this.ressourceList.put("glass", 0);
        this.ressourceList.put("gold", 0);

        this.playerToken = new HashMap<>();
        this.playerToken.put("Urbanisme", 0);
        this.playerToken.put("Artisanat", 0);
        this.playerToken.put("Joaillerie", 0);
        this.playerToken.put("Science", 0);
        this.playerToken.put("Tactique", 0);
        this.playerToken.put("Propagande", 0);
        this.playerToken.put("Economie", 0);
        this.playerToken.put("Culture", 0);
        this.playerToken.put("Architecture", 0);
        this.playerToken.put("Strategie", 0);
        this.playerToken.put("Education", 0);
        this.playerToken.put("Ingenierie",0);
        this.playerToken.put("Politique", 0);
        this.playerToken.put("Decoration", 0);


    }



    public int getAllPoints(){
        return partyPoint + militaryPoint + ((controlCat)?2:0);
    }


    public boolean levelIsBuilt(){
        for (Piece piece : wonder.getPieceList()){
            if(wonder.getLevel() == piece.getLevel()){
                if (piece.getStatus()==false){
                    return false;
                }
            }
        }
        wonder.addLevel();
        return true;
    }


    public void add_ressources(HashMap<String, Integer> cout) {
        // Ajoute les ressources spécifiées aux ressources courantes
        for (Map.Entry<String, Integer> entry : cout.entrySet()) {
            String ressource = entry.getKey();
            int quantity = entry.getValue();
            int ressourcesActuelles = this.ressourceList.get(ressource);
            this.ressourceList.put(ressource, ressourcesActuelles + quantity);
        }
    }


    // Fonction qui permettra de verifier si on a le jeton ou pas

    public boolean gotToken(String nameToken) {
        if (playerToken.get(nameToken) >= 1) {
            playerToken.replace(nameToken,0);
            return true;
        }
        return false;
    }

    //Fonction qui va appliquer l'effet des jetons dès que l'on pioche une carte
    public void directApplyTokenEffect(){
                if(playerToken.get("Economie")>=1) {
                    tokenProgress.economieEffect(this);
                }
                else if (playerToken.get("Tactique")>=1){
                    tokenProgress.tactiqueEffect(this);
                }
            }


    // Methode qui va appliquer les effects des jetons lorsque l'on pioche une carte
    public void piocheApplyTokenEffect(){
                if(playerToken.get("Urbanisme")>=1){
                    tokenProgress.urbanismeEffect(this);
                }
                else if (playerToken.get("Artisanat")>=1){
                    tokenProgress.artisanatEffect(this);
                }
                else if (playerToken.get("Joaillerie")>=1){
                    tokenProgress.joaillerieEffect(this);
                }
                else if(playerToken.get("Science")>=1){
                    tokenProgress.scienceEffect(this);
                }
                else if(playerToken.get("Propagande")>=1){
                    tokenProgress.propagandeEffect(this);
                }
            }

    // Methode qui va appliquer les effect des jetons lors de la construction d'une wonder
    public void wonderBuiltApplyTokenEffect(){
                if(playerToken.get("Architecture")>=1) {
                    tokenProgress.architectureEffect(this);
                }
                else if(playerToken.get("Ingenierie")>=1) {
                    tokenProgress.ingenieurieEffect(this);
                }
            }





    // Methode qui va appliquer les effect des jetons lors de la fin de la partie
    public void endApplyTokenEffect(){
                if(playerToken.get("Decoration") >=1) {
                    tokenProgress.decorationEffect(this);
                }
                else if(playerToken.get("Politique")>=1){
                    tokenProgress.politiqueEffect(this);
                }
                else if(playerToken.get("Strategie")>=1){
                    tokenProgress.strategieEffect(this);
                }
                else if(playerToken.get("Education")>=1){
                    tokenProgress.educationEffect(this);
                }
                else if(playerToken.get("Culture")>=1){
                    tokenProgress.cultureEffect(this);
                }
            }






    //Gain
    public void gainPartyPoint(int points){partyPoint+=points;}
    public void gainMilitaryPoint(int points){ militaryPoint+=points;}
    public void gainShieldNb(int points){militaryPoint+=points;}



    //Setters
    public void attributeWonder(Wonder merveille){
        wonder = merveille;
    }

    public void setTurn(int tour){
        nbTurn = tour;
    }


    //Getters

    public String getName(){return name;}
    public int getAge(){return age;}
    public int getNbTurn(){return nbTurn;}
    public Wonder getWonder(){return wonder;}
    public int getPartyPoint() {return partyPoint;}
    public int getMilitaryPoint() {return  militaryPoint;}
    public boolean getControlCat(){return controlCat;}
    public ArrayList<Card> getDeckCard(){return deckCard;}
    public HashMap<String, Integer> getRessourceList(){return ressourceList;}
    public HashMap<String, Integer> getPlayerToken(){return playerToken;}

    public int getShieldNb(){return shieldNb;}

    //Attribute
    private String name;
    private int age;
    private int nbTurn;
    private Wonder wonder;

    private TokenProgress tokenProgress;
    private int partyPoint;
    private int militaryPoint;
    private boolean controlCat;
    private ArrayList<Card> deckCard;

    private HashMap<String, Integer> playerToken;
    private HashMap<String, Integer> ressourceList;
    private int shieldNb;



}
