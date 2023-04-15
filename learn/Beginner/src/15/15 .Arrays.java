package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// Arrays.
	// Arrays examples:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Declaring and initializing an array
		
		int[] list_v1 = {1,2,3,4,5};
		
		// 2 dimensional arrays
		int[][] list_v2 = {
				{1,2,3,4,5},
				{6,7,8,9,10},
		};
		
		System.out.println(list_v1[0]); // 1
		System.out.println(list_v2[1][2]); // 8
		
		list_v2[1][2] = 100;
		System.out.println(list_v2[1][2]); // 100
		
		// Iterating over an array
		for (int index = 0; index < list_v1.length ; index++) {
			System.out.print(list_v1[index] + "\t");
		}
		
		System.out.println();
		
		// Multi-dimensional arrays
		int first,second;
		
		for(first = 0; first < list_v2.length; first++) {
			for(second = 0; second < list_v2[first].length; second++) {
				System.out.print(list_v2[first][second] + "\t"); // \t (tab)
			}
			System.out.println();
		}
		}
}
