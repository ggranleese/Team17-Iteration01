package core;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Rummikub {
	Table table = new Table();
	public static void main(String[] args) {
		Player[] players = null;
		Pile pile;
		
		//Start the Game
		System.out.println("hey man welcome to Rummikub");
		int bots;
		while(true) {
			Scanner numBots = new Scanner(System.in);
			int n = promptNumBotChoice(numBots);
			if (n > 3 || n < 1) {
				System.out.println("Invalid choice. Please select between 1 and 3 bots.");
			}
			else {
				bots = n;
				break;
			}
		}
		
		int PlayerOrder[] = playerOrder(bots + 1);
		startDraw(PlayerOrder);
		Player Player[] = playInOrder(PlayerOrder);
		System.out.println(Player[0]);
		
	}

	//Player Order guide
	private static int[] playerOrder(int n) {
		int PossibleDraws[] = new int[n];
		for(int i = 0; i > n; i++) {
			PossibleDraws[i] = i+1;
		}
		startDraw(PossibleDraws);
		return (PossibleDraws);
	}
	
	//Makes Players
	private static Player[] playInOrder(int[] numArray) {
		int n = numArray.length;
		Player[] playerArray = new Player[n];
		for(int i=0; i<n;i++) {
			playerArray[numArray[i]] = new Player(); 
		}
		
		return playerArray;
	}

	//Puts players in correct order.
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
	
	public static int promptNumBotChoice(Scanner sc) {
	
		System.out.println("Choose number of bots: ");
		if(sc.hasNextLine()) {
			int userSelection = Integer.parseInt(sc.nextLine());
			return userSelection;
			}
			
			return -1;
	}
	
	public static int promptRunOrSetChoice() {
		System.out.println("Choose Run(1) or Set(2): ");
		Scanner runOrSet = new Scanner(System.in);
		int n = runOrSet.nextInt();
		runOrSet.close();
		return n;

	}
	
	public static void PlayerTurn(Observer player) {
		if(player.getIsBot()) {
			((AI) player).doTurn();
		}
		else {
			
		}
	}
	
}
