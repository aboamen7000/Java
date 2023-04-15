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
	// Interface .
	// Interface :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		method_4 mth4 = new method_4();
		
		mth4.test1();
		mth4.test2();
		mth4.test3();
		
		}
}

///// method1 Class
package test;

public interface method_1 {
	// implement methods
	void test1();
}

///// method2 Class
package test;

public interface method_2 {
	void test2();
}

///// method3 Class
package test;

public interface method_3{
	void test3();
}
///// method4 Class
package test;

public class method_4 implements method_1,method_2,method_3{

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("test3");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("test2");
	}

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("test1");
	}
	

}
