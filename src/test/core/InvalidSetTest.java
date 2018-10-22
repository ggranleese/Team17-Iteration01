package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class InvalidSetTest extends TestCase{

	public void test() {
		ArrayList<Tile> tiles1 = new ArrayList<Tile>();
		tiles1.add(new Tile(1,5));
		tiles1.add(new Tile(2,5));
		tiles1.add(new Tile(3,5));
		
		Set set = new Set(tiles1);	
		
		assertTrue(set.isValid());
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles2.add(new Tile(1,3));
		tiles2.add(new Tile(1,4));
		tiles2.add(new Tile(1,6));
		
		Set set2 = new Set(tiles2);	
		
		assertTrue(!set2.isValid());
	}

}
