package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    public Player(String nom, int age, Wonder wonder){
        name = nom;
        this.age = age;
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

    // Vérifie si les ressources courantes peuvent payer le cout spécifié
    public boolean canAfford(HashMap<String, Integer> cout) {
        for (Map.Entry<String, Integer> entry : cout.entrySet()) {
            String ressource = entry.getKey();
            int quantity = entry.getValue();
            if (!this.ressourceList.containsKey(ressource) || this.ressourceList.get(ressource) < quantity) {
                return false;
            }
        }
        return true;
    }


    public void payCost(HashMap<String, Integer> cout) {
        // Déduit le coût spécifié des ressources courantes
        for (Map.Entry<String, Integer> entry : cout.entrySet()) {
            String ressource = entry.getKey();
            int quantity = entry.getValue();
            int ressourcesActuelles = this.ressourceList.get(ressource);
            this.ressourceList.put(ressource, ressourcesActuelles - quantity);
        }
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
        if (playerToken.get(nameToken) == 1) {
            playerToken.replace(nameToken,0);
            return true;
        }
        return false;
    }

    //Gain
    public void gainPartyPoint(int points){
        partyPoint+=points;
    }
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
    public int getShieldNb(){return shieldNb;}

    //Attribute
    private String name;
    private int age;
    private int nbTurn;
    private Wonder wonder;
    private int partyPoint;
    private int militaryPoint;
    private boolean controlCat;
    private ArrayList<Card> deckCard;

    private HashMap<String, Integer> playerToken;
    private HashMap<String, Integer> ressourceList;
    private int shieldNb;



}
