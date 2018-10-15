package core;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class RunOntoTableTest extends TestCase{

	@Test
	public void test() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,3));
		tiles.add(new Tile(1,4));
		tiles.add(new Tile(1,5));
		
		Run run = new Run(tiles);	
		
		Table table = new Table();
		table.add(run);
		System.out.println(table.getMelds().size()); 
		
		Assert.assertTrue(table.getMelds().get(0).getTypeOfMeld() == 1);
	}

}
