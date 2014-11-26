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

public class DisplayTracks extends JPanel{
	public DisplayTracks(ArrayList<Track> TracksArrayList) {
		setLayout(null);

		JLabel lblList = new JLabel("<html><h2>List</h2></html>");
		lblList.setBounds(278, 6, 54, 25);
		add(lblList);
		
		
	
		Track track = TracksArrayList.get(0);
		String title = TracksArrayList.get(0).getTitle();
		
//		JButton btnAtrack = new JButton(title);
//		btnAtrack.setBounds(127, 44, 277, 29);
//		add(btnAtrack);
		
//		JLabel lblFristTrack = new JLabel("Frist Track");
//		lblFristTrack.setBounds(35, 49, 76, 16);
//		add(lblFristTrack);
		
//		JListT list = new JListT();
//		list.setBounds(365, 161, -181, 84);
//		add(list);

	
		
		
		 
		 
		// Display an icon and a string for each object in the list.
	
		
//		btnAtrack.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
		
//		/* creating track page that takes the newly recorded track in as an argument*/
//		 TrackPage trackCard = new TrackPage(track);
//		 /*adding track page to cards group*/
//		 TrackView.cards.add(TrackView.TRACKPAGE, trackCard);
//		 /*defining card layout var card layout from TrackView */
//		 CardLayout cardLayout = (CardLayout) TrackView.cards.getLayout();
//		 /*show/change to the newly created Track page*/
//		 cardLayout.show( TrackView.cards, TrackView.TRACKPAGE);
//				
//			}
//		});
		
		
		
		
		
	}
}

