package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import realityx.*;

public class TestType {

	@Test
	public void testTypes() {
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		Type test = new Type("humain",game);
		assertFalse(test.getTypes().isEmpty());
		assertTrue(test.isType("humain"));
		assertTrue(test.isType("homme"));
		assertFalse(test.isType("humaine"));
		test.addA("bleu");
		assertTrue(test.isAdj("bleu"));
		assertFalse(test.isAdj("vert"));
	}

}
