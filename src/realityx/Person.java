package realityx;


public class Person {
	private String name;
	private Personality personality;
	private int age;
	private Type type;
	private Game game;
	private Location isOn;
	
	public Person() {
		name="";
		personality=new Personality();
		age=0;
		isOn = new Location();
		game=new Game();
		type = new Type("humain", game);
	}
	
	public Person(String n, Personality c, int a, char g, Game ga){
		name=n;
		personality=c;
		age=a;
		game=ga;
		if(g=='h'|g=='m'){
			type = new Type("humain", game);
		}else if(g=='f'|g=='w'){
			type = new Type("humaine", game);
		}else{
			System.out.println("Veuillez rentrer un genre correct(h/f)");
		}
		isOn = new Location();
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Personality getPersonality() {
		return personality;
	}
	public void setPersonality(Personality personality) {
		this.personality = personality;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Location getLocation(){
		return isOn;
	}
	public void setLocation(Location l){
		isOn = l;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Game getGame() {
		return game;
	}

	public boolean equals(Person test){
		boolean ret=true;
		ret&=name.equals(test.getName());
		ret&=personality.equals(test.getPersonality());
		ret&=age==test.getAge();
		ret&=type.equals(test.getType());
		return ret;
	}

	
}
