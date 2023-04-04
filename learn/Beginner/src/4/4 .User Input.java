package test;
import java.util.Scanner;
public class main {
	// User Input.
	// User Input : 
	//              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// 1) Reading an Integer from User Input
		System.out.print("Enter an integer : ");
		int number = scanner.nextInt();
		System.out.println("you entered : " + number);
		
		// must reset the buffer before calling nextline(which will get the string u typed)
		scanner.nextLine();
		
		// 2) Reading an String from User Input
		System.out.print("Enter an String : ");
		String words = scanner.nextLine();
		System.out.println("you entered : " + words + '\n');
		
		// 3) Reading an String from User Input
		System.out.print("Enter an Floating Point Number : ");
		float number_2 = scanner.nextFloat();
		System.out.println("you entered : " + number_2 + '\n');
		
		
	}

}
