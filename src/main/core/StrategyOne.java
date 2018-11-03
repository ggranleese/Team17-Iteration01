package core;

import java.util.ArrayList;

public class StrategyOne implements IStrategy {

	public ArrayList<Meld> play(ArrayList<Tile> hand, Table table){
		return checkPlays(hand);
	}
	public ArrayList<Meld> checkPlays(ArrayList<Tile> hand){
		ArrayList<Meld> tmp;
		tmp.add(checkRun(hand));
		tmp.add(checkSet(hand));
		
		return tmp;
	
	}
}