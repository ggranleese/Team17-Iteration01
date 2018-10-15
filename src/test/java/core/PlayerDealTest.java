package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerDealTest {

	@Test
	public void test() {
		Pile pile = new Pile();
		PlayerHand hand = new PlayerHand();
		hand.drawHand(pile);
		
		assertTrue(hand.getHand().length = 14); 
	}

}
