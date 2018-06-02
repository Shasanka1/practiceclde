
public class TestScores
{
	int Test1;
	int Test2;
	int Test3;
	
	public static void main(String[] args)
	{
		TestScores avg_t = new TestScores(96,75,68);
		
		System.out.println("The Average Score is :   "  + avg_t.Avg_test());
		
	}
	
	public TestScores(int b_test, int ok_test, int w_test)
	{
		Test1 = b_test;
		Test2 = ok_test;
		Test3 = w_test;
	}
	public void set_tests(int a, int b, int c )
	{
		Test1 = a;
		Test2 = b;
		Test3 = c;
	}
	public float Avg_test()
	{
		return (Test1 + Test2 + Test3) / 3;
		
	}
}

