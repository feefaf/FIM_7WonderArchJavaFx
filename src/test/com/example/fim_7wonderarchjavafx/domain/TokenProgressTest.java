package com.example.fim_7wonderarchjavafx.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TokenProgressTest {

    @Test
    void culture1TokenEffectTest() {
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //On ajoute 7 points au joueur
        player.gainPartyPoint(7);

        //On obtient 1 jetons culture
        player.getPlayerToken().replace("Culture", 1);

        //On applique l'effet culture sur notre joueur
        tokenProgress.cultureEffect(player);

        //On est censé obtenir 11 points car 7+4
        assertTrue(player.getPartyPoint()==11);
    }

    @Test
    void culture2TokenEffectTest() {
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");


        //On obtient 1 jetons culture
        player.getPlayerToken().replace("Culture", 2);

        //On applique l'effet culture sur notre joueur
        tokenProgress.cultureEffect(player);

        //On est censé obtenir 12 points car 0+12
        assertTrue(player.getPartyPoint()==12);
    }



    @Test
    void tactiqueEffect() {
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //On applique l'effet tactique sur le joueur
        tokenProgress.tactiqueEffect(player);

        //On vérifie qu'on a obtenu 2 points
        assertTrue(player.getShieldNb()==2);
    }

    @Test
    void educationEffectTestWithOtherToken() {
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //On fait en sorte d'obtenir plusieurs jeton pour voir si le test est fonctionnel
        player.getPlayerToken().replace("Urbanisme",1);
        player.getPlayerToken().replace("Propagande",1);
        player.getPlayerToken().replace("Tactique",1);
        player.getPlayerToken().replace("Culture",1);

        //On applique l'effet éducation
        tokenProgress.educationEffect(player);

        //On vérifie que l'on obtient bien 10 points
        assertTrue(player.getPartyPoint()==10);
    }

    @Test
    void educationEffectTestOnlyWithEducationToken() {
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //Application de l'effet du jeton
        tokenProgress.educationEffect(player);

        //On vérifie que l'on a 2 gold car même si on a aucun autre jeton le jeton initiateur de l'effet est quand même inclue
        assertTrue(player.getPartyPoint()==2);
    }

    @Test
    void economieEffectWithNoGold(){
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //On applique l'effet du jeton
        tokenProgress.economieEffect(player);

        //On verifie que l'on obtient aucun gold vu qu'on l'on a rien dès le départ
        assertTrue(player.getRessourceList().get("gold")==0);
    }

    @Test
    void economieEffectWithGold(){
        //On initialise la wonder, le player et le jeton progrès
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Luc", 19, wonder);
        TokenProgress tokenProgress = new TokenProgress("","");

        //On rajoute 2 ressources Or au joueur
        player.getRessourceList().replace("gold",2);

        //On applique l'effet économie
        tokenProgress.economieEffect(player);

        //On vérifie que l'on obtient bien 3 gold au final donc 1 gold en plus
        assertTrue(player.getRessourceList().get("gold")==3);
    }
}