public class worktwo
{
	public static void main(String[] arg)
	{
				// Stock Transaction Program
		
		// Joe's stock last month in Acme Software
		
		int  shares = 1000;
		double paid_pshare = 32.87;
		double com1 = 0.02;
		double commission;
		double paid;
		
		// Joe's stock two weeks later
		
		int shares2 = 1000;
		double paid_pshare2 = 33.92;
		double com2 = 0.02;
		double commission2;
		double paid2;
		double profit;
		
		paid = shares * paid_pshare;
		commission = com1 * paid;
		
		paid2 = shares2 * paid_pshare2;
		commission2 = paid2 * com2;
		profit = paid2 - (com1 + com2);
		
		System.out.printf("The amount of money Joe paid forthe stock is:  $%,.0f" + "\n The amount of commission Joe paid his broker the stock is: $%,.of "
		+ "\n The amount of that Joe sold the stock for is: %,.0f" + "\n The ammount of commission Joe paid hsi broker when he sold the stock"
		+ "\n The profit that Joe made after selling his stocks and payed the two commissions is: %,.0f", paid, commission, paid2, commission2, profit);
		
		
	}
}