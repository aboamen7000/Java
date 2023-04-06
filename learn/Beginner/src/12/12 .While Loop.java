package test;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit

public class main {
	// While Loop.
	// While Loop examples: execute a block of code as long as a specified condition is reached [true]
	// 
	// increment examples
//	index += 1; //  increment custom value
//	index = index + 1; //  increment custom value
//	index++; //  increment 1 value [if index = 1 ,then new call will be as index = 2]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Simple while loop
		int index = 0;
		while (index < 6) {
			System.out.print(index + "\t"); 
			index += 1; // increment the value result is : 0	1	2	3	4	5
		}
		// printing new line
		System.out.println();
		
		// Loop with a condition that becomes false
		int index_2 = 5;
		while (index_2 > 0) {
			System.out.print(index_2 + "\t"); 
			index_2 -= 1; // increment the value result is : 5	4	3	2	1
		}
		
		// printing new line
		System.out.println();
		
		// Loop with a boolean flag
		boolean checker = true;
		int index_3 = 1;
		
		while(checker) {
			if (index_3 > 5) {
				checker = false; // close the while loop condition [after run the whole code]
			}
			System.out.println(index_3);
			index_3++;
		}
		
		
		System.out.println();
		
		// Loop with break statement
		int index_4 = 1;
		while(true) {
			if (index_4 > 5) {
				break; // forced close the loop
			}
			System.out.println(index_4);
			index_4++;
		}
		
		System.out.println();
		
		// Loop with continue statement
		int index_5 = 1;
		while(true) {
			
			
			if(index_5 <= 5) {
				if (index_5 == 3) {
					index_5++;
					continue; // skip for this function
				}
				System.out.println(index_5);
				index_5++;
			}
			
			
		}
		
	}
}
