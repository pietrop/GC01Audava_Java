package Testing;

import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import Utilities.CreateXMLWithDOM;
import AlbumHierarchy.Album;


/**
 * 
 * @author SamiStart
 *
 */
public class TestUtilitiesNOTAREALCLASS {

	public static void main(String[] args) throws FileNotFoundException, ParserConfigurationException, TransformerException {
		
		for (int i = 0; i < 10; i++) {

			new Album();

		}

		CreateXMLWithDOM.createXmlAllAlbums(Album.getAllAlbums());

	}
}
	
	