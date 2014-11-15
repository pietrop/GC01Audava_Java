import javax.swing.JFrame;


public class Controller {

	public static void main(String[] args) {
		AlbumPage albumPage = new AlbumPage();// create JFrame window(?)
		albumPage.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		albumPage.setSize( 700, 500 );
		albumPage.setVisible( true ); 
		albumPage.setResizable(true);
	}

}
