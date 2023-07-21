
public class Room {
	int length;
	int width;
	int height;
	String color;
	int roomNo;
	
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
