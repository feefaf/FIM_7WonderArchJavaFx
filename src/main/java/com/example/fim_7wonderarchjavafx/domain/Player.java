package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Player {
    public Player(String nom, int age){
        name = nom;
        this.age = age;
        partyPoint = 0;
        militaryPoint = 0;
        shieldNb = 0;
        controlCat = false;
        ressourceList.put("brick", 0);
        ressourceList.put("wood", 0);
        ressourceList.put("stone", 0);
        ressourceList.put("paper", 0);
        ressourceList.put("glass", 0);
        ressourceList.put("gold", 0);
    }

    public int getAllPoints(){
        return partyPoint + militaryPoint + ((controlCat)?2:0);
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

    private ArrayList<ProgressTokens> playerToken;
    private HashMap<String, Integer> ressourceList;
    private int shieldNb;

}
