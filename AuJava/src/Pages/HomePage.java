package Pages;

/**
 * @author: Pietro 
 * 
 */

import jComponents.MenuBar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Font;

import jComponents.MenuBar;

import javax.swing.JScrollBar;

public class HomePage extends Page {
	public HomePage() {
<<<<<<< Updated upstream
		
		setLayout(null);
		
		JLabel lblStorytellingMadeEasy = new JLabel("<html><h1>Storytelling made easy\n\n</h1></html>");
		lblStorytellingMadeEasy.setBounds(39, 41, 295, 40);
		this.add(lblStorytellingMadeEasy);
		
		
		JLabel homePageImage = new JLabel(" ");
		homePageImage.setIcon(new ImageIcon("duke-java.png"));
		homePageImage.setBounds(396, 65, 252, 252);

	
		
		this.add(homePageImage);
	
		
		
		JLabel txtAudava = new JLabel("<html><p>Vestibulum scelerisque, lorem ac iaculis cursus, nibh mi elementum elit, sit amet tincidunt sapien odio at elit.</p><p> Donec sollicitudin molestie erat at euismod. Curabitur commodo euismod dui, quis ornare nibh pharetra sit amet. Sed eu accumsan massa. Etiam sit amet varius lorem. Sed vitae erat vel nunc mollis egestas id elementum nisi. Sed nisl nisl, pellentesque at lorem id, sodales feugiat nisi.</p></html>");
		txtAudava.setBounds(39, 87, 344, 230);
//		txtAudava.setText();
		this.add(txtAudava);
				
			
=======
		super("AuJava - Home Page");

		String dummyTextForAudava = new String(
				"Audava is a ..Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. Vivamus maximus, neque non tempus tincidunt, ante turpis pellentesque massa, et bibendum metus ligula ut eros.\n \n Maecenas venenatis nisi eget imperdiet lacinia. Nullam eget interdum mauris, non scelerisque felis.");

		MenuBar menuBar = new MenuBar();
		this.setJMenuBar(menuBar);

		JLabel lblStorytellingMadeEasy = new JLabel(
				"Storytelling made easy\n\n");
		lblStorytellingMadeEasy.setFont(new Font("Lucida Grande", Font.PLAIN,
				20));
		lblStorytellingMadeEasy.setBounds(23, 64, 396, 17);
		getContentPane().add(lblStorytellingMadeEasy, BorderLayout.NORTH);

		JLabel homePageImage = new JLabel(" ");

		homePageImage.setIcon(new ImageIcon("duke-java.png"));
		homePageImage.setBounds(473, 64, 210, 212);
		getContentPane().add(homePageImage, BorderLayout.EAST);

		JTextPane txtAudava = new JTextPane();
		txtAudava.setText(dummyTextForAudava);
		txtAudava.setEditable(false);
		txtAudava.setBounds(23, 110, 396, 166);
		getContentPane().add(txtAudava, BorderLayout.CENTER);

>>>>>>> Stashed changes
	}
}
