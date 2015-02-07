package realityx;

import java.util.Vector;

public class DataBaseA extends DataBase<Action> {
	
	public DataBaseA() {
		super();
	}

	public boolean isIn(Action o) {
		for (Action e : db){
			boolean test = o.equals(e);
		    if(test){
		    	return true;
		    }
		}
		return false;
	}
	
	public Action getElem(String n){
		for(Action a : db){
			if(a.getType().equals(n)){
				return a;
			}
		}
		return null;
	}

	public void hogwards(Game g){
		DataBaseA ret = new DataBaseA();
		//Move Action
		Action move = new Action("Move", g);
		getDb().add(move);
		//Talk Action
		Action talk = new Action("Talk", g);
		getDb().add(talk);
		//Touch Action
		Action touch = new Action("Touch", g);
		getDb().add(touch);
		//Status Action
		Action status = new Action("Status", g);
		getDb().add(status);
		//Debug Action
		Action debug = new Action("Debug", g);
		getDb().add(debug);
	}
}
