package realityx;

public class Event {
	private String type;
	private Game game;
	
	public Event() {
		type="";
		game=new Game();
	}
	
	public Event(String t, Game g){
		type=t;
		game=g;
	}
	
	public boolean equals(Event test){
		boolean ret = type.equals(test.getType());
		return ret;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
