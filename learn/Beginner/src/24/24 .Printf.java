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
	// Printf .
	// Printf :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Formatting integers
		int num = 50;
		int num_2 = 45;
		System.out.println(num);
		System.out.printf("The number is : %d and another value is : %d", num, num_2);
		
		// new line
		System.out.println();
		
		// Formatting floating-point numbers
		double num_3 = 5.95642;
		System.out.printf("The number is %.2f\n", num_3);
		
		System.out.println("Next operation");
		
		// Formatting strings [%s]
		String welcome = "Hello, Body!";
		System.out.printf("Welcome msg : %s\n", welcome);
		
		
		// Formatting a single character [%c]
		char chr = 'I';
		System.out.printf("The single chr is : %c\n", chr);
		
		// Combining multiple formatting arguments
		int into = 50;
		double doubleo = 5.50544445;
		String stringo = "Test test.. brahh";
		System.out.printf("1) %d \n2) %f \n3) %s\n", into,doubleo,stringo);
		
		// Padding numbers with zeros
		int pado = 65; // total nums : 5 , original 3 , res = 00065
		System.out.printf("The num with padding zero is : %05d", pado);
		}
}