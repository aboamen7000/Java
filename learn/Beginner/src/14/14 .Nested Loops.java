package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// Nested Loops.
	// Nested Loops examples:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Printing a multiplication table

//		int first,second;
//		
//		for(first = 1; first <= 10; first++) { // 1 2
//			for(second = 1; second <= 10 ; second++) { // 1 ..10 || 2 ...10
//				System.out.print(first * second + "\t");
//			}
//			System.out.println();
//		}
//		
//		scanner.close();
//		
		// Printing a pattern *
//		for(int third = 1; third <=5 ; third++) {
//			for(int fourth = 1; fourth <= third ; fourth++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		
		// Finding the largest number in a 2D array list
		int[][] numbers = {{1,5,9,15,100},{5,8,7,10,140}}; // 2D array list
		int max_value = Integer.MIN_VALUE;
//		int founder = numbers[0][3]; // 15
//		System.out.print(founder);
		
		
		for (int finder_1 = 0; finder_1 < numbers.length; finder_1++) {
			for (int finder_2 = 0; finder_2 < numbers[finder_1].length; finder_2++) {
				if (numbers[finder_1][finder_2] > max_value) {
					max_value = numbers[finder_1][finder_2];
				}
			}
		} // for loop finished
		System.out.println("The Max value is : " + max_value);
		
		
		}
}
