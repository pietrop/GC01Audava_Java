import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class TitleDescription extends JPanel{
	
	JPanel titleDescriptionPanel = new JPanel(new GridBagLayout());
	JLabel albumTitleLabel = new JLabel("Album Title");
	JLabel albumDescriptionLabel = new JLabel("Album Description");
	
	TitleDescription(){
		
		titleDescriptionPanel.add(albumTitleLabel);
		titleDescriptionPanel.add(albumDescriptionLabel);
		add(titleDescriptionPanel);
		
		
	}
	
	
}
