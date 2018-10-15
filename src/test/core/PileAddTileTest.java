package core;

import junit.framework.TestCase;

public class PileAddTileTest extends TestCase{

	public void addTileTest() {
		Pile pile = new Pile();
		Tile tile = new Tile(1,0);
		pile.addTile(tile);
		
		assertEquals(pile.getTile(0), tile);
		
	}
}
