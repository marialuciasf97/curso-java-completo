package entities;

public class Room {
		
	private int number;
	private Student occupant;
	
	public Room(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Student getOccupant() {
		return occupant;
	}
	
	public boolean isOccupied() {
		return occupant != null;
	}
	
	public void rentTo(Student student) {
		this.occupant = student;
	}
	
}
