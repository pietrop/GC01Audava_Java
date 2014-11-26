package Pages;
import java.util.ArrayList;

import javax.swing.JLabel;

import jComponents.TrackListPanel;
import AlbumHierarchy.Track;

public class TrackSPage extends Page{
	public TrackSPage(ArrayList<Track> TracksArrayList) {
		setLayout(null);
		
//		JLabel lbltracks = new JLabel("<html><h1>Tracks</h1></html>");
//		lbltracks.setBounds(304, 6, 95, 26);
//		add(lbltracks);
//	
//		DisplayTracks tracksList = new DisplayTracks(TracksArrayList);
//		tracksList.setBounds(65, 52, 550, 529);
//		add(tracksList);
//		
//		JListTracks listOfTracks = new JListTracks();
//		listOfTracks.setBounds(149, 44, 439, 264);
//		add(listOfTracks);
		
		showTracks(TracksArrayList);
	}
	
/**
 * constructor for when there are no recordings
 */
	public TrackSPage() {
	setLayout(null);
	/**
	 * if db already has tracks then show them
	 */
	if (Track.getAllTracks().size()!=0){
		JLabel lbltracks = new JLabel("<html><h1>Tracks</h1></html>");
		lbltracks.setBounds(304, 6, 95, 26);
		add(lbltracks);
		
		JLabel lblYouDontHave = new JLabel("You don't have any Tracks yet, click the Record Page to create some");
		lblYouDontHave.setBounds(149, 44, 439, 264);
		add(lblYouDontHave);
	}
	else {
		showTracks(Track.getAllTracks());
	}
	
	
	
		// TODO Auto-generated constructor stub
	}
	
	private void showTracks(ArrayList<Track> TracksArrayList) {
		TrackListPanel tracksPane = new TrackListPanel();
		tracksPane.setBounds(149, 44, 439, 264);
		add(tracksPane);
		
		 for(Track track : TracksArrayList){
//	        	listModel.addElement(track.toString());
	        	System.out.println(track.toString());
	        }
	}
}
