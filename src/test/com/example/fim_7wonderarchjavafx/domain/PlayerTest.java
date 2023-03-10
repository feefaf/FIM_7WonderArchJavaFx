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

            //On ajoute la piece dans la liste de pi??ce de la wonder
            wonder.getPieceList().add(piece1);

            //On v??rifie que la fonction nous retourne bien false car la pi??ce est initialement ?? false et nous n'avons pas chang?? son ??tat
            assertEquals(false,player.levelIsBuilt());

            //On v??rifie que l'on est rest?? ?? l'??tage 1 de la wonder
            assertTrue(wonder.getLevel()==1);
            assertFalse(wonder.getLevel()==2);

        }

    @Test
    public void testLevelIsBuiltTrueOnePiece() {
        // Initializing player, wonder, and pieces
        Wonder wonder = new Wonder("Alexandrie",new ArrayList<Piece>());
        Player player = new Player("player1",18,wonder);
        Piece piece1 = new Piece("piece1", "Alexandrie", 0, 0, 1, false, "", "", 0, false);

        //On change l'??tat de la pi??ce ?? true pour dire qu'elle est construite
        piece1.constructPiece();

        //On ajoute la piece dans la liste de pi??ce de la wonder
        wonder.getPieceList().add(piece1);

        //On v??rifie que la fonction nous retourne bien true car la pi??ce est d??sormais constrtuite vu que son ??tat est ?? true
        assertTrue(player.levelIsBuilt()==true);

        //On v??rifie que l'on est pass?? ?? l'??tage 2 de la wonder
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

        //On change l'??tat de la pi??ce 1 et 2 ?? true pour dire qu'elles sont construite sauf pour la pi??ce 3
        piece1.constructPiece();
        piece2.constructPiece();

        //On ajoute les pieces dans la liste de pi??ce de la wonder
        wonder.getPieceList().add(piece1);
        wonder.getPieceList().add(piece2);
        wonder.getPieceList().add(piece3);

        //On v??rifie que la fonction nous retourne bien false car toutes les pi??ces ne sont pas construite
        assertEquals(false,player.levelIsBuilt());

        //On v??rifie que l'on est r??st?? ?? l'??tage 1 de la wonder
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

        //On change l'??tat de la pi??ce 1 et 2 ?? true pour dire qu'elles sont construite sauf pour la pi??ce 3
        piece1.constructPiece();
        piece3.constructPiece();

        //On ajoute les pieces dans la liste de pi??ce de la wonder
        wonder.getPieceList().add(piece1);
        wonder.getPieceList().add(piece2);
        wonder.getPieceList().add(piece3);

        //On v??rifie que la fonction nous retourne bien false car toutes les pi??ces ne sont pas construite et que la pi??ce 1 a un ??tage n??gatif
        assertEquals(false,player.levelIsBuilt());

        //On v??rifie que l'on est r??st?? ?? l'??tage 1 de la wonder
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

        //On verifie que false est retourn??
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

        //On verifie que false est retourn??
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

        //On verifie que false est retourn?? car on s'est tromp?? en renseignant la cl??
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

        //On verifie que true est retourn??
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

        //On verifie que false est retourn??
        assertEquals(false, player.gotToken("Culture"));
        assertFalse(player.getPlayerToken().get("Culture")>=1 && player.getPlayerToken().get("Culture")<= 2);
    }

    @Test
    void dontGotCultureTokenTest2() {
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On verifie que false est retourn??
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

        //On verifie que false est retourn??
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

        //On verifie que false est retourn?? car on s'est tromp?? dans l'??criture de Culture
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

        //On verifie qu'on a bien 1 pi??ce d'or
        assertTrue(player.getRessourceList().get("gold")==1);
    }

    @Test
    void verifyValueAddRessource2(){
        //On initialise les variables Wonder et Player
        Wonder wonder = new Wonder("Alexandrie", new ArrayList<Piece>());
        Player player = new Player("Arnaud",20,wonder);

        //On ajoute la ressources gold
        player.addRessources("gauld");

        //On verifie qu'on a bien 0 pi??ce d'or car on a fait une faute d'orthographe
        assertTrue(player.getRessourceList().get("gold")==0);
    }



}