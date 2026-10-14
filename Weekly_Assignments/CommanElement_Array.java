package weeklyassigment;

public class CommanElement_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[]= {10,20, 30, 40, 50};
		int array2[]={30, 40, 60, 70, 50};
		System.out.print("The Comman Elements: ");
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.print(array1[i]+",");
				}
			}
		}
	}

}
