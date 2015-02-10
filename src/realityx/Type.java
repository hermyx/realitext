package realityx;

import java.util.Vector;

import fran.*;
import fran.ConstF.*;


public class Type {

	private Vector<Word> types;
	private Vector<Word> adj;
	private static Game game;
	
	public Type(){
		types = new Vector<Word>(0);
		adj = new Vector<Word>(0);
		game = new Game();
	}
	
	public Type(Vector<Word> t, Vector<Word> a, Game g){
		types = t;
		adj = a;
		game = g;
	}
	
	public Type(String t, Game g){
		game = g;
		types = new Vector<Word>(0);
		adj = new Vector<Word>(0);
		if(t.equals("humain")){
			addT("humain");
			//addT("être vivant");
			addT("homme");
		}
		else if(t.equals("humaine")){
			addT("humaine");
			//addT("être vivant");
			addT("femme");
		}
		else if(t.equals("animal")){
			addT("animal");
			//addT("être vivant");
		}
		else if(t.equals("objet")){
			addT("objet");
		}
		else{
			System.out.println("Ce String n'est pas dans les types par défaut.");
			System.out.println("Veuillez le rentrer manuellement ou choisir un autre type");
		}
	}
	
	public Vector<Word> getTypes() {
		return types;
	}
	public void setTypes(Vector<Word> types) {
		this.types = types;
	}
	public Vector<Word> getAdj() {
		return adj;
	}
	public void setAdj(Vector<Word> adj) {
		this.adj = adj;
	}
	public boolean addT(String t){
		Vector<Word> all = game.getDicof().allWordWithName(t);
		Word add = new Word();
		boolean toto = false;
		for(Word a : all){
			if(a.getNat().value == ConstF.Nature.NOM.value){
				add=a;
				toto=true;
			}
		}
		if(toto){
			return types.add(add);
		}
		else{
			System.out.println("Un type ne peut être qu'un nom !");
			return false;
		}
	}
	public boolean addA(String t){
		Vector<Word> all = game.getDicof().allWordWithName(t);
		Word add = null;
		for(Word a : all){
			if(a.getNat().value == ConstF.Nature.ADJECTIF.value){
				add=a;
			}
		}
		if(add!=null){
			return adj.add(add);
		}
		else{
			System.out.println("Un adj ne peut être qu'un adjectif !");
			return false;
		}
	}
	public boolean isType(String t){
		for(Word w : types){
			if(w.getMot().equals(t)){
				return true;
			}
		}
		return false;
	}
	public boolean isAdj(String t){
		for(Word w : adj){
			if(w.getMot().equals(t)){
				return true;
			}
		}
		return false;
	}
	
	

	public boolean equals(Type t){
		boolean ret = true;
		for(Word type : types){
			ret&=t.isType(type.getMot());
		}
		for(Word adject : adj){
			ret&=t.isAdj(adject.getMot());
		}
		return ret;
	}
}
