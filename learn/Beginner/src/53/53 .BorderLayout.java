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
	// BorderLayout .
	// BorderLayout :
	// 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// createframe, size, title
		
		JFrame frame = new JFrame();
		frame.setSize(300,200);
		frame.setTitle("BorderLayout");
		
		// create new panelwith borderlayout manager
		JPanel panel = new JPanel(new BorderLayout());
		
		
		//create component buttons and add to the main panel
		
		JButton top = new JButton("Top");
		JButton bottom = new JButton("Bottom");
		JButton left = new JButton("Left");
		JButton right = new JButton("Right");
		JButton center = new JButton("Center");
		
		
		// add the buttons to panel with the borderlayout constraints
		
		panel.add(top, BorderLayout.NORTH);
		panel.add(left, BorderLayout.WEST);
		panel.add(center, BorderLayout.CENTER);
		panel.add(right, BorderLayout.EAST);
		panel.add(bottom, BorderLayout.SOUTH);
		
		
		frame.add(panel);
		frame.setVisible(true);
		
}
}


