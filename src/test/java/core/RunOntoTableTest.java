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
		tiles.add(new Tile(3,"G"));
		tiles.add(new Tile(4,"G"));
		tiles.add(new Tile(5,"G"));
		
		Run run = new Run(tiles);	
		
		Table table = new Table();
		table.add(run);
		System.out.println(table.getMelds().size()); 
		
		Assert.assertTrue(table.getMelds().get(0).getTypeOfMeld() == 1);
	}

}
