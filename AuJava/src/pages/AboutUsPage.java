package pages;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import utilities.HTMLReader;

/**
 * AboutUs page utilizing the HTMLReader to display a pre-written HTML file.
 * 
 * @author Axel Striesow
 */
public class AboutUsPage extends Page {

	public AboutUsPage(){
		
		setLayout(null);
		
		String htmlPath = "html/AboutUs.html";
		String imageImran = "img/duke-java.png";
		String imageUsman = "img/duke-java.png";
		
		JLabel lblAboutUs = new JLabel(HTMLReader.read(htmlPath));
		lblAboutUs.setBounds(39, 41, 295, 450);
		this.add(lblAboutUs);
		
		JLabel imranPicture = new JLabel("Imran Pic");
		imranPicture.setIcon(new ImageIcon(imageImran));
		imranPicture.setBounds(471, 37, 189, 150);
		add(imranPicture);
		
		JLabel usmanPicture = new JLabel("Usman Pic");
		usmanPicture.setIcon(new ImageIcon(imageUsman));
		usmanPicture.setBounds(465, 220, 195, 132);
		add(usmanPicture);
		
	}
}
