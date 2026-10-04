package weeklyassigment;

public class Reverse_Loops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		int reverse =0;
		for (;num>0;) {
			int lastdigt = num%10;
			reverse = (reverse*10)+lastdigt;
			num = num/10;
		}
			System.out.println(reverse);
		}
		
	}


