package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;

public class Wonder {

    public Wonder(String name, ArrayList<Piece> wonderStage){
        this.name = name;
        this.pieceList = wonderStage;
        this.level = 1;

    }



    //Getters

    public String getName(){return name;}
    public ArrayList<Piece> getPieceList(){return pieceList;}
    public int getLevel(){return level;}

    public void addLevel(){level+=1;}

    private ArrayList<Piece> pieceList;
    private int level;
    private String name;
}
