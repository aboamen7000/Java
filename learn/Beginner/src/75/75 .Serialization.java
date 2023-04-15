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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main implements Serializable {
	// Serialization  .
	// Serialization : Serialization is the process of converting an object into a stream of bytes,
	//				   so that it can be easily transmitted over a network or stored in a file or database.
	//				   The opposite process of converting a stream of bytes back into an object is
	//				   called deserialization
	// 
	
	
	String name;
	int age;
	
	// Default Constructor
	public main(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private String getname() {
		return name;
	}
	private int getage() {
		return age;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		main main_obj = new main("IA",22);
		
		// Serialize the object
	
			FileOutputStream file = new FileOutputStream("dd.wav");
	        ObjectOutputStream in = new ObjectOutputStream(file);
	        in.writeObject(main_obj);
	        in.close();
	        file.close();
	
	     // Deserialize the object
	        
	        
	        FileInputStream file2 = new FileInputStream("dd.wav");
	        ObjectInputStream in2 = new ObjectInputStream(file2);
	        main mai_obj2 = (main) in2.readObject();
	        in2.close();
	        file2.close();
	        
	        
	        System.out.println("Name : " + mai_obj2.getname()); //IA
	        System.out.println("Age : " + mai_obj2.getage()); //IA
}
}