package core;

import java.util.ArrayList;
import java.util.Random;




public class Pile {
	
private ArrayList<Tile> pile;
	
	//CONSTRUCTOR
	public Pile(){
		this.pile = new ArrayList<Tile>();
	}
	
	//METHODS
	public void shuffle() {
		ArrayList<Tile> tmp = new ArrayList<Tile>();
		Random rand = new Random();
		int index = 0;
		int size = this.pile.size();
		for(int i=0; i < size; i++) {
			index = rand.nextInt((this.pile.size()-1)+1);
			tmp.add(this.pile.get(index));
			this.pile.remove(index);
		}
		
		this.pile = tmp;
	}

	//GETTERS
	public Tile getTile(int index) {
		return this.pile.get(index);
	}
	
	public ArrayList<Tile> getPile() {
		return this.pile;
	}

}
