package jComponents;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PictureLabel extends JLabel {

	public PictureLabel () {
		
		Image image = new ImageIcon(this.getClass().getResource("/Track.png")).getImage();
		
		ImageIcon img2 = new ImageIcon("Track.png");
		
		this.setIcon(new ImageIcon(image));
//		this.setIcon(img2); Why does this not work?
		
		this.setBounds(20,50,256,256);
		
		
	}

}
