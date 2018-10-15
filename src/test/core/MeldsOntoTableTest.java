package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MeldsOntoTableTest extends TestCase {

	public void testAddMeldsToTable() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
	
		
		Run run = new Run(tiles);
		Table table = new Table();
		table.add(run);
		
		assertTrue(table.getMelds() != null);
	}
	
}
