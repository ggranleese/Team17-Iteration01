package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class PlayerDealTest extends TestCase{

	@Test
	public void test() {
		Pile pile = new Pile();
		PlayerHand hand = new PlayerHand();
		hand.drawHand(pile);

		assertTrue(hand.getHand().size() == 14); 
	}

}
