package AlbumHierarchy;

/**
 * 
 * @author SamiStart
 *
 */
public class Track extends AlbumOrTrack {

	private String audioFileLocation;

	public Track(String ttl, String dsc, String pic, String aud) {
		super(ttl, dsc, pic);
		this.audioFileLocation = aud;
	}

	public String getaudioFileLocation() {
		return audioFileLocation;
	}

	public void setaudioFileLocation(String audioFileLocation) {
		this.audioFileLocation = audioFileLocation;
	}

}
