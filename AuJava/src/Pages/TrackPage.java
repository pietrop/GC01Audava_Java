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
<<<<<<< HEAD
=======
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
>>>>>>> 014d34a3f976a7b3f78a185d94bfb4a8154a3e36
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import AlbumHierarchy.Track;

<<<<<<< HEAD
public class TrackPage extends Page {
=======
public class TrackPage extends JPanel {
>>>>>>> 014d34a3f976a7b3f78a185d94bfb4a8154a3e36

	private JPanel trackInfo;
	private JPanel trackPlayer;
	private Clip clip = null;

<<<<<<< HEAD
	public TrackPage(Track track) {
		
		this.setLayout(null);
		
		
		
		trackInfo = new JPanel();
		trackInfo.setBorder(new LineBorder(Color.blue));
		this.add(new PictureLabel());
		
		
		
		/* need a substitute for this */
		// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				try {
					File file = new File("src/test.wav");
					if (file.exists()) {
						 AudioInputStream inputStream = AudioSystem.getAudioInputStream(file);
					       clip = AudioSystem.getClip();
					       clip.open(inputStream);	
					} else { System.out.println("file does not exist.");}
					clip.setFramePosition(0);
					clip.start(); 
				} catch (Exception e) {
					e.printStackTrace();
					System.err.println(e.getMessage());
				}
			}
		});
		btnPlay.setBounds(40, 39, 117, 29);
		this.add(btnPlay);
		
		
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
			}
		});
		btnStop.setBounds(40, 80, 117, 29);
		this.add(btnStop);
=======
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TrackPage() {
		JLabel aLabel = new JLabel("Track Pane");
		add(aLabel);
>>>>>>> 014d34a3f976a7b3f78a185d94bfb4a8154a3e36
		
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(40, 121, 117, 29);
		this.add(btnPause);
		
	}

}
