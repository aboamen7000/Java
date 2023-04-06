package test;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit

public class main {
	// Logical Operator.
	// Logical Operator : 
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		// AND operator (&&)
		int a = 5, b = 10;
		if( a > 0 && b < 15) {
			// return True
		}else {
			// return False
		}
		
		// OR operator (||)
		if( a > 0 || b < 15) {
			// return True
		}else {
			// return False
		}
		
		// NOT operator (!)
		boolean checker = false;
		
		if( a != 0 || b != 15 && !checker) {
			// return True
		}else {
			// return False
		}
		
		// Combined logical operators
		if(a > 0 && b == 5 || checker) {
			// return True
		}else {
			// return False
		}
	}
}
