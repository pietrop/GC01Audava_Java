package AlbumHierarchy;

import java.util.ArrayList;

public class Album extends AlbumOrTitle {

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
