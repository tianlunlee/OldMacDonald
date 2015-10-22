class Farm 
{     
   //your code here
	private Animal[] friends = new Animal[4];
	public Farm() {

	friends[0] = new Cow("cow", "moo");
	if (Math.random() > 0.5) {
		friends[1] = new Chick("chick", "peep");
	}
	else {
		friends[1] = new Chick("chick", "cluck");
	}
	
	friends[2] = new Pig("pig", "oink");
	friends[3] = new NamedCow("cow", "Dairy", "moo");

	}
	 public void animalSounds()    {       
     for (int nI=0; nI < friends.length; nI++)       {          
       System.out.println( friends[nI].getType() + " goes " + friends[nI].getSound());   
       if (nI == 3) {
       	System.out.println( "The cow is known as " + ((NamedCow)friends[3]).getName() );  

       }
       
      }    
}
}
