import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public abstract class Page extends JFrame{
	TitleDescription titleDescription= new TitleDescription();
	JPanel pagePanel = new JPanel(new GridBagLayout());
	Page(){
	super("AuJava");
	add(pagePanel);
	}

}
