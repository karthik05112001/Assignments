package weeklyassigment;

public class No_Of_Digits_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987654;
		int count =0;
		for(;num>0;) {
			count++;
		 num = num/10; 
		}
		System.out.println(count);
	}

}
