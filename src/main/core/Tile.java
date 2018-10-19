package core;

public class Tile {
	
	private int value;
	private int colour;
	//LEGEND:
	//B = 1,
	//R = 2,
	//G = 3,
	//O = 4

	public Tile(int c, int v) {
		this.colour = c;
		this.value = v;
		
	}
	public int getValue() {
		return this.value;
	}
	public int getColour() {
		return this.colour;
	}
}