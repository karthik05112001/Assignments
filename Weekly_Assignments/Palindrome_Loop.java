package weeklyassigment;

public class Palindrome_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int num=1221;
		int original =num;
		int Reverse = 0;
		for (;num>0;) {
			int Digit = num%10;
			Reverse = (Reverse*10)+Digit;
			num = num/10;
		 	}
		if (Reverse==original) {
			System.out.println(Reverse+ " This is Palindrome");
		}
		else {
			System.out.println(Reverse+ " This not a Palindrome");
		}

	}
	}*/
		
		int num=153;
		int count=0;
		int sum=0;
		
		for(;num>0;)
		{
			count++;
			num=num/10;
		}
		
		for(;num>0;)
		{
			int lastDigit=num%10; //3
			sum=sum+Math.powExact(lastDigit, count);
			num=num/10;
		}
		
		if(sum==num)
		{
			System.out.println("153 is an Amstrong Number");
		}
		else
            System.out.println("153 is not an Amstrong Number:");
	}
}
