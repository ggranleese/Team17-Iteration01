package core;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Rummikub {

	public static void main(String[] args) {
		Player[] players = null;
		Pile pile;
		
		//Start the Game
		System.out.println("hey man welcome to Rummikub");
		
		//Fill Player[] (How many players?)
		//--Int n = Number of players
		
		//Determining Player Order
		//--Returns an array where players are represented by the element index
		//--i.e. Player1 is Array[0], Player2 is Array[1]...
		//--And the int value at that index is the order they play in
		//int turnOrder[] = PlayerOrder(n);
		
		//Players dealt 14 tiles each
		//Player with highest tile goes first
		
	}

	private static int[] playerOrder(int n) {
		int PossibleDraws[] = new int[n];
		for(int i = 0; i > n; i++) {
			PossibleDraws[i] = i+1;
		}
		startDraw(PossibleDraws);
		return (PossibleDraws);
	}
	
	private static Player[] playInOrder(int[] numArray) {
		int n = numArray.length;
		Player[] playerArray = new Player[n];
		for(int i=0; i<n;i++) {
			playerArray[numArray[i]] = new Player(); 
		}
		
		return playerArray;
	}

	static void startDraw(int[] turnOrder) {
		Random rnd = ThreadLocalRandom.current();
		    for (int i = turnOrder.length - 1; i > 0; i--)
		    {
		      int index = rnd.nextInt(i + 1);
		      // Simple swap
		      int a = turnOrder[index];
		      turnOrder[index] = turnOrder[i];
		      turnOrder[i] = a;
		    }
	}
	
	public static int promptNumBotChoice() {
		Scanner numBots = new Scanner(System.in);
		int n = numBots.nextInt();
		numBots.close();
		return n;
	}
	
}
