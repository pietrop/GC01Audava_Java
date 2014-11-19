import javax.swing.JFrame;

import Pages.AboutUsPage;
import Pages.AlbumsPage;
import Pages.HomePage;
import Pages.RecordPage;
import Pages.ShareTrack;

/**
 * @author: Pietro 
 * 
 */

public class Controller {

	public static final int PAGE_WIDTH = 700;
	public static final int PAGE_HEIGHT = 600;
	
	public static void main(String[] args) {
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
		RecordPage recordPage = new RecordPage();// create JFrame window(?)
		recordPage.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		recordPage.setSize( PAGE_WIDTH, PAGE_HEIGHT );
		recordPage.setVisible( true ); 
		recordPage.setResizable(true);
		
		
	}

}
