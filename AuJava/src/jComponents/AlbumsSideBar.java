package jComponents;

import java.awt.GridBagConstraints;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JButton;

import AlbumHierarchy.Album;
import Utilities.AlbumReadWrite;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class AlbumsSideBar extends JPanel {
	
	ArrayList<Album> albums;

	/**
	 * Create the panel.
	 */
	public AlbumsSideBar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
	
		
		try {
			albums = AlbumReadWrite.returnAllAlbums();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < albums.size(); i++) {
			GridBagConstraints gbc = new GridBagConstraints();
			gbc.insets = new Insets(0, 0, 5, 0);
			gbc.gridx = 0;
			gbc.gridy = i;
			add(new JButton(albums.get(i).getTitle()), gbc);
		}

	}
}
