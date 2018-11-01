package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class checkHandPlaysTest extends TestCase {

	public void testCheckHandPlays() {
		AI bot = new AI(1);
		ArrayList<Tile> tileList = new ArrayList<Tile>();
		tileList.add(new Tile(1,1));
		tileList.add(new Tile(2,1));
		tileList.add(new Tile(3,1));
		
		Set set = new Set(tileList);
		
		bot.addTile(new Tile(1,1));
		bot.addTile(new Tile(2,1));
		bot.addTile(new Tile(3,1));
		
		assertTrue(bot.checkHandPlays()[0] == set);
	}
}
