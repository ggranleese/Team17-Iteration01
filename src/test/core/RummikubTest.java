package core;

import java.util.Scanner;

import junit.framework.TestCase;

public class RummikubTest extends TestCase {

	public void testNumBotChoice() {
		Scanner numBots = new Scanner(System.in);
		int n = Rummikub.promptNumBotChoice(numBots);
		assertTrue(n >= 0);
	}
	
	public void testRunOrSet() {
		int n = Rummikub.promptRunOrSetChoice();
		assertTrue (n==1 || n== 0);	
	}
	
	
}
