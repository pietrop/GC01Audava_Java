package jComponents;

import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * The <code>MenuBar</code> class provides basic navigation for the 
 * AuJava application and is a common component on every page of the app.
 * 
 * @author Axel
 * @version 15/11/2014
 */
public class MenuBar extends JMenuBar {	
	
	private static String username = "Username"; 
	
	/**
	 * Cascading constructor.
	 */
	public MenuBar () {
		this(username);
	}
	/**
	 * Populate the menubar.
	 */
	public MenuBar (String username) {
		
		this.username = username;
		
		JMenu audava = new JMenu("AUDAVA");
		JMenu record = new JMenu("Record");
		JMenu upload = new JMenu("Upload");
		JMenu albums = new JMenu("Albums");
		JMenu aboutUs = new JMenu("AboutUs");
		JMenu account = new JMenu(username);
		
		
		
        
		this.add(audava);
		this.add(record);
		this.add(upload);
		this.add(albums);
		this.add(aboutUs);
		this.add(account);
		
		JMenuItem settings = new JMenuItem("Settings");
		JMenuItem logout = new JMenuItem("Logout");
		
		account.add(settings);
		account.add(logout);
		
	

		
	}
	
}