package SoundPlayer;

import javax.swing.JFrame;

public class TestAudioPlayer {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();// create JFrame window(?)
		audioPlayer.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		audioPlayer.setSize( 700, 500 );
		audioPlayer.setVisible( true ); 
		audioPlayer.setResizable(true);
}
}
