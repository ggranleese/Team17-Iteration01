package core;

import java.util.ArrayList;
import java.util.Scanner;

public class Player implements Observer{
	//MEMBERS
	private Boolean status;
	private int pointCounter;
	private ArrayList<Tile> hand;
	Scanner input = new Scanner(System.in);
	//These are observed from Table
	private	ArrayList<Meld> Melds;
	private Pile pile;
	
	//CONSTRUCTORS
	public Player() {
		this.hand = new ArrayList<Tile>();
		this.status = false;
	}
	
	//METHODS
	public void drawHand() {
		for(int i = 0; i<14; i++)
			this.hand.add(this.pile.getPile().get(i));
			pile.removeTile();
	}
	
	public void removeTile(int c, int v) {
		
		int n = this.hand.size();
		
		for(int i =0; i<n; i++) {
			if(this.hand.get(i).getValue() == v && this.hand.get(i).getColour() == c) {
				this.hand.remove(i);
				break;
			}
		}
	}
	
	/*
	public String toString() {
		String output = "";
		for(int i=0; i<this.getSize(); i++){
			if(this.getTile(i).getColour() == 1) {
				if(this.getTile(i).getValue() == 1) {
					output += ("B1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("B2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("B3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("B4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("B5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("B6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("B7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("B8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("B9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("B10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("B11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("B12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("B13");
					
				}
			}else if(this.getTile(i).getColour() == 2) {
				
				if(this.getTile(i).getValue() == 1) {
					output += ("R1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("R2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("R3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("R4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("R5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("R6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("R7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("R8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("R9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("R10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("R11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("R12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("R13");
					
				}
			}else if(this.getTile(i).getColour() == 3) {
				
				if(this.getTile(i).getValue() == 1) {
					output += ("G1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("G2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("G3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("G4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("G5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("G6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("G7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("G8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("G9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("G10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("G11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("G12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("G13");
					
				}
			}else{
				
				if(this.getTile(i).getValue() == 1) {
					output += ("O1");
					
				}else if(this.getTile(i).getValue() == 2) {
					output += ("O2");
					
				}else if(this.getTile(i).getValue() == 3) {
					output += ("O3");
					
				}else if(this.getTile(i).getValue() == 4) {
					output += ("O4");
					
				}else if(this.getTile(i).getValue() == 5) {
					output += ("O5");
					
				}else if(this.getTile(i).getValue() == 6) {
					output += ("O6");
					
				}else if(this.getTile(i).getValue() == 7) {
					output += ("O7");
					
				}else if(this.getTile(i).getValue() == 8) {
					output += ("O8");
					
				}else if(this.getTile(i).getValue() == 9) {
					output += ("O9");
					
				}else if(this.getTile(i).getValue() == 10) {
					output += ("O10");
					
				}else if(this.getTile(i).getValue() == 11) {
					output += ("O11");
					
				}else if(this.getTile(i).getValue() == 12) {
					output += ("O12");
					
				}else if(this.getTile(i).getValue() == 13) {
					output += ("O13");
					
				}
			}
		}
		return (output);
	}
*/
	public void playMeld(Meld m) {
		
		this.Melds.add(m);
	
		if(this.status == false) {
			int meldPoints = 0;
			
			for(int i = 0; i < m.getTiles().size(); i++) {
				meldPoints += m.getTiles().get(i).getValue();
			}
			
			this.pointCounter += meldPoints;
			if(pointCounter >= 30) {
				this.status = true;
			}
		}
	}
	
	public void addTile(Tile t) {
		this.hand.add(t);
	}
	
	public void doTurn() {
		System.out.println("1.Play meld from hand.");
		System.out.println("2.Play with table.");
		int n = input.nextInt();
		switch(n) {
			case 1: 
				handOptions();
				break;
			case 2: 
				if (this.status == false) {
					System.out.println("Must have 30 or more points to do this.");
					doTurn();
					break;
				}
				else {
					tableOptions();
					break;
				}
			default:
				System.out.println("Invalid choice.");
				doTurn();
				break;
		}
	}
	
