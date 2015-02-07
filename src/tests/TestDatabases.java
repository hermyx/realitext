package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import realityx.*;

public class TestDatabases {

	@Test
	public void test() {
		String hog = "Hogwards";
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero,"Hogwards");
		Person prem = game.getDbP().getDb().firstElement();
		Personality che = new Personality(9,9,5,7,6);
		Person her = new Person("Hermione",che,16,'f');
		Person toto = new Person("Toto",che,17,'h');
		assertTrue(prem.equals(her));
		assertTrue(game.getDbP().isIn(her));
		assertFalse(game.getDbP().isIn(toto));
		Action m = new Action("Move", game);
		Action m2 = new Action("Lolilol", game);
		Action tutu = game.getDbA().getDb().firstElement();
		assertTrue(tutu.equals(m));
		assertTrue(game.getDbA().isIn(m));
		assertFalse(game.getDbA().isIn(m2));
	}

}
