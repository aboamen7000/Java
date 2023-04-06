package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// For Loop.
	// For Loop examples: iterate a part of the program several times
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		
		// explanation
		//for (start; end; counter(increment/dis..)){
		//}
			
		// Simple for loop
		for (int index = 0; index < 6; index++) {
			System.out.println("Result of index is equal : " + index);
			}
		
		// Looping through an array
		int[] numbers =  {1,2,3,4,5,6,7,8,9,10}; // array list contains many numbers
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " "); // 1 2 3 4 5 6 7 8 9 10
		}
		// new line
		System.out.println();
		
		// Looping through an collection using enhanced for loop (ints)
		for(int number : numbers) {
			System.out.print(number);
		}
		
		// new line
		System.out.println();
		
		// Looping through an collection using enhanced for loop (strings)
		String Names[] = {"IA","Ahmad","Ali","Omar"};
		for(String fetch_individual_name : Names) {
			System.out.println(fetch_individual_name);
		}
		
		// Looping through a string (original for loop)
		String text = "Hello, it's ia";
		for(int i = 0 ; i < text.length(); i++) {
			System.out.print(text.charAt(i) + " ");
		}
		
		
		// Nested for loops
		for (int i = 1 ; i <= 3 ; i++) {
			
			for (int j = 1; j <= 3 ; j++) {
				System.out.println(i + ", " + j);
			}
		}
		
		}
}
