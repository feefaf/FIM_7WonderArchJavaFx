package com.example.fim_7wonderarchjavafx.domain;

import java.util.Map;

public class TokenProgress {
    public TokenProgress(String nom, String url){
        this.name = nom;
        this.url = url;
    }

    public String getName(){return  name;}
    public String getUrl(){return url;}

    //public void setEffect(boolean effect){ this.effect = effect;}

    public void urbanismeEffect(Player player){

    }

    public void artisanatEffect(Player player){

    }

    public void joaillerieEffect(Player player){

    }

    public void cultureEffect(Player player){
        // Si le joueur à 1 fois le jeton et gagne 4 pts et si il a deux fois le jetons
        if (player.getPlayerToken().get("Culture") == 1){
            player.gainPartyPoint(4);
        } else if (player.getPlayerToken().get("Culture") == 2) {
            player.gainPartyPoint(2);
        }
        else {
            System.out.println("Vous ne possédez pas le jeton culture !");
        }
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
        //
        int cpt = 0;
        for (Map.Entry<String,Integer> valueToken : player.getPlayerToken().entrySet()){
            int value = valueToken.getValue();
            if (value>=1){
                cpt+=2;
            }
        }
        player.gainPartyPoint(cpt);

    }








    private String name;
    private String url;
}
