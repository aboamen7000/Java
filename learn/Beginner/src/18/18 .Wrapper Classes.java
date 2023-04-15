package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
import java.util.Arrays;

public class main {
	// Wrapper Classes.
	// Wrapper Classes:
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// int -- Integer str
		int number = 15;
		Integer wrappedNum = Integer.valueOf(number); // 15
		String number_string = wrappedNum.toString(); // 15
		int parsed_int = Integer.parseInt(number_string); // 15
		
		// boolean -- Boolean string
		boolean checker = false; // low memory thrid (short hand coding)
		Boolean warpedbool = Boolean.valueOf(checker); // high memory third (more advanced futures)
		String bool_str = warpedbool.toString();
		boolean parsed_str = Boolean.parseBoolean(bool_str);
		
		// char --- character string ==> checker for is digits {boolean(true/false)}
		char letter = 'I';
		Character wraped_chr = Character.valueOf(letter);
		String leter_str = wraped_chr.toString();
		boolean is_digits = Character.isDigit(letter);
		
		
		// double --- Double string
		double numberr = 2.5;
		Double wraped_double = Double.valueOf(numberr);
		String numberr_str = wraped_double.toString();
		Double parsedNum = Double.parseDouble(numberr_str);
		
		
		System.out.print(parsedNum);
		}
}