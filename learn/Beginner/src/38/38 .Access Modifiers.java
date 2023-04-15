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
	// Access Modifiers .
	// Access Modifiers :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		method_3 method3 = new method_3();
		
		method3.my_info3();
		}
}

///// method 3 Class
package test;

public class method_3{
	/// protected : The protected access modifier makes a class member visible and accessible within the same package and any subclass of the class, even if they are in different packages
	/// public : The public access modifier makes a class member visible and accessible to any other class, regardless of whether they are in the same package or not.
	/// private : The private access modifier makes a class member only visible and accessible within the class where it is declared
	
	protected void my_info3() {
		System.out.println("calling from method 3");
	}
	
}
