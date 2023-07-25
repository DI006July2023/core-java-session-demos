
public class Zoo {
	
	
	void exhibit(Animal animal) {
		if(animal instanceof Dog) {
			Dog dog1 = (Dog) animal;
		}else if(animal instanceof Snake) {
			Snake snake1 = (Snake) animal;
		}
	}
//	void exhibit(Dog dog) {
//		// go ahead and call the members of dog
//	}
//	
//	void exhibit(Snake snake) {
//		// go ahead and call the members of snake
//	}

}
