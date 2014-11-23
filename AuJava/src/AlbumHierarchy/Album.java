package AlbumHierarchy;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import Utilities.AlbumCreateXMLWithDOM;
import Utilities.AlbumDOMReader;

/**
 * 
 * @author SamiStart
 *
 */
public class Album extends AlbumOrTrack {

	public static final String ALBUMFILE = "db/albums.txt";

	private static ArrayList<Album> allAlbums = new ArrayList<Album>();
	private ArrayList<Track> tracksInAlbum = new ArrayList<Track>();
	private int id;

	public Album() {
		super();
		this.id = allAlbums.size();
		allAlbums.add(this);
		for (int i = 0; i < Track.getAllTracks().size(); i++) {
			if (Track.getTrack(i).getAlbumId()==this.id) {
				tracksInAlbum.add(Track.getTrack(i));
			}
		}
	}

	public Album(String ttl, String dsc, String pic) {
		super(ttl, dsc, pic);
		this.id = allAlbums.size();
		allAlbums.add(this);
		for (int i = 0; i < Track.getAllTracks().size(); i++) {
			if (Track.getTrack(i).getAlbumId()==this.id) {
				tracksInAlbum.add(Track.getTrack(i));
			}
		}
	}

	static public ArrayList<Album> loadAlbums() {
		AlbumDOMReader reader = new AlbumDOMReader();
		return reader.getDataFromXML();
	}

	static public void saveAlbums() {
		try {
			AlbumCreateXMLWithDOM.createXmlAllAlbums(allAlbums);
		} catch (FileNotFoundException | ParserConfigurationException
				| TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Append a track to the end of the ArrayList of tracks held in this album
	 * 
	 * @param track
	 */
	public void addTrack(Track track) {
		tracksInAlbum.add(track);
	}

	/**
	 * 
	 * @param index
	 *            the index of the ArrayList of tracks for this album that you
	 *            want to access (starts at 0!)
	 * @return Track
	 * 
	 */
	public Track getTrackAt(int index) {
		// TODO get tracks from database
		return tracksInAlbum.get(index);
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Track> getTracks() {
		// TODO get tracks from database
		return tracksInAlbum;
	}

	/**
	 * 
	 * @return Arraylist<Album> all currently stored albums.
	 */
	public static ArrayList<Album> getAllAlbums() {

		return allAlbums;
	}

	/**
	 * 
	 * @param index
	 * @return Album at specified position in ArrayList
	 */
	public static Album getAlbum(int index) {

		return allAlbums.get(index);
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void delete(Album album) {

	}
	
	public static void setAllAlbums(ArrayList<Album> allAlbums) {
		Album.allAlbums = allAlbums;
	}

}