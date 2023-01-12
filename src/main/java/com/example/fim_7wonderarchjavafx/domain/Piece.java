package com.example.fim_7wonderarchjavafx.domain;

//import static javax.swing.text.rtf.RTFAttributes.BooleanAttribute.True;

public class Piece {

    Player player;
    public Piece(String nom, String merveille,
                 int PointsDeVictoire, int etage, boolean effet,
                 String urlArriere, String urlAvant){
        name = nom;
        wonder = merveille;
        pointPiece = PointsDeVictoire;
        level = etage;
        status = false;
        effect = effet;
        backImageUrl = urlArriere;
        frontImageUrl = urlAvant;
    }


    private void returnPiece(){
        this.status = true;
        applyWonderEffect(this.wonder, this.effect, player);
    }


    //Fonction qui va appliquer l'effet de la wonder
    public void applyWonderEffect(String nameWonder, boolean effect,  Player player){
        if (effect){
            switch (nameWonder){
                case "Alexandrie":

                    break;
                case "Ephèse":

                    break;
                case "Babylone":

                    break;
                case "Rhodes":

                    break;
                case "Halicarnasse":

                    break;
                case "Olympie":

                    break;
                case "Gizeh":

                    break;
            }
        }

    }

    //Attributs
    private int pointPiece;
    private String name;
    private String wonder;
    private int level;
    private boolean status;
    private boolean effect;
    private String backImageUrl;
    private String frontImageUrl;

    //Getters
    public int getPoints_piece(){return pointPiece;}
    public String getName(){return name;}
    public boolean getStatus() {return status;}
    public String getWonder(){return wonder;}
    public boolean getEffect(){return effect;}

}
