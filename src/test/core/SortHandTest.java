package core;

import junit.framework.TestCase;

public class SortHandTest extends TestCase{
	
	public void testSortHand() {
		Player player = new Player();
		
		player.addTile(new Tile(2,1));
		player.addTile(new Tile(3,2));
		player.addTile(new Tile(4,3));
		player.addTile(new Tile(1,1));
		player.addTile(new Tile(4,2));
		player.addTile(new Tile(1,3));
		
		sortHand(player.getHand());
	
		assertEquals(player.getHand().get(0).getValue(), "1");
		assertEquals(player.getHand().get(0).getColour(), "1");
	}
}
