package fran;

public class Constantes {
	public enum Nature {
		DETERMINANT(0),
		NOM(1),
		VERBE(2),
		ADJECTIF(3),
		ADVERBE(4),
		PREPOSITION(5);
		
		private final int value;
		
		private Nature(int value) {
	        this.value = value;
	    }
	}
	
	public enum Genre {
		MASCULIN(0),
		FEMININ(1);
		
		private final int value;
		
		private Genre(int value) {
	        this.value = value;
	    }
	}
	
	public enum Nombre {
		SINGULIER(0),
		PLURIEL(1);
		
		private final int value;
		
		private Nombre(int value) {
	        this.value = value;
	    }
	}
}
