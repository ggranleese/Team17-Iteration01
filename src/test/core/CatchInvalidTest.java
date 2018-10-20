package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import junit.framework.TestCase;

public class CatchInvalidTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		table.notifyObservers();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(1,11));
		tiles.add(new Tile(1,12));
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles2.add(new Tile(2,3));
		tiles2.add(new Tile(2,4));
		tiles2.add(new Tile(2,5));
		tiles2.add(new Tile(2,7));
		
		ArrayList<Tile> tiles3 = new ArrayList<Tile>();
		tiles3.add(new Tile(2,10));
		tiles3.add(new Tile(3,10));
		tiles3.add(new Tile(4,10));
		
		ArrayList<Tile> tiles4 = new ArrayList<Tile>();
		tiles4.add(new Tile(2,10));
		tiles4.add(new Tile(3,10));
		tiles4.add(new Tile(2,10));
		
		Run run = new Run(tiles);
		Run run2 = new Run(tiles2);
		Set set = new Set(tiles3);
		Set set2 = new Set(tiles4);
		
		System.out.println(table.getMelds().size());
		player.playMeld(run);
		player.playMeld(run2);
		player.playMeld(set);
		player.playMeld(set2);
		System.out.println(table.getMelds().size());
		player.endTurn();
		System.out.println(table.getMelds().size());
		
		assertTrue(table.getMelds().get(0) == null);
	
	}

}
