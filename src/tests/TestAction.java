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
	public void testTalk(){ // ?
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero, "Hogwards");
		game.getHero().getLocation().addP(game.getDbP().getDb().firstElement());
		Action act = new Action("Talk", game);
	}

}