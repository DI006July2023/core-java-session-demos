
public class Dog extends Animal{

	@Override
	void mobility() {
		System.out.println("Dog walks...");
	}
	
	void makeSound() {
		System.out.println("Dog barks...");
	}

	@Override
	void eat() {
		System.out.println("Dog bites the food...");
	}
	
}
