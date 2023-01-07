package com.example.fim_7wonderarchjavafx.domain;

public enum CardBack {

	CentralDeck(null), //
	
	Alexandrie(WonderEnum.Alexandrie), //
	Halicarnasse(WonderEnum.Halicarnasse),
	Ephese(WonderEnum.Ephese), //
	Olympie(WonderEnum.Olympie), //,
	Babylone(WonderEnum.Babylone), //
	Rhodes(WonderEnum.Rhodes), //
	Gizeh(WonderEnum.Gizeh); //
	
	public final boolean centralDeck;
	// set only when not centralDeck
	public final WonderEnum wonderDeck;
	
	private CardBack(WonderEnum wonderDeck) {
		this.centralDeck = (wonderDeck == null);
		this.wonderDeck = wonderDeck;
	}
	
}
