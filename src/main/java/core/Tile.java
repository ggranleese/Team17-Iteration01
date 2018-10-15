package core;

public class Tile {
private int value;
private String colour;
	public Tile(int i, String string) {
		this.value = i;
		this.colour = string;
	}
	public int getValue() {
		return this.value;
	}
	public String getColour() {
		return this.colour;
	}
}