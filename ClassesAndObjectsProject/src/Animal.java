
public abstract class Animal {
	// defining a method
	void breathes() {
		System.out.println("Animal breathes...");
	}
	
	void mobility() {
		System.out.println("Animal is mobile...");
	}
	
	abstract void eat(); // declaring a method - having the signature with no method body
}
