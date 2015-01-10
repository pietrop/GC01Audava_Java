/**
 * 
 */
package Pages;

import javax.swing.JLabel;

/**
 * @author Pietro Passarelli
 *
 */
public class UploadPage extends Page {
	
	public UploadPage(){
		setLayout(null);
		JLabel uploadLabel = new JLabel("Upload Label");
		uploadLabel.setBounds(206, 94, 137, 140);
		this.add(uploadLabel);
	}
	
}
