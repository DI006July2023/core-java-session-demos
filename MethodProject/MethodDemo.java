
public class MethodDemo {

	public static void main(String[] args) {
		// input
		int base = 3;
		int power = 4;
				
		// process
//		int result = 1;
//		for(int i=1;i<=power;i++) {
//			result = result * base;
//		}
		int output = computeBasePower(base, power);
				
		// output 
		System.out.println("The answer is:" + output);

	}

	// defining a method now
	static int computeBasePower(int baseNumber, int powerNumber) {
		int result = 1;
		for(int i=1;i<=powerNumber;i++) {
			result = result * baseNumber;
		}
		return result;
	}
	
}
