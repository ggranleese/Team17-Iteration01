package core;

import junit.framework.TestCase;

public class PileDealTileTest extends TestCase {
	
	public void testRemoveTile() {
		Pile pile = new Pile();
		
		pile.populate();
		
		Int sizeHold = pile.getSize();
		pile.removeTile();
		
		assertTrue(pile.getPile.size() != sizeHold);
	}
}
