package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902) 29 Aug. 2018
 */
public class LoginForm extends JPanel {
	
	//private JFrame frame = new JFrame("Simple Strategic Game");
	private JLabel lblTitle = new JLabel("Simple Strategic Game");
	private JLabel lblUsername = new JLabel("UserName");
	private JLabel lblPassword = new JLabel("Password");

	private JTextField txtUsername = new JTextField();
	private JPasswordField pwdPassword = new JPasswordField();

	private JButton btnLogin = new JButton("Login");
	private JButton btnRegister = new JButton("Register");
	private JButton btnCancel = new JButton("Cancel");

	public LoginForm() {
		lblTitle.setForeground(Color.blue);
		lblTitle.setFont(new Font("Serif", Font.BOLD, 40));
		lblTitle.setVerticalAlignment((int) CENTER_ALIGNMENT);
		lblTitle.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		lblTitle.setBounds(90, 30, 400, 60);

		lblUsername.setFont(new Font("Serif", Font.PLAIN, 25));
		txtUsername.setFont(new Font("Serif", Font.ITALIC, 25));
		lblUsername.setBounds(70, 125, 150, 40);
		txtUsername.setBounds(200, 125, 300, 40);

		lblPassword.setFont(new Font("Serif", Font.PLAIN, 25));
		pwdPassword.setFont(new Font("Serif", Font.ITALIC, 25));
		lblPassword.setBounds(70, 180, 150, 40);
		pwdPassword.setBounds(200, 180, 300, 40);

		btnLogin.setFont(new Font("Serif", Font.PLAIN, 25));
		btnLogin.setBounds(50, 250, 150, 50);
		btnRegister.setFont(new Font("Serif", Font.PLAIN, 25));
		btnRegister.setBounds(225, 250, 150, 50);
		btnCancel.setFont(new Font("Serif", Font.PLAIN, 25));
		btnCancel.setBounds(400, 250, 150, 50);

		add(lblTitle);
		add(lblUsername);
		add(txtUsername);
		add(lblPassword);
		add(pwdPassword);
		add(btnLogin);
		add(btnRegister);
		add(btnCancel);

		setSize(625, 415);
		setLayout(null);
		setVisible(true);
		
		btnLogin
		.addActionListener(new controller.LoginActionListner(
				 this));
	}
	
	public JTextField getTxtUserName() {
		return txtUsername;
	}
	public JPasswordField getPwdPassword() {
		return pwdPassword;
	}
}
