
public class FordMain {

	public static void main(String[] args) {
		FordFigo ff1 = new FordFigo();
		ff1.switchOn();
		ff1.accelerate();
		ff1.applyBrakes();
		ff1.switchOff();
		System.out.println("--------------------------------");
		
		FordFigo ff2 = new FordFigo();
		ff2.switchOn();
		ff2.accelerate();
		ff2.applyBrakes();
		ff2.switchOff();
		System.out.println("--------------------------------");
		
		FordFigoTitanium fft1 = new FordFigoTitanium();
		fft1.switchOn();
		fft1.accelerate();
		fft1.applyBrakes();
		fft1.popOutAirbags();
		fft1.switchOff();
		System.out.println("--------------------------------");
		
		
	}

}
