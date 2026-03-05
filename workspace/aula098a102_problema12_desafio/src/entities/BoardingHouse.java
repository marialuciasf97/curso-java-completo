package entities;

public class BoardingHouse {

	private static final int QUANTITY_ROOM = 10;
	
	private Room[] rooms;
	
	public BoardingHouse() {
		rooms = new Room[QUANTITY_ROOM];
		
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room(i);
		}
	}

	public Room[] getRooms() {
		return rooms;
	}

	public static int getQuantityRoom() {
		return QUANTITY_ROOM;
	}

	public boolean rentRoom(int number, Student student) {
		if (rooms[number].isOccupied()) {
			return false;
		}
		rooms[number].rentTo(student);
		return true;
	}
	
}
