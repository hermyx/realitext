package fran;

import fran.Constantes.*;

public class Word {
	private String mot;
	private Nature nat;
	private Genre gen;
	private Nombre nom;
	
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

}
