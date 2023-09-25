
public class FibonacciDemo {
	public static void main(String args[]) {
		// 0 1 1 2 3 5 8 13 
		int itr = 8;
		int currentNumber = 0;
		int nextNumber = 1;
		System.out.print(currentNumber);
		for(int i=0;i<itr-1;i++) {
			int sum = currentNumber + nextNumber; 
			System.out.print(" " + sum);
			nextNumber = currentNumber;
			currentNumber = sum;
		}
	}
}
