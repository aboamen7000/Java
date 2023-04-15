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
	// Constructors .
	// Constructors :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Creating an Object
		Informations person_1 = new Informations("IA", 180.5);
		Informations person_2 = new Informations("Ahmad", 150.5);
		
		
		
		System.out.println("First info : name (" + person_1.my_name + ")" + " ,height (" + person_1.my_height + ").");
		System.out.println("Second info : name (" + person_2.my_name + ")" + " ,height (" + person_2.my_height + ").");
		
		person_1.hello();
		person_2.hello();
		
	}
	

}

///// Informations class

package test;

public class Informations {
	String my_name;
	double my_height;
	
	public Informations(String name, double height) {
		this.my_name = name;
		this.my_height = height;
	}
	
	public void hello() {
		System.out.println("Hello, world!" + " ,Created by " + this.my_name);
	}

}
