package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class StrategyTwoPlaysTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(2);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		//p2 should do nothing as no one else has played 30
		
		((AI)bot).doTurn(table);
		bot.pushToTable(table);
		
		assertTrue(initial == table.getMelds().size());
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Set run = new Set(tiles);
		
		p1.doTurn();
		p1.playMeld(run);
		p1.pushToTable(table);
		
		initial = table.getMelds().size();
		
		bot.addTile(new Tile(1,10));
		bot.addTile(new Tile(2,10));
		bot.addTile(new Tile(3,10));
		
		//p2 should play a set as p1 has already played 30
		((AI)bot).doTurn(table);
		((AI)bot).pushToTable(table);
		
		assertTrue(initial < table.getMelds().size());
	}

}
