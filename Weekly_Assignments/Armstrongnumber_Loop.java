package weeklyassigment;

public class Armstrongnumber_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The Sum of the each digits raised to the power of the number of digits and then equal original number.
		int num =153;
		int original =num;
		int sum = 0;
		int count =0;
			for (;num>0;) 
			{
				count++;
				num = num/10;
			}
			{
				System.out.println(count);
			}
			num = original;
			for (;num>0;)
			{
				int digit = num%10;
				sum = sum+Math.powExact(digit, count);
				num=num/10;
			}
			if(sum == original) 
			{
				System.out.println(sum+" This number is Amstrong number");
			}
			else 
			{
				System.out.println(sum+" Sorry! this number is not Amstrong number");
			}
		

}
}
