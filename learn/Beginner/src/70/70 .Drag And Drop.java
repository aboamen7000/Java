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
	// Drag and Drop .
	// Drag and Drop :
	// 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);

		
		JFrame frame = new JFrame("Drag and Drop example");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JPanel panel = new JPanel();
		JLabel label = new JLabel("Drag here..!");
		label.setTransferHandler(new TransferHandler("text"));
		
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				JComponent component = (JComponent)e.getSource();
				TransferHandler handle = component.getTransferHandler();
				handle.exportAsDrag(component, e, TransferHandler.COPY);
				
			}
		});
		
		  label.addMouseMotionListener(new MouseMotionAdapter() {
	            public void mouseDragged(MouseEvent evt) {
	                JComponent comp = (JComponent) evt.getSource();
	                TransferHandler handler = comp.getTransferHandler();
	                handler.exportAsDrag(comp, evt, TransferHandler.COPY);
	            }
	        });
		frame.getContentPane().add(label, BorderLayout.CENTER);
		//frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
}

}
