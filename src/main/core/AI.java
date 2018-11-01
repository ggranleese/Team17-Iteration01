package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AI extends Player{
	//MEMBERS
private ArrayList<Tile> hand;
private Boolean status;
private IStrategy strategy;

	//CONSTRUCTORS
	public AI(int strat) {
		this.hand = new ArrayList<Tile>();
		
		if(strat == 1) {
			this.strategy = new StrategyOne();
		}else if(strat == 2){
			this.strategy = new StrategyTwo();
		}else{
			this.strategy = new StrategyThree();
		}
	}
	
	//METHODS
	@Override
	public void doTurn() {
		ArrayList<Meld> whatToPlay;
		whatToPlay = strategy.play(this.hand);
		for(Meld m : whatToPlay) {
			playMeld(m);
			for(int i = 0; i > m.getTiles().size();i++) {
				removeTile(m.getTiles().get(i).getColour(), m.getTiles().get(i).getValue());
			}	
		}
	}
	
	
	
	
	
	//GETTERS
	
}
