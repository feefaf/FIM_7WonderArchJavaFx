package com.example.fim_7wonderarchjavafx.domain;

import java.util.Arrays;
import java.util.List;

public class CardDecks {

	public static class CardTypeQuantity {
		public final int quantity;
		public final CardType cardType;
		public final String url;
		public CardTypeQuantity(int quantity, CardType cardType, String path) {
			this.quantity = quantity;
			this.cardType = cardType;
			this.url = path;
		}

		public String geturl() {return url;}
		//
	}
	
	/** Card Types x Quantities for Gizeh Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Gizeh = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(1, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(3, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(0, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(3, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //
	});

	/** Card Types x Quantities for Rhodes Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Rhodes = Arrays.asList(new CardTypeQuantity[] {
			// materiel
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //
			//
	});

	/** Card Types x Quantities for Babylon Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Babylon = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(1, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(3, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});
	
	/** Card Types x Quantities for Halicarnasse Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Halicarnasse = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(1, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(3, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});

	/** Card Types x Quantities for Alexandrie Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Alexandrie = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(1, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(4, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(1, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(2, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(2, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});

	/** Card Types x Quantities for Ephese Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Ephese = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(2, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(3, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(2, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(1, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(1, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(2, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});

	/** Card Types x Quantities for Olympie Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Olympie = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(1, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(2, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(2, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(3, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(2, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(1, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(1, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(2, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(2, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(1, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(1, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(3, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});

	/** Card Types x Quantities for extra Question Deck */
	public static final List<CardTypeQuantity> deckCardQuantities_Extra = Arrays.asList(new CardTypeQuantity[] {
			// material
			new CardTypeQuantity(4, CardType.CardMaterialWood, "src/main/resources/images/cards/card-material-wood-lumberjack.png"), //
			new CardTypeQuantity(4, CardType.CardMaterialPaper, "src/main/resources/images/cards/card-material-paper-women.png"), //
			new CardTypeQuantity(4, CardType.CardMaterialBrick,"src/main/resources/images/cards/card-material-brick-women.png"), // 2-1
			new CardTypeQuantity(4, CardType.CardMaterialStone,"src/main/resources/images/cards/card-material-stone-stonecutter.png"), //
			new CardTypeQuantity(4, CardType.CardMaterialGlass,"src/main/resources/images/cards/card-material-glass-women.png"), //
			new CardTypeQuantity(6, CardType.CardMaterialGold,"src/main/resources/images/cards/card-material-gold-vizir.png"), // 2+1
			// science
			new CardTypeQuantity(4, CardType.CardScienceLaw,"src/main/resources/images/cards/card-progress-law.png"), //
			new CardTypeQuantity(4, CardType.CardScienceMechanic,"src/main/resources/images/cards/card-progress-mechanic.png"), //
			new CardTypeQuantity(4, CardType.CardScienceArchitect,"src/main/resources/images/cards/card-progress-architect.png"), //
			// war
			new CardTypeQuantity(4, CardType.CardWar_barbarian,"src/main/resources/images/cards/card-war-barbarian-1corn.png"), //
			new CardTypeQuantity(4, CardType.CardWar_centurion,"src/main/resources/images/cards/card-war-centurion.png"), //
			new CardTypeQuantity(2, CardType.CardWar_archer,"src/main/resources/images/cards/card-war-archer-2corns.png"), // 0 !
			// politics
			new CardTypeQuantity(4, CardType.CardPolitic_emperor,"src/main/resources/images/cards/card-politic-emperor-3laurel.png"), //
			new CardTypeQuantity(8, CardType.CardPolitic_cat,"src/main/resources/images/cards/card-politic-women-2laurel-cat.png"), //

	});


}

