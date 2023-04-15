package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit

//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.util.*;

public class main {
	// For each Loop.
	// For each Loop:
	// 
	static int counter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Iterating over an array of integers
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		for (int number : numbers) {
			counter++;
			System.out.println("The number is : " + number + " Requested time : " + counter);
		}
		
		// Iterating over a list of strings
		List<String> names = new ArrayList<>();
		
		names.add("IA");
		names.add("Ahmad");
		names.add("Ali");
		names.add("Omar");
		names.add("Khaled");
		
		for(String name : names) {
			System.out.println("The string is : " + name);
		}
		
		// Iterating over a map of strings and integers
		Map<String, Integer> my_info = new HashMap<>();
		my_info.put("IA", 25);
		my_info.put("Ahmad", 29);
		my_info.put("Ali", 19);
		my_info.put("Omar", 15);
		my_info.put("Khaled", 20);
		
		for(Map.Entry<String, Integer> entry : my_info.entrySet()) {
			System.out.println("My name is : " + entry.getKey() + " , My age is : " + entry.getValue());
		}
		
		
		// best part is we can use the for each loop : arrays, lists, sets/dic[], and maps
		}
}