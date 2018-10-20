package core;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Rummikub {
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
		
		//TESTING
		Table table = new Table();
		Player player = new Player();
		Player bot = new AI(1);
		
		table.registerObserver(player);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Run run = new Run(tiles);
		
		player.playMeld(run);
		player.playMeld(run);
		player.playMeld(run);
		
		player.pushToTable(table);
		
		player.drawHand();
		player.doTurn();
		bot.doTurn();
		
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
	
}
