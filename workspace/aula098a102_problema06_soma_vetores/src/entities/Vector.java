package entities;

public class Vector {

	private double[] elements;
	
	public Vector(int size) {
		elements = new double[size];
	}
	
	public int getSize() {
		return elements.length;
	}
	
	public void insertElement(int index, double value) {
		elements[index] = value;
	}
	
	public double getElement(int index) {
		return elements[index];
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < elements.length; i++) {
			result += elements[i] + "\n";
		}
		return result;
	}
	
}
