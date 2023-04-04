package test;

public class main {
	// Swap two Variables.
	// Swap two Variables : declare two integer variables, Next, we declare a third variable
	//                      assign the value again to confirm that the swap has taken place
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// a = 10 , b = 5 [a 5 , b 10] [temp = a[10], a = b[5], b= temp[10] (a = 5 , b = 10)]
		
		int a = 5;
		int b = 10;
		
		System.out.println("before swaping");
		System.out.println("a = " + a + ", b = " + b);
		
		int swaper = a;
		a = b;
		b = swaper;
		
		System.out.println("After swaping");
		System.out.println("a = " + a + ", b = " + b);
	}

}
