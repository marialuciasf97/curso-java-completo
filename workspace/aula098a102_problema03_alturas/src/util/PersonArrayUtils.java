package util;

import entities.Person;

public class PersonArrayUtils {

	public static double calculateAverageHeight(Person[] people) {
		if (isArrayEmpty(people)) {
			return 0.0;
		}
		double sumHeight = 0.0;
		for (int i = 0; i < people.length; i++) {
			sumHeight += people[i].getHeight();
		}
		return sumHeight / people.length;
	}
	
	public static double getPercentageUnderAge(Person[] people) {
		if (isArrayEmpty(people)) {
			return 0.0;
		}
 		int countUnderAge = countPeopleUnderAge(people);
 		
		return ((double) countUnderAge / people.length) * 100;
	}
	
	public static String[] getNamesUnderAge(Person[] people) {
		if(isArrayEmpty(people)) {
			return new String[0];
		}
		
		int countUnderAge = countPeopleUnderAge(people);
		String[] namesUnderAge = new String[countUnderAge];
		
		int index = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].isUnderAge()) {
				namesUnderAge[index] = people[i].getName();
				index++;
			}
		}
		return namesUnderAge;
	}
	
	// Auxiliary Methods:
	
	private static boolean isArrayEmpty(Person[] people) {
		return people == null || people.length == 0; 
	}
	
	private static int countPeopleUnderAge(Person[] people) {
		if (isArrayEmpty(people)) {
			return 0;
		}
		int countUnderAge = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].isUnderAge()) {
				countUnderAge++;
			}
		}
		return countUnderAge;
	}
}
