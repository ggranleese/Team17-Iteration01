package core;

import junit.framework.TestCase;

public class PlayerHandRemoveCardTest extends TestCase{
	
	public void testRemoveCard() {
		Player player = new Player();
		
		player.addTile(new Tile(1,1));
		player.addTile(new Tile(1,3));
		player.removeTile(1,1);
		
		assertTrue(player.getHand().get(0).getValue() == 3);
	}
	
	
}
