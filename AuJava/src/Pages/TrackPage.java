package Pages;

import jComponents.InfoPanel;
import jComponents.PictureLabel;
import javax.sound.sampled.Clip;
import javax.swing.JPanel;
import AlbumHierarchy.Track;
import SoundPlayer.AudioPlayer;


public class TrackPage extends Page {

	public TrackPage() {
		this(null);
	}
	
	public TrackPage(Track track) {
		this.setLayout(null);
		
		//this.add(new InfoPanel("empty", "empty2", "empty3"));
		AudioPlayer ap = new AudioPlayer("TRACK FILE LOCATION AS STRING"); 
		ap.setLocation(0,250);
		this.add(ap);
	}
		
		/* need a substitute for this */
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}