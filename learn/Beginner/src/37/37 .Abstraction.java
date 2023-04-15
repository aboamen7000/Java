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
	// Abstraction .
	// Abstraction :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		method_2 meth2 = new method_2();
		method_3 meth3 = new method_3();
		
		meth2.my_info();
		meth3.my_info();
		
		}
}





///// method 1 Class

package test;

public abstract class method_1 {
	// implement methods
	public abstract void my_info();
}

///// method 2 Class

package test;

public class method_2 extends method_1 {
	
	public void my_info() {
		System.out.println("calling from method 2");
	}
}

///// method 3 Class

package test;

public class method_3 extends method_1{
	public void my_info() {
		System.out.println("calling from method 3");
	}
}
