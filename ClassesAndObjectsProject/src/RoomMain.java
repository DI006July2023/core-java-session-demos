
public class RoomMain {

	public static void main(String[] args) {
		
		int myMarks;
		myMarks = 70;
		
		Room livingRoom;
		livingRoom = new Room(200, 150, 50);
		
//		livingRoom.length = 200;
//		livingRoom.width = 150;
//		livingRoom.height = 50;
		
		System.out.println("Floor Area of living room:" + livingRoom.computeFloorArea());
		System.out.println("Wall painting cost:" + livingRoom.computeWallPaintingCost(2));
		
		Room bedRoom = new Room(150, 100, 50);
//		bedRoom.length = 150;
//		bedRoom.width = 100;
//		bedRoom.height = 50;
		
		System.out.println("Floor Area of bed room:" + bedRoom.computeFloorArea());
		System.out.println("Wall painting cost:" + bedRoom.computeWallPaintingCost(3));
		
		
		Room diningRoom = new Room(200, 180, 50, "Pink", 201);
		
		Room studyRoom = new Room(100, 80, 50, "Blue");
		
		
		
		
	}

}
