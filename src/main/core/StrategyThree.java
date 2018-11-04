package core;

import java.util.ArrayList;

public class StrategyThree implements IStrategy {
	
	public ArrayList<Meld> play(ArrayList<Tile> hand){
		return checkPlays(hand);
	}
	
	public ArrayList<Meld> checkPlays(ArrayList<Tile> hand){
		ArrayList<Meld> tmp;
		tmp.add(checkRun(hand));
		tmp.add(checkSet(hand));
		
		return tmp;
	
	}
	
	public int  checkTotalPoints(ArrayList<Meld> melds) {
		int counter = 0;
		for(Meld m : melds) {
			for (Tile t : m.getTiles()) {
				counter += t.getValue();
			}
		}
		
		return counter;
	}
}
