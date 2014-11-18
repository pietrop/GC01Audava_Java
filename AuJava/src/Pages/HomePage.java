package Pages;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.TextArea;

import JPanels.MenuBar;

public class Home extends JFrame{
	public Home() {
		
		JPanel aBakcgroundPanel = new JPanel();
		aBakcgroundPanel.setLayout(new BorderLayout(0, 0));
		
		TextArea textArea = new TextArea("lore ipsum");
		MenuBar menuBar = new MenuBar();
		aBakcgroundPanel.add(menuBar, BorderLayout.NORTH);
//		aBakcgroundPanel.add(textArea, BorderLayout.CENTER);
		
		
		
		add(aBakcgroundPanel);
		
		
	}

}
