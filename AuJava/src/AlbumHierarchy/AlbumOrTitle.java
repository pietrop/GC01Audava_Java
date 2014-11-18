package AlbumHierarchy;

/**
 * This is an abstract class to hold the common members for albums and tracks.
 * Albums and tracks should extend this class.
 * 
 * @author SamiStart
 */
public abstract class AlbumOrTitle {
	private String title;
	private String description;
	private String picFileLocation;

	public AlbumOrTitle(String ttl, String dsc, String pic) {
		this.title = ttl;
		this.description = dsc;
		this.picFileLocation = pic;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPicFileLocation(String picFileLocation) {
		this.picFileLocation = picFileLocation;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getPicFileLocation() {
		return picFileLocation;
	}
}
