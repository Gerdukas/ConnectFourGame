/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import connect.four.player.ConsolePlayer;
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
public class ConsolePlayerTest {
	
	public ConsolePlayerTest() {
	}

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
	public void testConsolePlayerConstructor() {
	    ConsolePlayer p1 = new ConsolePlayer("Gerda");
	    ConsolePlayer p2 = new ConsolePlayer("John");
	    String name = p1.getName();
	    String name2 = p2.getName();
	    assertEquals(name, "Gerda");
	    assertNotEquals(name2, "Gerda");
	}
	
	@Test
	public void testSetName(){
	
	}
}
