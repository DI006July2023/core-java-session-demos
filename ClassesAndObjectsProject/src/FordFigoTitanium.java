
public class FordFigoTitanium extends FordFigo{

	int airbags;
	
	boolean popOutAirbags() {
		System.out.println("FordFigoTitanium Airbags popped out....");
		return true;
	}

	@Override
	boolean applyBrakes() {
		System.out.println("FordFigoTitanium ABS brakes applied...");
		return true;
	}
	
	
}
