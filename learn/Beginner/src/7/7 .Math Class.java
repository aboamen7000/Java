package test;
import java.util.Scanner;
//import javax.swing.*;
import java.lang.Math;
import java.util.Random;

public class main {
	// Math Class example.
	// Math Class Example : 
	//              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Finding the square root of a number
//		double number = 25.0;
//		double square = Math.sqrt(number); // 5
//		System.out.println("The square root of " + number + " is : " + square);
		
		// Rounding a decimal number to the nearest integer
//		double number = 3.8;
//		int rounded = (int) Math.round(number); // 4
//		System.out.println(number + " rounded to nearest integer is : " + rounded);
		
		// Generating a random number between 1 and 100
		int min_number = 1;
		int max_number = 100;
		
		int result = (int) (Math.random() * (max_number - min_number + 1) + min_number);
		System.out.println("Generated Number between 1 and 100 is : " + result);
		
		
		// Calculating the power of a number
//		int a = 2;
//		int b = 3;
//		int result = (int) Math.pow(a, b);
//		System.out.println("Pow number of the " + a + " X " + b + " is : " + result);
		
		// Calculating the absolute value of a number
		double a = -10.0;
		double result_0 = (double) Math.abs(a);
		System.out.println("absolute number of the " + a + " is : " + result_0);
		
		
	}
}
