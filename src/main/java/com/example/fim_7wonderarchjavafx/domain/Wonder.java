package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;

public class Wonder {

    public Wonder(String name, ArrayList<Piece> wonderStage){
        this.name = name;
        this.pieceList = wonderStage;
        this.level = 1;

    }

    public void WonderJavaFXDisplayer(int x, int y, int rotate){
        //Cette fonction permettra d'afficher la merveille en fonction de
        //sa localisation sur l'ecran, de sa localisation
    }

    //Getters

    public ArrayList<Piece> getPieceList(){return pieceList;}

    private ArrayList<Piece> pieceList;
    private int level;
    private String name;
}
