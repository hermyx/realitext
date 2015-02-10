package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import realityx.Word;
import fran.ConstF;

public class TestWord {

	@Test
	public void testEquals() {
		Word wt1 = new Word
				("humain",ConstF.Nature.NOM,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt2 = new Word
				("humain",ConstF.Nature.NOM,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		assertTrue(wt1.equals(wt2));
	}


}
