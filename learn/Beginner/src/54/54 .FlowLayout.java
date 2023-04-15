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
import javax.imageio.ImageIO;
public class main{
	// FlowLayout .
	// FlowLayout :
	// 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
	    JFrame frame = new JFrame("FlowLayout Example");
	    // set the layout of the frame to the flowlayout
	    frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15,15));
	    
	    //for loop
//	    for(int i = 1; i <=10 ; i++) {
//	   	 JButton button = new JButton("Button " + i);
// 	     frame.add(button);
//	    }
	   
	    int[] buttons = {1,2,3,4,5,6,7,8,9,10};
	    // for each
	    for(int btn : buttons) {
	   	 JButton button = new JButton("Button " + btn);
 	     frame.add(button);
	    }
	    
	    
	    frame.setSize(500,500);
	    frame.setVisible(true);
		
}
}


