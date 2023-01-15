package com.example.fim_7wonderarchjavafx.domain;

public class TokenProgress {

    public TokenProgress(String nom/*, boolean effect*/){
        this.name = nom;
        //this.effect = false;
    }



    //public boolean getEffect(){return  effect;}
    public String getName(){return  name;}

    //public void setEffect(boolean effect){ this.effect = effect;}


    public void urbanismeEffect(Player player){

    }

    public void artisanatEffect(Player player){

    }

    public void joaillerieEffect(Player player){

    }

    public void cultureEffect(Player player){

    }

    public void scienceEffect(Player player){

    }

    public void propagandeEffect(Player player){

    }

    public void architectureEffect(Player player){

    }

    public void economieEffect(Player player){
            int newGoldRessource = player.getRessourceList().get("gold");
            if (newGoldRessource>1){
                newGoldRessource+=1;
            }
        player.getRessourceList().replace("gold", newGoldRessource);

    }

    public void ingenieurieEffect(Player player){

    }

    public void tactiqueEffect(Player player){
        player.gainShieldNb(2);
    }

    public void decorationEffect(Player player){

    }

    public void politiqueEffect(Player player){

    }

    public void strategieEffect(Player player){

    }

    public void educationEffect(Player player){

    }

    //Fonction qui va appliquer l'effet de la wonder
    public void directApplyTokenEffect(String nameToken,  Player player){
            switch (nameToken){
                case "Economie":
                    economieEffect(player);
                    break;
                case "Tactique":
                    tactiqueEffect(player);
                    break;
            }

    }

    public void piocheApplyTokenEffect(String nameToken,  Player player){
            switch (nameToken){
                case "Urbanisme":
                    urbanismeEffect(player);
                    break;
                case "Artisanat":
                    artisanatEffect(player);
                    break;
                case "Joaillerie":
                    joaillerieEffect(player);
                    break;
                case "Science":
                    scienceEffect(player);
                    break;
                case "Propagande":
                    propagandeEffect(player);
                    break;

            }

        }



    public void wonderBuiltApplyTokenEffect(String nameToken,  Player player){
            switch (nameToken){
                case "Architecture":
                    architectureEffect(player);
                    break;
                case "Ingénierie":
                    ingenieurieEffect(player);
                    break;
            }



    }

    public void endApplyTokenEffect(String nameToken,  Player player){
            switch (nameToken){
                case "Décoration":
                    decorationEffect(player);
                    break;
                case "Politique":
                    politiqueEffect(player);
                    break;
                case "Strategie":
                    strategieEffect(player);
                    break;
                case "Education":
                    educationEffect(player);
                    break;
                case "Culture":
                    cultureEffect(player);
                    break;
            }


    }




    private String name;
}
