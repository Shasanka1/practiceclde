
public class Payroll
{
	static int hours;
	static int pay = 30;
	
	public static void main(String[] args) // main is the Name of Method
	{
		System.out.println(Name("Sally"));
		System.out.println(ID(89053));
		System.out.println(hour_pay(30));
		System.out.println(hours_w(50));
		
		
	}
	public static String Name(String F_L){
		return F_L;
	}
	public static int ID(int number){
		return number;
	}
	public static int hour_pay(int y){
		hours = y;
		return hours * pay;
	}
	public static int hours_w(int worked){
		return worked;
	}
}
