package weeklyassigment;

public class SecondLargest_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {12, 45, 7, 89, 34, 89, 56,99,100};
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                secondLargest = largest;
                largest = num[i];
            }
            else if (num[i] > secondLargest && num[i]!= largest)
            {
                secondLargest = num[i];
            }
        }
		System.out.println("Largest number:"+largest);
		System.out.println("Second number:"+secondLargest);
		}
	}


