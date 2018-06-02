import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RandomStringChooser

{
	private ArrayList<String> words;
	
	public static void main( String arg[]){
		String[] w = new String[4];
		int i = 0;
		int rand;
		while(i<w.length){
			rand = (int) (Math.random()*3);
			if(rand == 0){
				w[i]= "Batman";
				
			}
			else if(rand ==1){
				w[i]="Robin";
				
			}
			else{
				w[i]="Joker";
			}
			i++;
		}
		System.out.println(Arrays.toString(w));
		
		
		
		
	}
	
	public RandomStringChooser(String[] s)
	{
		
		words = new ArrayList<String>();
		for(int i = s.length-1;i>=0;i++){
			words.add(0, s[i]);
			
		}
	
	}
	
}