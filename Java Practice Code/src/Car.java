
public class Car
{
	int year;
	String make_car;
	int curr_speed;
	
	public static void main(String[] args) // main is the Name of Method
	{
		
		Car mycar = new Car(1996,"Honda");
		System.out.println(mycar.YearModel());
		System.out.println(mycar.Make());
		System.out.println(mycar.Speed());
		System.out.println(mycar.Get_accel());
		System.out.println(mycar.Get_accel());
		System.out.println(mycar.Brake());
	}
	
	public Car(int y, String m){
		year = y;
		make_car = m;
		curr_speed = 0;
	}
	
	public int YearModel(){
		return year;
	}
	
	public String Make(){
		return make_car;
	}
	
	public int Speed(){
		return curr_speed;
	}
	
	public int Get_accel(){	
		curr_speed += 5;
		return curr_speed;
	}
	
	public int Brake(){
		curr_speed -= 5;
		return curr_speed;
			
	}
}
