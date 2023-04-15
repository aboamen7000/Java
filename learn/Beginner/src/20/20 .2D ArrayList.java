package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;
import java.util.ArrayList;

public class main {
	// 2D ArrayList.
	// 2D ArrayList:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Creating a 2D ArrayList of integers
		ArrayList<ArrayList<Integer>> listo = new ArrayList<>();
		// adding rows (object)
		listo.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		listo.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
		listo.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
		// accessing element (rows + column)
		int result = listo.get(1).get(1); // 5
		
		
		// Creating a 2D ArrayList of String
		ArrayList<ArrayList<String>> names = new ArrayList<>();
		// adding rows (object)
		names.add(new ArrayList<String>(Arrays.asList("IA","Ahmad","Ali")));
		names.add(new ArrayList<String>(Arrays.asList("Omar","Khaled","Nour","MJ")));
		names.add(new ArrayList<String>(Arrays.asList("Qasim","Hesham","Maro")));
		names.add(new ArrayList<String>(Arrays.asList("Tayson","Petter")));
		
		// accessing element (rows + column)
		String result_2 = names.get(0).get(0); // IA
		
		// Creating a nested for loop
		for (int row = 0; row < names.size(); row ++) {
			
			for(int column = 0; column < names.get(row).size(); column++) {
				
				System.out.print(names.get(row).get(column) + "\t");
			}
			// new line before recall the second for loop
			System.out.println();
		}
		
		
		}
}