package AlbumHierarchy;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import Utilities.AlbumCreateXMLWithDOM;
import Utilities.AlbumDOMReader;
import Utilities.TrackCreateXMLWithDOM;
import Utilities.TrackDOMReader;

/**
 * 
 * @author SamiStart
 *
 */
public class Track extends AlbumOrTrack {

	public static final String TRACKFILE = "db/tracks.txt";

	public static final String ALBUMID = "albumid";

	public static final String AUDIOLOCATION = "audiolocation";

	
	private String audioFileLocation;
	private int id;
	private int AlbumId;
	private static ArrayList<Track> allTracks = new ArrayList<Track>();

	public Track() {
		super();
		this.AlbumId=0;
		this.audioFileLocation = "default constructor audio location";
		this.id=allTracks.size();
		allTracks.add(this);
	}

	public Track(String ttl, String dsc, String pic, String aud) {
		super(ttl, dsc, pic);
		this.audioFileLocation = aud;
		this.id=allTracks.size();
		allTracks.add(this);
	}
/*P trying out stuff */
	static String dsc = "A default track description";
	static String pic = "img/Track.png";
	public Track(String outputFilename) {
		super(outputFilename, dsc, pic);
		this.audioFileLocation = outputFilename;
	}
/*end*/
	public String getAudioFileLocation() {
		return audioFileLocation;
	}

	public void setAudioFileLocation(String audioFileLocation) {
		this.audioFileLocation = audioFileLocation;
	}

	public static ArrayList<Track> getAllTracks() {
		return allTracks;
	}

	public static void setAllTracks(ArrayList<Track> allTracks) {
		Track.allTracks = allTracks;
	}
	/**
	 * 
	 * @param index
	 * @return Album at specified position in ArrayList
	 */
	public static Track getTrack(int index) {
		return allTracks.get(index);
	}

	public int getAlbumId() {
		return AlbumId;
	}

	public void setAlbumId(int albumId) {
		AlbumId = albumId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void saveTracks() {
		try {
			TrackCreateXMLWithDOM.createXmlAllTracks(allTracks);
		} catch (FileNotFoundException | ParserConfigurationException
				| TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	static public void loadTracks() {
		TrackDOMReader reader = new TrackDOMReader();
		setAllTracks(reader.getDataFromXML());
	}

}