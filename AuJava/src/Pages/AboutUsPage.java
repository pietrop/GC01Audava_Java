package Pages;
/**
 * @author: Pietro 
 * 
 */

import jComponents.MenuBar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import jComponents.MenuBar;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Label;

public class AboutUsPage extends Page {

	public AboutUsPage(){
		/*About - Us title of the page */
		JLabel aboutUs = new JLabel("<html><h1>About us</h1></html>");
		aboutUs.setBounds(45, 20, 113, 50);
		add(aboutUs);
		
		/*  some text for their bio */
		String dummyTextForAudava = new String("<html><p>Vestibulum scelerisque, lorem ac iaculis cursus, nibh mi elementum elit, sit amet tincidunt sapien odio at elit.</p><br><p> Donec sollicitudin molestie erat at euismod. Curabitur commodo euismod dui, quis ornare nibh pharetra sit amet. Sed eu accumsan massa. Etiam sit amet varius lorem.  </p></html>");
		setLayout(null);
		
		/*Usman headline */
		JLabel lblUsman = new JLabel("<html><h2>Usman</h2></html>");
		lblUsman.setBounds(45, 271, 113, 20);
		add(lblUsman);
		/*Usman bio text*/
		JLabel usmanTextPane = new JLabel();
		usmanTextPane.setBounds(45, 303, 365, 118);
		usmanTextPane.setText(dummyTextForAudava);
		add(usmanTextPane);
		/*Usman picture*/
		JLabel usamanPicture = new JLabel("Usman Pic");
		usamanPicture.setIcon(new ImageIcon("img/duke-java.png"));
		usamanPicture.setBounds(465, 220, 195, 132);
		add(usamanPicture);
		
		/*Imran headline */
		JLabel lblIrman = new JLabel("<html><h2>Imran</h2></html>");
		lblIrman.setBounds(45, 91, 103, 20);
		add(lblIrman);
		/*Imran bio text */
		JLabel ImranTextPane = new JLabel();
		ImranTextPane.setBounds(45, 109, 365, 138);
		add(ImranTextPane);
		ImranTextPane.setText(dummyTextForAudava);
		/*Imran picture */
		JLabel imranPicture = new JLabel("Imran Pic");
		imranPicture.setIcon(new ImageIcon("img/duke-java.png"));
		imranPicture.setBounds(471, 37, 189, 150);
		add(imranPicture);

	}
}
