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
	// JOptionPane .
	// JOptionPane :
	// 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello, " + name + " !");
		
		int choosing = JOptionPane.showConfirmDialog(null, "Do you like me");
		
		if(choosing == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "That's great.");
		}else if(choosing == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "That's too bad.");
		}else {
			JOptionPane.showMessageDialog(null, "you didn't say yes or no.");
		}
		
}
}


