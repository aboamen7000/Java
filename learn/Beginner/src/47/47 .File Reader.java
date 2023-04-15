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
	// File Reader .
	// File Reader :
	// 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Static Declaration
		File file = new File("ia.txt");
		
		// Reading from a file [file reader]
		try {
			FileReader reader = new FileReader(file); // write as default is false
			
			int character;
			while((character = reader.read())!= -1)
			{
				System.out.print((char)character);
			}
			reader.close();
		}catch (Exception e){
			System.out.println(e);
		}
		
		
		// Reading from a file using a [BufferedReader]:
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file)); // write as default is false
			
			String Line;
			
			while((Line = reader.readLine())!= null)
			{
				System.out.println(Line);
			}
			reader.close();
		}catch (Exception e){
			System.out.println(e);
		}
		
			
		}
}
