package AlbumHierarchy;

import java.io.IOException;
import java.util.ArrayList;

import Utilities.AlbumReadWrite;

/**
 * 
 * @author SamiStart
 *
 */
public class Album extends AlbumOrTrack {

	public Album() {
		super();
<<<<<<< HEAD
		appendAlbum(this);
=======
		allAlbums.add(this);
		Utilities.AlbumReadWrite.appendAlbum(this);
>>>>>>> 6a602a693a63935d8d020e0c3a769d2171194625
	}

	public Album(String ttl, String dsc, String pic) {
		super(ttl, dsc, pic);
<<<<<<< HEAD
		appendAlbum(this);
=======
		allAlbums.add(this);
		Utilities.AlbumReadWrite.appendAlbum(this);
>>>>>>> 6a602a693a63935d8d020e0c3a769d2171194625
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

	public static ArrayList<Album> getAllAlbums() {
//		try {
//			allAlbums = AlbumReadWrite.returnAllAlbums();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return allAlbums;
	}

	public static Album getAlbum(int index) {
<<<<<<< HEAD
//		try {
//			allAlbums = AlbumReadWrite.returnAllAlbums();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		return allAlbums.get(index);
	}

	private void appendAlbum(Album album) {
		allAlbums.add(album);

//		AlbumReadWrite.appendAlbum(album);

	}
=======
		try {
			allAlbums = AlbumReadWrite.returnAllAlbums();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return allAlbums.get(index);
	}

>>>>>>> 6a602a693a63935d8d020e0c3a769d2171194625

	public void delete(Album album) {

	}

}
