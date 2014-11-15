
import java.awt.BorderLayout;
import JPanels.AlbumInfoPanel;
import JPanels.AlbumsSideBar;


public class AlbumPage extends Page{
	String albumDescription = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer sed felis tincidunt, iaculis quam in, luctus arcu. \n Interdum et malesuada fames ac ante ipsum primis in faucibus. \n Vestibulum pretium quam vitae lacinia venenatis. Nunc turpis ex, dictum nec turpis ut, fringilla consectetur nisl.\n Fusce vitae ex tempus, sodales enim et, luctus elit. Nullam enim ante, feugiat a velit at, iaculis dictum ligula. Aliquam sit amet aliquet quam. Ut a laoreet erat, vitae pretium nisi. \nDuis ac ultricies augue. Nulla ultrices turpis erat, interdum cursus nunc finibus vitae. Nam sed turpis nec lectus fringilla pretium vel in ex. In hendrerit dui eget lectus fermentum gravida. In purus purus, maximus sed egestas mollis, venenatis in lectus. Etiam felis metus, maximus at sapien ac, vulputate vestibulum orci. \n Nunc at neque a velit ornare porttitor eget ut sapien. Integer in aliquam tellus. Aenean consequat, elit vel laoreet iaculis, ipsum mi rhoncus dolor, at tempor urna nulla ac dui. Proin faucibus lacinia lectus. Sed iaculis massa arcu, eu consequat elit scelerisque id. Integer iaculis condimentum est, eget vulputate tellus pulvinar at. Etiam in arcu pharetra, imperdiet elit a, gravida nunc. Etiam in turpis elit. Sed quis quam neque.";
	AlbumInfoPanel myAlbumInfoPanel= new AlbumInfoPanel("Test title", albumDescription);
	AlbumsSideBar myAlbumsSideBar = new AlbumsSideBar();
	public AlbumPage(){

		setLayout(new BorderLayout());
		getContentPane().add(myAlbumInfoPanel, BorderLayout.CENTER);
		
		getContentPane().add(myAlbumsSideBar, BorderLayout.WEST);

	}
	
	
	
}
