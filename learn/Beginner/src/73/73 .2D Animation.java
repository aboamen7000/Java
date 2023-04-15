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
public class main extends JPanel {
	// 2D Animation .
	// 2D Animation :
	// 
	
	int x,y, vert_x, vert_y;
	Color color;
	
	// default Constructor
	public main() {
		x = 50;
		y = 50;
		vert_x = 3;
		vert_y = 2;
		color = Color.BLACK;
		
		Timer timer = new Timer (1, e-> {
			x = x + vert_x;
			y = y + vert_y;
			
			
			// check border x
			if (x < 0 || x > getWidth()) {
				vert_x = -vert_x;
				color = Color.green;
			}
			
			// check border y
			if (y < 0 || y > getHeight()) {
				vert_y = -vert_y;
				color = Color.pink;
			}
			
			repaint();
			
		});
		
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2d.setColor(color);
		g2d.fillOval(x, y, 50, 50);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("2D Animation example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		
		main main_panel = new main();
		
		frame.add(main_panel);
		frame.setVisible(true);
		
}

}
