import java.util.Arrays;

public class OneDSalesMain {

	/*
	 * 
 						South	East	West 	North
		Sales			1006	504	1504	871
		Units Returned	16	11	5	14
		Manager			E. Burns	C. Ahern	F. Clarke	N. Webb
		Onsite Presence	Yes	Yes	No	Yes
		
		
		Taking the information above, find the following (thro’ the use of 1D or 2D arrays)
		1.	Overall Sales
		2.	Region with
			a.	Highest Sales
			b.	Lowest Units returned
			c.	In both, return the manager responsible
		3.	How many regions have a manager who is onsite? 

	 */
	
	public static void main(String[] args) {
		int myMark = 0;
		//declaring the array
//		int[] sales = new int[4];
//		int[] unitsReturned = new int[4];
//		String[] manager = new String[4];
//		boolean[] onsitePresence = new boolean[4];
//
//		sales[0] = 1006;
//		sales[1] = 504;
		
		//initializing the arrays
		int[] sales = {1006, 504, 1504, 871};
		int[] unitsReturned = {16, 11, 5, 14 };
		String[] manager = { "E. Burns", "C. Ahern", "F. Clarke", "N. Webb" };
		boolean[] onsitePresence = { true, true, false, true };

		// start - Calculating overall sales
		int overallSales = 0;
		for(int i=0; i<sales.length; i++) {
			overallSales += sales[i];
		}
		System.out.println("Overall sales is: " + overallSales);
		// end - Calculating overall sales
		
		// start - Calculating highest sales and manager of the region with highest sales
		int highestSales = 0;
		int highestSaleIndex = 0;
		for(int i=0; i<sales.length; i++) {
			if(sales[i] > highestSales) {
				highestSales = sales[i];
				highestSaleIndex = i;
			}
		}
		System.out.println("Highest Sales is: " + highestSales);
		System.out.println("Manager of the region with highest sales: " + manager[highestSaleIndex]);
		// end - Calculating highest sales and manager of the region with highest sales
		
		// start - Calculating lowest units and manager of the region with lowest units
		//Arrays.sort(unitsReturned);
		//System.out.println("Lowest Units returned: " + unitsReturned[0]);
		
		//int lowestUnits = 0;
		int lowestUnits = unitsReturned[0]; // commented previous line because if lowestUnits=0, then 0 will always be the lowestUnits, 
											// hence intialized it to unitsReturned[0], could do something similar like this to highestSales as well
		int lowestUnitsIndex = 0;
		for(int i=0;i<unitsReturned.length;i++) {
			if(unitsReturned[i] < lowestUnits) {
				lowestUnits = unitsReturned[i];
				lowestUnitsIndex = i;
			}
		}
		System.out.println("Lowest Units returned: " + lowestUnits);
		System.out.println("Manager of the region with lowest units: " + manager[lowestUnitsIndex]);
		// end - Calculating lowest units and manager of the region with lowest units
		
		// start - Calculating no. of onsite managers
		int noOfManagers = 0;
		for(boolean eachPresence: onsitePresence) {
			if(eachPresence) {
				noOfManagers++;
			}
		}
		System.out.println("No. of onsite managers: " + noOfManagers);
		// end - Calculating no. of onsite managers
		
	}

}
