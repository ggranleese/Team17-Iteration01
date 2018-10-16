package core;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PlayerStartDrawTest extends TestCase{

	@Test
	public void test() {
		int PossibleDraws[] = {1,2,3,4};
		int PossibleDraws2[] = {1,2,3,4};
		Rummikub.startDraw(PossibleDraws2);
		
		
		assertTrue(PossibleDraws[0] != PossibleDraws2[0] &&
				PossibleDraws[1] != PossibleDraws2[1] &&
				PossibleDraws[2] != PossibleDraws2[2] &&
				PossibleDraws[3] != PossibleDraws2[3] 
				); 
		
		 
	}

}
