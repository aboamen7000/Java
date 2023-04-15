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
	// Dynamic Polymorphism .
	// Dynamic Polymorphism :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		method_1 mthd;
		System.out.println("Which Method do u want to run while run time ");
		System.out.print("Method : 1, 2 : ");
		
		int saved = scanner.nextInt();
		
		if (saved == 1)
		{
			mthd = new method_1();
			mthd.status();
		}
		else if (saved == 2){
			mthd = new method_2();
			mthd.status();
		}
		else {
			System.out.println("Invalid Parameters");
		}
		scanner.close();
		}
}

///// method1 Class
package test;

public class method_1{
	public void status() {
		System.out.println("mthd1");
	}
}

///// method2 Class
package test;

public class method_2 extends method_1{
	public void status() {
		System.out.println("mthd2");
	}
}
///// method3 Class
package test;

public class method_3 extends method_1{
	public void status() {
		System.out.println("mthd3");
	}
}
///// method4 Class
package test;

public class method_4 extends method_1{
	public void status() {
		System.out.println("mthd4");
	}
}