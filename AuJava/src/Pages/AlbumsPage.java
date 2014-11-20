package Pages;

import jComponents.AlbumInfoPanel;
import jComponents.AlbumsSideBar;
import jComponents.MenuBar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jComponents.MenuBar;
import jComponents.MenuBar;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import javax.swing.Box;


public class AlbumsPage extends JPanel {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public AlbumsPage() {
		setLayout(null);

	
		
		JLabel anAlbumLabel = new JLabel("album label");
		anAlbumLabel.setBounds(165, 42, 73, 16);
		add(anAlbumLabel);

		
		AlbumsSideBar albumSideBar = new AlbumsSideBar();
		albumSideBar.setBounds(6, 29, 121, 229);
		add(albumSideBar);
		
		AlbumInfoPanel albumInfoPanel = new AlbumInfoPanel("title", "description", "albumImage");
		albumInfoPanel.setBounds(277, 5, 1, 1);
		add(albumInfoPanel);
		
		JLabel lblTracks = new JLabel("Tracks");
		lblTracks.setBounds(162, 110, 42, 16);
		add(lblTracks);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(139, 29, 1, 229);
		add(verticalStrut);
		

	}
}
