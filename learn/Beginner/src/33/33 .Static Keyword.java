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
	// Static Keyword .
	// Static Keyword : single copy of a variable is created and shared, of static member
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Informations.changer();
		Informations.changer();
		Informations.changer();
		Informations.changer();
		Informations.changer();
		
		Informations.display();
		}
	
}


///// Informations Class


package test;

public class Informations {
	static int changer; // single copy of a variable is created and shared, of static member
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
	
	public static void changer() {
		changer++;
	}
	public static void display() {
		System.out.print(changer);
	}
}
