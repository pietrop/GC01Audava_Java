package Utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.CDATASection;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import AlbumHierarchy.Album;
import AlbumHierarchy.Track;

/**
 * {@link}
 * http://www.lynda.com/Java-tutorials/Adding-data-elements-attributes-DOM/
 * 
 * @author SamiStart
 *
 */
public class TrackDOMCreator {

	@SuppressWarnings("unused")
	private static final String XMLDATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss";

	Document doc = null;

	public TrackDOMCreator() {
	}

	public Document createXMLDoc(List<Track> data)
			throws ParserConfigurationException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		doc = builder.newDocument();

		Element root = doc.createElement("albums");
		doc.appendChild(root);

		for (Track track : data) {
			Element albumElement = addElement(root, "track", "");
			String idAsString = Integer.toString(track.getId());
			albumElement.setAttribute(Track.ID, idAsString);

			addElement(albumElement, Track.TITLE, track.getTitle());

			addElement(albumElement, Track.ALBUMID,
					Integer.toString(track.getId()));

			Element description = addElement(albumElement, Album.DESCRIPTION,
					"");
			CDATASection cdata = doc.createCDATASection(track.getDescription());
			addElement(albumElement, Album.PICLOCATION,
					track.getPicFileLocation());
			description.appendChild(cdata);

			DateFormat df = new SimpleDateFormat(XMLDATEFORMAT);
			addElement(albumElement, Track.ADDED, df.format(track.getAdded()));

		}

		return doc;
	}

	private Element addElement(Element parent, String elementName,
			String textValue) {
		Element childElement = doc.createElement(elementName);
		childElement.setTextContent(textValue);
		parent.appendChild(childElement);
		return childElement;
	}

}
