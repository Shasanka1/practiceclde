
public class Temperature
{

	double ftemp;
	
	public static void main(String[] arg)
	{
		Temperature mytemp = new Temperature(103);
		mytemp.setFah(103.0);
		System.out.println(mytemp.getFah());
		System.out.println(mytemp.getCal());
		System.out.println(mytemp.getKel());
		
		
	}
	
	public Temperature(double fah_temp){
		ftemp = fah_temp;
	}
	
	public void setFah(double set_f){
		ftemp = set_f;
	}
	
	public double getFah(){
		return ftemp;
	}
	
	public double getCal(){
		return (5/9) * (ftemp - 32);
	}
	
	public double getKel(){
		return ((5/9) * (ftemp - 32)) + 273;
		
	}
	
	
	
	
}
