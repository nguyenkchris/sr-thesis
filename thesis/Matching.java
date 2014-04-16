package thesis;

public class Matching {

	public static void main(String[] args) {
	   
	    	// females
	    	Dater angela = new Dater("Angela",3,2,1,3,2,1);
	    	Dater becky = new Dater("Becky",2,1,3,2,1,3);
	    	Dater crystal = new Dater("Crystal",1,3,2,1,3,2);
	    	Dater[] females = new Dater[] {angela, becky, crystal};

	    	// males
	    	Dater adam = new Dater("Adam",3,2,1,3,2,1);
	    	Dater bob = new Dater("Bob",2,1,3,2,1,3);
	    	Dater charlie = new Dater("Charlie",1,3,2,1,3,2);
	    	Dater[] males = new Dater[] {adam, bob, charlie};
	    	
	    	System.out.println("Trying to match Adam, Bob, Charlie with Angela, Becky, Crystal.\n");

	    	adam.setPreferredPartners(females);
	    	System.out.println(adam + "\n"); 	

	    	bob.setPreferredPartners(females);
	    	System.out.println(bob + "\n");

	    	charlie.setPreferredPartners(females);
	    	System.out.println(charlie + "\n");

	    	angela.setPreferredPartners(males);
	    	System.out.println(angela + "\n");

	    	becky.setPreferredPartners(males);
	    	System.out.println(becky + "\n");	
	    	
	    	crystal.setPreferredPartners(males);
	    	System.out.println(crystal + "\n");	

	    	Dater[][] matches = Dater.match(females, males);
	    	System.out.println("The algorithm produces the following matches:\n");
	    	for (int i = 0; i < matches.length; i++) {
	    	    System.out.println(matches[i][0].name + " is matched with " + matches[i][1].name + ".");
	    	} // for

	}

}
