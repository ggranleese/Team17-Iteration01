package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PlayerHandToStringTest extends TestCase{

	
	public void testToString() {
		PlayerHand playerHand = new PlayerHand();
		
		playerHand.addTile(new Tile(1,1));
		playerHand.addTile(new Tile(1,2));
		playerHand.addTile(new Tile(1,3));
	
		assertEquals(playerHand.toString(), "B1B2B3");
	}
}
