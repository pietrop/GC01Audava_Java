package Pages;

import jComponents.PictureLabel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import AlbumHierarchy.Track;

public class TrackPage extends Page {

	private JPanel trackPlayer;
	private Clip clip = null;

	public TrackPage(Track track) {
		
		this.setLayout(null);
		
		
		
		this.add(new PictureLabel());
		
	}
		
		/* need a substitute for this */
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	public TrackPage() {
		JLabel aLabel = new JLabel("Track Pane");
		add(aLabel);		
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(40, 121, 117, 29);
		this.add(btnPause);
		
	}

}
