package realityx;

public class DataBaseE extends DataBase<Event> {
	public DataBaseE() {
		super();
	}

	public boolean isIn(Event o) {
		for (Event e : db){
			boolean test = o.equals(e);
		    if(test){
		    	return true;
		    }
		}
		return false;
	}

	public void hogwards(Game g){
		DataBaseE ret = new DataBaseE();
		//Appear Event
		Event app = new Event("Appear", g);
		getDb().add(app);
		//Disappear Event
		Event disapp = new Event("Disappear", g);
		getDb().add(disapp);
	}
}
