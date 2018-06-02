
public class Pet   // Start Class
{
	String name;
	String type;
	int age;

	public static void main(String[] args)
	{
	Pet mypet = new Pet("Benny", "Dog" , 4);
		System.out.println(mypet.getName());
		System.out.println(mypet.getType());
		System.out.println(mypet.getAge());
		
	}
	public Pet(String n, String t, int r)
	{
		name = n;
		type = t;
		age = r;
	}
	public void setName (String s)
	{
		name = s;
	}
	
	public void setType(String ty )
	{
		type = ty;
	}
	public void setAge(int a)
	{
		age = a;
	}
	public String getName()
	{
		return name;
	}
	public String getType()
	{
		return type;
	}
	public int getAge()
	{
		return age;
	}
}