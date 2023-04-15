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
public class main{
	// GridLayout .
	// GridLayout :
	// 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("GridLAyout");
		
		frame.setSize(400, 400);
		
		// creating a panel with a GridLayout
		JPanel panel = new JPanel(new GridLayout(3, 3));
		
		int[] buttons = {1,2,3,4,5,6,7,8,9};

		//
		for(int button : buttons) {
			JButton butto = new JButton("Button " + button);
			panel.add(butto);
		}
		
		
		frame.add(panel);
		frame.setVisible(true);
}
}





////////// method 2

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
	// GridLayout .
	// GridLayout :
	// 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Calculator");
		
		JTextField res = new JTextField(10);
		res.setEditable(false);
		
		// creating a panel with a GridLayout
		JPanel panel = new JPanel(new GridLayout(4, 4));
		
		String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

		// on clicked function
		 ActionListener buttonListener = new ActionListener() {
		      public void actionPerformed(ActionEvent e) {
		        // get the button label
		        String label = ((JButton) e.getSource()).getText();

		        // append the label to the result field
		        res.setText(res.getText() + label);
		      }
		    };
		
		//
		for(String button : buttons) {
			JButton butto = new JButton(button);
			butto.addActionListener(buttonListener);
			panel.add(butto);
		}
		
		frame.add(res, "North");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
}
}


