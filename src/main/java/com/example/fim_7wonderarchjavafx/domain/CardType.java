package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;

/**
 * type of cards
 */
public enum CardType {

    // Material Cards
    CardMaterialWood("wood", Material.Wood, "card-material-wood-lumberjack.png"), //
    CardMaterialPaper("paper", Material.Paper, "card-material-paper-women.png"), //
    CardMaterialBrick("brick", Material.Brick, "card-material-brick-women.png"), //
    CardMaterialStone("stone", Material.Stone, "card-material-stone-stonecutter.png"), //
    CardMaterialGlass("glass", Material.Glass, "card-material-glass-women.png"), //

    // joker (mandatory replacing any material)
    CardMaterialGold("gold", Material.Gold, "card-material-gold-vizir.png"), //

    // Science cards
    CardScienceLaw("law", "law", "card-progress-law.png"), //
    CardScienceMechanic("mechanic", "mechanic", "card-progress-mechanic.png"), //
    CardScienceArchitect("architect", "architect", "card-progress-architect.png"), //

    // War Cards
    CardWar_barbarian("barbarian", 1, 1, "card-war-barbarian-1corn.png"), //
    CardWar_centurion("centurion", 1, 0, "card-war-centurion.png"),  //
    CardWar_archer("archer", 1, 2, "card-war-archer-2corns.png"), //

    // Polics Cards
    CardPolitic_emperor("emperor", 3, false, "card-politic-emperor-3laurel.png"), //
    //CardPolitic_cat("cat", 2, true, "card-politic-women-2laurel-cat.png") //
    ;

    // ------------------------------------------------------------------------

    public final String cardDisplayName;

    public final CardCategory cardCategory;

    /** material of the card, meaningfull only cardCategory==Material */
    public final Material material;

    /** drawing on the card, meaningfull only cardCategory==Science */
    public final String scienceCategory;

    /** number of shields, meaningfull only cardCategory==War */
    public final int shieldCount;
    /** number of corns, meaningfull only cardCategory==War */
    public final int cornCount;

    /** number of laurel, meaningfull only cardCategory==Politic */
    public final int laurelCount;
    /** with cat, meaningfull only cardCategory==Politic */
    public final boolean cat;

    public final String imageResource;

    // ------------------------------------------------------------------------

    private CardType(String cardDisplayName, CardCategory cardCategory, //
                     Material material, // only when cardCategory==Material
                     String scienceCategory, // only when cardCategory==Science
                     int shieldCount, int cornCount, // only when cardCategory==War
                     int laurelCount, boolean cat, // only when cardCategory==Politic
                     String imageResource) {
        this.cardDisplayName = cardDisplayName;
        this.cardCategory = cardCategory;
        this.material = material;
        this.scienceCategory = scienceCategory;
        this.shieldCount = shieldCount;
        this.cornCount = cornCount;
        this.laurelCount = laurelCount;
        this.cat = cat;
        this.imageResource = "images/cards/" + imageResource;
    }
    public String getCardName(){
        return cardDisplayName;
    }

    // for Material card
    private CardType(String cardDisplayName, Material material, String imageResource) {
        this(cardDisplayName, CardCategory.MaterialCard, material, null, 0, 0, 0, false, imageResource);
    }
    // for Science card
    private CardType(String cardDisplayName, String scienceCategory, String imageResource) {
        this(cardDisplayName, CardCategory.ProgressCard, null, scienceCategory, 0, 0, 0, false, imageResource);
    }
    // for War card
    private CardType(String cardDisplayName, int shieldCount, int cornCount, String imageResource) {
        this(cardDisplayName, CardCategory.WarCard, null, null, shieldCount, cornCount, 0, false, imageResource);
    }
    // for Politic card
    private CardType(String cardDisplayName, int laurelCount, boolean cat, String imageResource) {
        this(cardDisplayName, CardCategory.PoliticCard, null, null, 0, 0, laurelCount, cat, imageResource);
    }



}