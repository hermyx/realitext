package fran;

public class Constantes {
	public enum Nature {
		DETERMINANT(0),
		NOM(1),
		VERBE(2),
		ADJECTIF(3),
		ADVERBE(4),
		PREPOSITION(5),
		PRONOM(6),
		ONOMATOPEE(7),
		CONJONCTION(8);
		
		public final int value;
		
		private Nature(int value) {
	        this.value = value;
	    }
	}
	
	public enum Genre {
		MASCULIN(0),
		FEMININ(1),
		BOTH(2); //Verbes, par exemple
		
		public final int value;
		
		private Genre(int value) {
	        this.value = value;
	    }
	}
	
	public enum Nombre {
		SINGULIER(0),
		PLURIEL(1),
		BOTH(2); 
		
		public final int value;
		
		private Nombre(int value) {
	        this.value = value;
	    }
	}
}
