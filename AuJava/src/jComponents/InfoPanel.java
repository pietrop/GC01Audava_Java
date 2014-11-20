package jComponents;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Reuseable InfoPanel for AlbumsPage and Track Page
 * 
 * @author Axel
 * @version 20 Nov 2014
 */
public class InfoPanel extends JPanel {
	
	private String titel = "";
	private String description = "";
	private String imgLocation = "";
		
	InfoPanel () {
		this("empty", "empty", "empty");
	}
	
	InfoPanel(String titel, String desc, String imgLoc) {
		this.titel = titel;
		this.description = desc;
		this.imgLocation = imgLoc;
		populate();
	}
	
	private void populate () {
		add(new JLabel(titel));
		add(new JLabel(description));
		add(new JLabel(imgLocation));
	}
	
}
