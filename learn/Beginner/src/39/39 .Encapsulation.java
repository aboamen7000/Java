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
	// Encapsulation .
	// Encapsulation :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Informations infos = new Informations("IA", 25);
		
		System.out.println(infos.getname());
		
		String setter = infos.setname("Ahmad");
		
		System.out.println(setter);
		}
}




///// Informations Class
package test;

public class Informations {
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
	
	public String setname(String name_arg) {
		this.name = name_arg;
		return name_arg;
	}
	
	public void setage(int age_arg) {
		this.age = age_arg;
	}

}	
	