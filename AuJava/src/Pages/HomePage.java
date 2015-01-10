package pages;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import utilities.HTMLReader;

/**
 * Homepage utilizing the HTMLReader to display a pre-written HTML file.
 * 
 * @author Axel Striesow
 */
public class HomePage extends Page {
	
	public HomePage() {
		
		setLayout(null);
		
		String htmlPath = "html/Homepage.html";
		String imagePath = "img/duke-java.png";
		
		JLabel lblHome = new JLabel(HTMLReader.read(htmlPath));
		lblHome.setBounds(39, 41, 295, 400);
		this.add(lblHome);
		
		JLabel homeImg = new JLabel();
		homeImg.setIcon(new ImageIcon(imagePath));
		homeImg.setBounds(396, 80, 252, 252);
		this.add(homeImg);
		
	}
}
