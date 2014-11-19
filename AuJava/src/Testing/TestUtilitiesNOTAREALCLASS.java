package Testing;

import java.io.IOException;

import AlbumHierarchy.Album;
import Utilities.AlbumFileReadWrite;

/**
 * 
 * @author SamiStart
 *
 */
public class TestUtilitiesNOTAREALCLASS {

	public static void main(String[] args) {

		Album albm = new Album();

		try {
			albm = AlbumFileReadWrite.returnAlbum("e");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(albm.getTitle() + '\t' + albm.getDescription()
				+ '\t' + albm.getPicFileLocation());

	}
}
