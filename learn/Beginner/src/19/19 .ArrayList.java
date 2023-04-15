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
	// ArrayList.
	// ArrayList:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Creating an ArrayList of Strings and adding elements to it
		
		ArrayList<String> names = new ArrayList<>();
		names.add("IA");
		names.add("Ahmad");
		names.add("Ali");
		names.add("Omar");
		names.add("Adham");
		names.add("Khaled");
		// Accessing elements in an ArrayList by index
		
		String show_name = names.get(1); // Ahmad

		
		// Removing an element from an ArrayList
		names.remove("IA");
		
		// Checking if an element exists in an ArrayList
		boolean checker_name = names.contains("IA");
		System.out.print(checker_name);
		
		// new line before excution of the for loop
		System.out.println();
		// Iterating through an ArrayList using a for loop
		
		for(int i = 0 ; i < names.size(); i++) {
			//String element = names.get(i);
			System.out.println(names.get(i));
		}
		
		// Iterating through an ArrayList using an enhanced for loop
		
		for(String name : names) {
			System.out.print(name + "\t");
		}
		
		
		}
}