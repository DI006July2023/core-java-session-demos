
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
		
		Room studyRoom3 = new Room(80, 100, 50);
		System.out.println("------------------------------------");
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 == num2);
		
		// check the equality of the diningRoom and studyRoom
		// reference equality
		System.out.println("diningRoom == studyRoom:" + (diningRoom == studyRoom));
		Room studyRoom2 = studyRoom;
		System.out.println("studyRoom2 == studyRoom:" + (studyRoom2 == studyRoom));
		
		//content equality
		System.out.println("diningRoom.equals(studyRoom):" + (diningRoom.equals(studyRoom2)));
		System.out.println("studyRoom3.equals(studyRoom):" + (studyRoom3.equals(studyRoom)));
	}

}
