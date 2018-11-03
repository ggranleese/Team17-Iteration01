package core;

import java.util.ArrayList;

public class StrategyTwo implements IStrategy {

	public ArrayList<Meld> play(ArrayList<Tile> hand, Table table) {
		ArrayList<Meld> plays = new ArrayList<Meld>();
	
		if(table.status) {
			checkRun(hand);
			checkSet(hand);
			plays = checkHandPlays(hand);
			//not the right condition
			if (plays.get(0).getTiles().get(0).getValue() < 30) {
				plays.clear();
				return plays;
			}
				//return empty(draw a tile)
			else {
				return plays;
			}
		
		}
		else {
			plays.clear();
			return plays;
		}
	}
	
	
	public ArrayList<Run> checkRun(ArrayList<Tile> hand){
		
		
		ArrayList<Run> runs = new ArrayList<Run>();
		ArrayList<Tile> hold = new ArrayList<Tile>();
		
		for(int i=1; i<=4; i++) {
			
			ArrayList<Tile> colour = new ArrayList<Tile>();
			colour.addAll(colourSplitter(hand, i));
			
			int counter = 1;
			
			for(int t=0; t<colour.size(); t++) {
			
				hold.add(hand.get(t));
			
				try {
				if(hand.get(t).getValue()+1 == hand.get(t+1).getValue()){
					counter++;

				}}catch(Exception IndexOutOfBoundsException) {
					if(counter <3) {
						hold.clear();
						
					}else {
						hold.add(hand.get(t));
						runs.add(new Run(hold));
						
					}
					counter = 1;
				}
			}
		}
			
			return runs;
		
	}
	
	public ArrayList<Set> checkSet(ArrayList<Tile> hand){
		ArrayList<Set> sets = new ArrayList<Set>();
		ArrayList<Tile> hold = new ArrayList<Tile>();

		
		for(int i=1; i<=4; i++){
			for(int t=0; t<colourSplitter(hand, i).size(); t++) {
				
				int counter = 1;
				hold.add(colourSplitter(hand, i).get(t));
				
				for(int j=1; j<=4; j++) {
					if(j==i){
						
						for(Tile x: colourSplitter(hand, j)) {
							if(x.getValue() == colourSplitter(hand, i).get(t).getValue()) {
								counter++;
								hold.add(x);
								break;
							}
						}
					}
					if(counter <3){
						hold.clear();
					}else {
						sets.add(new Set(hold));
						hold.clear();
						counter = 1;
					}
				}

			}
		}
		
		return sets;
		
		
	}
	public ArrayList<Tile> colourSplitter(ArrayList<Tile> hand, int i) {
		
		ArrayList<Tile> colour = new ArrayList<Tile>();
		
		for(int t = 0; t<hand.size(); t++) {
			if(hand.get(t).getColour() == i) {
				colour.add(hand.get(t));
			}
		}
		
		return colour;
	}

	public ArrayList<Meld> checkHandPlays(ArrayList<Tile> hand){
		ArrayList<Meld> possiblePlays = new ArrayList<Meld>();
		possiblePlays.addAll(checkRun(hand));
		possiblePlays.addAll(checkSet(hand));
		return possiblePlays;
		
	}
}