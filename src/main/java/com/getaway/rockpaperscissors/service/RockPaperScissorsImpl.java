package com.getaway.rockpaperscissors.service;

import com.getaway.rockpaperscissors.entities.HandGame;

public class RockPaperScissorsImpl {
	
	/*
	 * As Player1 constantly forms the ROCK shape, only Player2 shape is considered
	 * to the below function
	 */
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
	 * Player1 Result is bound to Player2 result.
	 * Player1 result is calculated using Player2 result from the below function
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
