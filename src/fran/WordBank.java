package fran;

import java.io.*;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.*;

import fran.Constantes.Genre;
import fran.Constantes.Nature;
import fran.Constantes.Nombre;
import realityx.Event;
import realityx.Game;
import realityx.Location;
import realityx.LocationBuilder;
import realityx.Person;
import realityx.Personality;

public class WordBank {
	protected Vector<Word> db;
	private final HashMap<String, Constantes.Nature> translatorNat = new HashMap();
	private final HashMap<String, Constantes.Genre> translatorGen = new HashMap();
	private final HashMap<String, Constantes.Nombre> translatorNom = new HashMap();

	public WordBank() {
		db = new Vector<Word>();
		initTrans();
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

	public Vector<Word> getDb() {
		return db;
	}

	public void setDb(Vector<Word> db) {
		this.db = db;
	}
	
	public boolean isIn(Word wd){
		for (Word w : db){
			if(w!=null){
				boolean test = wd.equals(w);
			    if(test){
			    	return true;
			    }
			}
		}
		return false;
	}
	
	
	
	public void initTrans(){
		translatorNat.put("NOM", Constantes.Nature.NOM);
		translatorNat.put("AUX", Constantes.Nature.VERBE);
		translatorNat.put("VER", Constantes.Nature.VERBE);
		translatorNat.put("ADJ", Constantes.Nature.ADJECTIF);
		translatorNat.put("ADV", Constantes.Nature.ADVERBE);
		translatorNat.put("ART", Constantes.Nature.DETERMINANT);
		translatorNat.put("PRE", Constantes.Nature.DETERMINANT);
		translatorNat.put("PRO", Constantes.Nature.DETERMINANT);
		translatorNat.put("CON", Constantes.Nature.CONJONCTION);
		translatorNat.put("ONO", Constantes.Nature.ONOMATOPEE);
		translatorGen.put("f", Constantes.Genre.FEMININ);
		translatorGen.put("m", Constantes.Genre.MASCULIN);
		translatorGen.put("", Constantes.Genre.BOTH);
		translatorNom.put("s", Constantes.Nombre.SINGULIER);
		translatorNom.put("p", Constantes.Nombre.PLURIEL);
		translatorNom.put("", Constantes.Nombre.BOTH);
		
	}
	
	public void fillFran(){
		String chaine="";
		String fichier ="Lexique.txt";
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				String[] parts = ligne.split("\t");
				String n = parts[0];
				Pattern pn = Pattern .compile("^ART|^ADJ|^PRO");
				Matcher mn = pn.matcher(parts[3]);
				String nat="";
				if(mn.find()){
					nat=parts[3].substring(mn.start(), mn.end());
				}
				else{
					nat=parts[3];
				}
				Constantes.Nature nature = translatorNat.get(nat);
				Constantes.Genre genre = translatorGen.get(parts[4]);
				Constantes.Nombre nombre = translatorNom.get(parts[5]);
				if(nature==Nature.VERBE){
					try{
						   Pattern pv1 = Pattern.compile("s;$");
						   Matcher mv1 = pv1.matcher(parts[10]);
						   Pattern pv2 = Pattern.compile("p;$");
						   Matcher mv2 = pv2.matcher(parts[10]);
						   if(mv1.find()){
							   nombre = Nombre.SINGULIER;
						   }
						   else if(mv2.find()){
							   nombre = Nombre.PLURIEL;
						   }
					}catch(PatternSyntaxException pse){
						System.out.println(pse.toString());
					}
				}
				Word word = new Word(n,nature,genre,nombre);
				if(!(genre == null) && !(nombre == null) && !(nature == null)){
					db.addElement(word);
				}
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}

	}
	
}
