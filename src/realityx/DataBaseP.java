package realityx;

import java.util.Vector;

public class DataBaseP extends DataBase<Person> {

	public DataBaseP() {
		super();
	}
	
	public boolean isIn(Person o) {
		for (Person e : db){
			boolean test = o.equals(e);
		    if(test){
		    	return true;
		    }
		}
		return false;
	}
	
	public Person getElem(String n){
		for(Person p : db){
			if(p.getName().equals(n)){
				return p;
			}
		}
		return null;
	}
	
	public void hogwards(Game g){
		//Hermione character
		Personality che = new Personality(9,9,5,7,6);
		Person her = new Person("Hermione",che,16,'f',g);
		getDb().add(her);
		//Harry character
		Personality cha = new Personality(6,2,6,7,7);
		Person har = new Person("Harry",cha,16, 'h',g);
		getDb().add(har);
		//Ron character
		Personality ronP = new Personality(5,3,3,7,7);
		Person ron = new Person("Ron",ronP,16, 'h',g);
		getDb().add(ron);
	}
}
