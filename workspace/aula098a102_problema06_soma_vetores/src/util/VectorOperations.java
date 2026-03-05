package util;

import entities.Vector;

public class VectorOperations {

	public static Vector sumVectors(Vector vectorA, Vector vectorB) {

		Vector vectorC = new Vector(vectorA.getSize());

		double sum = 0.0;
		for (int i = 0; i < vectorC.getSize(); i++) {
			sum = vectorA.getElement(i) + vectorB.getElement(i);
			vectorC.insertElement(i, sum);
		}

		return vectorC;
	}
}
