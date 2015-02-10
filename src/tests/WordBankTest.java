package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import realityx.Word;
import fran.*;

public class WordBankTest {

	@Test
	public void test() {
		WordBankF wb = new WordBankF();
		Word wt1 = new Word
				("humain",ConstF.Nature.NOM,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt2 = new Word
				("humains",ConstF.Nature.NOM,ConstF.Genre.MASCULIN,ConstF.Nombre.PLURIEL);
		Word wt3 = new Word
				("humaine",ConstF.Nature.NOM,ConstF.Genre.FEMININ,ConstF.Nombre.SINGULIER);
		Word wt4 = new Word
				("humaines",ConstF.Nature.NOM,ConstF.Genre.FEMININ,ConstF.Nombre.PLURIEL);
		Word wt5 = new Word
				("humain",ConstF.Nature.ADJECTIF,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt6 = new Word
				("humains",ConstF.Nature.ADJECTIF,ConstF.Genre.MASCULIN,ConstF.Nombre.PLURIEL);
		Word wt7 = new Word
				("humaine",ConstF.Nature.ADJECTIF,ConstF.Genre.FEMININ,ConstF.Nombre.SINGULIER);
		Word wt8 = new Word
				("humaines",ConstF.Nature.ADJECTIF,ConstF.Genre.FEMININ,ConstF.Nombre.PLURIEL);
		Word wt9 = new Word
				("humaines",ConstF.Nature.NOM,ConstF.Genre.MASCULIN,ConstF.Nombre.PLURIEL);
		Word wt10 = new Word
				("humaines",ConstF.Nature.ADJECTIF,ConstF.Genre.MASCULIN,ConstF.Nombre.PLURIEL);
		Word wt11 = new Word
				("manger",ConstF.Nature.VERBE,ConstF.Genre.BOTH,ConstF.Nombre.BOTH);
		Word wt12 = new Word
				("mangé",ConstF.Nature.VERBE,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt13 = new Word
				("mangeons",ConstF.Nature.VERBE,ConstF.Genre.BOTH,ConstF.Nombre.PLURIEL);
		Word wt14 = new Word
				("manges",ConstF.Nature.VERBE,ConstF.Genre.BOTH,ConstF.Nombre.SINGULIER);
		Word wt15 = new Word
				("ce",ConstF.Nature.DETERMINANT,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt16 = new Word
				("cette",ConstF.Nature.DETERMINANT,ConstF.Genre.FEMININ,ConstF.Nombre.SINGULIER);
		Word wt17 = new Word
				("ces",ConstF.Nature.DETERMINANT,ConstF.Genre.BOTH,ConstF.Nombre.PLURIEL);
		Word wt18 = new Word
				("difficilement",ConstF.Nature.ADVERBE,ConstF.Genre.BOTH,ConstF.Nombre.BOTH);
		Word wt19 = new Word
				("blanc",ConstF.Nature.ADJECTIF,ConstF.Genre.MASCULIN,ConstF.Nombre.SINGULIER);
		Word wt20 = new Word
				("blancs",ConstF.Nature.ADJECTIF,ConstF.Genre.MASCULIN,ConstF.Nombre.PLURIEL);
		Word wt21 = new Word
				("blanche",ConstF.Nature.ADJECTIF,ConstF.Genre.FEMININ,ConstF.Nombre.SINGULIER);
		Word wt22 = new Word
				("blanches",ConstF.Nature.ADJECTIF,ConstF.Genre.FEMININ,ConstF.Nombre.PLURIEL);
		
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
		
		assertTrue(wt22.equals(wb.isF("blanches")));
		
		
	}

}
