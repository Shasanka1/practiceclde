
public class Circle  // Start Class
{
	double radius;
	double pi = 3.14159;
	
	public static void main(String[] args)
	{
	
		Circle acc_circle = new Circle(50);
		acc_circle.setRadius(50);
		System.out.println(acc_circle.getRadius());
		System.out.println(acc_circle.getArea());
		System.out.println(acc_circle.getDiameter());
		System.out.println(acc_circle.getCircumference());
	}
	public Circle(double rad){
		radius = rad;
	}
	public void setRadius(double set_r){
		set_r = radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea(){
		return pi *radius * radius;
	}
	public double getDiameter(){
		return radius * 2;
	}
	public double getCircumference(){
		return 2 * pi * radius;
	}
}