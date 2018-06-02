
public class Write
{
	public static void main(String [] arg)
	{
		// Stock commission
		
		int shares = 1000;
		double price_pshare = 25.50;
		double com = 0.02;
		double commission;
		double stock;
		double total;
		
		stock = shares * price_pshare;
		commission = stock * com;
		total = stock + commission;
		
		System.out.printf(" The amount paid for the stock alone is:  	$ %,.0f " + " \n The amount of commission is: 			 $ %,.0f "
		                  + "\n The total amount paid is:			$ %,.0f " , stock, commission,total);
		
		
	}
}



