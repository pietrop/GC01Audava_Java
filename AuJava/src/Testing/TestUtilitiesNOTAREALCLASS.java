package Testing;

import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import AlbumHierarchy.Album;
import AlbumHierarchy.Track;


/**
 * For testing the XML parser and writer
 * @author SamiStart
 *
 */
public class TestUtilitiesNOTAREALCLASS {

	public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, TransformerException {
		
		Track.loadTracks();
		Album.loadAlbums();
		
		
			Track track = new Track();
		
		Album.saveAlbums();
		

	}
}
	
	