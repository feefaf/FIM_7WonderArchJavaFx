package com.example.fim_7wonderarchjavafx;

import com.example.fim_7wonderarchjavafx.domain.Piece;
import com.example.fim_7wonderarchjavafx.domain.Wonder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface WonderHash {
    public static void main(String[] args){
        //alexandrie.add(new Piece());
        //alexandrie.add(new Piece());
        //alexandrie.add(new Piece());
        //alexandrie.add(new Piece());
        //alexandrie.add(new Piece());


        //wondersHash.put("alexandrie", new  Wonder("alexandrie", alexandrie));
    }
    HashMap<String, Wonder> wondersHash = new HashMap<>();

    ArrayList<Piece> alexandrie = new ArrayList<>();
    ArrayList<Piece> babylon = new ArrayList<>();
    ArrayList<Piece> ephese = new ArrayList<>();
    ArrayList<Piece> giseh = new ArrayList<>();
    ArrayList<Piece> halicarnasse = new ArrayList<>();
    ArrayList<Piece> olympie = new ArrayList<>();
    ArrayList<Piece> rhodes = new ArrayList<>();

}
