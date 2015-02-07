package tests;


import static org.junit.Assert.*;

import org.junit.Test;

import realityx.Person;
import realityx.Personality;

public class TestPerson {

	@Test
	public void testConstructor() {
		Personality c = new Personality(1,2,3,4,5);
		Person h = new Person("Hermione",c,16,'f');
		assertSame("Hermione", h.getName());
		assertSame(c, h.getPersonality());
		assertEquals(16,h.getAge());
		assertEquals('f',h.getGender());
	}

}
