package jComponents;
import java.awt.GridBagLayout;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

/**
 * @author: Pietro 
 * 
 */

public class AlbumInfoPanel extends JPanel{

	public AlbumInfoPanel(String title, String description, String albumImage) {
		populatePanel(title,description,albumImage);
	}
	
//	public AlbumInfoPanel(String title, String description) {
//		populatePanelWithoutAlbumPicture(title,description);
//	}

	private void populatePanel(String title, String description,String albumImage){
		
//		JLabel albumTitleLabel = new JLabel(title);
		TextArea albumTitleLabel = new TextArea(title,1,1, TextArea.SCROLLBARS_NONE);
		albumTitleLabel.setBounds(107, 10, 256, 29);
		albumTitleLabel.setEditable(false);
//		JLabel albumDescriptionLabel = new JLabel(description);
		TextArea albumDescriptionLabel = new TextArea(description,1,10,TextArea.SCROLLBARS_NONE);
		albumDescriptionLabel.setEditable(false);
		albumDescriptionLabel.setBounds(20, 80, 343, 196);
		
		setLayout(null);
		add(albumTitleLabel);
		add(albumDescriptionLabel);
		//album title
		JLabel lblAlbumTitle = new JLabel("Album Title");
		lblAlbumTitle.setBounds(20, 23, 112, 16);
		add(lblAlbumTitle);
		
		//album description
		JLabel albulmDescription = new JLabel("Album Description");
		albulmDescription.setBounds(20, 58, 131, 16);
		add(albulmDescription);
		//album image
		ImageIcon  albumPictureIcon = new ImageIcon(albumImage);
		JLabel alblAlbumImage = new JLabel(albumPictureIcon);
		alblAlbumImage.setBounds(388, 11, 289, 188);
		add(alblAlbumImage);
	}
}
