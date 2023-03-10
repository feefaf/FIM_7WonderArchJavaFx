package com.example.fim_7wonderarchjavafx.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    //------------------------------------------------------------------------------------
    //Test pour le fonction getAllPoint
    @Test
    void testGetAllPointsWithControlCatTrue() {
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("Mael",18,wonder);

        player.gainMilitaryPoint(2);
        player.gainPartyPoint(5);
        player.setControlCat(true);

        assertEquals(9, player.getAllPoints());
    }


    @Test
    public void testGetAllPointsWithControlCatFalse() {
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("Mael",18,wonder);

        player.gainMilitaryPoint(2);
        player.gainPartyPoint(5);
        player.setControlCat(false);


        assertEquals(7, player.getAllPoints());
    }

    @Test
    public void testGetAllPointsWithZeroValues() {
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("Mael",18,wonder);

        player.gainMilitaryPoint(0);
        player.gainPartyPoint(0);
        player.setControlCat(false);


        assertEquals(0, player.getAllPoints());
    }

    @Test
    public void testGetAllPointsWithNegValues() {
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("Mael",18,wonder);

        player.gainMilitaryPoint(-5);
        player.gainPartyPoint(-2);
        player.setControlCat(false);


        assertFalse(player.getAllPoints() != 0);
    }

    //------------------------------------------------------------------------------------
    //Test pour le fonction levelIsBuilt
        @Test
        public void testLevelIsBuiltFalseOnePiece() {
            // Initializing player, wonder, and pieces
            Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
            Player player = new Player("player1",18,wonder);
            Piece piece1 = new Piece("piece1", "Alexandrie", 0, 0, 1, false, "", "", 0, false);

            //On ajoute la piece dans la liste de pièce de la wonder
            wonder.getPieceList().add(piece1);

            //On vérifie que la fonction nous retourne bien false car la pièce est initialement à false et nous n'avons pas changé son état
            assertEquals(false,player.levelIsBuilt());

            //On vérifie que l'on est resté à l'étage 1 de la wonder
            assertTrue(wonder.getLevel()==1);
            assertFalse(wonder.getLevel()==2);

        }

    @Test
    public void testLevelIsBuiltTrueOnePiece() {
        // Initializing player, wonder, and pieces
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("player1",18,wonder);
        Piece piece1 = new Piece("piece1", "Alexandrie", 0, 0, 1, false, "", "", 0, false);

        //On change l'état de la pièce à true pour dire qu'elle est construite
        piece1.constructPiece();

        //On ajoute la piece dans la liste de pièce de la wonder
        wonder.getPieceList().add(piece1);

        //On vérifie que la fonction nous retourne bien true car la pièce est désormais constrtuite vu que son état est à true
        assertTrue(player.levelIsBuilt()==true);

        //On vérifie que l'on est passé à l'étage 2 de la wonder
        assertFalse(wonder.getLevel()==1);
        assertTrue(wonder.getLevel()==2);

    }

    @Test
    public void testLevelIsBuiltTrueTwoPiece() {
        // Initializing player, wonder, and pieces
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("player1",18,wonder);
        Piece piece1 = new Piece("piece1", "Alexandrie", 0, 0, 1, false, "", "", 0, false);
        Piece piece2 = new Piece("piece2", "Alexandrie", 0, 0, 1, false, "", "", 0, false);
        Piece piece3 = new Piece("piece3", "Alexandrie", 0, 0, 1, false, "", "", 0, false);

        //On change l'état de la pièce 1 et 2 à true pour dire qu'elles sont construite sauf pour la pièce 3
        piece1.constructPiece();
        piece2.constructPiece();

        //On ajoute les pieces dans la liste de pièce de la wonder
        wonder.getPieceList().add(piece1);
        wonder.getPieceList().add(piece2);
        wonder.getPieceList().add(piece3);

        //On vérifie que la fonction nous retourne bien false car toutes les pièces ne sont pas construite
        assertEquals(false,player.levelIsBuilt());

        //On vérifie que l'on est résté à l'étage 1 de la wonder
        assertTrue(wonder.getLevel()==1);
        assertFalse(wonder.getLevel()==2);

    }

    @Test
    public void testLevelIsBuiltTrueTwoPieceNeg() {
        // Initializing player, wonder, and pieces
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("player1",18,wonder);
        Piece piece1 = new Piece("piece1", "Alexandrie", 0, 0, -1, false, "", "", 0, false);
        Piece piece2 = new Piece("piece2", "Alexandrie", 0, 0, 1, false, "", "", 0, false);
        Piece piece3 = new Piece("piece3", "Alexandrie", 0, 0, 1, false, "", "", 0, false);

        //On change l'état de la pièce 1 et 2 à true pour dire qu'elles sont construite sauf pour la pièce 3
        piece1.constructPiece();
        piece3.constructPiece();

        //On ajoute les pieces dans la liste de pièce de la wonder
        wonder.getPieceList().add(piece1);
        wonder.getPieceList().add(piece2);
        wonder.getPieceList().add(piece3);

        //On vérifie que la fonction nous retourne bien false car toutes les pièces ne sont pas construite et que la pièce 1 a un étage négatif
        assertEquals(false,player.levelIsBuilt());

        //On vérifie que l'on est résté à l'étage 1 de la wonder
        assertTrue(wonder.getLevel()==1);
        assertFalse(wonder.getLevel()==2);

    }

