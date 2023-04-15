// method 1 : Basic MouseListener implementation

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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main implements MouseListener{
	// Mouse Listener .
	// Mouse Listener :
	// 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("Mouse listener example");
		JPanel panel = new JPanel();
		
		panel.addMouseListener(new main());
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		  System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
		   
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	     System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
	     
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	      System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
	      
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
		  
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	     System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
	     
	}
	

}

//////////////////////////
// method 2 : MouseListener with pop-up menu

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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main implements MouseListener{
	// Mouse Listener .
	// Mouse Listener :
	// 
	
	private JPopupMenu popupmenu;
	
	public main() {
		popupmenu = new JPopupMenu();
		JMenuItem item_1 = new JMenuItem("Item 1");
		JMenuItem item_2 = new JMenuItem("Item 2");
		
		popupmenu.add(item_1);
		popupmenu.add(item_2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("Mouse listener example");
		JPanel panel = new JPanel();
		
		panel.addMouseListener(new main());
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		  System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
		 if (e.getButton() == MouseEvent.BUTTON3) {
			 popupmenu.show(e.getComponent(), e.getX(), e.getY());
		 }
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
	     System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
	     
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
	      System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
	      
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		 System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
		  
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	     System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
	     
	}
	

}
