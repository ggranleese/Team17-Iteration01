package core;

public class Tile {
	
	private int value;
	private int colour;

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