package Pages;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import Utilities.AlbumFileReadWrite;

/**
 * 
 * @author SamiStart
 *
 */
public class CreateNewAlbumPage extends CreateNewAlbumOrTrackPage {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateNewAlbumPage frame = new CreateNewAlbumPage();
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
	public CreateNewAlbumPage() {
		super.btnCreate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				writeInfoToFile();
			}
		});
		
	}
	
	private void writeInfoToFile(){
		AlbumFileReadWrite.appendAlbum(super.textField_ttl.getText(), super.textField_dscrptn.getText(), super.textField_pic.getText());
	}
}
