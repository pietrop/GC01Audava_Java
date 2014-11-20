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


public class AlbumsPage extends JPanel {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public AlbumsPage() {

	
		
		JLabel anAlbumLabel = new JLabel("album label");
		add(anAlbumLabel);


		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		setLayout(gbl_contentPane);

		
		AlbumsSideBar albumSideBar = new AlbumsSideBar();
		GridBagConstraints gbc_albumSideBar = new GridBagConstraints();
		gbc_albumSideBar.gridheight = 2;
		gbc_albumSideBar.insets = new Insets(0, 0, 5, 5);
		gbc_albumSideBar.gridx = 0;
		gbc_albumSideBar.gridy = 0;
		add(albumSideBar, gbc_albumSideBar);
		
		AlbumInfoPanel albumInfoPanel = new AlbumInfoPanel("title", "description", "albumImage");
		GridBagConstraints gbc_albumInfoPanel = new GridBagConstraints();
		gbc_albumInfoPanel.insets = new Insets(0, 0, 5, 0);
		gbc_albumInfoPanel.gridx = 1;
		gbc_albumInfoPanel.gridy = 0;
		add(albumInfoPanel, gbc_albumInfoPanel);
		
		JLabel lblTracks = new JLabel("Tracks");
		GridBagConstraints gbc_lblTracks = new GridBagConstraints();
		gbc_lblTracks.gridx = 1;
		gbc_lblTracks.gridy = 1;
		add(lblTracks, gbc_lblTracks);
		

	}

}
