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
	// Copy Objects .
	// Copy Objects :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Informations2 infos = new Informations2("IA",29);
		
		Informations2 infos2 = new Informations2(infos);
		
		System.out.println(infos2.getname()); // IA
		System.out.println(infos.getage());  // 29
		}
}


///// Informations2 Class

package test;

public class Informations2 {
	private String name;
	private int age;
	// default constructor
	public Informations2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Informations2(Informations2 infos) {
		this.name = infos.name;
		this.age = infos.age;
	}
	
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
}
