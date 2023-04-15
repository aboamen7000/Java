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
public class main {
	// Label .
	// Label :
	// 

	
	private static void Init() {
		
		   JFrame frame = new JFrame("Simple App By IA");
	        JPanel panel = new JPanel() {
	            @Override
	            protected void paintComponent(Graphics g) {
	                super.paintComponent(g);
	                try {
	                    Image image = ImageIO.read(new File("sad.png"));
	                    int x = ( getWidth() - image.getWidth(null)) / 2;
	                    int y = ( getHeight() - image.getHeight(null)) / 2;
	                    g.drawImage(image, x, y, null);
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        };
		
		panel.setLayout(null);
		JLabel label = new JLabel("Hello its IA");
		label.setBounds(130,60, 200, 30);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Arial", Font.BOLD, 25));
		
		panel.add(label);
		
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		Init();
	
}
}