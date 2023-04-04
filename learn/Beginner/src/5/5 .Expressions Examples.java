package test;
import java.util.Scanner;
public class main {
	// expressions examples.
	// expressions examples : 
	//              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// 1) Arithmetic expressions
		int Addition = 5 + 5;
		double multi = 10.6 * 5;
		int divition = 20 / 4;
		int reminder = 20 % 6;
		int subract = 60 - 50;
		System.out.println("Result is : " + multi);
		
		// 2) Boolean expressions
		boolean status = true;
		boolean checker = false;
		boolean equals = 5 == 3;
		boolean not_equal = 10 != 5;
		System.out.println("Result is : " + not_equal);
		
		// 3) Conditional expressions [Ternary operator] : a short hand of if condition.
//		(condition) ? ture : false;
//		int x = 30;
//		int y = 20;
//		int max_value = (x > y) ? x : y;
//		System.out.println("The Bigger value result is : " + max_value);
		
		// 4) Assignment expressions
		// declare+assigmnet the data type
		int x = 30;
		x = x + 1;
		x += 2;
		System.out.println("The value result is : " + x);
		
		// 5) String concatenation
		String first_name = "IA";
		String last_name = "Amen";
		System.out.println(first_name + " " + last_name);
		
	}

}
