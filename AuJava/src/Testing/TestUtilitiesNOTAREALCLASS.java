package Testing;

import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import AlbumHierarchy.Album;
import AlbumHierarchy.Track;


/**
 * 
 * @author SamiStart
 *
 */
public class TestUtilitiesNOTAREALCLASS {

	public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, TransformerException {
		
		
		for (int i = 0; i < Album.getAllAlbums().size(); i++) {
			Track track = new Track();
		}
		
		Track.saveTracks();
		

	}
}
	
	