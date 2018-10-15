package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerStartDrawTest {

	@Test
	public void test() {
		int PossibleDraws[] = {1,2,3,4};
		int result[] = Rummikub.StartDraw(PossibleDraws);
		
		assertTrue(PossibleDraws[0] != result[0] &&
				PossibleDraws[1] != result[1] &&
				PossibleDraws[2] != result[2] &&
				PossibleDraws[3] != result[3] 
				); 
		
		 
	}

}
