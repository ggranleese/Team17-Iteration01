package core;

import java.util.ArrayList;

public class Player {
	//MEMBERS
	private ArrayList<Tile> hand;
	private Boolean status;
	//CONSTRUCTORS
	public Player() {
		
		this.hand = new ArrayList<Tile>();
	}
	
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
	
	public String toString() {
		String output = "";
		for(int i=0; i<this.getSize(); i++){
			if(this.getTile(i).getColour() == 1) {
				if(this.getTile(i).getValue() == 1) {
					output += ("B1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("B2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("B3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("B4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("B5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("B6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("B7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("B8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("B9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("B10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("B11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("B12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("B13");
					
				}
			}else if(this.getTile(i).getColour() == 2) {
				
				if(this.getTile(i).getValue() == 1) {
					output += ("R1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("R2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("R3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("R4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("R5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("R6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("R7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("R8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("R9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("R10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("R11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("R12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("R13");
					
				}
			}else if(this.getTile(i).getColour() == 3) {
				
				if(this.getTile(i).getValue() == 1) {
					output += ("G1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("G2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("G3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("G4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("G5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("G6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("G7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("G8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("G9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("G10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("G11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("G12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("G13");
					
				}
			}else{
				
				if(this.getTile(i).getValue() == 1) {
					output += ("O1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("O2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("O3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("O4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("O5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("O6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("O7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("O8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("O9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("O10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("O11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("O12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("O13");
					
				}
			}
		}
		return (output);
	}

	public Tile getTile(int i) {
		return this.hand.get(i);
	}
	
	public void addTile(Tile t) {
		this.hand.add(t);
	}
	//GETTERS
	public ArrayList<Tile> getHand() {
		return this.hand;
	}
	public Boolean getStatus() {
		return this.status;
	}
	public int getSize() {
		return this.hand.size();
	}
}
