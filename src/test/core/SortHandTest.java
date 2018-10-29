package core;


import junit.framework.TestCase;

public class SortHandTest extends TestCase{
	
	public void testSortHand() {
		Player player = new Player();
		
		player.addTile(new Tile(2,4));
		player.addTile(new Tile(3,3));
		player.addTile(new Tile(4,1));
		player.addTile(new Tile(1,2));
		player.addTile(new Tile(4,6));
		player.addTile(new Tile(1,5));
	
		
		System.out.println("Unsorted");
		System.out.println(player.getHand());
		player.sortHand();
		System.out.println("Sorted");
		System.out.println(player.getHand());
	
		assertEquals(player.getHand().get(0).getValue(), 2);
		assertEquals(player.getHand().get(0).getColour(), 1);
	}
}
