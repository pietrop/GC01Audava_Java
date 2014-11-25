package Utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Basic HTML file to String reader. 
 * 
 * @author Axel
 * @version 25 Nov 2014
 */
public class HTMLReader {
	
	public static String read (String filepath) {
		
		String fileContent = "";
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filepath));
			String line = "";
			while ( (line = reader.readLine()) != null ) {
				line += "\n";
				fileContent += line;
			}
			reader.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return fileContent;
		
	}
	
}
