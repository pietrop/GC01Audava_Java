package Pages;

/**
 * @author: Pietro 
 * 
 */

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HomePage extends Page {
	public HomePage() {

		
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


	}
}
