package core;

import java.util.ArrayList;

public class AI extends Player{
	//MEMBERS
private ArrayList<Tile> hand;
private Boolean status;
private Boolean isBot;
private Integer strategy;

	//CONSTRUCTORS
	public AI(int strat) {
		this.hand = new ArrayList<Tile>();
		this.strategy = strat;
		this.isBot = true;
	}
	
	//METHODS
	public void doTurn() {}
	
	//GETTERS
	public Boolean getIsBot() {
		return this.isBot;
	}
	
}
