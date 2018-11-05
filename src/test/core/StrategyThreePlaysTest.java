package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class StrategyThreePlaysTest extends TestCase{
	
	public void test() {
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(3);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		
		//bot should do nothing should do nothing since it doesn't have 30pts to play yet 
		bot.addTile(new Tile(1,9));
		bot.addTile(new Tile(2,9));
		bot.addTile(new Tile(3,9));
		
		((AI)bot).doTurn();
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
		
		//bot should play a set since it has 30 point 
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(initial < table.getMelds().size());
		
		//bot should play all of its tiles to win since it can + p1 has 3 less tiles
		assertTrue(bot.getHand().size() == 0);
	}
}
