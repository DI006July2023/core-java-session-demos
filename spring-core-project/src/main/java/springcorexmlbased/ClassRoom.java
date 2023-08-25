package springcorexmlbased;

public class ClassRoom {
	private Projector classProjector;
	private Television tv;
	private int roomNo;
	
	public ClassRoom(Projector classProjector, int roomNo) {
		super();
		this.classProjector = classProjector;
		this.roomNo = roomNo;
	}

	public Projector getClassProjector() {
		return classProjector;
	}

	public void setClassProjector(Projector classProjector) {
		this.classProjector = classProjector;
	}

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	
	public Television getTv() {
		return tv;
	}

	public void setTv(Television tv) {
		this.tv = tv;
	}

	@Override
	public String toString() {
		return "ClassRoom [classProjector=" + classProjector + ", tv=" + tv + ", roomNo=" + roomNo + "]";
	}

	
}
