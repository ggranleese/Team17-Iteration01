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
	
	public void removeTile(int c, int v) {
		
		int n = this.hand.size();
		
		for(int i =0; i<n; i++) {
			if(this.hand.get(i).getValue() == v && this.hand.get(i).getColour() == c) {
				this.hand.remove(i);
				break;
			}
		}
	}

	//GETTERS
	public ArrayList<Tile> getHand() {
		return this.hand;
	}
	
	public int getSize() {
		return this.hand.size();
	}
}
