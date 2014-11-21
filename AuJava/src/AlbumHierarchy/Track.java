	package AlbumHierarchy;

/**
 * 
 * @author SamiStart
 *
 */
public class Track extends AlbumOrTrack {

	private String audioFileLocation;
	private String albumTitle;

	public Track() {
		super();
		this.audioFileLocation = "default constructor audio location";
	}

	public Track(String ttl, String dsc, String pic, String aud) {
		super(ttl, dsc, pic);
		this.audioFileLocation = aud;
	}

	public String getAudioFileLocation() {
		return audioFileLocation;
	}

	public void setAudioFileLocation(String audioFileLocation) {
		this.audioFileLocation = audioFileLocation;
	}

	private void delete() {
		// TODO Auto-generated method stub

	}

	public String getAlbumTitle() {
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}

}
