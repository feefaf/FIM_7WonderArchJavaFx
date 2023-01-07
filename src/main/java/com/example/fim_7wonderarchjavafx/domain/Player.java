package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Player {
    public Player(String nom, int age){
        name = nom;
        this.age = age;
        partyPoint = 0;
        militaryPoint = 0;
        shieldNb = 0;
        cat = false;
        ressourceList.put("brick", 0);
        ressourceList.put("wood", 0);
        ressourceList.put("stone", 0);
        ressourceList.put("paper", 0);
        ressourceList.put("glass", 0);
        ressourceList.put("gold", 0);
    }

    public int getAllPoints(){
        return partyPoint + militaryPoint + ((cat)?2:0);
    }
//Gain
    public void gainPartyPoint(int points){
        partyPoint+=points;
    }
    public void gainMilitaryPoint(int points){ militaryPoint+=points;}

    //Permet d'augmenter le nombre de
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
    public boolean getCat(){return cat;}
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
    private boolean cat;
    private ArrayList<Card> deckCard;
    private HashMap<String, Integer> ressourceList;
    private int shieldNb;

}
