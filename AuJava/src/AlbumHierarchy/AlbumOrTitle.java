package AlbumHierarchy;

/**
 * This is an abstract class to hold the common members for albums and tracks.
 * Albums and tracks should extend this class.
 * @author SamiStart
 */
public abstract class AlbumOrTitle {
	private String title;
	private String description;

	public AlbumOrTitle() {
		this.title = "default track title";
		this.description = "";

	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
}
