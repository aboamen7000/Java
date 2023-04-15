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
	// Array of Object .
	// Array of Object :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// individual object caller
		//Informations info = new Informations("IA",35);
		
		// array of object caller
		Informations[] info = new Informations[3];
		
		info[0] = new Informations("IA", 25);
		info[1] = new Informations("Ahmad", 19);
		info[2] = new Informations("Ali", 30);

		
		// for loop
		for(int i = 0; i < info.length ; i++) {
			System.out.println("Name : " + info[i].getname() + " , Age : " + info[i].getage());
		}
		
		// or using for each loop
		for(Informations infos : info) {
			System.out.println("Name : " + infos.getname() + " , Age : " + infos.getage());
		}
		
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
