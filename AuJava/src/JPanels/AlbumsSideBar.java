package JPanels;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JButton;
import AlbumHierarchy.Album;

public class AlbumsSideBar extends JPanel {

	/**
	 * Create the panel.
	 */
	public AlbumsSideBar() {
		setLayout(null);
		
		//one button for each album plus one more for the New Album button
		int buttonCount = Album.allAlbums.size() + 1;
		
		int buttonWidth = this.getWidth();
		int buttonHeight = 40;
		
		ArrayList<JButton> btns = new ArrayList<JButton>();
		
		for (int i = 0; i < buttonCount; i++) {
			btns.add(new JButton(Album.allAlbums.get(i).getTitle()));
			btns.get(i).setBounds(0, buttonHeight*i, buttonWidth, buttonHeight);
			add(btns.get(i));
		}
		
		

	}
}
