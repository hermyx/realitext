package realityx;

import java.util.Scanner;

import fran.*;

import java.util.Vector;

public class Game {
	private Vector<Location> places;
	private Person hero;
	public Scanner in = new Scanner(System.in);
	private DataBaseP dbP;
	private DataBaseA dbA;
	private WordBankF dicof;

	public Game() {
		places = new Vector(0);
		dbP = new DataBaseP();
		dbA = new DataBaseA();
		dicof = new WordBankF();
	}
	
	public Game(Vector<Location> l, String type){
		dicof = new WordBankF();
		places = l;
		dbP = new DataBaseP();
		dbP.type(type, this);
		dbA = new DataBaseA();
		dbA.type(type, this);
	}
	
	public DataBaseP getDbP() {
		return dbP;
	}

	public DataBaseA getDbA() {
		return dbA;
	}

	public Vector<Location> getPlaces() {
		return places;
	}
	
	public Person getHero() {
		return hero;
	}
	
	public void addHero(Person h) {
		hero = h;
	}

	public Location getPlace(String n){
		for(Location l : places){
			if (l.getName().equals(n)){
				return l;
			}
		}
		return null;
	}
	public void game_flow(){
		//Intro
		System.out.println("Vous etes a Poudlard ! Vous rentrez dans votre derniere annee. Vous etes dans le grand Hall.");
		while(true){
			System.out.println("Que faites-vous ?");
			Action act = new Action(in.nextLine(), this);
			if(dbA.isIn(act)){
				// To delete after the implementation of events -- Add Hermione in the main entrance
				getPlace("Main Entrance").addP(dbP.getDb().firstElement());
				act.execute();
			}
			else{
				System.out.println("This action isn't in the DataBase");
			}
		}
	}
	
	
	public static void main(String[] args){
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		game.hero.setLocation(game.getPlace("Main Entrance"));
		game.game_flow();
	}

	public WordBankF getDicof() {
		return dicof;
	}
	
	public boolean isInDicof(Word d){
		return dicof.isIn(d);
	}
	
	public Word isF(String n){
		return dicof.isF(n);
	}
}
