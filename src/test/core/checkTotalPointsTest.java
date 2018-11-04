package core;

import java.util.ArrayList;

import junit.framework.TestCase;

public class checkTotalPointsTest extends TestCase{

	public void testCheckTotalPoints() {
		AI bot = new AI(3);
		
		ArrayList<Tile> setList = new ArrayList<Tile>();
		setList.add(new Tile(1,1));
		setList.add(new Tile(2,1));
		setList.add(new Tile(3,1));
		
		Set set = new Set(setList);
		
		ArrayList<Tile> runList = new ArrayList<Tile>();
		runList.add(new Tile(1,1));
		runList.add(new Tile(1,2));
		runList.add(new Tile(1,3));
		
		Run run = new Run(runList);
		
	
	
		
		assertTrue(bot.checkTotalPoints(set) == 3);
		assertTrue(bot.checkTotalPoints(run) == 6);


		
	}
}
