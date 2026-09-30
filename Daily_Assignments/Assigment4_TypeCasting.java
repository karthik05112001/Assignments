package day1;

public class Assigment4_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Downcasting and Explicit Program
		System.out.println("Explicit Progream");
		double marks = 10.75;
		System.out.println("Double Marks values: "+ marks);
		int num = (int) marks;
		System.out.println("Double to Int values convert is:"+num);
		
		//Upercasting and Implicit Program
		System.out.println("\nImplicit Program");
		float marks2 = num;
		System.out.println("Int to float convert is :"+(float)marks2);
	}

}
