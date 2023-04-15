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
	// Polymorphism .
	// Polymorphism :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		method_1 mthd1 = new method_1();
		method_2 mthd2 = new method_2();
		method_3 mthd3 = new method_3();
		method_4 mthd4 = new method_4();
		
		
		method_1[] fetcher = {mthd1,mthd2,mthd3,mthd4};
		
		// for each
		for(method_1 mth : fetcher)
		{
			mth.status();
		}
//		fetcher[1].status(); // mthd2
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