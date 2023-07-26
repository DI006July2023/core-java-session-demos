
public class CasaGrande implements SafetyGuidelines2023 {

	void houseAdvice() {
		System.out.println("house advice...");
	}
	
	void constructAppartments() {
		System.out.println("appartment contructed...");
	}

	@Override
	public void protectHead() {
		System.out.println("fiber helmets provided with thickness:" + PROTECTIVE_GAUGE);
		
	}

	@Override
	public void protectFeet() {
		System.out.println("fiber shoes provide with thickness:" + PROTECTIVE_GAUGE);
	}
	
	
	
}
