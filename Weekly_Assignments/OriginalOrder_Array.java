package weeklyassigment;

public class OriginalOrder_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-4, 7, 0, -2, 9, 0, -8, 5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.println(arr[i]+" ");
				i++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println(arr[i]+" ");
				i++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.println(arr[i]+" ");
				i++;
			}
		}
	}
}
