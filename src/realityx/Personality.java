package realityx;


public class Personality {
	
	private enum Type {
		OUV(0),
		CONS(1),
		EXTR(2),
		AGR(3),
		NEVR(4);
		
		private final int value;
		
		private Type(int value) {
	        this.value = value;
	    }
	}
	
	private int[] values;

	public Personality() {
		values = new int[5];
		values[Type.OUV.value]=0;
		values[Type.CONS.value]=0;
		values[Type.EXTR.value]=0;
		values[Type.AGR.value]=0;
		values[Type.NEVR.value]=0;
	}
	
	public Personality(int o, int c, int e, int a, int n){
		values = new int[5];
		values[Type.OUV.value]=o;
		values[Type.CONS.value]=c;
		values[Type.EXTR.value]=e;
		values[Type.AGR.value]=a;
		values[Type.NEVR.value]=n;
	}

	
	public int getOuv() {
		return values[Type.OUV.value];
	}

	public void setOuv(int v) {
		this.values[Type.OUV.value] = v;
	}
	
	public int getCons() {
		return values[Type.CONS.value];
	}
	public void setCons(int v) {
		this.values[Type.CONS.value] = v;
	}
	
	public int getExtr() {
		return values[Type.EXTR.value];
	}
	public void setExtr(int v) {
		this.values[Type.EXTR.value] = v;
	}
	
	public int getAgr() {
		return values[Type.AGR.value];
	}
	public void setAgr(int v) {
		this.values[Type.AGR.value] = v;
	}
	
	public int getNevr() {
		return values[Type.NEVR.value];
	}
	public void setNevr(int v) {
		this.values[Type.NEVR.value] = v;
	}

	public int[] getValues() {
		return values;
	}
	public void setValues(int[] values) {
		this.values = values;
	}
	
	public boolean equals(Personality c){
		boolean ret = true;
		for (Type type : Type.values()) {
			  ret &= (this.values[type.value]==c.getValues()[type.value]);
		}
		return ret;
	}

	
}
