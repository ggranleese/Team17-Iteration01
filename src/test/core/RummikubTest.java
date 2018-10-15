package core;

import junit.framework.TestCase;

public class RummikubTest extends TestCase {

	public void testNumBotChoice() {
		int n = Rummikub.promptNumBotChoice();
		assertTrue(n >= 0);
	}
	
	public void testRunOrSet() {
		int n = Rummikub.promptRunOrSetChoice();
		assertTrue (n==1 || n== 0);	
	}
	
	
}
