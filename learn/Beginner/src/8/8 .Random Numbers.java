package test;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
import java.util.Random;
import java.awt.Color; // abstract window toolkit

public class main {
	// Random Numbers.
	// Random Numbers : 
	//              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Generating a random integer between 0 and a specified maximum value
//		int max = 100;
//		int result = (int) (Math.random() * max);
//		System.out.println("A random integer between 0 to 100 is : " + result);
		
		// Generating a random integer between a specified minimum and maximum value
		int min = 10;
		int max = 1000;
		int result = (int) (Math.random() * (max - min + 1) + min);
		System.out.println("A random integer between " + min + " to " + max + " is : " + result);
		
		// Generating a random double between 0.0 (inclusive) and 1.0
		double x = Math.random();
		System.out.println("A random integer between 0.0 to 1.0 : " + x);
		
		// Generating a random boolean value
		boolean y = Math.random() < 0.5;
		System.out.println("A random Boolean value is : " + y);
		
		// Generating a random color using RGB (Red, Green, Blue)
		Random rand = new Random();
		Color randcolor = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
		System.out.println("A random Color value is : " + randcolor);
		
	}
}
