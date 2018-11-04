package core;

import junit.framework.TestCase;

public class EndGameTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player player = new Player();
		Player player2 = new Player();
		Pile pile = new Pile();
		pile.populate();
		
		table.registerObserver(player);
		table.registerObserver(player2);
		table.notifyObservers();
		
		player.drawHand();
		
		if(player.endTurn())
			player.pushToTable(table);
		
		assertTrue(!table.getGameOver());
		
		if(player2.endTurn())
			player2.pushToTable(table);
		
		assertTrue(table.getGameOver());
		
	}

}
