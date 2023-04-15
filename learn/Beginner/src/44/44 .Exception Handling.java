package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.util.*;

public class main {
	// Exception Handling .
	// Exception Handling :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		int first,second;
		
		System.out.print("First Number : ");
		first = scanner.nextInt();
		System.out.print("second Number : ");
		second = scanner.nextInt();
		
		try {
			int result = first / second;
			System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println("The error : " + e);
		}catch (NullPointerException e) {
			System.out.println("The error : " + e);
		}
		catch (Exception e) {
			System.out.println("The error : " + e);
		}finally {
			System.out.println("That's all");
		}

		
		}
}
