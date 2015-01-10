package Pages;

import jComponents.InfoPanel;
import jComponents.TrackListPanel;
import AlbumHierarchy.Album;

/**
 * 
 * @author Pietro Passarelli
 *
 */
public class AlbumsPage extends Page {
	/**
	 * Create the frame.
	 */
	public AlbumsPage() {
		setLayout(null);

		
		String title = Album.getAlbum(0).getTitle().toString();
		String description = Album.getAlbum(0).getDescription().toString();
		String image = Album.getAlbum(0).getPicFileLocation().toString();
		
		InfoPanel infoPanel = new InfoPanel(title, description, image);
		infoPanel.setBounds(200, 23, 480, 282);
		add(infoPanel);
		
		
		TrackListPanel albumSideBar = new TrackListPanel();
		albumSideBar.setBounds(6, 29, 149, 425);
		add(albumSideBar);
	
	}
}
