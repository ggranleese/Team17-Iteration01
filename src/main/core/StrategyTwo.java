package core;

import java.util.ArrayList;

public class StrategyTwo implements IStrategy {

	public ArrayList<Meld> play(ArrayList<Tile> hand, Table table) {
		if(table.status) {
			checkRun();
			checkSet();
			whatToPlay();
			if (whatToPlay.values < 30) {
				//return empty(draw a tile)
			}
			else {
				return whatToPlay();
			}
		}
		else {
			//return empty(draw a tile)
		}
	}

}
