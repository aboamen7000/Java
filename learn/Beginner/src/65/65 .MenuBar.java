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
	// MenuBar .
	// MenuBar :
	// 

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Progressbar example");
//		JPanel panel =new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menubar = new JMenuBar();
		JMenu file = new JMenu("File"); // open save exit (item menu)
		JMenu edit = new JMenu("Edit"); // cut copy paste (item menu)
		JMenu view = new JMenu("View"); // zoom in zoom out (item menu)
		
		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem exit = new JMenuItem("Exit");
		file.add(open);
		file.add(save);
		file.add(exit);
		
		JMenuItem cut = new JMenuItem("Cut");
		JMenuItem copy = new JMenuItem("Copy");
		JMenuItem paste = new JMenuItem("Paste");
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		
		JMenuItem zoom_in = new JMenuItem("Zoom In");
		JMenuItem zoom_out = new JMenuItem("Zoom Out");
		view.add(zoom_in);
		view.add(zoom_out);
		
		menubar.add(file);
		menubar.add(edit);
		menubar.add(view);
		
		frame.setJMenuBar(menubar);
		frame.setSize(500, 500);
        frame.setVisible(true);
}
}


