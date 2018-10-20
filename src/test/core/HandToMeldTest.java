package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class HandToMeldTest extends TestCase{
	public void test() {
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		table.notifyObservers();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Run run = new Run(tiles);
		
		player.playMeld(run);
		
		int initial = table.getMelds().get(0).getTiles().size();
		
		player.addToMeld(table.getMelds().get(0), new Tile(4,10), 3);
		
		assertTrue(initial < table.getMelds().get(0).getTiles().size());
		
	}

}
