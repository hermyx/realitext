package fran;

import java.io.*;
import java.util.Vector;

import fran.Constantes.Genre;
import fran.Constantes.Nature;
import fran.Constantes.Nombre;
import realityx.Game;

public class WorkBank {
	protected Vector<Word> db;

	public WorkBank() {
		db = new Vector<Word>();
		fillFran();
	}

	public void add(Word o) {
		if(!isIn(o))
			db.add(o);
	}
	public void remove(Word o) {
		for(Word e : db){
			if(e.equals(o)){
				db.removeElement(o);
		    }
		}
	}
	public boolean isIn(Word o) {
		return true;
	}

	public Vector<Word> getDb() {
		return db;
	}

	public void setDb(Vector<Word> db) {
		this.db = db;
	}
	
	public void fillFran(){
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				System.out.println(ligne);
				chaine+=ligne+"\n";
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		
		
		String mot1 = "humain";
		Word word1 = new Word(mot1,Nature.NOM,Genre.MASCULIN,Nombre.SINGULIER);
		String mot2 = "humains";
		Word word2 = new Word(mot2,Nature.NOM,Genre.MASCULIN,Nombre.PLURIEL);
		String mot3 = "humaine";
		Word word3 = new Word(mot3,Nature.NOM,Genre.FEMININ,Nombre.SINGULIER);
		String mot4 = "humain";
		Word word4 = new Word(mot4,Nature.NOM,Genre.MASCULIN,Nombre.SINGULIER);
	}
}
