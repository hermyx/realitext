package tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import fran.Constantes;
import fran.Word;
import realityx.Personality;

public class TestPersonality {

	@Test
	public void testConstructor() {
		Personality c1 = new Personality(0, 5, 8, 4, 2);
		assertEquals(0, c1.getOuv());
		assertEquals(5, c1.getCons());
		assertEquals(8, c1.getExtr());
		assertEquals(4, c1.getAgr());
		assertEquals(2, c1.getNevr());
	}
	
	@Test
	public void testEquals() {
		Personality c1 = new Personality(0, 5, 8, 4, 2);
		Personality c2 = new Personality(0, 5, 8, 4, 2);
		Personality c3 = new Personality(0, 5, 8, 4, 3);
		assertTrue(c1.equals(c2));
		assertFalse(c1.equals(c3));
	}
}
