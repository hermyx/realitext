package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fran.Constantes;
import fran.Word;

public class TestWord {

	@Test
	public void testEquals() {
		Word wt1 = new Word
				("humain",Constantes.Nature.NOM,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt2 = new Word
				("humain",Constantes.Nature.NOM,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		assertTrue(wt1.equals(wt2));
	}


}
