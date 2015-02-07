package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import realityx.Game;
import realityx.Location;
import realityx.LocationBuilder;
import realityx.Person;
import realityx.Personality;

public class TestLocation {

	@Test
	public void testConstructor() {
		String hog = "Hogwards";
		Location hogwards = new Location(hog);
		assertSame(hog,hogwards.getName());
	}
	
	@Test
	public void testAddP() {
		String hog = "Hogwards";
		Personality che = new Personality(9,9,5,7,6);
		Personality cha = new Personality(6,2,6,7,7);
		Personality mep = new Personality(9,5,6,9,7);
		Person her = new Person("Hermione",che,16,'f');
		Person har = new Person("Harry",cha,16,'h');
		Person me = new Person("Hermyx",mep,16,'h');
		Location hogwards = new Location(hog);
		assertFalse(hogwards.isThere(her.getName()));
		assertSame(null,hogwards.persWithName("Hermione"));
		hogwards.addP(her);
		assertTrue(hogwards.isThere(her.getName()));
		assertFalse(hogwards.isThere(har.getName()));
		assertSame(her,hogwards.persWithName("Hermione"));
		assertSame(null,hogwards.persWithName("Hermyx"));
	}
	
	@Test
	public void testAddL() {
		String mEntr = "Main Entrance";
		Location mainEntrance = new Location(mEntr);
		String gHall = "Great Hall";
		Location greatHall = new Location(gHall);
		String stway = "Stairway";
		Location stairway = new Location(stway);
		mainEntrance.addGoTo(greatHall);
		mainEntrance.addGoTo(stairway);
		greatHall.addGoTo(mainEntrance);
		stairway.addGoTo(mainEntrance);
		assertTrue(stairway.isGoTo(mainEntrance.getName()));
		assertFalse(stairway.isGoTo(greatHall.getName()));
		assertSame(stairway,mainEntrance.locWithName("Stairway"));
		assertSame(null,mainEntrance.locWithName("Main Entrance"));
	}

}