//----------------
//Test pour la fonction gotToken

    @Test
    void haveTokenTest() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient le jeton propagande
        player.getPlayerToken().replace("Propagande",1);

        //On verifie que l'on a le jeton propagande
        assertTrue(player.getPlayerToken().get("Propagande")==1);
        assertEquals(true, player.gotToken("Propagande"));
    }
    @Test
    void dontHaveTokenTest() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On verifie que l'on a pas le jeton propagande
        assertEquals(false, player.gotToken("Propagande"));
        assertFalse(player.getPlayerToken().get("Propagande")==1);

    }



    @Test
    void dontHaveTokenTest2() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient le jeton propagande 3 fois (ce qui n'est pas possible donc cela devrait nous renvoyez false)
        player.getPlayerToken().replace("Propagande",3);

        //On verifie que false est retourné
        assertEquals(false, player.gotToken("Propagande"));
        assertFalse(player.getPlayerToken().get("Propagande")==1);

    }

    @Test
    void dontHaveTokenTest3() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient le jeton propagande -1 fois (ce qui n'est pas possible donc cela devrait nous renvoyez false)
        player.getPlayerToken().replace("Propagande",-1);

        //On verifie que false est retourné
        assertEquals(false, player.gotToken("Propagande"));
        assertFalse(player.getPlayerToken().get("Propagande")==1);

    }

    @Test
    void dontHaveTokenTest4() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient le jeton propagande -1 fois (ce qui n'est pas possible donc cela devrait nous renvoyez false)
        player.getPlayerToken().replace("Propagende",1);

        //On verifie que false est retourné car on s'est trompé en renseignant la clé
        assertEquals(false, player.gotToken("Propagande"));
        assertTrue(player.getPlayerToken().get("Propagande")==0);

    }

    @Test
    void haveGotCultureTokenTest() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient 2 jeton culture
        player.getPlayerToken().replace("Culture",2);

        //On verifie que true est retourné
        assertTrue(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
        assertEquals(true, player.gotToken("Culture"));
    }

    @Test
    void dontGotCultureTokenTest() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On obtient 4 jetons culture
        player.getPlayerToken().replace("Culture",4);

        //On verifie que false est retourné
        assertEquals(false, player.gotToken("Culture"));
        assertFalse(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
    }

    @Test
    void dontGotCultureTokenTest2() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On verifie que false est retourné
        assertEquals(false, player.gotToken("Culture"));
        assertFalse(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
    }

    @Test
    void dontGotCultureTokenTest3() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On a -1 jetons culture
        player.getPlayerToken().replace("Culture",-1);

        //On verifie que false est retourné
        assertEquals(false, player.gotToken("Culture"));
        assertFalse(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
    }

    @Test
    void dontGotCultureTokenTest4() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On a -1 jetons culture
        player.getPlayerToken().replace("Culltur",1);

        //On verifie que false est retourné car on s'est trompé dans l'écriture de Culture
        assertEquals(false, player.gotToken("Culture"));
        assertFalse(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
    }



    //----------------
//Test pour la fonction addRessources

    @Test
    void verifyValueAddRessource(){
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On ajoute la ressources gold
        player.addRessources("gold");

        //On verifie qu'on a bien 1 pièce d'or
        assertTrue(player.getRessourceList().get("gold")==1);
    }

    @Test
    void verifyValueAddRessource2(){
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On ajoute la ressources gold
        player.addRessources("gauld");

        //On verifie qu'on a bien 0 pièce d'or car on a fait une faute d'orthographe
        assertTrue(player.getRessourceList().get("gold")==0);
    }



}