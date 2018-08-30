package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import view.GamePanel;
import view.LoginForm;
import view.SSGameSystem;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902) 28 Aug. 2018
 */
public class LoginActionListner implements ActionListener {

	private LoginForm loginForm;
	GamePanel gamePanel = new GamePanel();
	
	public LoginActionListner(LoginForm loginForm) {
		super();
		this.loginForm = loginForm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null,"You hit the btn");
		
		String userName = loginForm.getTxtUserName().getText();
		 char[] password = loginForm.getPwdPassword().getPassword();
		
		//String password = loginForm.getPwdPassword().getPassword().toString();
		JOptionPane.showMessageDialog(null,userName);
		JOptionPane.showMessageDialog(null,password);
		
		if (userName.equals("a") && password.equals("a")) {
			gamePanel.setVisible(true);
			JLabel label = new JLabel("Welcome:" + userName);
			gamePanel.getContentPane().add(label);
		} else {
//			JOptionPane.showMessageDialog(userName, "Incorrect login or password", "Error",
//					JOptionPane.ERROR_MESSAGE);
		}
	}
}
