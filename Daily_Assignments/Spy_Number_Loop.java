package daily_assigment;
import java.util.Scanner;
public class Spy_Number_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		int original = num;
		int sum =0;
		int product = 1;
		for (;num>0;)
		{
			int digit = num%10;
			sum = sum+digit;
			num = num/10;
		}
		System.out.println("Sum of the digit = "+sum);
		num = original;
		for (;num>0;)
		{
			int digit = num%10;
			product =product*digit;
			num = num/10;
		}
		System.out.println("Product of digits = "+product);
		if(sum==product)
		{
			System.out.println(original+" is a Spy Number");
		}
		else
		{
			System.out.println(original+" is a not Spy Number");
		}
	}

}
