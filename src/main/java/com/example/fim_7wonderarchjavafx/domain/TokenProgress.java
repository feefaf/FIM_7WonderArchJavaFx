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

    //Si on a 1 jeton culture alors on gagne 4 points et si on en a 2 on a 12 points
    public void cultureEffect(Player player){
        // Si le joueur à 1 fois le jeton et gagne 4 pts et si il a deux fois le jetons
        if (player.getPlayerToken().get("Culture") == 1){
            player.gainPartyPoint(4);
        } else if (player.getPlayerToken().get("Culture") == 2) {
            player.gainPartyPoint(12);
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


    //Si on a au moins une ressource gold disponible alors on rajoute une ressource gold en plus
    public void economieEffect(Player player){
            int newGoldRessource = player.getRessourceList().get("gold");
            if (newGoldRessource>=1){
                newGoldRessource+=1;
            }
        player.getRessourceList().replace("gold", newGoldRessource);

    }

    public void ingenieurieEffect(Player player){

    }

    //Rajout de deux bouclier
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
        //Commence à 2 car le jeton éducation est inclus
        int cpt = 2;

        //Boucle qui parcours le dictionnaire et qui vérifie si la valeur associé à la clé qui est le nom du jeton est sup à 1 afin
        //d'incrémenter le compteurs de 2 à chaque fois que la condition est vérifié
        for (Map.Entry<String,Integer> valueToken : player.getPlayerToken().entrySet()){
            String tokenName = valueToken.getKey();
            if (player.getPlayerToken().get(tokenName)>=1){
                cpt+=2;
            }
        }
        player.gainPartyPoint(cpt);

    }








    private String name;
    private String url;
}
