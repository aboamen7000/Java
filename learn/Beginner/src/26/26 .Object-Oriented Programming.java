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
	// Object-Oriented Programming (OOP) .
	// Object-Oriented Programming (OOP) :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Creating an Object
		My_Info info = new My_Info("IA", 25);
		
		//Accessing Object Properties
		System.out.println("My name : " + info.name + " ,My age is : " + info.age);
		System.out.println("Text sended by me : " + info.Greeting_by_you("Its me"));
		String saved = info.Greeting();
		System.out.println("Saved info : " + saved);
		
		// Object Methods
		// Creating an object of Rectangle class
		Rectangle rectangle = new Rectangle(10,15);
		
		int Area_result = rectangle.getArea();
		System.out.println(Area_result);
		
	}
	

}


