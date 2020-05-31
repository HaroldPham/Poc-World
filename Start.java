/* Author: Harold Pham
 * Creation date: 4/26/2020
 * Latest revisions: 4/26/2020
 * Description: This will be the main test class of the game.
 */
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import java.awt.*;

public class Start {
//FIELDS
	private Map<Item, Integer> Backpack = new HashMap<>();
	
	public static void main(String[] args)
	{
		/*Notes by the Developer - Using JFrame and JLabel:
		 * Max Frame dimensions (Pixels): 1920 horizontally x 1080 vertically
		 * Setting size: (Horizontal, Vertical)
		 * 
		 */
		 JFrame screen = new JFrame("Poc World"); //JFrame will create the window/HUD
		 
		//JFrame optimization
		 	try 
		 	{
	            screen.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("test.jpg")))));
	        } 
		 	catch (IOException e) 
		 	{
	            e.printStackTrace();
	        }
	        screen.setPreferredSize(new Dimension(800,600)); //Set the size of the window object
	        screen.pack(); //Will make the preferred size apparent
	        screen.setResizable(false); //Client side non resizable
	        screen.setVisible(true); //Makes window visible
	        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Closing button works
	        
	     JLabel text = new JLabel("Testing text"); //The text object
	     
	       //JLabel optimization
	        text.setPreferredSize(new Dimension(300,100));
	     
	    //Add Label to Frame
	     screen.getContentPane().add(text,BorderLayout.CENTER);
	        
	}
}
