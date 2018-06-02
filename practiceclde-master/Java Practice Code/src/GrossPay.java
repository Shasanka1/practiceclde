import java.util.Scanner;

public class GrossPay
{

	public static void main(String[] arg)
	{
		double b = Fcn1();	
		
		System.out.println(Fcn1());
		System.out.println(Fcn("bat"));
//		X1();
		System.out.println(Add(4,5));
		System.out.println(Add(7,10));
		System.out.println(a(5.788969948895,9));
	}

	public static int Fcn1() {
		int a = 2;
	 	return a;
	}
	
	public static String Fcn(String word){
		
		String a = word;
		return word;
		
	}
	public static int Add(int x,int y){
		
		int z = x + y;
		return z; 	
	
	}
	public static long a(double e, int b){
		
		long t = (long) (e*b);
		return t;
	}
	
}
