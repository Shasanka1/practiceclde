public class Work
{
	public static void main(String[] arg)
	{
				// Stock Transaction Program
		
		// Joe's stock last month in Acme Software
		
		int  shares = 1000;
		double paid_pshare = 32.87;
		double com = 0.02;
		double commission1;
		double paid;
		
		// Joe's stock two weeks later
		
		double paid_pshare2 = 33.92;
		double commission2;
		double paid2;
		double profit;
		
		paid =  (double)shares * paid_pshare;
		commission1 = com * paid;
		
		paid2 = (double)shares * paid_pshare2;
		commission2 = paid2 * com;
		profit = paid2 - (commission1 + commission2);
		
		System.out.printf(" The amount of money Joe paid forthe stock is:  $%,.0f" + "\n The amount of commission Joe paid his broker the stock is: $%,.0f "
		+ "\n The amount of that Joe sold the stock for is: $%,.0f" + "\n The ammount of commission Joe paid his broker when he sold the stock is: $%,.0f "
		+ "\n The profit that Joe made after selling his stocks and payed the two commissions is: $%,.0f", paid, commission1, paid2, commission2, profit);
		
		
	}
}