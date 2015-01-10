package jComponents;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ListCellRenderer;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;

import AlbumHierarchy.Track;
import Pages.TrackPage;
import Pages.TrackView;
/**
 * 
 * @author Sami Start
 * @author Pietro Passarelli
 *
 */
public class DisplayTracks extends JPanel{
	public DisplayTracks(ArrayList<Track> TracksArrayList) {
		setLayout(null);

		JLabel lblList = new JLabel("<html><h2>List</h2></html>");
		lblList.setBounds(278, 6, 54, 25);
		add(lblList);
	
		Track track = TracksArrayList.get(0);
		String title = TracksArrayList.get(0).getTitle();
		
	}
}

