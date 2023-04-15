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
		
		Informations info = new Informations2("IA",25);
		info.display();
		
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
		this.name = name_change;
		this.age = age_change;
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
	
	public void display() {
		System.out.print(changer);
	}
}


///// Informations2 Class

package test;

public class Informations2 extends Informations {

	public Informations2(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void display() {
		System.out.print("first");
	}
}
