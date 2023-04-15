package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.io.*;
import java.util.*;
//import javax.sound.sampled.*;
import java.awt.*; // abstract window toolkit
import javax.swing.*;
public class main {
	// Graphical User Interface .
	// Graphical User Interface : a user-friendly visual experience builder for Java applications
	// 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Frame frame = new Frame();
		frame.setTitle("My first app");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null); // center the app in the screen
		frame.setVisible(true);
		
		ImageIcon image = new ImageIcon("sad.png");
		frame.setIconImage(image.getImage()); // set image
		frame.setBackground(new Color(0x12345));// change background color {with custom color}
		
}
}



/////// another way

package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.io.*;
import java.util.*;
//import javax.sound.sampled.*;
import java.awt.*; // abstract window toolkit
import javax.swing.*;
public class main extends Frame {
	// Graphical User Interface .
	// Graphical User Interface : a user-friendly visual experience builder for Java applications
	// 


	public main() { // as default Constructors
		setTitle("My first app");
		setSize(500, 500);
		setLocationRelativeTo(null); // center the app in the screen
		setVisible(true);
		
		ImageIcon image = new ImageIcon("sad.png");
		setIconImage(image.getImage()); // set image
		setBackground(new Color(0x12345));// change background color {with custom color}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
	
		new main();
}
}