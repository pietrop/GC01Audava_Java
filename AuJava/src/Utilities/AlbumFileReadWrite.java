package Utilities;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

	private static Album returnSpecificAlbum(String title) throws IOException {

		FileReader fR = new FileReader(ALBUMFILEPATH);
		BufferedReader textReader = new BufferedReader(fR);

		String[] testString;
		Album album;
		do {
			testString = textReader.readLine().split(TAB);
			album = new Album(testString[0], testString[1], testString[2]);
		} while (testString[0] != title);
		

		textReader.close();
		fR.close();

		return album;
	}

	public static ArrayList<Album> readAllAlbums() throws IOException {
		ArrayList<Album> albums = new ArrayList<Album>();

		FileReader fR = new FileReader(ALBUMFILEPATH);
		BufferedReader textReader = new BufferedReader(fR);

		String[] testString;

		try {
			testString = textReader.readLine().split(TAB);
			do {
				albums.add(new Album(testString[0], testString[1],
						testString[2]));
				testString = textReader.readLine().split(TAB);

			} while (testString[0] != "");

		} catch (Exception e) {
			e.printStackTrace();
		}

		textReader.close();
		fR.close();

		return albums;

	}

}
