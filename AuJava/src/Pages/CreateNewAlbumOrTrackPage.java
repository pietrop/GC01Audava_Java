package Pages;

import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import jComponents.MenuBar;

import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JButton;


/**
 * An abstract class to hold similarities between the create a track page and
 * the create an album page. Should be extended by these pages.
 * 
 * @author SamiStart
 *
 */
public abstract class CreateNewAlbumOrTrackPage extends JFrame {

	private JPanel contentPane;

	
	protected int lblCount = 3;
	protected JTextField textField_ttl;
	protected JTextField textField_dscrptn;
	protected JTextField textField_pic;
	protected JButton btnCreate;

	/**
	 * Create the frame.
	 */
	public CreateNewAlbumOrTrackPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 960, 700);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		GridBagLayout gbl = new GridBagLayout();
		gbl.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0};
		gbl.columnWeights = new double[]{0.0, 1.0};
		contentPane.setLayout(gbl);
		
		/*MenuBar menuBar = new MenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.gridwidth = 2;
		gbc_menuBar.insets = new Insets(0, 0, 5, 5);
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		contentPane.add(menuBar, gbc_menuBar);*/
		
		JLabel lblCreateNewTrackalbum = new JLabel("Create new track/album (edit this text in subclass!!)");
		GridBagConstraints gbc_lblCreateNewTrackalbum = new GridBagConstraints();
		gbc_lblCreateNewTrackalbum.gridwidth = 2;
		gbc_lblCreateNewTrackalbum.insets = new Insets(0, 0, 5, 0);
		gbc_lblCreateNewTrackalbum.gridx = 0;
		gbc_lblCreateNewTrackalbum.gridy = 1;
		contentPane.add(lblCreateNewTrackalbum, gbc_lblCreateNewTrackalbum);	
		
		JLabel lblTitle = new JLabel("Title");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.EAST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 0;
		gbc_lblTitle.gridy = 2;
		contentPane.add(lblTitle, gbc_lblTitle);
		
		textField_ttl = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		contentPane.add(textField_ttl, gbc_textField);
		textField_ttl.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		GridBagConstraints gbc_lblDescription = new GridBagConstraints();
		gbc_lblDescription.anchor = GridBagConstraints.EAST;
		gbc_lblDescription.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescription.gridx = 0;
		gbc_lblDescription.gridy = 3;
		contentPane.add(lblDescription, gbc_lblDescription);
		
		textField_dscrptn = new JTextField();
		GridBagConstraints gbc_textField_dscrptn = new GridBagConstraints();
		gbc_textField_dscrptn.insets = new Insets(0, 0, 5, 0);
		gbc_textField_dscrptn.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_dscrptn.gridx = 1;
		gbc_textField_dscrptn.gridy = 3;
		contentPane.add(textField_dscrptn, gbc_textField_dscrptn);
		textField_dscrptn.setColumns(10);
		
		JLabel lblChooseAPicture = new JLabel("Choose a picture");
		GridBagConstraints gbc_lblChooseAPicture = new GridBagConstraints();
		gbc_lblChooseAPicture.anchor = GridBagConstraints.EAST;
		gbc_lblChooseAPicture.insets = new Insets(0, 0, 5, 5);
		gbc_lblChooseAPicture.gridx = 0;
		gbc_lblChooseAPicture.gridy = 4;
		contentPane.add(lblChooseAPicture, gbc_lblChooseAPicture);
		
		textField_pic = new JTextField();
		GridBagConstraints gbc_textField_pic = new GridBagConstraints();
		gbc_textField_pic.insets = new Insets(0, 0, 5, 0);
		gbc_textField_pic.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_pic.gridx = 1;
		gbc_textField_pic.gridy = 4;
		contentPane.add(textField_pic, gbc_textField_pic);
		textField_pic.setColumns(10);
		
		btnCreate = new JButton("Create");
		GridBagConstraints gbc_btnCreate = new GridBagConstraints();
		gbc_btnCreate.gridx = 1;
		gbc_btnCreate.gridy = 5;
		contentPane.add(btnCreate, gbc_btnCreate);
		
		

	}

}
