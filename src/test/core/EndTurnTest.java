package core;

import junit.framework.TestCase;

public class EndTurnTest extends TestCase{

	public void test() {
		Player player = new Player();
		assertTrue(player.endTurn());
	}

}
