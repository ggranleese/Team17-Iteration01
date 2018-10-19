package core;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class ThirtyPointsTest extends TestCase{

	public void test() {
		Player player1 = new Player();
		
		assertTrue(!player1.getStatus());
		
		Table table = new Table();
		Player player2 = new Player();
		
		table.registerObserver(player2);
		table.notifyObservers();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Run run = new Run(tiles);
		
		player2.playMeld(run);
		
		assertTrue(player2.getStatus());
		
	}
}
