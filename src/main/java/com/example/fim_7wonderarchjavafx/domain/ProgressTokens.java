package com.example.fim_7wonderarchjavafx.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgressTokens {

	public static final List<ProgressToken> TOKENS = Collections.unmodifiableList(createTokenList());
	
	// there is 1 token of each type, and 2 tokens of the same 'Culture' type
	private static List<ProgressToken> createTokenList() {
		List<ProgressToken> res = new ArrayList<ProgressToken>();
		res.addAll(Arrays.asList(ProgressToken.values()));
		res.add(ProgressToken.Culture);
		return res;
	}

	//Fonction qui va appliquer l'effet de la wonder
	public void applyTokenEffect(String nameToken, boolean effect,  Player player){
		if (effect){
			switch (nameToken){
				case "Urbanisme":

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

}
