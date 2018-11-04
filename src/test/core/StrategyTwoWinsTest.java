package core;

import junit.framework.TestCase;

public class StrategyTwoWinsTest extends TestCase{

	public void test() {
		Table table = new Table();
		AI bot = new AI(2);
		
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		//p2 should play a run and win the game even if the run is not 30+
		
		bot.addTile(new Tile(1,4));
		bot.addTile(new Tile(1,5));
		bot.addTile(new Tile(1,6));
		
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(initial + 1 == table.getMelds().size());
		assertTrue(table.getGameOver());
		
	}

}
