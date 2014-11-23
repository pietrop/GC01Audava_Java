package AlbumHierarchy;

import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author SamiStart
 *
 */
public class Album extends AlbumOrTrack {

	private int id;

	public Album() {
		super();
		this.id = allAlbums.size();
		allAlbums.add(this);
	}

	public Album(String ttl, String dsc, String pic) {
		super(ttl, dsc, pic);
		this.id = allAlbums.size();
		allAlbums.add(this);
	}

	/**
	 * A static ArrayList of all the albums (this only works for one user)
	 */
	private static ArrayList<Album> allAlbums = new ArrayList<Album>();

	private ArrayList<Track> tracksInAlbum = new ArrayList<Track>();

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

}