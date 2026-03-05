package util;

import entities.Person;

public class PersonArrayUtils {

	public static Person findOldest(Person[] people) {
		
		if (people == null || people.length == 0) {
			return null;
		}
		
		Person personOldest = people[0];
		for (int i = 1; i < people.length; i++) {
			if(personOldest.getAge() < people[i].getAge()) {
				personOldest = people[i];
			}
		}
		return personOldest;
	}
	
}
