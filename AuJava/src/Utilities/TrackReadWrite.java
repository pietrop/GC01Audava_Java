package Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import AlbumHierarchy.Track;

/**
 * 
 * @author SamiStart
 *
 */
public class TrackReadWrite extends ReadWriteUtilities{

	private static final String FILEPATH = "db/tracks.txt";

	public static void appendtrack(String title, String description,
			String picLocation, String audioLocation) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter(FILEPATH, true)))) {
			out.println(title + TAB + description + TAB + picLocation+ TAB + audioLocation);
			out.flush();
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	
	/**
	 * Returns a specific track that you choose by it's title. If the track does
	 * not exist an track with all fields equal to 'track not found" will be
	 * returned and an error message printed to console.
	 * 
	 * @param title
	 *            Title of the track that you want to return (case-insensitive)
	 * @return
	 * @throws IOException
	 */
	public static Track returntrack(String title) throws IOException {

		FileReader fR = new FileReader(FILEPATH);
		BufferedReader textReader = new BufferedReader(fR);

		String[] testStrings = new String[getNumberOfFields(FILEPATH)];
		Track track = new Track("track not found", "track not found",
				"track not found", "track not found");
		String testString = textReader.readLine();
		// TODO make something to flag up when the database is empty
		while (testString != null) {

			testStrings = testString.split(TAB);

			if (testStrings[0].equalsIgnoreCase(title)) {

				textReader.close();
				fR.close();

				track.setTitle(testStrings[0]);
				track.setDescription(testStrings[1]);
				track.setPicFileLocation(testStrings[2]);
				track.setAudioFileLocation(testStrings[3]);
				return track;
			}

			testString = textReader.readLine();

		}

		System.err.println("track not found");
		return track;

	}


}
