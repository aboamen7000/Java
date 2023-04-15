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
import javax.swing.*;
import javax.imageio.ImageIO;
public class main{
	// LayeredPane .
	// LayeredPane :
	// 


	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Jframe");
		
		frame.setTitle("LayeredPane App");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a JLayeredpane
		JLayeredPane layeredpane = frame.getLayeredPane();
		
		// create panel to add colors
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(50,50,210,210);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(100,100,210,210);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel_3.setBounds(150,150,210,210);
		
		
		// adding the jpanels to the JlayeredPane
		layeredpane.add(panel_1, new Integer(0));
		layeredpane.add(panel_2, new Integer(1));
		layeredpane.add(panel_3, new Integer(2));
		
//		frame.pack();
		frame.setVisible(true);
}
}


