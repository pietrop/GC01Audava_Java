package Pages;

import AlbumHierarchy.Track;
import jComponents.InfoPanel;
import jComponents.PictureLabel;

import javax.sound.sampled.Clip;
import javax.swing.JPanel;

import sound.AudioPlayer;

/**
 * Track page to display track information and enable playback.
 * 
 * @author Axel
 * @version 22 Nov 2014
 */
public class TrackPage extends Page {
	
	public TrackPage(Track track) {
		this.setLayout(null);

		InfoPanel infoPanel = new InfoPanel(track.getTitle(), track.getDescription(), track.getPicFileLocation());
		infoPanel.setBounds(200, 23, 480, 282);
		add(infoPanel);
		
		AudioPlayer ap = new AudioPlayer(track.getAudioFileLocation()); 
		ap.setLocation(0,300);
		this.add(ap);
	}
		
		/* need a substitute for this */
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
