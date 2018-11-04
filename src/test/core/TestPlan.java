package core;

import java.util.ArrayList;
import java.util.Scanner;

import junit.framework.TestCase;

public class TestPlan extends TestCase{
	public static void main(String[] args) {
		System.out.println("Select Requirement: ");
		Scanner choice = new Scanner(System.in);
		int userSelection = -1;
		if(choice.hasNextInt()) {
			userSelection = choice.nextInt();
			}
		switch(userSelection) {
			case 10: R10();
		}
		choice.close();
	}

	public static void test() {
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
			//5
			player.doTurn();
			player.hand.clear();
			player.pushToTable(table);
			assertTrue(table.getGameOver());
			player.setGameOver(false);
			
			//6
			player.drawHand();
			int sizeBefore = player.getHand().size();
			player.pushToTable(table);
			int sizeAfter = player.getHand().size();
			assertTrue(sizeBefore + 1 == sizeAfter);
			
			//7
			bot1.addTile(new Tile(1,10));
			bot1.addTile(new Tile(1,11));
			bot1.addTile(new Tile(1,12));
			bot1.doTurn();
			
			//8
			
	}
	public static void R1() {
		
	}
	public static void R2() {}
	public static void R3() {}
	public static void R4() {
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
	
	public static void R5() {}
	public static void R6() {}
	public static void R7() {}
	public static void R8() {}
	public static void R9() {
		Table table = new Table();
		
		Player player = new Player();
		
		table.registerObserver(player);
	
		table.notifyObservers();
		table.getPile().populate();
		table.getPile().shuffle();
		
		player.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,11));
			add(new Tile(3,12));
			}}));
		
		player.playMeld(new Run(new ArrayList<Tile>() {{
			add(new Tile(1,10));
			add(new Tile(2,11));
			add(new Tile(3,12));
			}}));
		
	}
	
	public static void R10() {
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
}