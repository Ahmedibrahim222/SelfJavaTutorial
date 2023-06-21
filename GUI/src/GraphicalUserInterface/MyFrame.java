package GraphicalUserInterface;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		
		this.setSize(420,420); //sets the x-dimension, and y-dimension of this
		this.setTitle("JFrame title goes here"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		this.setResizable(false); //prevent this from being resized
		this.setVisible(true); //makes this visible

		ImageIcon image = new ImageIcon("yoruba.jpg"); //create an ImageIcon
		this.setIconImage(image.getImage()); //change icon of this from java logo to my logo
		this.getContentPane().setBackground(new Color(200, 90, 100)); //change color(rgb) of background


	}

}


