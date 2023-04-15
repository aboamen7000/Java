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
	// File Selector .
	// File Selector :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// create a file shooser
		JFileChooser file = new JFileChooser();
		
		// show the file chooser dialog
		int result = file.showOpenDialog(null);
		
		// to handle the error exception
		if (result == JFileChooser.APPROVE_OPTION) {
			// get the selected file
			java.io.File selectedfile = file.getSelectedFile();
			
			System.out.println(selectedfile.getAbsolutePath());
		}else {
			System.out.println("You dodged the open file button");
		}
		
		
		
}
}


