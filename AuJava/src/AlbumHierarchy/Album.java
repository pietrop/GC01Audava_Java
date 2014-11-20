package AlbumHierarchy;

import java.io.IOException;
import java.util.ArrayList;
import jComponents.AlbumsSideBar;
import Utilities.AlbumReadWrite;

public class Album extends AlbumOrTrack {
	
	public Album(){
		super();
	}
	
	public Album(String ttl, String dsc, String pic) {
		super(ttl, dsc, pic);
	}

	/**
	 *A static ArrayList of all the albums (this only works for one user)
	 */
	public static ArrayList<Album> allAlbums = new ArrayList<Album>();

	private ArrayList<Track> tracksInAlbum = new ArrayList<Track>();

	/**
	 * Append a track to the end of the ArrayList of tracks held in this album
	 * @param track
	 */
	public void addTrack(Track track) {
		tracksInAlbum.add(track);
	}
	
	/**
	 * 
	 * @param index 
	 * the index of the ArrayList of tracks for this album that you want to access (starts at 0!)
	 * @return Track
	 * 
	 */
	public Track getTrackAt(int index){
		return tracksInAlbum.get(index);
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<Track> getTracks(){
		return tracksInAlbum;
	}
	
	
}
