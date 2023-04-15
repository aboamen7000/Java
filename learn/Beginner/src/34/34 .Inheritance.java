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
	// Inheritance .
	// Inheritance :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Grand_Father grand = new Grand_Father();
		Father father = new Father();
		Son son = new Son();
		
		grand.tall();
		father.tall();
		son.tall();
		son.eyes();
		
		}
	
}


///// Grand-Father Class

package test;

public class Grand_Father {
	
	public void tall() {
		System.out.print("Height is : 180");
	}
	
}

///// Father Class

package test;

public class Father extends Grand_Father {
	
	public void eyes() {
		System.out.print("Eyes is : Brown");
	}
	
}

///// Son Class

package test;

public class Son extends Father{

}
