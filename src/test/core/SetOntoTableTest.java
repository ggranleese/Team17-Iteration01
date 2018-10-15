package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class SetOntoTableTest extends TestCase {

	@Test
	public void test() {
			ArrayList<Tile> tiles = new ArrayList<Tile>();
			tiles.add(new Tile(1,3));
			tiles.add(new Tile(1,4));
			tiles.add(new Tile(1,5));
			
			Set set = new Set(tiles);	
			
			Table table = new Table();
			table.add(set);
			
			Assert.assertTrue(table.getMelds().get(0).getTypeOfMeld() == 0);
	}
}

