package realityx;

public class Action {
	private String type;
	private Game game;
	
	public Action() {
		type="";
		game=new Game();
	}
	
	public Action(String t, Game g){
		type=t;
		game=g;
	}
	
	public boolean equals(Action test){
		boolean ret = type.equals(test.getType());
		return ret;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void execute(){
		switch(type){
		case "Talk":talk();break;
		case "Move":move();break;
		default:System.out.println("Not implemented action");
		}
	}
	
	public void talk(){
		System.out.println("To whom you want to talk ?");
		String toTalk = game.in.nextLine();
		Person toT = game.getHero().getLocation().persWithName(toTalk);
		talk(toT);
	}
	public boolean talk(Person p){
		if(p!=null && game.getHero().getLocation().isThere(p.getName())){
			System.out.println("Vous parlez avec "+p.getName()+"!");
			if(p.getGender()=='f'){
				System.out.println("Elle aime ça :p!");
			}
			return true;
		}
		else{
			System.out.println("Cette personne n'est pas dans "+game.getHero().getLocation().getName());
			return false;
		}
	}
	
	public void move(){
		System.out.println("Where do you want to move ?");
		System.out.println("You can go to : ");
		for(Location l : game.getHero().getLocation().getGoTo()){
			System.out.println("- "+l.getName());
		}
		String goTo = game.in.nextLine();
		move(goTo);
	}
	
	public boolean move(String nameL){
		if(game.getHero().getLocation().isGoTo(nameL)){
			game.getHero().setLocation(game.getHero().getLocation().locWithName(nameL));
			System.out.println("Vous vous trouvez à : "+game.getHero().getLocation().getName());
			return true;
		}
		else{
			System.out.println("Cette destination n'est pas valide !");
			return false;
		}
	}

}