	public ArrayList<Tile> fromHand() {
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		int choice;
		while(true) {
			System.out.println("Select tile from hand:");
			printTiles(this.hand);
			choice = input.nextInt();
			
			System.out.println("1.Select more");
			System.out.println("2.Continue");
			int moreTiles = input.nextInt();
			
			if(moreTiles == 1) {
				try {
					tiles.add(this.hand.get(choice - 1));
					this.hand.remove(choice -1);
					}catch(Exception e) {
						System.out.println("Invalid.");
						continue;
					}
				continue;
			}
			if(moreTiles == 2) {
				try {
					tiles.add(this.hand.get(choice - 1));
					this.hand.remove(choice -1);
					}catch(Exception e) {
						System.out.println("Invalid.");
						continue;
					}
				break;
			}
			else {
				System.out.println("Invalid.");
				continue;
			}
		}
		return tiles;
	}
	
	public ArrayList<Tile> fromMeld(){
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		Meld meld;
		int meldNum;
		int tileNum;
		while(true) {
			System.out.println("Select meld to take from:");
			displayMelds();
			meldNum = input.nextInt();
			try {
				meld = Melds.get(meldNum -1);
				break;
			}catch (Exception e){
				System.out.println("Invalid.");
				continue;
			}
		}
		while(true) {
			if(meld.getTiles().isEmpty()) {
				System.out.println("This meld is empty!");
				this.Melds.remove(meldNum -1);
				break;
			}
			System.out.println("Select tiles:");
			printTiles(meld.getTiles());
			tileNum = input.nextInt();
			
			System.out.println("1.Select more from this meld");
			System.out.println("2.Select from different meld");
			System.out.println("3.Done");
			int moreTiles = input.nextInt();
			
			if(moreTiles == 1) {
				try {
					tiles.add(meld.getTiles().get(tileNum - 1));
					meld.getTiles().remove(tileNum -1);
					}catch(Exception e) {
						System.out.println("Invalid.");
						continue;
					}
				continue;
			}
			if(moreTiles == 3) {
				try {
					tiles.add(meld.getTiles().get(tileNum - 1));
					meld.getTiles().remove(tileNum -1);
					}catch(Exception e) {
						System.out.println("Invalid.");
						continue;
					}
				break;
			}
			else {
				System.out.println("Invalid.");
				continue;
			}
		}
		return tiles;
	}

	//UI
	private void handOptions() {
		System.out.println("Some hand options.");	
	}
	
	private void tableOptions( ) {
		System.out.println("1.Take tile(s) from hand.");
		System.out.println("2.Take tile(s) from a meld.");
		System.out.println("3.Back");
		
		int n = input.nextInt();
		switch(n) {
			case 1:
				addToMeld(fromHand());
				break;
			case 2: 
				addToMeld(fromMeld());
				break;
			case 3:
				tableOptions();
				break;
			default:
				System.out.println("Invalid choice.");
				tableOptions();
				break;
		}
	}
	
	public void addToMeld(ArrayList<Tile> tiles) {
		int choice;
		Meld meld;
		
		while(true) {
			System.out.println("Select meld to add to:");
			displayMelds();
			choice = input.nextInt();
			try {
				meld = Melds.get(choice -1);
				break;
			}catch (Exception e){
				System.out.println("Invalid.");
				continue;
			}
		}
		while(!tiles.isEmpty()) {
			while(true) {
				System.out.println("Select position you'd like to add ["+ tiles.get(0).toString()+"] to:");
				printTiles(Melds.get(choice -1).getTiles());
				int position = input.nextInt();
				try {
				meld.getTiles().add(position -1,tiles.get(0));
				tiles.remove(0);
				break;
				} catch(Exception e) {
					System.out.println("Invalid.");
					continue;
				}
			}
		}
		
		System.out.println("New Meld:");
		//printTiles(Melds.get(choice -1).getTiles());
		displayMelds();
	}
	
	private void displayMelds() {
		for(Meld m : this.Melds) {
            printTiles(m.getTiles());
        }
	}
	
	private void printTiles(ArrayList<Tile> tiles) {
		String printVal = "[ ";
		for (Tile t : tiles) {
			printVal += t.toString() + " ";
		}
		printVal += "]";
		System.out.println(printVal);
	}

	//OBSERVER METHODS
	//OBSERVER METHODS
	public void update(Table table) {
		this.pile = table.getPile();
		this.Melds = table.getMelds();
	}
	public void pushToTable(Table table) {
		table.updateTable(this.Melds, this.pile);
	}
	//GETTERS
	
	//GETTERS
	public ArrayList<Tile> getHand() {
		return this.hand;
	}
	public Boolean getStatus() {
		return this.status;
	}
	public Tile getTile(int i) {
		return this.hand.get(i);
	}
	public int getSize() {
		return this.hand.size();
	}

}
