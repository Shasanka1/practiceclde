import java.util.ArrayList;

public class Digit{
	
	private ArrayList<Integer> digitlist;
	
	public static void main (String args[]){
		
		Digit d1 = new Digit(1224);
		
		d1.print();
		System.out.println( "\n"+d1.isStrictlyIncreasing());	
		}
	
	private void  print() {
		for(int e = 0; e< digitlist.size(); e++){
			System.out.print(digitlist.get(e));
		}
		
	}

	public Digit(int num){
		digitlist = new ArrayList<Integer>();
		
		for(int i = num; i>0;i = i/10){
			digitlist.add(0, i%10);
		}
		
	}
	
	public boolean isStrictlyIncreasing(){
		
		for(int z = 0; z < digitlist.size()-1; z++){
			if(digitlist.get(z)>= digitlist.get(z+1)){
				return false;
			}
		}
		
		
		return true;
	}
	
}