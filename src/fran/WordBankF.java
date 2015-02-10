package fran;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Vector;
import java.util.regex.*;

import fran.ConstF.Genre;
import fran.ConstF.Nature;
import fran.ConstF.Nombre;
import realityx.Event;
import realityx.Game;
import realityx.Location;
import realityx.LocationBuilder;
import realityx.Person;
import realityx.Personality;
import realityx.Word;

public class WordBankF {
	protected Vector<Word> db;
	private final HashMap<String, ConstF.Nature> translatorNat = new HashMap();
	private final HashMap<String, ConstF.Genre> translatorGen = new HashMap();
	private final HashMap<String, ConstF.Nombre> translatorNom = new HashMap();

	public WordBankF() {
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
	
	public Word isF(String m){
		for (Word w : db){
			if(w!=null){
			    if(m.equals(w.getMot())){
			    	return w;
			    }
			}
		}
		return null;
	}
	
	public Vector<Word> allWordWithName(String m){
		Vector<Word> ret = new Vector<Word>(0);
		for (Word w : db){
			if(w!=null){
			    if(m.equals(w.getMot())){
			    	ret.add(w);
			    }
			}
		}
		return ret;
	}

	
	//The old method of filling the wordbank.
	/*public void initTrans(){
		translatorNat.put("NOM", Constantes.Nature.NOM);
		translatorNat.put("AUX", Constantes.Nature.VERBE);
		translatorNat.put("VER", Constantes.Nature.VERBE);
		translatorNat.put("ADJ", Constantes.Nature.ADJECTIF);
		translatorNat.put("ADJ:num", Constantes.Nature.ADJECTIF);
		translatorNat.put("ADV", Constantes.Nature.ADVERBE);
		translatorNat.put("ADJ:dem", Constantes.Nature.DETERMINANT);
		translatorNat.put("ADJ:ind", Constantes.Nature.DETERMINANT);
		translatorNat.put("ADJ:int", Constantes.Nature.DETERMINANT);
		translatorNat.put("ADJ:pos", Constantes.Nature.DETERMINANT);
		translatorNat.put("ART", Constantes.Nature.DETERMINANT);
		translatorNat.put("PRE", Constantes.Nature.DETERMINANT);
		translatorNat.put("PRO", Constantes.Nature.DETERMINANT);
		translatorNat.put("PRO:per", Constantes.Nature.DETERMINANT);
		translatorNat.put("CON", Constantes.Nature.CONJONCTION);
		translatorNat.put("ONO", Constantes.Nature.ONOMATOPEE);
		translatorNat.put("LIA", Constantes.Nature.ONOMATOPEE);
		translatorNat.put("", Constantes.Nature.ONOMATOPEE);
		translatorGen.put("f", Constantes.Genre.FEMININ);
		translatorGen.put("m", Constantes.Genre.MASCULIN);
		translatorGen.put("", Constantes.Genre.BOTH);
		translatorNom.put("s", Constantes.Nombre.SINGULIER);
		translatorNom.put("p", Constantes.Nombre.PLURIEL);
		translatorNom.put("", Constantes.Nombre.BOTH);
		
	}
		
	public void fillFran(){
		String chaine="";
		String fichier ="Lexique380.txt";
		
		try{
			//Initialisation of a filter
			PrintWriter writer = new PrintWriter("lexique2.txt", "UTF-16");
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				String[] parts = ligne.split("\t");
				String n = parts[0];
				Pattern pn = Pattern .compile("^ART|^ADJ:^d|^PRO");
				Matcher mn = pn.matcher(parts[3]);
				String nat="";
				try{
					if(mn.find()){
					
						nat=parts[3].substring(mn.start(), mn.end());
					}
					else{
						nat=parts[3];
					}
					if(parts[3] == ""){
						System.out.println(n);
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
					//This is the filter to select which word to put in another file
					if(nature.value==Constantes.Nature.ONOMATOPEE.value){
						int i =0;
					}
					if(((Double.parseDouble(parts[6])) > 11 || (Double.parseDouble(parts[7])) > 11 ||
							(Double.parseDouble(parts[8])) > 11 || (Double.parseDouble(parts[9])) > 11)
							&& nature.value != Constantes.Nature.ONOMATOPEE.value){
						writer.println(n+"\t"+nature+"\t"+genre+"\t"+nombre);
					}
					if(!(genre == null) && !(nombre == null) && !(nature == null)){
						db.addElement(word);
					}
				}
				catch (Exception e){
					System.out.println(e.toString()+" - "+n);
				}
			}
			br.close();
			writer.close();
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}

	}*/
//--------------------------------------------------------------------------------------------------
	  public void initTrans(){

		translatorNat.put("NOM", ConstF.Nature.NOM);
		translatorNat.put("VERBE", ConstF.Nature.VERBE);
		translatorNat.put("ADJECTIF", ConstF.Nature.ADJECTIF);
		translatorNat.put("ADVERBE", ConstF.Nature.ADVERBE);
		translatorNat.put("DETERMINANT", ConstF.Nature.DETERMINANT);
		translatorNat.put("CONJONCTION", ConstF.Nature.CONJONCTION);
		translatorGen.put("FEMININ", ConstF.Genre.FEMININ);
		translatorGen.put("MASCULIN", ConstF.Genre.MASCULIN);
		translatorGen.put("BOTH", ConstF.Genre.BOTH);
		translatorNom.put("SINGULIER", ConstF.Nombre.SINGULIER);
		translatorNom.put("PLURIEL", ConstF.Nombre.PLURIEL);
		translatorNom.put("BOTH", ConstF.Nombre.BOTH);
		
	}
	
	public void fillFran(){
		String fichier ="lexique2.txt";
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips, Charset.forName("UTF-16"));
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				String[] parts = ligne.split("\t");
				if(parts.length>4){
					System.out.println("toto");
				}
				String n = parts[0];
				ConstF.Nature nature = translatorNat.get(parts[1]);
				ConstF.Genre genre = translatorGen.get(parts[2]);
				ConstF.Nombre nombre = translatorNom.get(parts[3]);
				Word word = new Word(n,nature,genre,nombre);
				db.addElement(word);
			}
			br.close();
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}

	}
	public static void main(String[] args){
		WordBankF db = new WordBankF();
	}
	
}
