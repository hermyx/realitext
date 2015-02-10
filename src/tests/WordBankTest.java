package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import fran.*;

public class WordBankTest {

	@Test
	public void test() {
		WordBank wb = new WordBank();
		Word wt1 = new Word
				("humain",Constantes.Nature.NOM,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt2 = new Word
				("humains",Constantes.Nature.NOM,Constantes.Genre.MASCULIN,Constantes.Nombre.PLURIEL);
		Word wt3 = new Word
				("humaine",Constantes.Nature.NOM,Constantes.Genre.FEMININ,Constantes.Nombre.SINGULIER);
		Word wt4 = new Word
				("humaines",Constantes.Nature.NOM,Constantes.Genre.FEMININ,Constantes.Nombre.PLURIEL);
		Word wt5 = new Word
				("humain",Constantes.Nature.ADJECTIF,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt6 = new Word
				("humains",Constantes.Nature.ADJECTIF,Constantes.Genre.MASCULIN,Constantes.Nombre.PLURIEL);
		Word wt7 = new Word
				("humaine",Constantes.Nature.ADJECTIF,Constantes.Genre.FEMININ,Constantes.Nombre.SINGULIER);
		Word wt8 = new Word
				("humaines",Constantes.Nature.ADJECTIF,Constantes.Genre.FEMININ,Constantes.Nombre.PLURIEL);
		Word wt9 = new Word
				("humaines",Constantes.Nature.NOM,Constantes.Genre.MASCULIN,Constantes.Nombre.PLURIEL);
		Word wt10 = new Word
				("humaines",Constantes.Nature.ADJECTIF,Constantes.Genre.MASCULIN,Constantes.Nombre.PLURIEL);
		Word wt11 = new Word
				("manger",Constantes.Nature.VERBE,Constantes.Genre.BOTH,Constantes.Nombre.BOTH);
		Word wt12 = new Word
				("mang�",Constantes.Nature.VERBE,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt13 = new Word
				("mangeons",Constantes.Nature.VERBE,Constantes.Genre.BOTH,Constantes.Nombre.PLURIEL);
		Word wt14 = new Word
				("manges",Constantes.Nature.VERBE,Constantes.Genre.BOTH,Constantes.Nombre.SINGULIER);
		Word wt15 = new Word
				("ce",Constantes.Nature.DETERMINANT,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt16 = new Word
				("cette",Constantes.Nature.DETERMINANT,Constantes.Genre.FEMININ,Constantes.Nombre.SINGULIER);
		Word wt17 = new Word
				("ces",Constantes.Nature.DETERMINANT,Constantes.Genre.BOTH,Constantes.Nombre.PLURIEL);
		Word wt18 = new Word
				("difficilement",Constantes.Nature.ADVERBE,Constantes.Genre.BOTH,Constantes.Nombre.BOTH);
		Word wt19 = new Word
				("blanc",Constantes.Nature.ADJECTIF,Constantes.Genre.MASCULIN,Constantes.Nombre.SINGULIER);
		Word wt20 = new Word
				("blancs",Constantes.Nature.ADJECTIF,Constantes.Genre.MASCULIN,Constantes.Nombre.PLURIEL);
		Word wt21 = new Word
				("blanche",Constantes.Nature.ADJECTIF,Constantes.Genre.FEMININ,Constantes.Nombre.SINGULIER);
		Word wt22 = new Word
				("blanches",Constantes.Nature.ADJECTIF,Constantes.Genre.FEMININ,Constantes.Nombre.PLURIEL);
		
		assertTrue(wb.isIn(wt1));
		assertTrue(wb.isIn(wt2));
		assertTrue(wb.isIn(wt3));
		assertTrue(wb.isIn(wt4));
		assertTrue(wb.isIn(wt5));
		assertTrue(wb.isIn(wt6));
		assertTrue(wb.isIn(wt7));
		assertTrue(wb.isIn(wt8));
		assertFalse(wb.isIn(wt9));
		assertFalse(wb.isIn(wt10));
		assertTrue(wb.isIn(wt11));
		assertTrue(wb.isIn(wt12));
		assertTrue(wb.isIn(wt13));
		assertTrue(wb.isIn(wt14));
		assertTrue(wb.isIn(wt15));
		assertTrue(wb.isIn(wt16));
		assertTrue(wb.isIn(wt17));
		
		assertTrue(wt22.equals(wb.wWithName("blanches")));
		
		
	}

}
