package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

import AlbumHierarchy.Track;

/**
 * {@link}
 * http://www.lynda.com/Java-tutorials/Adding-data-elements-attributes-DOM/
 * 
 * @author SamiStart
 *
 */
public class TrackCreateXMLWithDOM {
	

	public static void createXmlAllTracks(ArrayList<Track> allTracks)
			throws ParserConfigurationException, TransformerException,
			FileNotFoundException {

		TrackDOMCreator creator = new TrackDOMCreator();
		Document doc = creator.createXMLDoc(allTracks);

		String xmlString = outputToString(doc);
		
		outputAsFile(doc, Track.TRACKFILE );

	}

	private static void outputAsFile(Document doc, String filename) throws TransformerConfigurationException, TransformerException, TransformerFactoryConfigurationError {
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File(filename));
		getTransformer().transform(source, result);

	}

	private static String outputToString(Document doc)
			throws TransformerFactoryConfigurationError,
			TransformerConfigurationException, TransformerException {
		DOMSource source = new DOMSource(doc);
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		Transformer transformer = getTransformer();

		transformer.transform(source, result);
		String xmlString = writer.toString();

		System.out.println(xmlString);
		return xmlString;
	}

	private static Transformer getTransformer()
			throws TransformerFactoryConfigurationError,
			TransformerConfigurationException {
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();

		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(
				"{http://xml.apache.org/xslt}indent-amount", "2");
		return transformer;
	}

}
