
public class RetailItem  // Start Class
{
	
	public static void main(String[] args)
	{
	System.out.println("Item #1"+ " \t " + description("Jacket") + "\t\t\t" + Unit(12)
			+ "\t\t\t" + price(59.95));
	System.out.println("Item #2" + " \t " + description("Designer Jeans") + "\t\t" + Unit(40)
	+ "\t\t\t" + price(34.95));
	System.out.println("Item #3" + " \t " + description("Shirt") + "\t\t\t" + Unit(40)
			+ "\t\t\t" + price(24.95));
	
		
	}
	public static String description(String item){
		return item;
	}
	public static int Unit(int on_hand){
		return on_hand;
	}
	public static double price(double retail_price){
		return retail_price;
	}
}