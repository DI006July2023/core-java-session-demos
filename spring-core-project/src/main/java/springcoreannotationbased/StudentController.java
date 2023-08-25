package springcoreannotationbased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentController {
	StudentServiceImpl studentService;

	// this is constructor injector
	@Autowired // this annotation tells the spring framework to automatically scan the constructor parameter of type StudentServiceImpl, 
					//create an object and do constructor injection 
	public StudentController(StudentServiceImpl studentService) {
		this.studentService = studentService;
	}

	@Override
	public String toString() {
		return "StudentController [studentService=" + studentService + "]";
	}
	
	
}
