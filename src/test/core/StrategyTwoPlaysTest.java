package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class StrategyTwoPlaysTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player p1 = new Player();
		AI p2 = new AI(2);
		
		table.registerObserver(p1);
		table.registerObserver(p2);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		//p2 should do nothing as no one else has played 30
		
		//p2.doTurn();
		//p2.pushToTable(table);
		
		
		assertTrue(initial == table.getMelds().size());
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Run run = new Run(tiles);
		
		p1.playMeld(run);
		
		p1.pushToTable(table);
		
		initial = table.getMelds().size();
		
		p2.addTile(new Tile(1,10));
		p2.addTile(new Tile(2,10));
		p2.addTile(new Tile(3,10));
		
		//p2 should play a set as p1 has already played 30
		p2.doTurn();
		p2.pushToTable(table);
		
		assertTrue(initial < table.getMelds().size());
	}

}
