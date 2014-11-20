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
<<<<<<< Updated upstream

import jComponents.MenuBar;
import jComponents.MenuBar;
=======

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
>>>>>>> Stashed changes

public class AlbumsPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
<<<<<<< Updated upstream
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					TrackPage frame = new TrackPage();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
=======
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AlbumsPage frame = new AlbumsPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
>>>>>>> Stashed changes

	/**
	 * Create the frame.
	 */
	public AlbumsPage() {
<<<<<<< Updated upstream
	
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		add(contentPane);
//		add(new MenuBar("user"));
		
		JLabel anAlbumLabel = new JLabel("album label");
		add(anAlbumLabel);
=======
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
>>>>>>> Stashed changes
		
		AlbumsSideBar albumSideBar = new AlbumsSideBar();
		GridBagConstraints gbc_albumSideBar = new GridBagConstraints();
		gbc_albumSideBar.gridheight = 2;
		gbc_albumSideBar.insets = new Insets(0, 0, 5, 5);
		gbc_albumSideBar.gridx = 0;
		gbc_albumSideBar.gridy = 0;
		contentPane.add(albumSideBar, gbc_albumSideBar);
		
		AlbumInfoPanel albumInfoPanel = new AlbumInfoPanel("title", "description", "albumImage");
		GridBagConstraints gbc_albumInfoPanel = new GridBagConstraints();
		gbc_albumInfoPanel.insets = new Insets(0, 0, 5, 0);
		gbc_albumInfoPanel.gridx = 1;
		gbc_albumInfoPanel.gridy = 0;
		contentPane.add(albumInfoPanel, gbc_albumInfoPanel);
		
		JLabel lblTracks = new JLabel("Tracks");
		GridBagConstraints gbc_lblTracks = new GridBagConstraints();
		gbc_lblTracks.gridx = 1;
		gbc_lblTracks.gridy = 1;
		contentPane.add(lblTracks, gbc_lblTracks);

		MenuBar menuBar = new MenuBar();
		this.setJMenuBar(menuBar);
		
		

	}

}
