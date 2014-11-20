package Pages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JTextField;

import Utilities.AlbumReadWrite;
import Utilities.TrackReadWrite;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author SamiStart
 *
 */

// you will need to set up a valid file location in Utilities for this to work
public class CreateNewTrackPage extends CreateNewAlbumOrTrackPage {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewTrackPage frame = new CreateNewTrackPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateNewTrackPage() {
		lblCreateNewTrackalbum.setText("Create New Track");

		JLabel lblChooseAnAudio = new JLabel("Choose an audio file");
		GridBagConstraints gbc_lblChooseAnAudio = new GridBagConstraints();
		gbc_lblChooseAnAudio.anchor = GridBagConstraints.EAST;
		gbc_lblChooseAnAudio.insets = new Insets(0, 0, 0, 5);
		gbc_lblChooseAnAudio.gridx = 0;
		gbc_lblChooseAnAudio.gridy = 5;
		getContentPane().add(lblChooseAnAudio, gbc_lblChooseAnAudio);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 5;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);

		super.btnCreate.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				writeInfoToFile();
			}
		});

	}

	private void writeInfoToFile() {
		TrackReadWrite.appendtrack(super.textField_ttl.getText(),
				super.textField_dscrptn.getText(),
				super.textField_pic.getText(), textField.getText());
	}

}
