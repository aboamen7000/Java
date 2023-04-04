package test;
// print.
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//1) Printing variables
		int age = 25;
		String name = "IA";
		System.out.println("My name is : " + name + " and i am : " + age + " Year old.");
		
		//2) Printing formatted output using printf()
		double pi = 5.45421; //Decimal number Portion (point.)
		double pi2 = 6.45421; //Decimal number Portion (point.)
		System.out.printf("The value of pi is %.2f %.1f\n", pi , pi2);
		
		//3) Printing multiple lines
		System.out.print("hello without new line\n"); // \n = new line in your string code
		System.out.println("Hello, world");
		System.out.println("Hello, second print");
		
	}

}
