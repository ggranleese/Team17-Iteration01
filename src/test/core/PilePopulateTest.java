package core;

import junit.framework.TestCase;

public class PilePopulateTest extends TestCase {
	
	public void testPopulatePile() {
		Pile pile = new Pile();
		pile.populate();
		System.out.println(pile.getPile().size());
		
		assertTrue(pile.getPile().size() != 0);
		assertTrue(pile.getPile().size() == 104);
	}

}
