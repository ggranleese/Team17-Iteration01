import java.util.ArrayList;

import core.Player;
import core.Run;
import core.Set;
import core.Table;
import core.Tile;
import junit.framework.TestCase;

public class MultipleMeldsToMeldTest extends TestCase{
	public void test() {
		Table table = new Table();
		Player player = new Player();
		
		table.registerObserver(player);
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
		
		Run run = new Run(tiles);
		Run run2 = new Run(tiles2);
		Set set = new Set(tiles3);
		
		player.playMeld(run);
		player.playMeld(run2);
		player.playMeld(set);
		
		
		player.pushToTable(table);
		
		player.addToMeld(player.fromMeld());
		
		int meld1 = table.getMelds().get(0).getTiles().size();
		int meld2 = table.getMelds().get(1).getTiles().size();
		int meld3 = table.getMelds().get(2).getTiles().size();
		
		assertTrue(table.getMelds().get(0).getTiles().size() < meld1);
		assertTrue(table.getMelds().get(1).getTiles().size() < meld2);
		assertTrue(table.getMelds().get(2).getTiles().size() > meld3);
	}

}
