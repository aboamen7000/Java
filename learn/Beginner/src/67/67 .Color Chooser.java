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
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main extends JFrame{
	// Color Chooser .
	// Color Chooser :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Color Picker Example");
		
		JButton button = new JButton("Choose a color");
		
		// handle btn click
		button.addActionListener(
				e->{
				Color color = JColorChooser.showDialog(null, "Choose a Color", Color.BLACK);
				
				button.setBackground(color);
				System.out.println(color);
				});
		
		
		frame.add(button, BorderLayout.CENTER);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
}
}


