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
	private WordBank dicof;

	public Game() {
		places = new Vector(0);
		hero = new Person();
		dbP = new DataBaseP();
		dbA = new DataBaseA();
		dicof = new WordBank();
	}
	
	public Game(Vector<Location> l, Person h, String type){
		places = l;
		hero=h;
		dbP = new DataBaseP();
		dbP.type(type, this);
		dbA = new DataBaseA();
		dbA.type(type, this);
		dicof = new WordBank();
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
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero, "Hogwards");
		game.hero.setLocation(game.getPlace("Main Entrance"));
		game.game_flow();
	}

	public WordBank getDicof() {
		return dicof;
	}
	
	public boolean isInDicof(Word d){
		return dicof.isIn(d);
	}
	
	public Word wordWithName(String n){
		return dicof.wWithName(n);
	}
}
