package core;

import java.util.ArrayList;

public class PlayerHand {
	//MEMBERS
private ArrayList<Tile> hand = new ArrayList<Tile>();
	
	//METHODS
	public void drawHand(Pile pile) {
		for(int i = 0; i<14; i++)
			this.hand.add(pile.getPile().get(0));
	}

	//GETTERS
	public ArrayList<Tile> getHand() {
		return this.hand;
	}
}
