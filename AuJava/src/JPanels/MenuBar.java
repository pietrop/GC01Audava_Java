package JPanels;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * The <code>MenuBar</code> class provides basic navigation for the 
 * AuJava application and is a common component on every page of the app.
 * 
 * @author Axel
 * @version 15/11/2014
 */
public class MenuBar extends JPanel {	
	
	private String username = "Username"; 
	
	public MenuBar() {
		setBounds(0, 0, 400, 40);
		this.setLayout(null);
		
		addMenuItems();
	}

	/**
	 * @param username Setting the username variable displayed on Account button.
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Adds buttons for each MenuBar item and provides navigational functionality.
	 */
	private void addMenuItems () {
		
		int buttonCount = 6;
		
		int buttonWidth = (int) this.getWidth() / buttonCount;
		int buttonHeight = this.getHeight();
		
		JButton btnAudava = new JButton("AUDAVA");
		JButton btnRecord = new JButton("Record");
		JButton btnUpload = new JButton("Upload");
		JButton btnAlbums = new JButton("Albums");
		JButton btnAboutUs = new JButton("About Us");
		JButton btnAccount = new JButton(username);
		
		JButton[] buttons = new JButton[buttonCount];
		buttons[0] = btnAudava;
		buttons[1] = btnRecord;
		buttons[2] = btnUpload;
		buttons[3] = btnAlbums;
		buttons[4] = btnAboutUs;
		buttons[5] = btnAccount;
		
		for (int i=0; i<buttonCount; i++) {
			buttons[i].setBounds(buttonWidth*i, 0, buttonWidth, buttonHeight);
			add(buttons[i]);
		}
		
	}
	
}