
void setup()
{
	//your variable declarations here
	Farm omd = new Farm();
	omd.animalSounds();
	if (mousePressed == true) {
		omd.animalSounds();
	}

}

interface Animal{
	public String getSound();
	public String getType();
}


