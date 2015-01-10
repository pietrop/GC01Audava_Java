package Pages;
import jComponents.TrackListPanel;

import java.util.ArrayList;

import javax.swing.JLabel;

import AlbumHierarchy.Track;
/**
 * <code>TrackSPage</code> lists all the tracks and displays them in tracks page.
 * @author Pietro Passarelli 
 *
 */
public class TrackSPage extends Page{
	
	/**
	 * Default constructor, calling <code>showTracks</code> on array list of Tracks.
	 * @param TracksArrayList
	 */
	public TrackSPage(ArrayList<Track> TracksArrayList) {
		setLayout(null);
		
		showTracks(TracksArrayList);
	}
	
	/**
	 * Default constructor overloading for when there are no recordings being passed. 
	 * 
	 */
	public TrackSPage() {
	setLayout(null);
	/**
	 * If database already has tracks then it shows them
	 */
	if (Track.getAllTracks().size()==0){
		JLabel lbltracks = new JLabel("<html><h1>Tracks</h1></html>");
		lbltracks.setBounds(304, 6, 95, 26);
		add(lbltracks);
		
		JLabel lblYouDontHave = new JLabel("You don't have any Tracks yet, click the Record Page to create some.");
		lblYouDontHave.setBounds(149, 44, 439, 264);
		add(lblYouDontHave);
	}
	else {
		showTracks(Track.getAllTracks());
	}
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	 * @param TracksArrayList
	 */
	private void showTracks(ArrayList<Track> TracksArrayList) {
		TrackListPanel tracksPane = new TrackListPanel();
		tracksPane.setBounds(149, 44, 439, 264);
		add(tracksPane);
	}
}
