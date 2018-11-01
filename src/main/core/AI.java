package core;

import java.util.ArrayList;

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
		System.out.println("Im a bot");
	}
	
	public ArrayList<Meld> checkHandPlays(){
		
	}
	
	public ArrayList<Run> checkRun(){
		
	}
	
	public ArrayList<Set> checkSet(){
		
	}
	
	//GETTERS
	
}
