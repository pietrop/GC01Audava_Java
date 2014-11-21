package SoundPlayer;

import jComponents.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author Pietro
 * @author Axel
 *
 * @version 18 Nov 2014 
 * @time 12:52:38
 */


public class AudioPlayer extends JPanel {
	
	private Clip clip = null;
	
	public AudioPlayer () {
		
		/* Play Button */
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
		
		/* Stop Button */
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
			}
		});
		btnStop.setBounds(40, 80, 117, 29);
		this.add(btnStop);
		
		/*
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(40, 121, 117, 29);
		this.add(btnPause);
		*/
	}
	
}
