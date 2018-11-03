package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Table implements Observable{
	//MEMBERS
private	ArrayList<Meld> Melds;
private List<Observer> observers;
private Pile pile;
private boolean gameOver = false;
public boolean status;

	public Table(){
		this.observers = new ArrayList<Observer>();
		this.Melds = new ArrayList<Meld>();
		this.pile = new Pile();
		this.status = false;
	}
	//METHODS
	//--don't really need this, I think it's just for testing.
	public void add(Meld meld) {
		this.Melds.add(meld);
	}
	//OBSERVER
	public void registerObserver(Observer observer) {
		if(observer!=null) {
			this.observers.add(observer);
		}
	}
	public void notifyObservers() {
		Iterator<Observer> i = observers.iterator();
		while(i.hasNext()) {
			Observer observer = i.next();
			observer.update(this);
		}
		
	}
	public void removeObserver(Observer observer) {
		if(observer!=null) {
			this.observers.remove(observer);
		}
		
	}
	public void updateTable(ArrayList<Meld> updatedMelds, boolean gameOver, boolean status) {
		this.gameOver = gameOver;
		this.Melds = updatedMelds;
		if(status = true)
			this.status = true;
		notifyObservers();
	}
	//GETTERS
	public ArrayList<Meld> getMelds() {
		return this.Melds;
	}
	public Pile getPile() {
		return this.pile;
	}
	public boolean getGameOver() {
		return this.gameOver;
	}

}
