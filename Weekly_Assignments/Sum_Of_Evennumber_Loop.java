package weeklyassigment;

public class Sum_Of_Evennumber_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =50;
		int sum =0;
		for (int i=1;num>=i;i++) 
		{
		if (i%2==0) {
			int value = i;
			sum = sum+value;
		}
		}
		System.out.println("Sum of Even numbers "+sum);
	}

}
