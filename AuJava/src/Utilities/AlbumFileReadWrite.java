package Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import AlbumHierarchy.Album;

public class AlbumFileReadWrite {

	private static final String ALBUMFILEPATH = "/Users/SamiStart/Desktop/blog.txt";

	private final static String TAB = "\t";

	public static void appendAlbum(String title, String description,
			String picLocation) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter(ALBUMFILEPATH, true)))) {
			out.println(title + TAB + description + TAB + picLocation);
			out.flush();
			out.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	/**
	 * Returns a specific album that you choose by it's title. If the album does
	 * not exist an album with all fields equal to 'album not found" will be
	 * returned and an error message printed to console.
	 * 
	 * @param title
	 *            Title of the album that you want to return (case-insensitive)
	 * @return
	 * @throws IOException
	 */
	public static Album returnAlbum(String title) throws IOException {

		FileReader fR = new FileReader(ALBUMFILEPATH);
		BufferedReader textReader = new BufferedReader(fR);

		String[] testStrings = new String[getNumberOfFields()];
		Album album = new Album("album not found", "album not found",
				"album not found");
		String testString = textReader.readLine();
		// TODO make something to flag up when the database is empty
		while (testString != null) {

			testStrings = testString.split(TAB);

			if (testStrings[0].equalsIgnoreCase(title)) {

				textReader.close();
				fR.close();

				album.setTitle(testStrings[0]);
				album.setDescription(testStrings[1]);
				album.setPicFileLocation(testStrings[2]);
				return album;
			}

			testString = textReader.readLine();

		}

		System.err.println("album not found");
		return album;

	}

	private static int getNumberOfFields() throws IOException {
		int numberOfFields;

		FileReader fR = new FileReader(ALBUMFILEPATH);
		BufferedReader textReader = new BufferedReader(fR);

		numberOfFields = textReader.readLine().split(TAB).length;

		textReader.close();
		fR.close();

		return numberOfFields;

	}

}
