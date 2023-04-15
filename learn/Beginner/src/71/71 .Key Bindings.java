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
public class main {
	// Key Bindings .
	// Key Bindings :
	// 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("Key Bindings example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Press A+CTRL to change color");
		
		
		// create an action for the binding (A + CTRL)
		
		Action change_color = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);;
			}
		};
		
		
		// create the key binding
		KeyStroke keystroke = KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK);
		InputMap inputmap = panel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputmap.put(keystroke, "ChangeColorAction");
		panel.getActionMap().put("ChangeColorAction" , change_color);
		
		panel.add(label);
		frame.getContentPane().add(panel);
		//frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
}

}
