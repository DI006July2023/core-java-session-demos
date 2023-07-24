
public class Room {
	int length;
	int width;
	int height;
	String roomColor;
	int roomNo;
	
	Room(int length, int width, int height){
		//this(length, width, height, "blue", 50);
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	Room(int length, int width, int height, String roomColor){
		this(length, width, height);
		this.roomColor = roomColor;
	}
	
	Room(int length, int width, int height, String roomColor, int roomNo){
		
		this(length, width, height, roomColor); // here we are making a call to the other 
									//constructor which takes three int
									// and this is called constructor chaining
									// and this has to be the first line
//		this.length = length;
//		this.width = width;
//		this.height = height;
//		this.roomColor = roomColor;
		this.roomNo = roomNo;
	}
	
	int computeFloorArea(){
		int area = 0;
		area = length * width;
		return area;
	}
	
	int computeWallPaintingCost(int labourCost) {
		int wallArea = (2 * length * height) + (2 * width * height);
		//int labourCost = 2;
		int paintingCost = wallArea * labourCost;
		return paintingCost;
	}
}
