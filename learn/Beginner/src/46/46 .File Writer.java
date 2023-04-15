package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.io.*;
import java.util.*;

public class main {
	// File Writer .
	// File Writer :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Static Declaration
		File file = new File("ia.txt");
		
		// overriding the text
		try {
			FileWriter writer = new FileWriter(file,false); // write as default is false
			writer.write("Hello, this is IA");
			writer.close();
			System.out.println("Wrote to the file, successfully..!");
		}catch (Exception e){
			System.out.println(e);
		}
		
		// append the text
		try {
			FileWriter writer = new FileWriter(file, true); // ture to appending
			writer.write("\nHi again");
			writer.close();
			System.out.println("appended to the file, successfully..!");
		}catch (Exception e){
			System.out.println(e);
		}
		
			
		}
}
