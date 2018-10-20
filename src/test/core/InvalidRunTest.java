package core;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class InvalidRunTest {
	@Test
	public void test() {
		ArrayList<Tile> tiles1 = new ArrayList<Tile>();
		tiles1.add(new Tile(1,3));
		tiles1.add(new Tile(1,4));
		tiles1.add(new Tile(1,5));
		
		Run run = new Run(tiles1);	
		
		assertTrue(run.isValid());
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles2.add(new Tile(1,3));
		tiles2.add(new Tile(1,4));
		tiles2.add(new Tile(1,6));
		
		Run run2 = new Run(tiles2);	
		
		assertTrue(!run2.isValid());
		
		ArrayList<Tile> tiles3 = new ArrayList<Tile>();
		tiles3.add(new Tile(1,3));
		tiles3.add(new Tile(1,4));
		
		Run run3 = new Run(tiles3);	
		
		assertTrue(!run3.isValid());
	}
}
