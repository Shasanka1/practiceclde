
public class Employee
{
	public static void main(String [] arg)
	{
		System.out.println("NAME " + "\t\t ID NUMBER" + "\t\t DEPARTMENT" +"\t\t POSITION");
		
		// Susan's info
		
		System.out.println(First_Last("Susan Meyers") + " \t " + ID(47899)
		+ " \t\t\t " + Department("Accounting") + " \t\t " + Position("Vice President"));
		
		// Mark's info
		
		System.out.println(First_Last("Mark Jones") + " \t " + ID(39119) + " \t\t\t " + 
		Department("IT") + " \t\t\t " + Position("Programmer"));
		
		// Joy's info
		
		System.out.println(First_Last("Joy Rogers") + " \t " + ID(81774) + " \t\t\t "
				+ Department("Manufacturing") + "\t\t " + Position("Engineer") );
		
		
	}
	
	public static String First_Last(String name){
		
//		String a = name;
		return name;
		
	}
	
	public static int ID(int number){
		
		return number;
		
	}
	public static String Department(String job){
		
		return job;
	}
	public static String Position(String role){
		return role;
	}
}



