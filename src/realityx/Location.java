package realityx;

import java.util.*;

public class Location {
	private String name;
	private Vector<Person> p;
	private Vector<Location> goTo;
 
	public Location() {
		name = "";
		p = new Vector<Person>(0);
		goTo = new Vector<Location>(0);

	}
	public Location(String n) {
		name = n;
		p = new Vector<Person>(0);
		goTo = new Vector<Location>(0);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public Vector<Location> getGoTo() {
		return goTo;
	}
	 
	public void addP(Person pers){
		if(!isThere(pers.getName()))
		p.add(pers);
	}
	public void addGoTo(Location l){
		if(!isGoTo(l.getName()))
		goTo.add(l);
	}
	
	public boolean isThere(String pers){
		for (Person person : p){
		    if(person.getName().equals(pers)){
		    	return true;
		    }
		}
		return false;
	}
	public boolean isGoTo(String l){
		for (Location loc : goTo){
		    if(loc.getName().equals(l)){
		    	return true;
		    }
		}
		return false;
	}
	
	public Person persWithName(String n){
		for(Person person : p){
			if(person.getName().equals(n)){
				return person;
			}
		}
		return null;
	}
	public Location locWithName(String n){
		for(Location loc : goTo){
			if(loc.getName().equals(n)){
				return loc;
			}
		}
		return null;
	}
	public Vector<Person> getP() {
		return p;
	}
}
