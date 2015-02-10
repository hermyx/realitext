package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import fran.ConstF;
import realityx.*;

public class TestGame {

	@Test
	public void testConstructor() {
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		Action act = new Action("Move", game);
		assertTrue(game.getDbA().isIn(act));
		
	}
	
	@Test
	public void testLocCreation(){
		boolean test = true;
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		for(Location l : game.getPlaces()){
			for(Location subL : l.getGoTo()){
				test &= subL.isGoTo(l.getName());
			}
		}
		assertTrue(test);
	}
	
	@Test
	public void testDicof(){
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards, "Hogwards");
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h',game);
		game.addHero(hero);
		Word wt = new Word("blanches",ConstF.Nature.ADJECTIF,
				ConstF.Genre.FEMININ,ConstF.Nombre.PLURIEL);
		assertTrue(wt.equals(game.isF("blanches")));
	}

}
