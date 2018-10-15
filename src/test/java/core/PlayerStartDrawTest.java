package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerStartDrawTest {

	@Test
	public void test() {
		int PossibleDraws[] = {1,2,3,4};
		Tile result[] = Rummikub.StartDraw(PossibleDraws);
		
		assertTrue(result[0].getNumber() != result[1].getNumber()); 
		
		 
	}

}
