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
	// Buttons .
	// Buttons :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Buttons example");
		JPanel panel =new JPanel();
		
		JButton button = new JButton("Click me..");
		// change style ( of the button )
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(0,150,230)); // RGB (RED,Green,BLue)
		button.setOpaque(true);
		button.setBorderPainted(false);
		
		// method 1
		button.addActionListener(
				e -> System.out.println("You clicked me, method 1"));
		
		// method 2
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked me, method 2");
			}
		});
		
		
		panel.add(button);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}


