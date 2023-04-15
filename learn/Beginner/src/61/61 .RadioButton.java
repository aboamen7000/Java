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
	// Radio-Buttons .
	// Radio-Buttons :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Radio Button example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		
		JRadioButton radio1 = new JRadioButton("Option 1");
		JRadioButton radio2 = new JRadioButton("Option 2");
		JRadioButton radio3 = new JRadioButton("Option 3");
		
	
		
		radio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("I pressed radio 1..!");
			}
		});
		
		radio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("I pressed radio 2..!");
			}
		});
		
		
		radio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("I pressed radio 3..!");
			}
		});
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		
		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
}
}


