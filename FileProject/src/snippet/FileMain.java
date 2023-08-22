package snippet;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FileMain {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		try {
			//FileWriter fw = new FileWriter("orders\\Order_20100303.txt");
			LocalDate todaysDate = LocalDate.now();
			System.out.println("Todays date:" + todaysDate);
			String fileName = "Orders_" + todaysDate.getYear() + todaysDate.getMonthValue() + todaysDate.getDayOfMonth() + ".txt";
			FileWriter fw = new FileWriter(fileName);
			fw.append("first order");
			fw.flush();
			fw.close();
			
			FileWriter fw1 = new FileWriter(fileName);
			fw1.append("second order");
			fw1.flush();
			fw1.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
