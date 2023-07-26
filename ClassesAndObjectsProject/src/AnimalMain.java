
public class AnimalMain {

	public static void main(String[] args) {
		// commented because Animal class has become an abstract class 
//		Animal animal = new Animal();
//		animal.breathes();
//		animal.mobility();
		
		Dog dog = new Dog();
		dog.breathes();
		dog.mobility();
		dog.makeSound();
		
		Snake snake = new Snake();
		snake.breathes();
		snake.mobility();
		snake.attack();
		
		Animal animal1 = new Dog();
		animal1.breathes();
		animal1.mobility(); // at compile time the compiler assumes that the mobility of the 
									//super class is going to be called
							// but during runtime the mobility of the sub class is bound to animal1
									// and mobility of Dog class is called
		//animal1.makeSound();
		
		System.out.println("animal1 cast to dog1");
		Dog dog1 = (Dog) animal1; // this is down casting and
										// down casting requires explicit casting
		
		dog1.breathes();
		dog1.mobility();
		dog1.makeSound();
		
		System.out.println("animal1 cast to snake1");
		Snake snake1 = (Snake) animal1;
		
		Animal animal2 = dog1; // this is upcasting and 
									//upcasting does not require explicit casting(implicit casting)
		
		
		
		
		

	}
	
	

}
