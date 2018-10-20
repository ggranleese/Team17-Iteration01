package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class EndGameTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		table.notifyObservers();
		
		player.endTurn();
		
		assertTrue(table.isOver());
	
	}

}
