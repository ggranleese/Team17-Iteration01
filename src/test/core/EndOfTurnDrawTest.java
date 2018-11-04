package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class EndOfTurnDrawTest extends TestCase{

	public void test() {
		Table table = new Table();
		Player player = new Player();
		Player player2 = new Player();
		table.getPile().populate();
		table.registerObserver(player);
		table.registerObserver(player2);
		table.notifyObservers();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Set set = new Set(tiles);
		
		player.playMeld(set);
		int sizeBeforeTurn = player.getHand().size();
		if(player.endTurn())
			player.pushToTable(table);
		int sizeAfterTurn = player.getHand().size();
		
		assertTrue(sizeAfterTurn == sizeBeforeTurn);
		
		
		player2.drawHand();
		
		sizeBeforeTurn = player2.getHand().size();
		if(player2.endTurn())
			player2.pushToTable(table);
		sizeAfterTurn = player2.getHand().size();
		assertTrue(sizeAfterTurn - sizeBeforeTurn == 1);
	}

}
