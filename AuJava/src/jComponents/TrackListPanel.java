package jComponents;

import java.awt.GridBagConstraints;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JButton;

import AlbumHierarchy.Track;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TrackListPanel extends JPanel {
	
	ArrayList<Track> tracks;
	GridBagConstraints gbc;

	/**
	 * Create the panel.
	 */
	public TrackListPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		Track.loadTracks();
	
		tracks = Track.getAllTracks();
		gbc = new GridBagConstraints();
		ArrayList<JButton> buttons = new ArrayList<JButton>();
		
		for (int i = 0; i < tracks.size(); i++) {
			gbc.insets = new Insets(0, 0, 5, 0);
			gbc.gridx = 0;
			gbc.gridy = i;
			
			buttons.add(new JButton(tracks.get(i).getTitle()));
			buttons.get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			add(buttons.get(i));
		}

	}
}
