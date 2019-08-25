package com.getaway.assignment.test;

import org.junit.Assert;

import org.junit.Test;

import com.getaway.rockpaperscissors.entities.HandGame;
import com.getaway.rockpaperscissors.service.RockPaperScissorsImpl;

/**
 * @author Gowtham
 *
 */
public class RockPaperScissorsTest {
	
	
	@Test
	public void rpsMapValuesTest() {
		Assert.assertEquals(0, HandGame.ROCK.getShapeValue());
		Assert.assertEquals(1, HandGame.PAPER.getShapeValue());
		Assert.assertEquals(2, HandGame.SCISSORS.getShapeValue());
	}
	
	
	@Test
	public void testTie() {
		RockPaperScissorsImpl impl = new RockPaperScissorsImpl();
		Assert.assertEquals("Tie", impl.findResult(HandGame.ROCK.getShapeValue()));
	}
	
	@Test
	public void testPlayer2Win() {
		RockPaperScissorsImpl impl = new RockPaperScissorsImpl();
		Assert.assertEquals("Win", impl.findResult(HandGame.PAPER.getShapeValue()));
	}
	
	@Test
	public void testPlayer2Lost() {
		RockPaperScissorsImpl impl = new RockPaperScissorsImpl();
		Assert.assertEquals("Lost", impl.findResult(HandGame.SCISSORS.getShapeValue()));
	}
	
	@Test
	public void testPlayer1Result() {
		String player2Win = "Win";
		RockPaperScissorsImpl impl = new RockPaperScissorsImpl();
		Assert.assertEquals("Lost", impl.findPlayer1Result(player2Win));
		
		String player2Lost = "Lost";
		Assert.assertEquals("Win", impl.findPlayer1Result(player2Lost));
		
		String player2Tie = "Tie";
		Assert.assertEquals("Tie", impl.findPlayer1Result(player2Tie));
	}
}
