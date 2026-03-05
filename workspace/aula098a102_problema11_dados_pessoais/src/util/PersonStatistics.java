package util;

import entities.Person;

public class PersonStatistics {

	public static double getMaxHeight(Person[] people) {
		double maxHeight = people[0].getHeight();
		for (int i = 1; i < people.length; i++) {
			if (maxHeight < people[i].getHeight()) {
				maxHeight = people[i].getHeight();
			}
		}
		return maxHeight;
	}
	
	public static double getMinHeight(Person[] people) {
		double minHeight = people[0].getHeight();
		for (int i = 1; i < people.length; i++) {
			if (minHeight > people[i].getHeight()) {
				minHeight = people[i].getHeight();
			}
		}
		return minHeight;
	}
	
	public static double getAverageHeightOfWomen(Person[] people) {
		double sumHeight = 0.0;
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].isWoman()) {
				sumHeight += people[i].getHeight();
				count++;
			}
		}
		if (count == 0) {
			return 0.0;
		}
		return sumHeight / count;
	}
	
	public static int getNumberOfMen(Person[] people) {
		int count = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i].isMan()) {
				count++;
			}
		}
		return count;
	}
	
}
