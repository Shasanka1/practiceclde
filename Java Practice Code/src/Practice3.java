import java.util.Scanner;

public class Practice3
{
	public static void main(String[] arg)
	{
		double hours, rate;
		
		Scanner keyboard = new Scanner(System.in);
		
		Payroll employee = new Payroll();
		
		System.out.println(" How many hours did the " + "employee work? ");
		hours = keyboard.nextDouble();
		
		System.out.println("What is the employee's hourly pay rate? ");
		rate = keyboard.nextDouble();
		
		employee.setHoursWorked(hours);
		employee.setPayRate(rate);
		
		System.out.println("The employee's gross pay is $ " + employee.GrossPay());

		
	}
}
