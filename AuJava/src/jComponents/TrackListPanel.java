package jComponents;

import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;

import AlbumHierarchy.Track;
import Pages.TrackPage;
import Pages.TrackView;

import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollBar;

/**
 * 
 * @author SamiStart
 *@author PietroPasserelli
 */
public class TrackListPanel extends JPanel {
	int j;
	ArrayList<Track> tracks;
	GridBagConstraints gbc;
	String TRACKPAGEK = "TrackK";//
	/**
	 * Create the panel.
	 */
	public TrackListPanel() {
		int j;
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);

		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.gridheight = 5;
		gbc_scrollBar.insets = new Insets(0, 0, 5, 0);
		gbc_scrollBar.gridx = 14;
		gbc_scrollBar.gridy = 0;
//		add(scrollBar, gbc_scrollBar);
		//		Track.saveTracks();
		Track.loadTracks();

		tracks = Track.getAllTracks();
		gbc = new GridBagConstraints();
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		/////
		JPanel trackPane = new JPanel();
		//		List<JPanel>  trackPaneList = new ArrayList<JPanel>();
		CardLayout cardLayout = (CardLayout) TrackView.cards.getLayout();


		//Tacks Panel with card layout
		JPanel trackPaneList = new JPanel();
		trackPaneList.setLayout(new CardLayout());
		///
		if(tracks.size() != 0){
			System.out.println("tracks list not empty");
			System.out.println(tracks.size());
			for (int i = 0; i < tracks.size(); i++) {
				gbc.insets = new Insets(0, 0, 5, 0);
				gbc.gridx = 0;
				gbc.gridy = i;

				buttons.add(new JButton(tracks.get(i).getTitle()));
				Track recordedTrack = tracks.get(i);
				/*adding track page to cards group*/
				//			 TrackView.cards.add(TrackView.TRACKPAGE, trackCard);//
				//+4

				buttons.get(i).addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						/* creating track page that takes the newly recorded track in as an argument*/
						 TrackPage trackCard = new TrackPage(recordedTrack);
						 /*adding track page to cards group*/
						 TrackView.cards.add(TrackView.TRACKPAGE, trackCard);
						 /*defining card layout var card layout from TrackView */
						 CardLayout cardLayout = (CardLayout) TrackView.cards.getLayout();
						 /*show/change to the newly created Track page*/
						 cardLayout.show( TrackView.cards, TrackView.TRACKPAGE);	

					}
				});
			add(buttons.get(i), gbc);
//				System.out.println("Clicke on select track "+ i);
			}
		}

	}
}