package SoundPlayer;

import jComponents.MenuBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

/**
 * 
 * @author Pietro
 * @author Axel
 *
 * @version 18 Nov 2014 
 * @time 12:52:38
 */


public class AudioPlayer extends JFrame{
	
	AudioPlayer(){
		super("Audio Player");
		MenuBar menuBar = new MenuBar("user");
		getContentPane().add(menuBar);
		
		JButton btnPlay = new JButton("play");
		btnPlay.setBounds(120, 143, 69, 29);
		menuBar.add(btnPlay);
		
		JButton btnStop = new JButton("stop");
		btnStop.setBounds(231, 143, 69, 29);
		menuBar.add(btnStop);
		
		
		AePlayWave aw = new AePlayWave( "AuJava.wav" );
//        aw.start();     
//        aw.stop(); 
        
        btnPlay.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				btnPlay.setEnabled(false);
				btnStop.setEnabled(true);
				aw.start();	
			}
        	
        });
        
        //
        btnStop.addActionListener(new ActionListener(){

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				btnPlay.setEnabled(true);
				btnStop.setEnabled(false);
				aw.stop();	
			}
        	
        });
		
        
		
	}
	
}
