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

public class AboutUsPage extends JFrame {
	
	public AboutUsPage(){
		super("AuJava - About Us Page");
		MenuBar menuBar = new MenuBar("user");
		this.setJMenuBar(menuBar);
		
		
String dummyTextForAudava = new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. \n\n  Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. ");
		
		//

		JLabel aboutUs = new JLabel("About us");
		aboutUs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		aboutUs.setBounds(23, 60, 188, 16);
		getContentPane().add(aboutUs, BorderLayout.NORTH);
		
		JPanel background = new JPanel();
		background.setLayout(null);
		
		
		JLabel lblIrman = new JLabel("Imran");
		lblIrman.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblIrman.setBounds(38, 37, 46, 20);
		background.add(lblIrman);
		
		
		
		JLabel lblUsaman = new JLabel("Usaman");
		lblUsaman.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblUsaman.setBounds(38, 215, 62, 20);
		background.add(lblUsaman);

		
		JTextPane usamanTextPane = new JTextPane();
		usamanTextPane.setText(dummyTextForAudava);
		usamanTextPane.setBounds(38, 239, 365, 118);
		usamanTextPane.setEditable(false);
		background.add(usamanTextPane);

		
		JTextPane ImranTextPane = new JTextPane();
		ImranTextPane.setText(dummyTextForAudava);
		ImranTextPane.setEditable(false);
		ImranTextPane.setBounds(38, 69, 365, 118);
		background.add(ImranTextPane);
		
		JLabel imranPicture = new JLabel("Imran Pic");
		imranPicture.setIcon(new ImageIcon("img/duke-java.png"));
		imranPicture.setBounds(471, 37, 189, 150);
		background.add(imranPicture);
		
		JLabel usamanPicture = new JLabel("Usman Pic");
		usamanPicture.setIcon(new ImageIcon("img/duke-java.png"));
		usamanPicture.setBounds(465, 220, 195, 132);
		background.add(usamanPicture);
		
		getContentPane().add(background, BorderLayout.CENTER);	
		
	}
}
