class Cow implements Animal 
{     
     //your code here
	private int numLegs;
	private String myType; 
	private String mySound;
	public Cow(String type, String sound) {
		myType = type;
		mySound = sound;
	}
	public Cow(){
		myType = "";
		mySound = "";
	}
	public String getType() {
		return myType;
	}
	public String getSound() {
		return mySound;
	}
}
