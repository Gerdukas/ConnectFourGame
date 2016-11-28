/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import connect.four.board.Board;
import connect.four.board.ReadWritableBoard;
import connect.four.player.ComputerPlayer;
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
public class computerPlayerTest {
	
	public computerPlayerTest() {
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
	public void testComputerPlayerNegativeDepth() {
	    ComputerPlayer player1 = new ComputerPlayer(-6);
	    RandomPlayer player2 = new RandomPlayer();
	    Board board1 = new Board(6,6);
	    
	    player1.performPlay(board1);
	    player2.performPlay(board1);
	    
	    player1.performPlay(board1);
	    assertTrue(true);
	}
	
}
