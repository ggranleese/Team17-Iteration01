package core;

import junit.framework.TestCase;

public class PlayInOrderTest extends TestCase{
	
	public void testPlayIntOrder() {
		int[] test = new int[4];
		test[0] = 4;
		test[1] = 1;
		test[2] = 2;
		test[3] = 3;
		
		PLayer[] playerArray = PlayInOrder(test);
		
		assertTrue(playerArray[3].playerNum == 1);
 	}
	
}
