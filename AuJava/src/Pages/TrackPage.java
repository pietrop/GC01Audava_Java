package Pages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jComponents.InfoPanel;
import jComponents.PictureLabel;

import javax.sound.sampled.Clip;
import javax.swing.JPanel;

import AlbumHierarchy.Track;
import SoundPlayer.AudioPlayer;
import Utilities.HTMLExport;

import javax.swing.JLabel;
import javax.swing.JButton;


public class TrackPage extends Page {

	public TrackPage(Track track) {
		this.setLayout(null);

		InfoPanel infoPanel = new InfoPanel(track.getTitle(), track.getDescription(), track.getPicFileLocation());
		infoPanel.setBounds(200, 23, 480, 282);
		add(infoPanel);

		AudioPlayer ap = new AudioPlayer(track.getAudioFileLocation()); 
		ap.setLocation(200,308);
		this.add(ap);

		JButton btnExportOtHtml = new JButton("Export ot HTML");
		btnExportOtHtml.setBounds(563, 332, 117, 57);
		add(btnExportOtHtml);

		btnExportOtHtml.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				HTMLExport.export(track);


			}
		});
	}
}
