package test;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit

public class main {
	// Switch Case.
	// Switch Case : 
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		int chosen;
		String day_of_the_week = null;
		
		System.out.print("Enter day of the week : ");
		chosen = scanner.nextInt();
		
		switch(chosen) {
			case 1:
				day_of_the_week = "Saturday";
				break;
			case 2:
				day_of_the_week = "Sunday";
				break;
			case 3:
				day_of_the_week = "Monday";
				break;
			case 4:
				day_of_the_week = "Tuesday";
				break;
			case 5:
				day_of_the_week = "Wednesday";
				break;
			case 6:
				day_of_the_week =  "Thursday";
				break;
			case 7:
				day_of_the_week = "Friday";
				break;
			default:
				day_of_the_week = "Invalid day";
				break;
		}
		
		System.out.println("Today is : " + day_of_the_week);
	}
}
