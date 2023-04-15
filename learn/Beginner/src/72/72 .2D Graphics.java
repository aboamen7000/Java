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
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main extends JPanel {
	// 2D Graphics .
	// 2D Graphics :
	// 
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// drawing a rectangle
		g.setColor(Color.BLUE);
		g.fillRect(50, 50, 100, 50);
		
		// drawing a ovval
		g.setColor(Color.CYAN);
		g.fillOval(130,50,50,50);
		
		// drawing a line
		g.setColor(Color.BLACK);
		g.drawLine(70, 70, 170, 70);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("2D Graphics example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JPanel panel = new JPanel();
		

		//panel.add(label);
		//frame.getContentPane().add(panel);
		//frame.add(panel);
		frame.setSize(500, 500);
		
		main main_panel = new main();
		
		frame.add(main_panel);
		
		frame.setVisible(true);
		
}

}
