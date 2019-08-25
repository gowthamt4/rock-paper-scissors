package com.getaway.rockpaperscissors.service;

import com.getaway.rockpaperscissors.entities.HandGame;

public class RockPaperScissorsImpl {

	public String findResult(int shapeValue) {
		// TODO Auto-generated method stub
		if(shapeValue == HandGame.ROCK.getShapeValue()) {
			return "Tie";
		}else if (shapeValue == HandGame.PAPER.getShapeValue()) {
			return "Win";
		} else {
			return "Lost";
		}
	}
	
	/*
	 * Player1 Result is bound to Player2 result
	 */
	public String findPlayer1Result(String player2Result) {
		// TODO Auto-generated method stub
		if(player2Result == "Win") {
			return "Lost";
		}else if(player2Result == "Lost"){
			return "Win";
		} else {
			return "Tie";
		}
	}
	
}
