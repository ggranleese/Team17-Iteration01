package core;
import java.util.ArrayList;

import junit.framework.TestCase;

public class MakePlayersTest extends TestCase{

	public void test() {
		ArrayList<Player> players = new ArrayList<Player>();
		players = setPlayer(players, 4);
		assertTrue(players.size() == 4);
	}

}
