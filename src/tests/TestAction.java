package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import realityx.Action;
import realityx.Game;
import realityx.Location;
import realityx.LocationBuilder;
import realityx.Person;
import realityx.Personality;

public class TestAction {

	@Test
	public void testConstructor(){
		Action move = new Action("Move", new Game());
		Action move2 = new Action("Move", new Game());
		Action talk = new Action("Talk", new Game());
		assertTrue(move.equals(move));
		assertFalse(move.equals(talk));
		assertTrue(move.equals(move2));
	}
	
	@Test
	public void testTalk(){
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		game.getHero().setLocation(game.getPlace("Main Entrance"));
		game.getHero().getLocation().addP(game.getDbP().getDb().firstElement());
		Action act = new Action("Talk", game);
		assertTrue(game.getHero().getLocation().getP().size()==0
				|| act.talk(game.getHero().getLocation().getP().firstElement()));
		assertFalse(act.talk(game.getDbP().getElem("Hermyx")));
	}
	
	@Test
	public void testTalk2(){ //Without the add of Hermione
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		game.getHero().setLocation(game.getPlace("Main Entrance"));
		Action act = new Action("Talk", game);
		assertTrue(game.getHero().getLocation().getP().size()==0
				|| act.talk(game.getHero().getLocation().getP().firstElement()));
		assertFalse(act.talk(game.getDbP().getElem("Hermyx")));
	}
	
	@Test
	public void testMove(){
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		game.getHero().setLocation(game.getPlace("Main Entrance"));
		Action act = new Action("Move", game);
		assertTrue(act.move("Stairway"));
		assertTrue(act.move("Griffyndor Common Room"));
		assertFalse(act.move("Great Hall"));
	}

}
