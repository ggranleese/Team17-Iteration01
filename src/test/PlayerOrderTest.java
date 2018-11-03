import core.AI;
import core.Player;
import core.Table;
import junit.framework.TestCase;

public class PlayerOrderTest extends TestCase{

	public void test() {
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
		

		player.drawHand();
		bot1.drawHand();
		
		bot2.drawHand();
		
		bot3.drawHand();
		
		
		while(table.getGameOver() == false) {
			
			player.doTurn();
			if(player.endTurn()) {
				player.pushToTable(table);
			}
			else {
				System.out.println("Invalid melds played.\n");
			}
	
			
			((AI)bot1).doTurn(table);
			bot1.pushToTable(table);
			
			((AI)bot2).doTurn(table);
			bot2.pushToTable(table);
			
			((AI)bot3).doTurn(table);
			bot3.pushToTable(table);
		}
	}

}
