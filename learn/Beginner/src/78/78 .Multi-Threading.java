package test;
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
import java.util.Timer;
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
//import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.imageio.ImageIO;
public class main {
	// Multi-Threading .
	// Multi-Threading : 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// Create and start the threads
		Thread thread1 = new threader("Thread 1");
		Thread thread2 = new threader("Thread 2");
		
		thread1.start();
		thread2.start();
		
		 // Wait for the threads to finish
		try {
			thread1.join();
			thread2.join();
		}catch (Exception e){
			e.printStackTrace();
		}
		 // Print out a message when both threads are done
		System.out.println("Finished...");
}
	
	private static class threader extends Thread{
		private String name;
		
		// default constructor
		public threader(String name) {
			this.name = name;
		}
		
		public void run() {
			for(int i = 0 ; i < 5; i++) {
				System.out.println(name + " is running..." + i);
				try {
					sleep(1000); // sleep for 1 second
				}catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}