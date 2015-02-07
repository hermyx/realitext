package realityx;


public class Person {
	private String name;
	private Personality personality;
	private int age;
	private char gender;
	private Location isOn;
	
	public Person() {
		name="";
		personality=new Personality();
		age=0;
		isOn = new Location();
	}
	
	public Person(String n, Personality c, int a, char g){
		name=n;
		personality=c;
		age=a;
		gender=g;
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
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Location getLocation(){
		return isOn;
	}
	
	public void setLocation(Location l){
		isOn = l;
	}
	
	public boolean equals(Person test){
		boolean ret=true;
		ret&=name.equals(test.getName());
		ret&=personality.equals(test.getPersonality());
		ret&=age==test.getAge();
		ret&=gender==test.getGender();
		return ret;
	}

	
}
