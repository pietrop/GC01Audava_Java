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
import Pages.AboutUsPage;
import Pages.AlbumsPage;
import Pages.HomePage;
import Pages.RecordPage;
import Pages.ShareTrack;
import Pages.UploadPage;

/**
 * @author: Pietro 
 * 
 */

public class Controller {
		final static String HOMEPANEL = "AuJava";
	    final static String ABOUTUSPANEL = "About Us";
	    final static String RECORDPAGE = "Record";
	    final static String UPLOADPAGE = "Upload";//
	    final static String ALBUMSPAGE = "Albums";//
	    
	    
	    final static int extraWindowWidth = 700 ;
	    final static int extraWindowHeight = 600;

	    public void addComponentToPane(Container pane) {
	        JTabbedPane tabbedPaneMenu = new JTabbedPane();
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
	        
	        /* Record Page */
	        RecordPage recordCard = new RecordPage() 
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
	        
	        
//	        JComponent uplaodCard = makeTextPanel("Panel #2");//
	        
	        /*Upload Page*/   
	        UploadPage uplaodCard = new UploadPage();
	        
	        /*Albums Page*/
	        AlbumsPage albumsCard = new AlbumsPage();
//	      

	        
	        
	        /* Adding Cards to the Tabs*/
	        tabbedPaneMenu.addTab(HOMEPANEL, homeCard);
	       
	        tabbedPaneMenu.addTab( RECORDPAGE, recordCard);
	        tabbedPaneMenu.addTab( UPLOADPAGE, uplaodCard);//
	        tabbedPaneMenu.addTab( ALBUMSPAGE, albumsCard);//
	        tabbedPaneMenu.addTab(ABOUTUSPANEL, aboutUsCard);
	        /*adding the main one */
	        pane.add(tabbedPaneMenu, BorderLayout.CENTER);
	    }//end addComponent To pane

	    /**
		 * @param string
		 * @return
		 */
		private JComponent makeTextPanel(String string) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event dispatch thread.
	     */
	    private static void createAndShowGUI() {
	    	JFrame frame = new JFrame("AuJava - Demo");
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	    	
	    	Controller demoAuJava = new Controller();
//	    	TabDemo demoAuJava = new TabDemo();
	    	demoAuJava.addComponentToPane(frame.getContentPane());
	         //Display the window.
	         frame.pack();
	         frame.setVisible(true);
	         
	    }//end create and show GUI
	    
	    
	        
	public static void main(String[] args) {
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
        
//        Album defaultStoryAlbum = new Album("Default Story Album Title", "Default Story Album Description", "duke-java.png");
//    	allAlbums.add(defaultStoryAlbum);
    	
    	
		//		createAndShowGUI();	

		//testing album page

		//		AlbumsPage albumsPage = new AlbumsPage();// create JFrame window(?)
		//		albumsPage.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//		albumsPage.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		//		albumsPage.setVisible( true ); 
		//		albumsPage.setResizable(true);

		//		//testing home page

		//		HomePage home = new HomePage();// create JFrame window(?)
		//		home.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//		home.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		//		home.setVisible( true ); 
		//		home.setResizable(true);

		//testing about us page
		//		AboutUsPage aboutUsPage = new AboutUsPage();// create JFrame window(?)
		//		aboutUsPage.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//		aboutUsPage.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		//		aboutUsPage.setVisible( true ); 
		//		aboutUsPage.setResizable(true);


		//		//ShareTrack		
		//		ShareTrack shareTrack = new ShareTrack();// create JFrame window(?)
		//		shareTrack.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//		shareTrack.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		//		shareTrack.setVisible( true ); 
		//		shareTrack.setResizable(true);

		//		//RecordPage		
		//		RecordPage recordPage = new RecordPage();// create JFrame window(?)
		//		recordPage.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		//		recordPage.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		//		recordPage.setVisible( true ); 
		//		recordPage.setResizable(true);


	}

}
