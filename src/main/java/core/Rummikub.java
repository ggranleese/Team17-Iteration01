package core;

import java.util.*;


public class Rummikub {

	public static void main(String[] args) {
		Player[] players = null;
		Pile pile;
		
		//Start the Game
		System.out.println("hey man welcome to Rummikub");
		
		//Fill Player[] (How many players?)
		//--Int n = Number of players
		
		//Draw initial tiles
		//--This is just done as array consisting of n unique integers.
		//--The position of the int in the array relates to the player
		//--i.e. Given: Int WhoGoesFirst[] = new Int[n];
		//--WhoGoesFirst[0] is player 1, WhoGoesFirst[1] is player 2 ...
		
		int PossibleDraws[] = {1,2,3,4};
		StartDraw(PossibleDraws);
		
		//Players dealt 14 tiles each
		//Player with highest tile goes first
		
	}
	
	
}
