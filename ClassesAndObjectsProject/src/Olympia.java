
public class Olympia implements SafetyGuidelines2023{

	void constructHouse() {
		System.out.println("House constructed");
	}
	
	void housePlan() {
		System.out.println("House plan...");
	}

	@Override
	public void protectHead() {
		System.out.println("iron helmets with thickness:" + PROTECTIVE_GAUGE);
		
	}

	@Override
	public void protectFeet() {
		System.out.println("iron shoes with thickness:" + PROTECTIVE_GAUGE);
		
	}
	
}

