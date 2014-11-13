package JPanels;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class AlbumsSideBar extends JPanel {

	/**
	 * Create the panel.
	 */
	public AlbumsSideBar() {
		setLayout(null);
		
		JButton btnDefaultAlbum = new JButton("Default Album");
		btnDefaultAlbum.setBounds(181, 61, 117, 29);
		add(btnDefaultAlbum);
		
		JButton btnAlbum = new JButton("Album 1");
		btnAlbum.setBounds(181, 102, 117, 29);
		add(btnAlbum);
		
		JButton btnAlbum_1 = new JButton("Album 2");
		btnAlbum_1.setBounds(181, 143, 117, 29);
		add(btnAlbum_1);
		
		JButton btnAlbum_2 = new JButton("Album 3");
		btnAlbum_2.setBounds(181, 190, 117, 29);
		add(btnAlbum_2);
		
		JLabel lblAlbums = new JLabel("Albums");
		lblAlbums.setBounds(208, 33, 61, 16);
		add(lblAlbums);

	}
}
