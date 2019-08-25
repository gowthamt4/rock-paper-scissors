package com.getaway.rockpaperscissors.entities;

public enum HandGame {
	ROCK(0), PAPER(1), SCISSORS(2);
	
	int shapeValue;
	HandGame(int shapeValue){
		this.shapeValue = shapeValue;
	}
	
	public int getShapeValue() {
		return shapeValue;
	}
	
}
