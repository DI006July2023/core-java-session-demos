package exception;

// this custom exception is a checked exception
// to create an unchecked exception, make your class extend RuntimeException
public class BooksNotFoundException extends Exception{

	// we are going to redefine the getMessage()
	@Override
	public String getMessage() {
		return "No Books in DB/File!!";
	}

}
