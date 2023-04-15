package test;
import java.util.Arrays;
import java.util.Scanner;
//import javax.swing.*;
//import java.lang.Math;
//import java.util.Random;
//import java.awt.Color; // abstract window toolkit
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.HashMap;
import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class main {
	// Audio .
	// Audio :
	// 

	public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException{
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		
		/// Record audio from a microphone
		try {
			AudioFormat format = new AudioFormat(44100, 16, 2 , true, true);
			TargetDataLine line = AudioSystem.getTargetDataLine(format);
			line.open();
			line.start();
			
			AudioInputStream ais = new AudioInputStream(line);
			AudioSystem.write(ais, AudioFileFormat.Type.WAVE, new File("IA.wav"));
		}catch (Exception e) {
			System.out.println(e);
		}
		//// ///
		
		// Play a WAV file
		
			File file = new File("IA.wav");
			AudioInputStream ais =  AudioSystem.getAudioInputStream(file);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
	
	
		
		}
}
