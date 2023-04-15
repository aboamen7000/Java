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
	// Panels .
	// Panels :
	// 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Create a frame to hold the panel
		
		JFrame frame = new JFrame("Panel Holder");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// create a panel to hold component (buttons, labels..etc)
		JPanel panel = new JPanel();
		
		
		// add components to the panel
		JLabel label = new JLabel("Enter your name : ");
		JTextField textfield = new JTextField(7); // length = 7
		JButton button = new JButton("Sumbit");
		
		
		// adding the component to the panel
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		
		// add the pnael to the frame
		frame.add(panel);
		
		// display the frame (panel to showing components which conains [buttons....etc])
		frame.pack();
		frame.setVisible(true);
		
}
}

//////////////////////// Method 2

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
	// Panels .
	// Panels :
	// 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Create a frame to hold the panel
		
		JFrame frame = new JFrame("Styled Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// create a panel to hold component (buttons, labels..etc)
		JPanel panel = new JPanel();
		panel.setBackground(new Color(200,200,190)); // RGB (RED, Green, Blue)
		
		
		// creating a tittle label
		JLabel title = new JLabel("My app, Welcome");
		title.setFont(new Font("Arial", Font.BOLD, 25));
		title.setForeground(new Color(70,5,120));
		
		
		// add components to the panel
		JLabel label = new JLabel("Enter your name : ");
		label.setFont(new Font("Arial", Font.BOLD, 22));
		
		JTextField textfield = new JTextField(14); // length = 14
		textfield.setFont(new Font("Arial", Font.BOLD, 22));
		
		
		JButton button = new JButton("Sumbit");
		button.setPreferredSize(new Dimension(90,33));
		button.setBackground(new Color(40,5,120));
		button.setForeground(Color.WHITE);
		
		// adding the component to the panel
		panel.add(title);
		panel.add(Box.createRigidArea(new Dimension(25,50)));
		panel.add(label);
		panel.add(textfield);
		panel.add(Box.createRigidArea(new Dimension(25,50)));
		panel.add(button);
		
		
		// add the pnael to the frame
		frame.add(panel);
		
		// display the frame (panel to showing components which conains [buttons....etc])
		frame.pack();
		frame.setVisible(true);
		
}
}