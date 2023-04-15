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
	// Overloaded Methods.
	// Overloaded Methods:
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		String result = statico("IA", "Single");
		
		System.out.println(result);
		
		}
	
	
	public static String statico(String name, String Status) {
		return "1- My Name is : " + name + " , and my status is : " + Status;
	}
	
	public static String statico(String name) {
		return "2- My Name is : " + name;
	}
}