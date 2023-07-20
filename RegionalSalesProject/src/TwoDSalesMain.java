
public class TwoDSalesMain {

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
		//String[][] salesInfo = new String[4][4];
		String[][] salesInfo = {
								{"1006", "16", "E. Burns", "true"}, 
								{"504", "11", "C. Ahern", "true"}, 
								{"1504", "5", "F. Clarke", "false"}, 
								{"871", "14", "N. Webb", "true"}
							   };
		
		// start - Calculating overall sales
		int overallSales = 0;
		for(String[] eachRegion: salesInfo) {
			overallSales = overallSales + Integer.parseInt(eachRegion[0]);
		}
		
		// above for loop is the same as below for loop
		
//		for(int i=0; i<salesInfo.length; i++) {
//			overallSales = overallSales + Integer.parseInt(salesInfo[i][0]);
//		}
		
		System.out.println("Overall sales is: " + overallSales);
		// end - Calculating overall sales
		
		// start - Calculating highest sales and manager of the region with highest sales
		int highestSales = 0;
		int highestSaleIndex = 0;
		for(int i=0; i<salesInfo.length; i++) {
			if(Integer.parseInt(salesInfo[i][0]) > highestSales) {
				highestSales = Integer.parseInt(salesInfo[i][0]);
				highestSaleIndex = i;
			}
		}
		System.out.println("Highest Sales is: " + highestSales);
		System.out.println("Manager of the region with highest sales: " + salesInfo[highestSaleIndex][2]);
		// end - Calculating highest sales and manager of the region with highest sales
		
		// start - Calculating lowest units and manager of the region with lowest units
		int lowestUnits = Integer.parseInt(salesInfo[0][1]); 
		int lowestUnitsIndex = 0;
		for(int i=0;i<salesInfo.length;i++) {
			if(Integer.parseInt(salesInfo[i][1]) < lowestUnits) {
				lowestUnits = Integer.parseInt(salesInfo[i][1]);
				lowestUnitsIndex = i;
			}
		}
		System.out.println("Lowest Units returned: " + lowestUnits);
		System.out.println("Manager of the region with lowest units: " + salesInfo[lowestUnitsIndex][2]);
		// end - Calculating lowest units and manager of the region with lowest units
		
		// start - Calculating no. of onsite managers
		int noOfManagers = 0;
		for(String[] eachRegionSales: salesInfo) {
			if(Boolean.parseBoolean(eachRegionSales[3])) {
				noOfManagers++;
			}
		}
		System.out.println("No. of onsite managers: " + noOfManagers);
		// end - Calculating no. of onsite managers
	}

}
