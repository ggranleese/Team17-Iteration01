package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PlayerHandRemoveCardTest extends TestCase{
	
	public void testRemoveCard() {
		ArrayList<Tile> playerHand = new ArrayList<Tile>();
		
		playerHand.addTile(1,1);
		playerHand.addTile(1,2);
		playerHand.removeTile(1,1);
		
		assertTrue(playerHand.get(0).getValue() == 2);
	}
	
	
}
