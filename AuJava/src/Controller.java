import jComponents.MenuBar;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import AlbumHierarchy.Album;
import AlbumHierarchy.Track;
import Pages.AboutUsPage;
import Pages.AlbumsPage;
import Pages.HomePage;
import Pages.RecordPage;
import Pages.ShareTrack;
import Pages.TrackPage;
import Pages.UploadPage;

/**
 * @author: Pietro 
 * 
 */

public class Controller {
	
		/*declaring var Strings to name the cards */
		final static String HOMEPANEL = "AuJava";
	    final static String ABOUTUSPANEL = "About Us";
	    final static String RECORDPAGE = "Record";
	    final static String UPLOADPAGE = "Upload";//
	    final static String ALBUMSPAGE = "Albums";//
	    final static String TRACKPAGE = "Track";
	    
	    /*declaring var width of the app */
	    final static int extraWindowWidth = 700 ;
	    final static int extraWindowHeight = 600;
	    
	    /* initialised tabbed menu */
	    static JTabbedPane tabbedPaneMenu = new JTabbedPane();

	    /* creating cards of pages and add them to the tabbedPaneMenu */
	    public void addComponentToPane(Container pane) {
	       
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
	        
	        /*Upload Page*/   
	        UploadPage uploadCard = new UploadPage();
	        
	        /*Albums Page*/
	        AlbumsPage albumsCard = new AlbumsPage();

	        /*Track page*/
//	        TrackPage trackCard = new TrackPage();

        
	        /* Adding Cards to the Tabs*/
	        tabbedPaneMenu.addTab(HOMEPANEL, homeCard);
	        tabbedPaneMenu.addTab( RECORDPAGE, recordCard);
	        tabbedPaneMenu.addTab( UPLOADPAGE, uploadCard);//
	        tabbedPaneMenu.addTab( ALBUMSPAGE, albumsCard);//
//	        tabbedPaneMenu.addTab(TRACKPAGE, trackCard);
	        tabbedPaneMenu.addTab(ABOUTUSPANEL, aboutUsCard);
	        
	        /*adding the main one */
	        pane.add(tabbedPaneMenu, BorderLayout.CENTER);
	    }//end addComponent To pane

		/**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event dispatch thread.
	     */
	    private static void createAndShowGUI() {
	    	JFrame frame = new JFrame("AuJava - Demo");
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    	Controller demoAuJava = new Controller();
	    	demoAuJava.addComponentToPane(frame.getContentPane());
	         //Display the window.
	         frame.pack();
	         frame.setVisible(true);        
	    }//end create and show GUI
	    	        
	public static void main(String[] args) {

		createDefaultStoryAlbum();

		 /* Use an appropriate Look and Feel */
        try {
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            		createAndShowGUI();
            }
        });
        
  
	}//end of main method

	
	/**
	 * create default story album at runtime
	 */
	private static void createDefaultStoryAlbum() {
		Album defaultStoryAlbum = new Album("Default Story Album 1", "A default album for your tracks1","img/Album.png");
	}

}
