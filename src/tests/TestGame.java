package tests;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import fran.Constantes;
import fran.Word;
import realityx.*;

public class TestGame {

	@Test
	public void testConstructor() {
		String hog = "Hogwards";
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero,"Hogwards");
		Action act = new Action("Move", game);
		assertTrue(game.getDbA().isIn(act));
		
	}
	
	@Test
	public void testLocCreation(){
		boolean test = true;
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero, "Hogwards");
		for(Location l : game.getPlaces()){
			for(Location subL : l.getGoTo()){
				test &= subL.isGoTo(l.getName());
			}
		}
		assertTrue(test);
	}
	
	@Test
	public void testDicof(){
		Personality me = new Personality(9,5,6,9,7);
		Person hero = new Person("Hermyx",me,16,'h');
		LocationBuilder lb = new LocationBuilder();
		Vector<Location> hogwards = lb.hogwards();
		Game game = new Game(hogwards,hero, "Hogwards");
		Word wt = new Word("blanches",Constantes.Nature.ADJECTIF,
				Constantes.Genre.FEMININ,Constantes.Nombre.PLURIEL);
		assertTrue(wt.equals(game.wordWithName("blanches")));
	}

}
