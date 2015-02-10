package realityx;

import fran.*;
import fran.ConstF.*;

public class Word {
	private String mot;
	private Nature nat;
	private Genre gen;
	private Nombre nom;
	
	public Word(){
		mot="";
		nat=ConstF.Nature.NOM;
		gen=ConstF.Genre.BOTH;
		nom=ConstF.Nombre.BOTH;
	}
	
	public Word(String m, Nature n, Genre g, Nombre nb){
		mot = m;
		nat = n;
		gen = g;
		nom = nb;
	}
	
	public String getMot() {
		return mot;
	}
	public void setMot(String mot) {
		this.mot = mot;
	}
	public Nature getNat() {
		return nat;
	}
	public void setNat(Nature nat) {
		this.nat = nat;
	}
	public Genre getGen() {
		return gen;
	}
	public void setGen(Genre gen) {
		this.gen = gen;
	}
	public Nombre getNom() {
		return nom;
	}
	public void setNom(Nombre nom) {
		this.nom = nom;
	}
	
	public boolean equals(Word wd){
		boolean ret = true;
		ret &= mot.equals(wd.getMot());
		ret &= (nat.value == wd.getNat().value);
		ret &= (gen.value == wd.getGen().value);
		ret &= (nom.value == wd.getNom().value);
		return ret;
	}

}
