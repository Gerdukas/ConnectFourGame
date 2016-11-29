/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import connect.four.board.Board;
import connect.four.player.RandomPlayer;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Gerdinha
 */
public class RandomPlayerTest {
	
	public RandomPlayerTest() {
	}

	// TODO add test methods here.
	// The methods must be annotated with annotation @Test. For example:
	//
	// @Test
	// public void hello() {}

	@BeforeClass
	public static void setUpClass() throws Exception {
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@BeforeMethod
	public void setUpMethod() throws Exception {
	}

	@AfterMethod
	public void tearDownMethod() throws Exception {
	}
	
	@Test
	public void testRandomPlayerName() {
	    Board board1 = new Board(7,6);
	    RandomPlayer randomPlayer1 = new RandomPlayer ();
	    assertEquals(randomPlayer1.getName(), "Computer");
	}
	
		@Test
	public void testRandomPlayerMove() {
	    int height = 5;
	    int width = 5;
	    
	    Board board1 = new Board(width,height);
	    RandomPlayer randomPlayer2 = new RandomPlayer();
	    randomPlayer2.performPlay(board1);
	    assertEquals(board1.getMoveCount(), 1);
	    
	    board1.clear();
	    for (int i =0; i < height * width; i++)
	    {
		    randomPlayer2.performPlay(board1);
		    assertEquals(board1.getMoveCount(), i+1);
	    }
	}
}
