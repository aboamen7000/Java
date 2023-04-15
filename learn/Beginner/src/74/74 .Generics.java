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
public class main <T>{
	// Generics .
	// Generics : allows you to write code that can work with different data types
	// 
	
	private T value;
	
	// Default Constructor
	public main(T value) {
		this.value  = value;
	}
	
	public T getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		main<Integer> as_Integer = new main<>(10);
		main<String> as_String = new main<>("IT's IA Hello");

		
		System.out.println(as_Integer.getValue()); // 10
		System.out.println(as_String.getValue()); // IT's IA Hello
}

}

///// method 2 : generics with arrays

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
public class main <T>{
	// Generics .
	// Generics : allows you to write code that can work with different data types
	// 
	
	private T[] array;
	
	// Default Constructor
	public main(int size) {
		array = (T[]) new Object[size];
	}
	
	public T getValue(int index) {
		return array[index];
	}
	
	 public void set(int index, T value) {
	        array[index] = value;
	    }

	    public int length() {
	        return array.length;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		  main<Integer> intArray = new main<>(3);
	        intArray.set(0, 1);
	        intArray.set(1, 2);
	        intArray.set(2, 3);

	        for (int i = 0; i < intArray.length(); i++) {
	            System.out.println(intArray.getValue(i)); // Output: 1, 2, 3
	        }

	        main<String> stringArray = new main<>(2);
	        stringArray.set(0, "Hello");
	        stringArray.set(1, "world");

	        for (int i = 0; i < stringArray.length(); i++) {
	            System.out.println(stringArray.getValue(i)); // Output: Hello, world
	        }
}

}
