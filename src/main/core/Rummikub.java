package core;

import java.util.*;


public class Rummikub {
	public static void main(String[] args) {
		
		//Start the Game
		System.out.println("hey man welcome to Rummikub");
		
		//-------------------------------------------------------------
		//FOR TESTING ONLY
		Table table = new Table();
		Player player = new Player();
		Player bot1 = new AI(1);
		Player bot2 = new AI(2);
		Player bot3 = new AI(3);
		
		table.registerObserver(player);
		table.registerObserver(bot1);
		table.registerObserver(bot2);
		table.registerObserver(bot3);
		
		table.getPile().populate();
		table.getPile().shuffle();
		
		table.notifyObservers();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		ArrayList<Tile> tiles2 = new ArrayList<Tile>();
		tiles2.add(new Tile(1,3));
		tiles2.add(new Tile(2,3));
		tiles2.add(new Tile(3,3));
		tiles2.add(new Tile(4,3));
		
		ArrayList<Tile> tiles3 = new ArrayList<Tile>();
		tiles3.add(new Tile(1,8));
		tiles3.add(new Tile(1,9));
		tiles3.add(new Tile(1,10));
		
		Set run = new Set(tiles);
		Set run2 = new Set(tiles2);
		Run set = new Run(tiles3);
		
		//player.playMeld(run);
		//player.playMeld(run2);
		//player.playMeld(set);
		
		player.drawHand();
		bot1.drawHand();
		bot1.sortHand();
		bot2.drawHand();
		bot2.sortHand();
		bot1.addTile(new Tile(1,10));
		bot1.addTile(new Tile(1,11));
		bot1.addTile(new Tile(1,12));
		bot3.drawHand();
		bot3.sortHand();
		
		
		while(table.getGameOver() == false) {
			
			player.sortHand();
			player.doTurn();
			
			if(player.endTurn()) {
				player.pushToTable(table);
			}
			else {
				System.out.println("Invalid melds played.\n");
			}
	
			
			((AI)bot1).doTurn();
			bot1.pushToTable(table);
			
			((AI)bot2).doTurn();
			bot2.pushToTable(table);
			
			//((AI)bot3).doTurn();
			//bot3.getHand().clear();
			//bot3.pushToTable(table);
		}
		System.out.println("Ganme Over.");
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
