public class Prac
{
	int weight;
	int height;
	
	// This Program is used to find if a person is overweight or underweight
	
	public static void main(String args[])
	{
		
		Prac runbmi = new Prac(150,58);
		
		System.out.println(runbmi.bmi());
		runbmi.setWeight(40);
		runbmi.setHeight(60);
		System.out.println(runbmi.bmi());
		
		if(18.5 < runbmi.bmi()&& 25 > runbmi.bmi())
			System.out.println("You are normal.");
		if(runbmi.bmi() < 18.5)
			System.out.println("You have a low bmi.");
		if( runbmi.bmi() > 25)
			System.out.println("You are overweight.");
		
		
	}
	
	// Constructor for the Object 
	public Prac (int w, int h)
	{
		weight = w;
		height = h;
	}
	
	public void setWeight(int w_int)
	
	{
		weight = w_int;
		System.out.println(weight);
	}
	
	public void setHeight(int h_int)


	Turn_Right();
	/**
	 * Hi this is bob
	 */
	
}
