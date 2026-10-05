package daily_assigment;

import java.util.Scanner;

public class MagicNumber_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int original = num;
		int sum =0;
		for (;num>0;)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println("Digit Sum = "+sum);
		num = original;
		for(;num>=10;)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println("Final Digit = "+num);
		if(num==1)
		{
			System.out.println(original+" is a Magic Number");
		}
		else
		{
			System.out.println(original+" is not a Magic Number");
		}
	}
	

}
