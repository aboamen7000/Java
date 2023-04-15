package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// String Methods.
	// String Methods:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		String words = "Hello its IA";
		
		// length() : returns the length of the string
		int len = words.length();
		
		// charAt(int index) : returns the character at the specified index
		char chr = words.charAt(0);
		
		// substring(int beginIndex): returns a new string that is a substring of the original string,
		// 							  starting from the specified index.
		String left_string = words.substring(6);
		
		// toUpperCase(): returns a new string with all characters in uppercase.
		String uppercase = words.toUpperCase();
		
		// toLowerCase(): returns a new string with all characters in lowercase.
		String lowercase = words.toLowerCase();
		
		// trim(): returns a new string with leading and trailing white space removed.
		String trimo = words.trim();
		
		// replace(char oldChar, char newChar): returns a new string where all occurrences of the 
		//									    old character are replaced with the new character
		String replaced = words.replace("its", "im");
		
		// startsWith(String prefix): returns true if the string starts with the specified prefix, 
		//							  otherwise false.
		boolean startwithhello = words.startsWith("Hello");
		boolean startwithia = words.startsWith("ia");
		
		System.out.println(startwithia);
		
}
}