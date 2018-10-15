package core;

import java.util.ArrayList;

public class Run implements Meld{
	
	//MEMBERS
private	ArrayList<Tile> tiles;
private int typeOfMeld;

	//CONSTRUCTORS
	public Run(ArrayList<Tile> tiles) {
		this.tiles = tiles;
	}

	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	//GETTERS
	public int getTypeOfMeld() {
		return this.typeOfMeld = 1;
	}

}
