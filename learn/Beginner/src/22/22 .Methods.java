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
	// Methods.
	// Methods:
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// adding
//		int sum = add(10, 5);
		System.out.println(add(10, 5));
		
		// pow (x,y)
		double pwoing = pow(2.0,10.0);
		System.out.println(pwoing);
		
		String names = names("IA","Ahmad","Ali");
		System.out.println(names);
		}
	
	
	public static int add(int a, int b) {
//		int result = a + b;
		return a + b;
	}
	
	public static double pow(double first, double second) {
		double result = first * second; // 2 * 3 = 6
		return result;
	}
	
	public static String names(String first, String second, String third) {
		String result = "First : " + first + " , Second : " + second + " , Third : " + third;
		return result;
	}
	
}