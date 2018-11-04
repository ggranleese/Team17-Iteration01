package core;

import junit.framework.TestCase;

public class StrategyOnePlaysTest extends TestCase{

	public void test() {
		Table table = new Table();
		AI bot = new AI(1);
		
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		//p2 should play a run
		
		bot.addTile(new Tile(1,10));
		bot.addTile(new Tile(2,10));
		bot.addTile(new Tile(3,10));
		
		((AI)bot).doTurn(table);
		((AI)bot).pushToTable(table);
		
		assertTrue(initial + 1 == table.getMelds().size());
		
		initial = table.getMelds().size();
		
		bot.addTile(new Tile(1,1));
		bot.addTile(new Tile(1,2));
		bot.addTile(new Tile(1,3));
		bot.addTile(new Tile(1,1));
		bot.addTile(new Tile(2,1));
		bot.addTile(new Tile(3,1));
		bot.addTile(new Tile(4,1));
		bot.addTile(new Tile(4,1));
		bot.addTile(new Tile(4,1));
		
		((AI)bot).doTurn(table);
		((AI)bot).pushToTable(table);
		//AI should be able to (and actually) play 2 melds
		assertTrue(initial + 2 == table.getMelds().size());
		
		
		
	}

}
