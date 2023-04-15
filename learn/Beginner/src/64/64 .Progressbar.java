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
	// Progressbar .
	// Progressbar :
	// 

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		JFrame frame = new JFrame("Progressbar example");
		JPanel panel =new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setTitle("Progressbar Example");
		frame.setBounds(100,100, 300,120);
		panel.setBorder(new EmptyBorder(5,5,5,5));
		frame.setContentPane(panel);
		panel.setLayout(null);
		
		JProgressBar progressbar = new JProgressBar();
		progressbar.setBounds(10,30,260,20);
		panel.add(progressbar);
		
		JLabel percent_Label = new JLabel();
		percent_Label.setBounds(130,60,30,21);
		panel.add(percent_Label);
		
		// Start a separate thread to update the progress bar and label
		Thread thread = new Thread(new Runnable() {
			public void run() {
				int index = 0;
				for(; index <= 100 ; index++) {
					final int progress = index;
					SwingUtilities.invokeLater(new Runnable() {
						public void run() {
							progressbar.setValue(progress);
							percent_Label.setText(progress + " %");
						}
					});
					try {
						Thread.sleep(30);
					}catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			}
		});
		
		thread.start();
		
        frame.setVisible(true);
}
}


