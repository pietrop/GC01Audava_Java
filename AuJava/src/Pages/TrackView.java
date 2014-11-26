package Pages;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import jComponents.MenuBar;

public class TrackView extends JPanel {
	
	public static JPanel cards;
	public static CardLayout cardLayout;
	public static JPanel containerPanel = new JPanel();
	/*declaring var Strings to name the cards */
	public final static String HOMEPAGE = "AuJava";
	public final static String ABOUTUSPAGE = "About Us";
	public final static String RECORDPAGE = "Record";
	public final static String TRACKSPAGE = "Tracks";
	public final static String TRACKPAGE = "Track";
    
    /*declaring var width of the app */
    final static int extraWindowWidth = 700 ;
    final static int extraWindowHeight = 600;
   
    /* creating cards of pages  */
    public static Component addComponentToPane(Container pane) {
       
    	cards = new JPanel();
    	cards.setLayout(new CardLayout());
    	
        /* Home Page*/
        HomePage homeCard = new HomePage() 
        {
            //Make the panel wider than it really needs, so
            //the window's wide enough for the tabs to stay
            //in one row.
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                size.height += extraWindowHeight;
                return size;
            }
        };
        /* about us page*/
        AboutUsPage aboutUsCard = new AboutUsPage() 
        {
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                size.height += extraWindowHeight;
                return size;
            }
        };
        
        /* Record Page */
        RecordPage recordCard = new RecordPage() 
        {
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += extraWindowWidth;
                size.height += extraWindowHeight;
                return size;
            }
        };
        
  

      /*Track page*/
        //Individual Track Page created from record page, when stop button is pressed
        //individual track page also create from tracks page where list of tracks are when individual track is pressed.
//        Track aNewTrack = new Track("audio/AuJava.wav");//test track
//        TrackPage trackCard = new TrackPage(aNewTrack.getTitle(),aNewTrack.getDescription(), aNewTrack.getImg(), aNewTrack.getAudioWithAudioPath() );

        
        /*Tracks page*/
        TrackSPage tracksCard = new TrackSPage();
        
        /*add to cards*/
        
        cards.add(HOMEPAGE, homeCard);
        cards.add( RECORDPAGE, recordCard);
        cards.add(TRACKSPAGE, tracksCard);
        cards.add(ABOUTUSPAGE, aboutUsCard);
        
        /*adding cards from card layout to centre element of panel*/
        pane.add(cards);
        pane.setVisible(true);
        
       
        /*card layout showing home page*/
        CardLayout cardLayout = (CardLayout) cards.getLayout();
        cardLayout.show(cards, HOMEPAGE);
		return pane;
        
    }//end addComponent To pane

	/**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI() {
    	JFrame frame = new JFrame("AuJava - Demo");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	addComponentToPane(containerPanel);
    	frame.add(containerPanel);
    	 /*adding menu bar, to north element of panel*/
        MenuBar menu = new MenuBar();
        frame.add(menu, BorderLayout.NORTH);
         //Display the window.
         frame.pack();
         frame.setVisible(true);        
    }//end create and show GUI
    	        



}
