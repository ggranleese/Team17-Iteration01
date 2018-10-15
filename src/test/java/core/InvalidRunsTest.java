package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class InvalidRunsTest extends TestCase{

	@Test
	public void test() {
		ArrayList<Tile> tiles1 = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
		
		Set run = new Run(tiles);	
		
		Table table = new Table();
		table.add(Run);
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
	}

}
