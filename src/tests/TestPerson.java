package tests;


import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import realityx.Game;
import realityx.Location;
import realityx.LocationBuilder;
import realityx.Person;
import realityx.Personality;

public class TestPerson {

	@Test
	public void testConstructor() {
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		Personality c = new Personality(1,2,3,4,5);
		Person h = new Person("Hermione",c,16,'f',game);
		assertSame("Hermione", h.getName());
		assertSame(c, h.getPersonality());
		assertEquals(16,h.getAge());
	}

}
