package thesis;

import java.util.ArrayList;
import java.util.Random;

public class Dater {

	protected String name;
	protected int beauty;
	protected int humor;
	protected int intelligence;
	protected int preferredBeauty;
	protected int preferredHumor;
	protected int preferredIntelligence;
	protected String[] preferredTraits;
	protected Dater[] preferredPartners;

	public Dater(String name, int beauty, int humor, int intelligence,
			int pBeauty, int pHumor, int pIntelligence) {
		this.name = name;
		this.beauty = beauty;
		this.humor = humor;
		this.intelligence = intelligence;
		this.preferredBeauty = pBeauty;
		this.preferredHumor = pHumor;
		this.preferredIntelligence = pIntelligence;
		this.preferredTraits = new String[3];
		this.preferredPartners = new Dater[3];
	} // Dater constructor

	public static Dater[][] match(Dater[] females, Dater[] males) {
		Dater[][] matches = new Dater[males.length][2];
		ArrayList<Integer> seen = new ArrayList<>();
		Random random = new Random();
		boolean found = false;
		boolean isStable = false;
		int index;
		while (isStable == false) {
			// match males and females
			for (int i = 0; i < males.length; i++) {
				matches[i][0] = males[i];
				while (found == false) {
					index = random.nextInt(females.length);
					for (int j = 0; j < seen.size(); j++) {
						if (j == 0)
							seen.add(j);
						else if (index == seen.get(j))
							break;
						seen.add(j);
						found = true;
					} // for
				} // while
			} // for
			
			// check if matches are stable
			for (int i = 0; i < matches.length; i++) {
				
			} // for
		} // while
		return matches;
	} // match

	public void setPreferredPartners(Dater[] partners) {
		// find out what the person prefers from most to least
		// assign the correct person to each index
		for (int i = 0; i < partners.length; i++) {
			Dater temp = partners[i];
			for (int j = i + 1; j < partners.length - 1; j++)
				if (partners[j].beauty > partners[j + 1].beauty)
					temp = partners[j];
			preferredPartners[i] = temp;
		} // for
	} // setPreferredPartners

	public String toString() {
		String s = "Name: " + name + "\tBeauty: " + beauty + "\tHumor: "
				+ humor + "\tIntelligence: " + intelligence;
		s += "\n" + name + " prefers (from most to least) ";
		for (int i = 0; i < preferredPartners.length; i++) {
			if (i != preferredPartners.length - 1)
				s += preferredPartners[i].name + ", ";
			else
				s += preferredPartners[i].name + ".";
		}
		return s;
	} // toString

}
