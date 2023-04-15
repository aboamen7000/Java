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
	// New GUI Window .
	// New GUI Window :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("My window 1");
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);// center
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		JButton button = new JButton("Open new window");
		
		button.addActionListener(e -> {
			JFrame frame_2 = new JFrame("My window 2");
			frame_2.setSize(500,500);
			frame_2.setLocationRelativeTo(frame);// center
			frame_2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			frame_2.setVisible(true);
		});
		
		panel_1.add(button);
		frame.add(panel_1);
	
		frame.setVisible(true);
		
}
}


