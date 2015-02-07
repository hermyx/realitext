package realityx;

import java.util.Vector;

public abstract class DataBase<E> {
	protected Vector<E> db;

	public DataBase() {
		db = new Vector<E>();
	}

	public void add(E o) {
		if(!isIn(o))
			db.add(o);
	}
	public void remove(E o) {
		for(E e : db){
			if(e.equals(o)){
				db.removeElement(o);
		    }
		}
	}
	public boolean isIn(E o) {
		return true;
	}
	
	public void type(String type, Game g){
		if (type == "Hogwards"){
			hogwards(g);
		}
	}
	
	public void hogwards(Game g){
	}

	public Vector<E> getDb() {
		return db;
	}

	public void setDb(Vector<E> db) {
		this.db = db;
	}
}
