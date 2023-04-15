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
	// Threads .
	// Threads : 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		Thread thread1 = new Thread(new Runnable() {
			public void run() {
				
				for(int i = 0; i < 5; i++) {
					System.out.println("Thread 1 is running... " + i);
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			public void run() {
				
				for(int i = 0; i < 5; i++) {
					System.out.println("Thread 2 is running... " + i);
					try {
						Thread.sleep(1000);
					}catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				
			}
		});
		
		thread1.start();
		thread2.start();
}
}