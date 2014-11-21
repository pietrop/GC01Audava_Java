package Pages;

import jComponents.InfoPanel;
import jComponents.AlbumsSideBar;
import jComponents.InfoPanel;
import jComponents.MenuBar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jComponents.MenuBar;
import jComponents.InfoPanel;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;

import javax.swing.Box;

import AlbumHierarchy.Album;


public class AlbumsPage extends Page {
	/**
	 * Create the frame.
	 */
	public AlbumsPage() {
		setLayout(null);

		
		String title = Album.getAlbum(0).getTitle().toString();
		String description = Album.getAlbum(0).getDescription().toString();
		String image = Album.getAlbum(0).getPicFileLocation().toString();
		
		InfoPanel infoPanel = new InfoPanel(title, description, image);
		infoPanel.setBounds(200, 23, 480, 282);
		add(infoPanel);
		
		
		AlbumsSideBar albumSideBar = new AlbumsSideBar();
		albumSideBar.setBounds(6, 29, 149, 425);
		add(albumSideBar);
		
//		
//		
//		JLabel lblTracks = new JLabel("Tracks");
//		lblTracks.setBounds(211, 164, 64, 31);
//		add(lblTracks);
//		
//		Component verticalStrut = Box.createVerticalStrut(20);
//		verticalStrut.setBounds(139, 29, 1, 229);
//		add(verticalStrut);
//		
//		Component horizontalGlue = Box.createHorizontalGlue();
//		horizontalGlue.setBounds(162, 143, 201, 9);
//		add(horizontalGlue);
//		
//		Component verticalGlue = Box.createVerticalGlue();
//		verticalGlue.setBounds(126, 39, 14, 218);
//		add(verticalGlue);
		

	}
}
