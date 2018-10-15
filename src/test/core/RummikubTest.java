package core;

import junit.framework.TestCase;

public class RummikubTest extends TestCase {

	public void testNumBotChoice() {
		int n = Rummikub.promptNumBotChoice();
		assertTrue(n >= 0);
	}
	
	
}
