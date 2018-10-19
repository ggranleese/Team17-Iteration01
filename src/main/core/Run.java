package core;

import java.util.ArrayList;

public class Run implements Meld{
	
	//MEMBERS
private	ArrayList<Tile> tiles;
private int typeOfMeld;
private Boolean valid;

	//CONSTRUCTORS
	public Run(ArrayList<Tile> tiles) {
		this.tiles = tiles;
		this.valid = checkValid(tiles);
		this.typeOfMeld = 1;
	}
	
	//METHODS
	private Boolean checkValid(ArrayList<Tile> tiles) {
		  for(int i=1; i< tiles.size();i++){
			  //checks colours are equal
		      if(tiles.get(i-1).getValue()>tiles.get(i).getValue()) {
		            return false;
		        }
		      //checks values are incrementing by 1
		        if(tiles.get(i).getValue() - tiles.get(i-1).getValue() != 1)
		            return false;
		    }
		    return true; 
	}

	//GETTERS
	public ArrayList<Tile> getTiles() {
		return tiles;
	}

	public int getTypeOfMeld() {
		return this.typeOfMeld;
	}

	public boolean isValid() {
		return this.valid;
	}

}
