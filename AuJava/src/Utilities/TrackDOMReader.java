package Utilities;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import AlbumHierarchy.Track;


/**
 * 
 * @author SamiStart
 *
 */
public class TrackDOMReader {
	
	private static final String XMLDATEFORMAT = "yyyy-MM-dd'T'HH:mm:ss";

	public ArrayList<Track> getDataFromXML() {
		
		ArrayList<Track> data = new ArrayList<>();
		
		File xmlFile = new File(Track.TRACKFILE);
		Document doc = null;
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			doc = builder.parse(xmlFile);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Element root = doc.getDocumentElement();
//		System.out.println(root.getNodeName());
		
		NodeList list = doc.getElementsByTagName("track");
		System.out.println("Nodes found: "+ list.getLength());
		
		for (int i = 0; i < list.getLength(); i++) {
			Track track = new Track();
			data.add(track);
			
			Element albElement = (Element) list.item(i);
			String idAsString = albElement.getAttribute(Track.ID);
			System.out.println("id found to be " + Integer.parseInt(idAsString));
			track.setId(Integer.parseInt(idAsString));
			String content = getTextFromElement(albElement,Track.TITLE);
			track.setTitle(content);
			content = getTextFromElement(albElement, Track.DESCRIPTION);
			track.setDescription(content);
			content = getTextFromElement(albElement, Track.PICLOCATION);
			track.setPicFileLocation(content);
			content = getTextFromElement(albElement, Track.AUDIOLOCATION);
			track.setAudioFileLocation(content);
			
			String added = getTextFromElement(albElement, Track.ADDED);
			try {
				track.setAdded(new SimpleDateFormat(XMLDATEFORMAT).parse(added));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return data;	
	}

	private String getTextFromElement(Element albElement, String elementName) {
		Element node = (Element) albElement.getElementsByTagName(elementName).item(0);
		String content = node.getTextContent();
		return content;
	}

}