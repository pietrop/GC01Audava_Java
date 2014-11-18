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
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Font;
import jComponents.MenuBar;
import javax.swing.JScrollBar;

public class HomePage extends Page{
	public HomePage() {
		super("AuJava - Home Page");
	
		String dummyTextForAudava = new String("Audava is a ..Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. Vivamus maximus, neque non tempus tincidunt, ante turpis pellentesque massa, et bibendum metus ligula ut eros.\n \n Maecenas venenatis nisi eget imperdiet lacinia. Nullam eget interdum mauris, non scelerisque felis.");
		
		MenuBar menuBar = new MenuBar();
		 this.setJMenuBar(menuBar);
	
		
		JLabel lblStorytellingMadeEasy = new JLabel("Storytelling made easy\n\n");
		lblStorytellingMadeEasy.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
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
				
			
	}
}
