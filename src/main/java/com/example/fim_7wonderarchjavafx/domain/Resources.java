package com.example.fim_7wonderarchjavafx.domain;

import java.util.HashMap;
import java.util.Map;



public class Resources {

        // Or
        private int gold;

        // Bois
        private int wood;

        // Pierre
        private int stone;

        // Clay
        private int clay;



        // Glass
        private int glass;

        // Papyrus
        private int papyrus;

        // Constructeur
        public Resources(int gold, int wood, int stone, int clay, int textile, int glass, int papyrus) {
            this.gold = gold;
            this.wood = wood;
            this.stone = stone;
            this.clay = clay;
            this.glass = glass;
            this.papyrus = papyrus;
        }



        // Getters
        public int getGold() { return this.gold; }
        public int getWood() { return this.wood; }
        public int getStone() { return this.stone; }
        public int getClay() { return this.clay; }
        public int getGlass() { return this.glass; }
        public int getPapyrus() { return this.papyrus; }

        // Setters
        public void setGold(int gold) { this.gold = gold; }
        public void setWood(int wood) { this.wood = wood; }
        public void setStone(int stone) { this.stone = stone; }
        public void setClay(int clay) { this.clay = clay; }
        public void setGlass(int glass) { this.glass = glass; }
        public void setPapyrus(int papyrus) { this.papyrus = papyrus; }

        // Méthodes



        public void add(Resources resources) {
            // Ajoute les ressources spécifiées aux ressources courantes
            this.gold += resources.getGold();
            this.wood += resources.getWood();
            this.stone += resources.getStone();
            this.clay += resources.getClay();
            this.glass += resources.getGlass();
            this.papyrus += resources.getPapyrus();
        }

        public void subtract(Resources resources) {
            // Soustrait les ressources spécifiées des ressources courantes
            this.gold -= resources.getGold();
            this.wood -= resources.getWood();
            this.stone -= resources.getStone();
            this.clay -= resources.getClay();
            this.glass -= resources.getGlass();
            this.papyrus -= resources.getPapyrus();
        }

    }



