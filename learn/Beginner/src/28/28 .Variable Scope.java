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
	// Variable Scope .
	// Variable Scope :
	// 
	static int x; // 2) class variable
	static int age;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		 x = 15; // 1) local variable
		
		System.out.println(setage(5));
		System.out.println(age);
	}
	
	public void caller() {
	      // System.out.println(x); // cannot be accessed here - x is out of local scope
		x = 19;
	}
	
	// 3) Instance Variables
	
	public static int setage(int agee) {
		return age = agee;
	}
}


