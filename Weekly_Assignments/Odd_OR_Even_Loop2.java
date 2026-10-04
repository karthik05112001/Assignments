package weeklyassigment;

public class Odd_OR_Even_Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =20;
		System.out.print("Even numbers:");
		for (int i=1;i<=num;i++) {
			if(i %2==0) {
				
				System.out.print(i+ " ");
			}
			}
			System.out.print("\nOdd numbers:");
			for (int f=1;f<=num;f++) {
				if(f %2!=0) {
					System.out.print(f+ " ");
				}
			}
		}
	}


