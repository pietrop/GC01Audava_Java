package jComponents;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Pages.TrackView;

/**
 * The <code>MenuBar</code> class provides basic navigation for the 
 * AuJava application and is a common component on every page of the app.
 * 
 * @author Axel
 * @version 15/11/2014
 */
public class MenuBar extends JMenuBar{	
	
	private static String username = "Username"; 
	
	/**
	 * define card layout local var, calling tack view card layout
	 */
	private static CardLayout cardLayout = (CardLayout) TrackView.cards.getLayout();
	
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
		
		JMenuItem audava = new JMenuItem("AUDAVA");
		JMenuItem record = new JMenuItem("Record");
		JMenuItem tracks = new JMenuItem("Tracks");
		JMenuItem aboutUs = new JMenuItem("AboutUs");
   
		this.add(audava);
		this.add(record);
		this.add(tracks);
		this.add(aboutUs);
	

		record.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				/* changes the card layout */
		        cardLayout.show( TrackView.cards, TrackView.RECORDPAGE);
		        System.out.println("pressed record button in menu bar");//console troubleshooting
			} 
		});
		
		tracks.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				/* changes the card layout */
		        cardLayout.show( TrackView.cards, TrackView.TRACKSPAGE);
		        System.out.println("pressed track button in menu bar");//console troubleshooting
			} 
		});	
		
		
		audava.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				/* changes the card layout */
		        cardLayout.show( TrackView.cards, TrackView.HOMEPAGE);	
			} 
			});	
		
		aboutUs.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
		        cardLayout.show( TrackView.cards, TrackView.ABOUTUSPAGE);	
			} 
		});
		
	}
	
}