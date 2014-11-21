package jComponents;
import java.awt.TextArea;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import AlbumHierarchy.Album;
import AlbumHierarchy.AlbumOrTrack;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author: Pietro 
 * 
 */

public class InfoPanel extends JPanel{

	public InfoPanel(String title, String description, String albumImage) {
		populatePanel(title,description,albumImage);
	}
	
//	public AlbumInfoPanel(String title, String description) {
//		populatePanelWithoutAlbumPicture(title,description);
//	}

	private void populatePanel(String title, String description,String albumImage){
		
//		JLabel albumTitleLabel = new JLabel(title);
		TextArea albumTitleLabel = new TextArea(title,1,1, TextArea.SCROLLBARS_NONE);
		albumTitleLabel.setBounds(59, 10, 215, 29);
		albumTitleLabel.setEditable(false);
//		JLabel albumDescriptionLabel = new JLabel(description);
		TextArea albumDescriptionLabel = new TextArea(description,1,10,TextArea.SCROLLBARS_NONE);
		albumDescriptionLabel.setEditable(false);
		albumDescriptionLabel.setBounds(20, 80, 256, 198);
		
		setLayout(null);
		add(albumTitleLabel);
		add(albumDescriptionLabel);
		//album title
		JLabel lblAlbumTitle = new JLabel("<html><h3>Title</h3></html>");
		lblAlbumTitle.setBounds(20, 23, 112, 16);
		add(lblAlbumTitle);
		
		//album description
		JLabel albulmDescription = new JLabel("<html><h4>Description</h4></html>");
		albulmDescription.setBounds(20, 58, 131, 16);
		add(albulmDescription);
		//album image
		ImageIcon  albumPictureIcon = new ImageIcon(albumImage);
		JLabel alblAlbumImage = new JLabel(albumPictureIcon);
		alblAlbumImage.setBounds(298, 10, 196, 136);
		add(alblAlbumImage);
		
		/*edit and save buttons*/
		JButton btnEdit = new JButton("edit");
		btnEdit.setBounds(298, 225, 75, 29);
		add(btnEdit);
		
		JButton btnSave = new JButton("save");
		btnSave.setBounds(385, 225, 75, 29);
		add(btnSave);
		
		
		btnSave.setEnabled(false);
		btnEdit.setEnabled(true);
		
		/*action listeners for the buttons*/
		
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEdit.setEnabled(false);
				btnSave.setEnabled(true);
				albumDescriptionLabel.setEditable(true);
				albumTitleLabel.setEditable(true);
			}
		});
		
		
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEdit.setEnabled(true);
				btnSave.setEnabled(false);
				albumDescriptionLabel.setEditable(false);
				albumTitleLabel.setEditable(false);
				
				/*saving changes into object*/
				 Album.getAlbum(0).setTitle(albumTitleLabel.getText().toString());
				 Album.getAlbum(0).setDescription(albumDescriptionLabel.getText().toString());
				
				/* dest by print out to console*/
				 System.out.println("- Printing out the album edited and saved: - ");
				 System.out.println(Album.getAlbum(0).getTitle().toString());
					System.out.println(Album.getAlbum(0).getDescription().toString());
					System.out.println(Album.getAlbum(0).getPicFileLocation().toString());
				 /* */
			}
		});
		
		
		
	}
}
