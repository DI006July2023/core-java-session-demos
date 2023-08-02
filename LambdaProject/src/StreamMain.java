import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class StreamMain {

	public static void main(String[] args) {
		List<String> allColors = new ArrayList<String>();
		
		allColors.add("red");
		allColors.add("blue");
		allColors.add("green");
		allColors.add("black");
		
		for(int i=0;i<allColors.size();i++) {
			System.out.println(allColors.get(i));
		}
		System.out.println("-----------------------");
		
		for(String eachColor: allColors) {
			System.out.println(eachColor);
		}
		System.out.println("-----------------------");
		
		Iterator itr = allColors.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------------");
		//BiFunction<Integer, Integer, Integer> product3 = (a,b)->a*b;
		//Consumer<String> send = (eachColor)->System.out.println(eachColor);
		//allColors.forEach(send);
		allColors.forEach((eachColor)->System.out.println(eachColor));
		
		System.out.println("-----------------------");
		boolean isRemoved = allColors.removeIf((eachColor)->eachColor.startsWith("b"));
		
		allColors.forEach((eachColor)->System.out.println(eachColor));
		System.out.println("-----------------------");
		
		// working with stream here
		
		long countOfColors = allColors.stream().count();
		System.out.println("Count of Colors: " + countOfColors);
		
	}

}
