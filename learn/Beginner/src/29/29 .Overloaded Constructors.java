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
	// Overloaded Constructors .
	// Overloaded Constructors :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		System.out.print("Enter name of user : ");
		name = scanner.nextLine();
		System.out.print("Enter age of user : ");
		age = scanner.nextInt();
		
		// creating object of my info class using default contructor
		Informations Person_1 = new Informations();
		
		Informations Person_2 = new Informations(name,age);
		
		// display the details of the persons
		Person_1.Display();
		Person_2.Display();
		
		scanner.nextLine();
		scanner.close();
	}
}


// Informations Class

package test;

public class Informations {
	String name;
	int age;
	
	// deafult contructor
	public Informations() {
		name = "Ahmad";
		age = 22;
	}
	
	public Informations(String name_change, int age_change) {
		name = name_change;
		age = age_change;
	}
	
	public void Display() {
		System.out.println("Name : " + name + " , Age : " + age);
	}


}
