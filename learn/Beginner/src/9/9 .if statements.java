package test;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit

public class main {
	// If Statments.
	// If Statments : 
	// and small hint about Ternary Operator.  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Method : 1
		int x = 10;
		int y = 20;
		
		if(x > y) {
			System.out.println("X bigger than Y");
		} else {
			System.out.println("Y bigger than X");
		}
		
		// Method : 2
		int age = 18;
		
		if (age >= 19) {
			System.out.println("You are an adult");
		}else {
			System.out.println("You are not an adult");
		}
		
		// Method : 3
		String my_name = "IA";
		
		if(my_name.equals("Ahmad")) {
			System.out.println("Hello Stranger");
		}else {
			System.out.println("Hello IA");
		}
		
		// using Ternary short hand..
		//(condintion) ? true : false;
		String result = (my_name.equals("Ahmad")) ? "Hello Stranger" : "Hello IA";
		System.out.println(result);
		
	}
}
