package core;

import java.util.ArrayList;

public class StrategyOne implements IStrategy {

	public ArrayList<Meld> play(ArrayList<Tile> hand, Table table) {
		ArrayList<Meld> plays = new ArrayList<Meld>();
		
		//checks all possible plays and returns all possible plays
		plays = checkHandPlays(hand);
		return plays;
		
	}
	
	
	public ArrayList<Run> checkRun(ArrayList<Tile> hand){
		
		
		ArrayList<Run> runs = new ArrayList<Run>();
		
		//work on one colour at a time
		for(int i=1; i<=4; i++) {
			//work on colour i
			ArrayList<Tile> colour = new ArrayList<Tile>();
			colour.addAll(colourSplitter(hand, i));
			// if array is empty, return empty
		 
			ArrayList<Integer> allValues = new ArrayList<Integer>();
	
			for (Tile e : colour)
				allValues.add(e.getValue());
	
			for (Tile e : colour) {
				int next = e.getValue() +1;
				int twoNext = e.getValue() +2;
				
				//if its possible for this value to be part of a run (+1 and +2 exist)
				if (allValues.contains(next) && allValues.contains(twoNext)) {
					ArrayList<Tile> hold = new ArrayList<Tile>();
					hold.add(new Tile(i,e.getValue()));
					while(allValues.contains(next)) {
						hold.add(new Tile(i, next));
						allValues.remove(Integer.valueOf(next));
						next++;
					}
			
					runs.add(new Run(hold));
					
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

		ArrayList<Run> possibleRuns = checkRun(hand);
		for(Run r : possibleRuns) {
			possiblePlays.add(r);
		}
		return possiblePlays;         
		
	}
}