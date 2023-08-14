package snippet;

import java.io.FileWriter;
import java.io.IOException;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//FileWriter fw = new FileWriter("orders\\Order_20100303.txt");
			FileWriter fw = new FileWriter("Order_20100303.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
