package gov.common.entity;

import java.util.ArrayList;
import java.util.Random;

public class TellerNames {

	private static ArrayList<String> names = new ArrayList<String>();
	
	static {
		names.add("Andrew");
		names.add("Alex");
		names.add("Devin");
		names.add("Peter");
		names.add("Paul");
		names.add("Sarah");
		names.add("Bob");
		names.add("Bobby");
		names.add("Robert");
		names.add("Scott");
		names.add("Charisse");
		names.add("Shanna");
		names.add("Shenaynay");
		names.add("Barack");
		names.add("Hussein");
		names.add("Rhohandra");
		names.add("Shaytanya");
		names.add("Trianelly");
		names.add("Dayquan");
		names.add("Akon");
		names.add("Azure");
		names.add("Kwame");
		names.add("Shaniqua");
		names.add("Latifah");
		names.add("V\'Lanta\'la\'mana\'ma\'nisha");
		names.add("Dequayquay");
		names.add("Tyrone");
		names.add("Kanye");
		names.add("Latoya");
		names.add("Laquisha");
		names.add("Bonifa");
		names.add("Shataniana");
		names.add("Kisha");
	}
	
	public static String getRandomName() {
		Random rand = new Random();
		int r = rand.nextInt(names.size());
		return names.get(r);
	}
	
}
