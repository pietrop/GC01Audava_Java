package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class ReadWriteUtilities {

	protected final static String TAB = "\t";

	/**
	 * 
	 * @param FILEPATH
	 * @return
	 * Returns the number of fields in that database
	 * @throws IOException
	 */
	public static int getNumberOfFields(String FILEPATH) throws IOException {
		int numberOfFields;

		FileReader fR = new FileReader(FILEPATH);
		BufferedReader textReader = new BufferedReader(fR);
		
		String testString = textReader.readLine();
		
		if (testString==null) {
			textReader.close();
			fR.close();
			return 0;
		}

		numberOfFields = testString.split(TAB).length;

		textReader.close();
		fR.close();

		return numberOfFields;

	}
}
