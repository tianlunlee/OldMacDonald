class Farm 
{     
   //your code here
		private Animal[] friends = new Animal[3];
	public Farm() {

	friends[0] = new Cow("cow", "moo");
	if (Math.random() > 0.5) {
		friends[1] = new Chick("chick", "peep");
	}
	else {
		friends[1] = new Chick("chick", "cluck");
	}
	
	friends[2] = new Pig("pig", "oink");

	}
	 public void animalSounds()    {       
     for (int nI=0; nI < friends.length; nI++)       {          
       System.out.println( friends[nI].getType() + " goes " + friends[nI].getSound());       
      }    
}
}
