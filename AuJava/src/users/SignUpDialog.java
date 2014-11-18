package users;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SignUpDialog extends JDialog {

	private JTextField tfUsername;
	private JPasswordField pfPassword;
	private JLabel lbUsername;
	private JLabel lbPassword;
	private JButton btnSignUp;
	private JButton btnCancel;
	private boolean succeeded;
	 public SignUpDialog(Frame parent) {
	        super(parent, "Sign Up", true);
	        //
	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints cs = new GridBagConstraints();

	        cs.fill = GridBagConstraints.HORIZONTAL;

	        lbUsername = new JLabel("Username: ");
	        cs.gridx = 0;
	        cs.gridy = 0;
	        cs.gridwidth = 1;
	        panel.add(lbUsername, cs);

	        tfUsername = new JTextField(20);
	        cs.gridx = 1;
	        cs.gridy = 0;
	        cs.gridwidth = 2;
	        panel.add(tfUsername, cs);

	        lbPassword = new JLabel("Password: ");
	        cs.gridx = 0;
	        cs.gridy = 1;
	        cs.gridwidth = 1;
	        panel.add(lbPassword, cs);

	        pfPassword = new JPasswordField(20);
	        cs.gridx = 1;
	        cs.gridy = 1;
	        cs.gridwidth = 2;
	        panel.add(pfPassword, cs);
	        panel.setBorder(new LineBorder(Color.GRAY));

	        btnSignUp = new JButton("Sign Up");

	        btnSignUp.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	                if (SignUp.authenticate(getUsername(), getPassword())) {
	                    JOptionPane.showMessageDialog(SignUpDialog.this,
	                            "Hi " + getUsername() + "! You have successfully logged in.",
	                            "Login",
	                            JOptionPane.INFORMATION_MESSAGE);
	                    succeeded = true;
	                    dispose();
	                } else {
	                    JOptionPane.showMessageDialog(SignUpDialog.this,
	                            "Invalid username or password",
	                            "Login",
	                            JOptionPane.ERROR_MESSAGE);
	                    // reset username and password
	                    tfUsername.setText("");
	                    pfPassword.setText("");
	                    succeeded = false;

	                }
	            }
	        });
	        btnCancel = new JButton("Cancel");
	        btnCancel.addActionListener(new ActionListener() {

	            public void actionPerformed(ActionEvent e) {
	                dispose();
	            }
	        });
	        JPanel bp = new JPanel();
	        bp.add(btnSignUp);
	        bp.add(btnCancel);

	        getContentPane().add(panel, BorderLayout.CENTER);
	        getContentPane().add(bp, BorderLayout.PAGE_END);

	        pack();
	        setResizable(false);
	        setLocationRelativeTo(parent);
	    }

	    public String getUsername() {
	        return tfUsername.getText().trim();
	    }

	    public String getPassword() {
	        return new String(pfPassword.getPassword());
	    }

	    public boolean isSucceeded() {
	        return succeeded;
	    }
	}
