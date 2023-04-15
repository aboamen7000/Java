// method 1 : Simple KeyListener

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

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main extends Frame implements KeyListener{
	// Key Listener .
	// Key Listener  :
	// 

	private static Label lbl;
	private static TextField txtf;
	
	private void extra() {
		
		txtf = new TextField(15);
		txtf.addKeyListener(this);
		
		lbl = new Label();
		
		lbl.setText("Yrasedasd");
		JFrame frame = new JFrame("Simple Key listener");
		frame.add(txtf, BorderLayout.NORTH);
		frame.add(lbl, BorderLayout.CENTER);
		frame.setTitle("Key listener");
		frame.setSize(500,500);
		frame.setVisible(true);
		
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		// create an instance of main
		main main_class = new main();
		main_class.extra();
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// key typed
		System.out.println("Key Typed : " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Pressed : " + e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Key Released : " + e.getKeyChar());
	}
}


////////////////////////////////////////
// method 2 : Moving Object with Arrow Keys


// method 2 : Moving Object with Arrow Keys

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

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main extends JPanel implements KeyListener{
	// Key Listener .
	// Key Listener  :
	// 
	
	int x, y;
	
	// Constructor
	public main() {
		x = 100;
		y = 100;
		addKeyListener(this);
		setFocusable(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(x, y, 60, 60);
	}
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		// create an instance of main
		main main_class = new main();
		
		JFrame frame = new JFrame("moving an object");
		frame.setTitle("Moving object");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(main_class);
		frame.setVisible(true);
		
}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// key typed
		//System.out.println("Key Typed : " + e.getKeyChar());
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Key Pressed : " + e.getKeyChar());
		
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) {
            x = x - 5;
        } else if (key == KeyEvent.VK_RIGHT) {
            x = x + 5;
        } else if (key == KeyEvent.VK_UP) {
            y = y - 5;
        } else if (key == KeyEvent.VK_DOWN) {
            y = y + 5;
        }
		
		// update to the drawing ui env..
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Key Released : " + e.getKeyChar());
	}
}
