public class MultPractice implements StudyPractice{

	private int first_num, sec_num;
	
	public MultPractice(int f_n,int s_n){
		first_num = f_n;
		sec_num = s_n;
	}
	
	public static void main (String args[]){
		MultPractice m1 = new MultPractice(7,3);
		for(int i = 0; i<100;i++){
			
		System.out.println(m1.getProblem());
		
		m1.nextProblem();
		}
		
	}
	
	
	@Override
	public String getProblem() {
		return first_num +"  TIMES " + sec_num;
	}

	@Override
	public void nextProblem() {
		 sec_num++;
		
	}
	
}