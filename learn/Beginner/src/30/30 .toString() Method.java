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
	// toString() .
	// toString() :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Informations info = new Informations("IA",35);
		System.out.println(info.toString());
		
	}
}


///// Informations Class

package test;

public class Informations {
	
	private String name;
	private int age;
		
	// default Constructor
	public Informations(String name_change, int age_change) {
		name = name_change;
		age = age_change;
	}
	
	public String toString() {
		return "My info : name (" + name + "), age(" + age + ")";
	}


}
