package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.io.File;
import java.util.*;

public class main {
	// File Class .
	// File Class :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Static Declaration
		File file = new File("ia.txt");
		
		// Creating a file
		try {
			if (file.createNewFile()) {
				System.out.println("File has been created successfully!");
			}	
		}catch (Exception e) {
			System.out.println("Error occurred while creating the file : " + e);
		}
	

		// checking a file
			if (file.exists()) {
				System.out.println("File exists!");
			}else {
				System.out.println("File does not exists!");
			}
			
		// Getting the absolute path of a file
			String path_str = file.getAbsolutePath();
			System.out.println("Absolute Path : " + path_str);
			
		// Deleting a file
			
			if(file.delete()) {
				System.out.println("the file deleted  successfully");
			}
			
			
		}
}
