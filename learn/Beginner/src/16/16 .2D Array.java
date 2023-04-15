package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// Two dimensional array list (2D).
	// 2D examples:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Initializing a 2D array with predefined values:
		
		int [][] numbers = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}
		};
		
		System.out.println(numbers[1][3]);

		// Initializing a 2D array with a loop
		int [][] numbers_0_value = new int[5][5];
//		numbers_0_value[0][0] = 5;
//		numbers_0_value[0][1] = 7;
//		numbers_0_value[0][2] = 5;
		
		int res = 0;
		for(int i = 0; i < numbers_0_value.length; i++) {
			for(int j = 0; j < numbers_0_value[i].length; j++) {
				res++;
				numbers_0_value[i][j] = res;
				System.out.print(numbers_0_value[i][j] + "\t");
			}
			System.out.println();
		}
		
//		System.out.println(numbers_0_value[0][1]);
}
}