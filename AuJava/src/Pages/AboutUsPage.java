package Pages;
/**
 * @author: Pietro 
 * 
 */

import jComponents.MenuBar;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import jComponents.MenuBar;
import java.awt.Font;

public class AboutUsPage extends JFrame {
	
	public AboutUsPage(){
		super("AuJava - About Us Page");
		MenuBar menuBar = new MenuBar("user");
		getContentPane().add(menuBar);
		
		
String dummyTextForAudava = new String("Audava is a ..Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. Vivamus maximus, neque non tempus tincidunt, ante turpis pellentesque massa, et bibendum metus ligula ut eros.\n \n Maecenas venenatis nisi eget imperdiet lacinia. Nullam eget interdum mauris, non scelerisque felis.");
		
		//
		JTextPane imranTextPane = new JTextPane();
		imranTextPane.setText(dummyTextForAudava);
		imranTextPane.setBounds(23, 110, 396, 101);
		imranTextPane.setEditable(false);
		menuBar.add(imranTextPane);
		
		JLabel lblIrman = new JLabel("Imran");
		lblIrman.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblIrman.setBounds(23, 88, 188, 16);
		menuBar.add(lblIrman);
		
		JLabel imranPicture = new JLabel("");
		imranPicture.setIcon(new ImageIcon("img/duke-java.png"));
		imranPicture.setBounds(447, 110, 210, 120);
		menuBar.add(imranPicture);
		
		JTextPane usamanTextPane = new JTextPane();
		usamanTextPane.setText("Audava is a ..Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque ipsum lacus, ultrices eget consectetur vel, aliquet id justo. Fusce in malesuada ante. Vestibulum accumsan dolor nec orci rutrum tempor. Maecenas tincidunt laoreet tempus. Vivamus maximus, neque non tempus tincidunt, ante turpis pellentesque massa, et bibendum metus ligula ut eros.\n \n Maecenas venenatis nisi eget imperdiet lacinia. Nullam eget interdum mauris, non scelerisque felis.");
		usamanTextPane.setBounds(23, 258, 396, 101);
		usamanTextPane.setEditable(false);
		menuBar.add(usamanTextPane);
		
		JLabel aboutUs = new JLabel("About us");
		aboutUs.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		aboutUs.setBounds(23, 60, 188, 16);
		menuBar.add(aboutUs);
		
		JLabel lblUsaman = new JLabel("Usaman");
		lblUsaman.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		lblUsaman.setBounds(23, 233, 188, 16);
		menuBar.add(lblUsaman);
		
		JLabel usamanPicture = new JLabel("");
		usamanPicture.setIcon(new ImageIcon("img/duke-java.png"));
		usamanPicture.setBounds(447, 258, 210, 120);
		menuBar.add(usamanPicture);
	}
}
