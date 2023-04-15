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
	// Object Passing .
	// object passing : passing object as arguments
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// passing an argument
		//System.out.print(caller("IA"));
		
		// object passing
		Informations info_1 = new Informations("IA", 26);
		Informations info_2 = new Informations("Ahmad", 30);
		
		printing(info_1);
		printing(info_2);
	}
	
	public static String caller(String name) {
		return name;
	}
	
	public static void printing(Informations infoooo) {
		System.out.println( "My name is : " + infoooo.getname() + " , my age : " + infoooo.getage() + " years old");
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
	
	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}
	
	public void setname(String name_arg) {
		this.name = name_arg;
	}
	
	public void setage(int age_arg) {
		this.age = age_arg;
	}
	
}
