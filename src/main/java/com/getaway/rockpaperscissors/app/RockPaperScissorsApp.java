package com.getaway.rockpaperscissors.app;

import java.util.Random;
import com.getaway.rockpaperscissors.service.RockPaperScissorsImpl;

public class RockPaperScissorsApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX_GAMES = 1000;
		RockPaperScissorsImpl impl = new RockPaperScissorsImpl();
		Random random = new Random();
		for(int game = 1; game <= MAX_GAMES; game++) {
			int player2ShapeVal = random.nextInt(3); //As Player 1 constantly uses Rock, only Player2 shape is considered
			String player2Result = impl.findResult(player2ShapeVal);
			System.out.println("Game:"+game+" [Player2 => "+player2Result+"; Player1 => "+impl.findPlayer1Result(player2Result)+"]");
		}
	}

	

}
