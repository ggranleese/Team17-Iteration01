package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class PlayerOrderTest extends TestCase{
	
	public void testPlayerPosition() {
		
		ArrayList<Player> players = new ArrayList<Player>();
	
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		assertTrue(players.get(1) == player2);
	}
	
}
