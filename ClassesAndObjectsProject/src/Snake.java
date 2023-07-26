
public class Snake extends Animal{

	@Override
	void mobility() {
		System.out.println("Snake crawls...");
	}
	
	void attack() {
		System.out.println("Snake attacks...");
	}

	@Override
	void eat() {
		System.out.println("Snake swallows");
		
	}

	
}
