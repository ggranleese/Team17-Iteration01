package core;

import java.util.ArrayList;
import java.util.Scanner;

import junit.framework.TestCase;

public class TestPlan extends TestCase{
	public static void main(String[] args) {
		
		Scanner choice = new Scanner(System.in);
		int userSelection = -1;
		while(true) {
		System.out.println("Select Requirement: ");
		if(choice.hasNextInt()) {
			userSelection = choice.nextInt();
			}
		switch(userSelection) {
			case 1: R1(); break;
			case 2: R2(); break;
			case 3: R3(); break;
			case 4: R4(); break;
			case 5: R5(); break;
			case 6: R6(); break;
			case 7: R7(); break;
			case 8: R8(); break;
			case 9: R9(); break;
			case 11: R10(); break;
			case 10: R11(); break;
			case 12: R12(); break;
			case 13: R13(); break;
			case 14: R14(); break;
			case 15: R15(); break;
			case 16: R16(); break;
			case 17: R17(); break;
			case 18: R18(); break;
			case 19: R19(); break;
			case 20: R20(); break;
		}
		}
	}

	
	public static void R1() {
		System.out.println("Requirement 1");
		Table table = new Table();
		Player player = new Player();
		AI bot1 = new AI(1);
		AI bot2 = new AI(2);
		AI bot3 = new AI(3);
		
		table.registerObserver(player);
		table.registerObserver(bot1);
		table.registerObserver(bot2);
		table.registerObserver(bot3);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();

		player.drawHand();
		
		bot1.drawHand();
		
		bot2.drawHand();
	
		bot3.drawHand();
		
	}
	public static void R2() {
		System.out.println("Requirement 2");
		Table table = new Table();
		Player player = new Player();
		AI bot1 = new AI(1);
		AI bot2 = new AI(1);
		AI bot3 = new AI(1);
		
		table.registerObserver(player);
		table.registerObserver(bot1);
		table.registerObserver(bot2);
		table.registerObserver(bot3);
		
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		player.drawHand();
		bot1.drawHand();
		bot2.drawHand();
		bot3.drawHand();
		
		player.doTurn();
		bot1.doTurn();
		bot2.doTurn();
		bot3.doTurn();
		
	}
	public static void R3() {
		//A table and player are first created
		//The table registers the player as an observer
		//The player is then prompted to interact with the UI and perform the operation
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		
		player.doTurn();
		
	}
	public static void R4() {
		System.out.println("Requirement 4");
		Table table = new Table();
		Player player = new Player();
		AI bot1 = new AI(1);
		AI bot2 = new AI(2);
		AI bot3 = new AI(3);
		
		table.registerObserver(player);
		table.registerObserver(bot1);
		table.registerObserver(bot2);
		table.registerObserver(bot3);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();

		player.drawHand();
		
		bot1.drawHand();
		
		bot2.drawHand();
	
		bot3.drawHand();
			
			//4a1
			assertTrue(!player.getStatus());
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,10));
				add(new Tile(2,10));
				add(new Tile(3,10));
				}}));
			assertTrue(player.getStatus());
			
			//4a2
			player.setStatus(false);
			assertTrue(!player.getStatus());
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,11));
				add(new Tile(2,11));
				add(new Tile(3,11));
				}}));
			assertTrue(player.getStatus());
			
			//4b1
			player.setStatus(false);
			assertTrue(!player.getStatus());
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,5));
				add(new Tile(2,5));
				add(new Tile(3,5));
				}}));
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,5));
				add(new Tile(2,5));
				add(new Tile(3,5));
				}}));
			assertTrue(player.getStatus());

			//4b2
			player.setStatus(false);
			assertTrue(!player.getStatus());
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,10));
				add(new Tile(2,10));
				add(new Tile(3,10));
				}}));
			player.playMeld(new Set(new ArrayList<Tile>() {{
				add(new Tile(1,10));
				add(new Tile(2,10));
				add(new Tile(3,10));
				}}));
			assertTrue(player.getStatus());
			
			//4c
			player.doTurn();
			player.hand.clear();
			player.pushToTable(table);
			assertTrue(table.getGameOver());
			player.setGameOver(false);
	}
	
	public static void R5() {
		//A table and player are first created
		//The table registers the player as an observer
		//The player is then prompted to interact with the UI and perform the operation
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		
		player.doTurn();
		
	}
	public static void R6() {
		//A table and player are first created
		//The table registers the player as an observer
		//The player is then prompted to interact with the UI and perform the operation
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		
		player.doTurn();
	}
	public static void R7() {
		System.out.println("Requirement 7");
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		player.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(1,11));
			add(new Tile(1,12));
			}}));
		
	}
	public static void R8() {
		
		//Player1 is given Run:
		//[R10, R11, R12]
		//Player1 plays the meld, increasing the table size by 1
		//Player1 then pushes to the table
		
		
		//Player2 is given a Set:
		//[R10, B10, G10]
		//Player2 plays the meld, increasing the table size by 1
		//Player2 then pushes to the table
		
		//Player3 is given 2 Runs:
		//[R10, R11, R12]
		//[B10, B11, B12]
		//Player3 plays the two melds, increasing the table size by 2
		//Player3 then pushes to the table
		
		//Player4 is given 2 Sets:
		//[R10, B10, G10]
		//[B10, G10, O10]
		//Player4 plays the two melds, increasing the table size by 2
		//Player4 then pushes to the table
		
		//Player5 is given a Run and a Set
		//Run: [R10, B10, G10]
		//Set: [B10, B11, B12]
		//Player5 plays the two melds, increasing the table size by 2
		//Player5 then pushes to the table
		
		
		

		System.out.println("Requirement 8");

		Table table = new Table();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();
		
		int tableSize = table.getMelds().size();
		
		table.registerObserver(player1);
		table.registerObserver(player2);
		table.registerObserver(player3);
		table.registerObserver(player4);
		table.registerObserver(player5);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		//8a
		player1.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(1,11));
			add(new Tile(1,12));
			}}));
		
		player1.pushToTable(table);
		
		assertTrue(table.getMelds().size() == tableSize + 1);
		
		//8b
		tableSize = table.getMelds().size();
		player2.playMeld(new Set(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,10));
			add(new Tile(3,10));
			}}));
		
		player2.pushToTable(table);
		assertTrue(table.getMelds().size() == tableSize +1);


		//8c
		tableSize = table.getMelds().size();
		player3.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(1,11));
			add(new Tile(1,12));
			}}));
		
		player3.playMeld(new Run(new ArrayList<Tile>() {{			
			add(new Tile(2,10));
			add(new Tile(2,11));
			add(new Tile(2,12));
			}}));
		
		player3.pushToTable(table);
		assertTrue(table.getMelds().size() == tableSize +2);
		
		//8d
		tableSize = table.getMelds().size();
		player4.playMeld(new Set(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,10));
			add(new Tile(3,10));
			}}));
		
		player4.playMeld(new Set(new ArrayList<Tile>() {{
			add(new Tile(2,11));
			add(new Tile(3,11));
			add(new Tile(4,11));
			}}));
		
		player4.pushToTable(table);
		assertTrue(table.getMelds().size() == tableSize +2);
		
		//8e
		tableSize = table.getMelds().size();
		player5.playMeld(new Set(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,10));
			add(new Tile(3,10));
			}}));
		
		player5.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(2,10));
			add(new Tile(2,11));
			add(new Tile(2,12));
			}}));
		
		player5.pushToTable(table);
		assertTrue(table.getMelds().size() == tableSize +2);


	}
	public static void R9() {
		//User starts turn with hand:
		//{[R1]}
		//User plays run:
		//{[R10] [R11] [R12]}
		
		// User draws [R13]
		//User can add [R13] to make:
		//{[R10] [R11] [R12] [R13]}
		//Users hand is now:
		//{[R1]}
		
		//User plays set:
		//{[R10] [B10] [G10]}
		
		// User draws [O10]
		//User can add [010] to make:
		//{[R10] [B10] [G10] [O10]}
		//Users hand is now:
		//{[R1]}
		
		//User draws: [R8] [R9]
		//User can add to:
		//{[R10] [R11] [R12] [R13]}
		//to make: 
		//{[R8] [R9] [R10] [R11] [R12] [R13]}
		//Users hand is now: [R1]
		
		//User draws: [R7] [R6]
		//User can take R8 from:
		//{[R8] [R9] [R10] [R11] [R12] [R13]}
		//to make: 
		//[R6] [R7] [R8]
		//Users hand is now: [R1]
		
		//User draws: [G10] [B10]
		//User can take R10 from:
		//{[R10] [B10] [G10] [O10]}
		//to make: 
		//{[R10] [B10] [G10]}
		//Users hand is now: [R1]
		
		//User draws: [R8] [R10]
		//User can add R8 to:
		//{[R9] [R10] [R11] [R12] [R13]}
		//to make: 
		//{[R8] [R9] [R10] [R11] [R12] [R13]}
		//User can add R10 to:
		//{[B10] [G10] [O10]}
		//To make: {[R10] [B10] [G10] [O10]}
		//Users hand is now: [R1]
		
		//User draws R9
		//User can take R10 from
		//{[R10] [B10] [G10] [O10]}
		//User can take R8 from
		//{[R8] [R9] [R10] [R11] [R12] [R13]}
		//User can make run
		//{[R8] [R9] [R10]}
		
		System.out.println("Requirement 9");
		Table table = new Table();
		
		Player player = new Player();
		
		table.registerObserver(player);
	
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		player.addTile(new Tile(1,1));
		
		player.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(1,11));
			add(new Tile(1,12));
			}}));
		player.addTile(new Tile(1,13));
		//9a
		player.doTurn();
		player.pushToTable(table);
		
		player.playMeld(new Set(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,10));
			add(new Tile(3,10));
			}}));
		player.addTile(new Tile(4,10));
		//9b
		player.doTurn();
		player.pushToTable(table);
		
		//9c
		player.addTile(new Tile(1,8));
		player.addTile(new Tile(1,9));
		player.doTurn();
		player.pushToTable(table);
		
		//9d
		player.addTile(new Tile(1,7));
		player.addTile(new Tile(1,6));
		player.doTurn();
		player.pushToTable(table);
		
		//9e
		player.addTile(new Tile(3,10));
		player.addTile(new Tile(2,10));
		player.doTurn();
		player.pushToTable(table);
		
		//9f
		player.addTile(new Tile(1,8));
		player.addTile(new Tile(1,10));
		player.doTurn();
		player.pushToTable(table);
		
		//9g
		player.addTile(new Tile(1,9));
		player.doTurn();
		player.pushToTable(table);
		
	}
	
	public static void R10() {
		System.out.println("Requirement 10");
		Table table = new Table();
		
		AI bot1 = new AI(1);
		AI bot2 = new AI(1);
		AI bot3 = new AI(1);
		
		table.registerObserver(bot1);
		table.registerObserver(bot2);
		table.registerObserver(bot3);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		bot1.addTile(new Tile(4,1));
		bot2.addTile(new Tile(4,1));
		bot3.addTile(new Tile(4,1));
		
		int tableSize1;
		int tableSize2;
		
		//10a
		System.out.println("10a");
		bot1.addTile(new Tile(1,10));
		bot1.addTile(new Tile(1,11));
		bot1.addTile(new Tile(1,12));
		tableSize1 = table.getMelds().size();
		bot1.doTurn();
		bot1.pushToTable(table);
		tableSize2 = table.getMelds().size();
		assertTrue(tableSize1 + 1 == tableSize2);
		
		//10b
		System.out.println("10b");
		bot2.addTile(new Tile(1,10));
		bot2.addTile(new Tile(1,11));
		bot2.addTile(new Tile(1,12));
		bot2.addTile(new Tile(1,10));
		bot2.addTile(new Tile(1,11));
		bot2.addTile(new Tile(1,12));
		bot2.doTurn();
		bot2.pushToTable(table);
		
		//10c
		System.out.println("10c");
		bot1.addTile(new Tile(1,10));
		bot1.addTile(new Tile(1,11));
		bot1.addTile(new Tile(1,12));
		bot1.doTurn();
		bot1.pushToTable(table);
		
		//10d
		System.out.println("10d");
		bot1.addTile(new Tile(1,10));
		bot1.addTile(new Tile(1,11));
		bot1.addTile(new Tile(1,12));
		bot1.addTile(new Tile(1,10));
		bot1.addTile(new Tile(1,11));
		bot1.addTile(new Tile(1,12));
		bot1.doTurn();
		bot1.pushToTable(table);
		
		//10e
		System.out.println("10e");
		bot3.addTile(new Tile(1,1));
		bot3.doTurn();
		bot3.pushToTable(table);
		
		//10f
		System.out.println("10f");
		bot3.doTurn();
		bot3.pushToTable(table);
	}


	public static void R11() {
		
		//11a and 11b
		//p3 is given three tiles:
		//[R1 : B2 : G3]
		//p3's turn goes by
		//assertTrue checks to make sure that p3 did not play since it didn't have 30+ points.
		testUnderThirty();
		
	}
	public static void R12() {
		
		//12a
		//p1 is given three tiles
		//[B9 : G5 : O1]
		//p1 doesn't make a play and draws a card giving them a total of 4 tiles
		//p3 is given six tiles
		//[R1 : R2 : R3 : B1 : B2 : B3]
		//p3 plays all its tiles to win game
		testWinGame();
		
	}
	public static void R13() {
		
		//13a and 13b
		//p1 is given three tiles
		//[B9 : G5 : O1]
		//p1 calls doTurn() and draws a random tile, giving them a total of 4 tiles
		//p3 is given seven tiles
		//[R9 : R10 : R11 : B9 : B10 : B11 : 01]
		//p1 has three fewer tiles than p3
		//p3 plays all its tiles to win game
		testThreeFewer();
		
	}
	
	public static void R14() {
		
		//Since we are not implementing table functions
		//this test function demonstrates the UI text ("p3 would reuse table")
		//when no other player has 3 fewer
		testUnderThirty();
		
	}

	public static void R15() {
		System.out.println("Requirement 15");
		//Player starts game with this hand:
		//{[R10] [B10] [G10] [R10]}
		//Player plays a set with these tiles
		//A player has now played 30 points
		//Bot does its turn with this hand:
		//{[R10]}
		//Bot is unable to make a meld with these tiles so it draws a tile
		//Bot does its turn with this hand:
		//{[R10] [R11] [R12]}
		//Bot is able to play a meld and does so
		
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(2);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
	
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Set run = new Set(tiles);
		
		p1.addTile(new Tile(1,1));
		p1.playMeld(run);
		p1.pushToTable(table);
		
		int initial = table.getMelds().size();
		
		//15b
		bot.addTile(new Tile(1,10));
		
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(initial == table.getMelds().size());
		
		//15a
		bot.addTile(new Tile(1,11));
		bot.addTile(new Tile(1,12));
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(initial +1 == table.getMelds().size());
	}
	
	public static void R16() {
		System.out.println("Requirement 16");
		//User starts game with this hand:
		//{[R10] [B10] [G10] [R10]}
		//User plays a set with these tiles
		//A player has now played 30 points
		//Bot does its turn with this hand:
		//{[R5] [R6] [R7]}
		//Bot is able to win so plays a run with these tiles even though the value != 30
		
		Table table = new Table();
		Player player = new Player();
		AI bot = new AI(2);
		
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		tiles.add(new Tile(1,10));
		tiles.add(new Tile(2,10));
		tiles.add(new Tile(3,10));
		
		Set run = new Set(tiles);
		
		player.addTile(new Tile(1,1));
		player.playMeld(run);
		player.pushToTable(table);
		
		//15a
		bot.addTile(new Tile(1,5));
		bot.addTile(new Tile(1,6));
		bot.addTile(new Tile(1,7));
		
		//16a
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(table.getGameOver());
		
	}
	public static void R17() {}
	public static void R18() {}

	public static void R19() {}
	public static void R20() {}
	
	public static void testUnderThirty() {
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(3);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		int initial = table.getMelds().size();
		
		//bot should do nothing should do nothing since it doesn't have 30pts to play yet 
		bot.addTile(new Tile(1,1));
		bot.addTile(new Tile(2,2));
		bot.addTile(new Tile(3,3));
		
		((AI)bot).doTurn();
		bot.pushToTable(table);
		
		assertTrue(initial == table.getMelds().size());
	}
	
	public static void testWinGame() {
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(3);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		p1.addTile(new Tile(2,9));
		p1.addTile(new Tile(3,5));
		p1.addTile(new Tile(4,1));
		p1.pushToTable(table);
		
		bot.addTile(new Tile(1,1));
		bot.addTile(new Tile(1,2));
		bot.addTile(new Tile(1,3));
		bot.addTile(new Tile(2,5));
		bot.addTile(new Tile(2,6));
		bot.addTile(new Tile(2,7));
		
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		assertTrue(bot.getHand().size() == 0);
		
		
	}
	
	public static void testThreeFewer(){
		Table table = new Table();
		Player p1 = new Player();
		AI bot = new AI(3);
		
		table.registerObserver(p1);
		table.registerObserver(bot);
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		p1.addTile(new Tile(2,9));
		p1.addTile(new Tile(3,5));
		p1.addTile(new Tile(4,1));
		p1.pushToTable(table);
		
		bot.addTile(new Tile(1,9));
		bot.addTile(new Tile(1,10));
		bot.addTile(new Tile(1,11));
		bot.addTile(new Tile(2,9));
		bot.addTile(new Tile(2,10));
		bot.addTile(new Tile(2,11));
		bot.addTile(new Tile(4,1));
		
		((AI)bot).doTurn();
		((AI)bot).pushToTable(table);
		
		//bot should play all possible melds since p1 has 3 fewer tiles
		assertTrue(bot.getHand().size() == 1);
	}
	
}