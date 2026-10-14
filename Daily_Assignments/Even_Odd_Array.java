package daily_assigment;

public class Even_Odd_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {11, 24, 35, 42, 56, 67, 80, 93};
		int count1=0;
		int count2=0;
		/*System.out.print("Even numbers:");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				System.out.print(num[i]+"," );	
			 	count1++;
			}
		   }
		System.out.println("\nCount of even numbers:"+count1);
		System.out.print("\nOdd numbers:");
		for(int f=0;f<num.length;f++) 
		{
			if(num[f]%2!=0)
			{
				System.out.print(num[f]+"," );	
			 	count2++;
			}
			}
			System.out.println("\nCount of Odd numbers:"+count2);*/
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
		}
		System.out.println("Count of even numbers:"+count1);
		System.out.println("Count of Odd numbers:"+count2);
	}
}




