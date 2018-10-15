package core;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RunOntoTableTest {

	@Test
	public void test() {
		Run run = new Run(new Tile(3,"G"), new Tile(4,"G"), new Tile(5,"G"));
		Meld meld = new Meld(run); 
		Table table = new Table();
		table.add(meld);
		Assert.assertTrue(table.getMelds().get(0).type = 1);
	}

}
