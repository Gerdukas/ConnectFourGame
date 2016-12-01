/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import connect.four.Game;
import connect.four.board.Board;
import connect.four.board.ReadWritableBoard;
import connect.four.player.Player;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Gerda Fraimanaite
 */
public class TestGame {

	TestPlayer player1;
	TestPlayer player2;
	Board board;
	Game game;
	
	public class TestPlayer implements Player{

		private int playerMove;
		
		@Override
		public String getName() {
			return "player1";
		}

		@Override
		public void performPlay(ReadWritableBoard board) {
			board.play(playerMove, this);
		}
		
		public int getNextMove(){
			return playerMove;
		}
		
		public void setNextMove(int playerMove){
			this.playerMove =playerMove;
		}
		
	}
	
	/**
	 * Called before the tests start. Run once.
	 * 
	 * @throws Exception java.lang.Exception
	 */

	@BeforeClass
	public void setUpClass() throws Exception {
		
	}
	/**
	 * Called after the class has been initialized. Run once.
	 * 
	 * @throws Exception java.lang.Exception
	 */
	@AfterClass
	public void tearDownClass() throws Exception {

	}
	/**
	 * Sets up the test fixture (Called before every test case method.)
	 * 
	 * @throws Exception java.lang.Exception
	 */
	@BeforeMethod
	public void setUpMethod() throws Exception {
		this.player1 = new TestPlayer();
		this.player2 = new TestPlayer();
		this.board = new Board(6, 7);
		this.game = new Game(new Player[]{player1, player2}, board, 4);
	}

	/**
	 * Tears down the test fixture (Called after every test case method.)
	 * 
	 * @throws Exception java.lang.Exception
	 */
	@AfterMethod
	public void tearDownMethod() throws Exception {
				
		this.player1 = null;
		this.player2 = null;
		this.board = null;
	}
	/**
	 * Test number of players
	 */
	@Test
	public void testPlayerNumber()
	{
	    int playerNumber = game.getPlayers().size();
	    System.out.println("Players playing: " + playerNumber);
	    assertEquals (playerNumber, 2);
	}
	
	/**
	 * Test initial score of the game player 1 and player2
	 */
	@Test
	public void testGetScore()
	{
		assertEquals(game.getScore(player1),0);
		assertEquals(game.getScore(player2),0);
	}
	
	
	
	
}
