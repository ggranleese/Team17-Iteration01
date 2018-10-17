package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThirtyPointsTest {

	@Test
	public void test() {
		Player player1 = new Player ();
		
		assertTrue(!player1.getStatus());
		
		Player player2 = new Player ();
		PlayerHand hand = player2.getPlayersHand();
		hand.addTile(new Tile(1,6));
		hand.addTile(new Tile(1,7));
		hand.addTile(new Tile(1,8));
		hand.addTile(new Tile(1,9));
		
		Run run = new Run(hand.getHand());
		hand.playMeld(run);
		
		assertTrue(player2.getStatus());
		
	}
}
