package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class PlayerDealTest extends TestCase{

	@Test
	public void test() {
		Pile pile = new Pile();
		Player player = new Player();
		player.drawHand(pile);

		assertTrue(player.getHand().size() == 14); 
	}

}
