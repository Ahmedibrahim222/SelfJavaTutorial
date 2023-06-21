package GraphicalUserInterface;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// JFram = a GUI window to add components to
		/*
		JFrame frame = new JFrame(); //creates a frame
		frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
		frame.setTitle("JFrame title goes here"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //prevent frame from being resized
		frame.setVisible(true); //makes frame visible
		
		ImageIcon image = new ImageIcon("yoruba.jpg"); //create an ImageIcon
		frame.setIconImage(image.getImage()); //change icon of frame from java logo to my logo
		frame.getContentPane().setBackground(new Color(200, 90, 100)); //change color(rgb) of background
		*/
		
	//	MyFrame myFrame = new MyFrame(); //if u don't plan making any changes, u dont need to create
		new MyFrame(); //this will do the same job

	}

}
