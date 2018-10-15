package core;

import java.util.ArrayList;

public class Table {
	//MEMBERS
private	ArrayList<Meld> Melds;

	public Table(){
		this.Melds = new ArrayList<Meld>();
	}
	//METHODS
	public void add(Meld meld) {
		this.Melds.add(meld);
	}

	//GETTERS
	public ArrayList<Meld> getMelds() {
		return this.Melds;
	}

}
