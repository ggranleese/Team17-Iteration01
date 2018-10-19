package core;

import java.util.ArrayList;

public class AI extends Player{
	//MEMBERS
private ArrayList<Tile> hand;
private Boolean status;
private Integer strategy;

	//CONSTRUCTORS
	public AI(int strat) {
		this.hand = new ArrayList<Tile>();
		this.strategy = strat;
	}
	
	//METHODS
	public void doTurn() {
		System.out.println("Im a bot");
	}
	
	//GETTERS
	
}
