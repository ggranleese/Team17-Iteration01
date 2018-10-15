package core;

import static org.junit.Assert.*;

import junit.framework.TestCase;

public class PileShuffleTest extends TestCase{

	public void testPileShuffle() {
		Pile pile = new Pile();
		Pile pile2 = new Pile();
		
		pile.populate();
		pile2.populate();
		
		pile.shuffle();
		
		assertTrue(pile.getTile(0) != pile2.getTile(0));
		
	}
}
