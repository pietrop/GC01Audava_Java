package Utilities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import AlbumHierarchy.Track;

/**
 * Basic HTMlExport class to enable exporting/sharing of individual tracks.
 * 
 * @author Axel
 * @version 24 Nov 2014
 */
public class HTMLExport {
	
	public static void export (Track track) {
		
		BufferedWriter writer = null;
		String filepath = System.getProperty("user.home") + "/Desktop/" + track.getTitle() + ".html" ;
		
		File file = new File(filepath);
		try {
			if (file.createNewFile()){
				System.out.println("File was created.");
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(filepath));
			writer.write(
						"<!DOCTYPE HTML>"
				+"\n"+	"<html>"
				+"\n"+	"<head>\n  <title>" + track.getTitle() + "</title>\n</head>"
				+"\n"+	"<body>"
				//+"\n"+	"  <h3>Album: " + track.getAlbumId() + "</h3>"
				+"\n"+	"  <h1>Track Title: " + track.getTitle() + "</h1>"
				+"\n"+	"  <p>"
				+"\n"+	"    Description:\n" + track.getDescription()
				+"\n"+	"  </p>"
				+"\n"+	"  <p>"
				+"\n"+	"    Image: " + track.getPicFileLocation()
				+"\n"+	"  </p>"
				+"\n"+	"  <p>"
				+"\n"+	"    File Location: " + track.getAudioFileLocation()
				+"\n"+	"  </p>"
				+"\n"+	"</body>"
				+"\n"+	"</html>"
			);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace(); 
			System.err.println(e);
		}
		
	}
	
}
