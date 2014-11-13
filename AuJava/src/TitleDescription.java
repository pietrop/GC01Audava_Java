import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TitleDescription extends JPanel{
	
	JPanel titleDescriptionPanel = new JPanel(new GridBagLayout());
	
	
//	TitleDescription(){
//		
//	}
//	
	TitleDescription(String title, String description){
				
		populatePanel(title, description);
		
	}
	
	private void populatePanel(String title, String description){
		JLabel albumTitleLabel = new JLabel(title);
		JLabel albumDescriptionLabel = new JLabel(description);
		titleDescriptionPanel.add(albumTitleLabel);
		titleDescriptionPanel.add(albumDescriptionLabel);
		add(titleDescriptionPanel);
	}
	
	
}
