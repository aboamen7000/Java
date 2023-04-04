package test;
import java.util.Scanner;
import javax.swing.*;
public class main {
	// Graphices User Interface example.
	// GUI Example : 
	//              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the Scanner library
		Scanner scanner = new Scanner(System.in);
		
		// create a JFrame for the GUI
        JFrame frame = new JFrame("Name and Age");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // create a JPanel to hold the components
        JPanel panel = new JPanel();

        // create labels and text fields for name and age
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(10);

        // create a button to submit the form
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String message = "Hello " + name + "! You are " + age + " years old.";
            JOptionPane.showMessageDialog(frame, message);
        });

        // add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(submitButton);

        // add the panel to the frame and display it
        frame.getContentPane().add(panel);
        frame.setVisible(true);
	    
	}

}
