package core;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerDrawTieTest {

	@Test
	public void test() {
		Tile WhoGoesFirst[] = {new Tile(10,G), new Tile(10,G)};
		Tile result[] = Rummikub.ResloveTies(WhoGoesFirst);
		
		assertTrue(result[0].getNumber() != result[1].getNumber()); 
		
		Tile WhoGoesFirst1[] = {new Tile(9,G), new Tile(10,G)};
		Tile result1[] = Rummikub.ResloveTies(WhoGoesFirst1);
		
		assertTrue(result1[0].getNumber() != result1[1].getNumber()); 
	}

}
