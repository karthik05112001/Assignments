package daily_assigment;
import java.util.Scanner;
public class DuplicateElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int []num= {10, 20, 30, 20, 40, 10, 50, 30, 60};
		System.out.print("Duplicate elements:");
		for(int i=0;i<num.length;i++)
			for(int j=i+1;j<num.length;j++)
				{
				{
				if(num[i]==num[j])
				{
					System.out.print(num[i]+",");	
					break;
				}
				}
				}*/
		/*Scanner sc = new Scanner(System.in); 
		int num[]=new int[9];
		System.out.print("Enter a number:");
			for(int i=0;i<num.length;i++) 
			{
				 num[i] = sc.nextInt();
			}
			System.out.print("Duplicate elements:");
			for(int i=0;i<num.length;i++) 
			{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.print(num[i]+",");	
					break;
				}
				}
				}*/
		int num[]= {10, 20, 30, 20, 40, 10, 50, 30, 60};
		int duplicate[] = new int[num.length];
		int Index=0;
		int Check=0;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					for(int k=0;k<duplicate.length;k++)
					{
						if(duplicate[k]==num[i]) {
							Check=1;
							break;
						}
					}
					if(Check==0)
					{
					 duplicate[Index]=num[i];
					 Index++;
					}
					Check=0;
				}
			}
		}
		System.out.print("Duplicate:");
		for(int i=0;i<duplicate.length;i++)
		{
			if(duplicate[i]!=0)
			{
				System.out.print(duplicate[i]+" ");
			}
		}
			
	}
}
