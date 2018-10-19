package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ThirtyPointsTest {

	@Test
	public void test() {
		Player player1 = new Player();
		
		assertTrue(!player1.getStatus());
		
		Player player2 = new Player();
		player2.addTile(new Tile(1,7));
		player2.addTile(new Tile(1,8));
		player2.addTile(new Tile(1,9));
		
		Run run = new Run(player2.getHand());
		player2.playMeld(run);
		
		assertTrue(player2.getStatus());
		
	}
}
