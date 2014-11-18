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

public class HomePage extends JFrame{
	public HomePage() {
		super("AuJava - Home Page");
	
		String dummyTextForAudava = new String("Audava is a ..Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. Vivamus maximus, neque non tempus tincidunt, ante turpis pellentesque massa, et bibendum metus ligula ut eros.\n \n Maecenas venenatis nisi eget imperdiet lacinia. Nullam eget interdum mauris, non scelerisque felis.");
		
		MenuBar menuBar = new MenuBar("user");
		getContentPane().add(menuBar);
		
		JTextPane txtAudava = new JTextPane();
		txtAudava.setText(dummyTextForAudava);
		txtAudava.setEditable(false);
		txtAudava.setBounds(23, 110, 396, 166);
		menuBar.add(txtAudava);
		
		JLabel lblStorytellingMadeEasy = new JLabel("Storytelling made easy");
		lblStorytellingMadeEasy.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblStorytellingMadeEasy.setBounds(23, 64, 396, 17);
		menuBar.add(lblStorytellingMadeEasy);
		
		JLabel homePageImage = new JLabel("Home Page Image Label");
		
		
		homePageImage.setIcon(new ImageIcon("duke-java.png"));
		homePageImage.setBounds(473, 64, 210, 212);
		menuBar.add(homePageImage);
		
		
	}
}
