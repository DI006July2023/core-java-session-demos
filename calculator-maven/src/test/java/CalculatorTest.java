import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// this is a test class
public class CalculatorTest {

	// here we write the test methods
	// test methods can be of any name, better to follow the convention
	// test methods are identified as test methods by JUnit when you put the @Test
	
	@BeforeAll
	public static void beforeAllTests() {
		System.out.println("Method with BeforeAll annotation is called");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("Method with BeforeEach annotation is called");
	}
	
	@AfterAll
	public static void afterAllTests() {
		System.out.println("Method with AfterAll annotation is called");
	}
	
	@AfterEach
	public void afterEachTest() {
		System.out.println("Method with AfterEach annotation is called");
	}
	
	@Test
	public void testAddPositive() {
		Calculator calc = new Calculator();
		
		int actualOutput = calc.add(10,  20);
		int expectedOutput = 30;
		
		Assertions.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testAddNegative() {
		//AAA - Arrange, Act, Assert
		Calculator calc = new Calculator();
		
		int actualOutput = calc.add(-8, -2);
		int expectedOutput = -10;
		
		Assertions.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testAddZero() {
		//AAA - Arrange, Act, Assert
		Calculator calc = new Calculator();
		
		int actualOutput = calc.add(5, 0);
		int expectedOutput = 5;
		
		Assertions.assertEquals(expectedOutput, actualOutput);
	}
	
}
