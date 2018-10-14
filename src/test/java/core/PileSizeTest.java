package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PileSizeTest {

	@Test
	public void test() {
		Pile pile = new Pile();
		pile.make();
		
		assertTrue(pile.size == 104);
	}

}
