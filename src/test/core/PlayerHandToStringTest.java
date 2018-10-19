package core;

import junit.framework.TestCase;

public class PlayerHandToStringTest extends TestCase{

	
	public void testToString() {
		Player player = new Player();
		
		player.addTile(new Tile(1,1));
		player.addTile(new Tile(1,2));
		player.addTile(new Tile(1,3));
	
		assertEquals(player.toString(), "B1B2B3");
	}
}
