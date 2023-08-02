import java.util.function.BiFunction;

public class LambdaMain {

	public static void main(String[] args) {
		// First way - conventional way
		Operation add = new Addition();
		int addAnswer = add.operate(4, 5);
		System.out.println("Sum is : " + addAnswer);
		
		
		Operation product = new Multiply();
		int productAnswer = product.operate(4, 5);
		System.out.println("Product is : " + productAnswer);
		
		System.out.println("-----------------------");
		
		// Second way - anonymous classes
		Operation add1 = new Operation() {
										@Override
										public int operate(int a, int b) {
											return a+b;
										}
									};
		int addAnswer1 = add1.operate(7, 8);
		System.out.println("Sum is : " + addAnswer1);
		
		Operation product1 = new Operation() {
										@Override
										public int operate(int a, int b) {
											return a*b;
										}
									};
		int productAnswer1 = product1.operate(7, 8);
		System.out.println("Product is : " + productAnswer1);
		System.out.println("-----------------------");
		
		// Third way - Lambda expressions
		Operation add2 = (x, y)->x+y;
		int addAnswer2 = add2.operate(10, 20);
		System.out.println("Sum is : " + addAnswer2);
		
		Operation product2 = (l, m)->l*m;
		int productAnswer2 = product2.operate(10, 20);
		System.out.println("Product is : " + productAnswer2);
		
		System.out.println("-----------------------");
		
		// the functional interface Operation need not be created by us 
		// because we can make use of the in-built functional interfaces given to us by java
		
	
		BiFunction<Integer, Integer, Integer> add3 = (a,b)->a+b;
		int addAnswer3 = add3.apply(2, 3);
		System.out.println("Sum is : " + addAnswer3);
		
		BiFunction<Integer, Integer, Integer> product3 = (a,b)->a*b;
		int productAnswer3 = product3.apply(2, 3);
		System.out.println("Product is : " + productAnswer3);
		
		
	}
}
