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
	
	public void testAddMultipleMeldstoTable() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
		
		Run run = new Run(tiles);
		Run run2 = new Run(tiles2);
		Table table = new Table();
		table.add(run);
		table.add(run2);
		
		assertTrue(table.getMelds() != null);
		
	}
	
}
