package view;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902)
 * 
 */
public class ToolBar extends JToolBar {

	private JButton btnRegister = new JButton("Register");
	private JButton btnLogin = new JButton("Login");
	private JButton btnPlay = new JButton("Play");
	private JLabel lblScore = new JLabel("");
	private JLabel lblPlayerName = new JLabel("");
	private JLabel lblPassword = new JLabel("");

	public ToolBar(final GamePanel gamePanel) {
		add(btnRegister);
		add(btnLogin);
		add(btnPlay);

		// Register button listener displays the panel to receive player
		// information
//		btnRegister.addActionListener(new controller.RegisterActionListener(gamePanel));
		// login button listener
	//	btnLogin.addActionListener(new controller.LoginActionListner(frame));

		// play button listener
//		btnPlay.addActionListener(new controller.PlayActionListner(gamePanel));
	}

	// disable or enable the Register item
	public void DisableRegisterButton(boolean flag) {
		// TODO Auto-generated method stub
		btnRegister.setEnabled(!flag);
	}

	// disable or enable the Login item
	public void DisableLoginButton(boolean flag) {
		// TODO Auto-generated method stub
		btnLogin.setEnabled(!flag);
	}

	// disable or enable the Play item
	public void DisablePlayButton(boolean flag) {
		// TODO Auto-generated method stub
		btnPlay.setEnabled(!flag);
	}

	// setter method for player name label
	public void setPlayerName(String name) {
		lblPlayerName.setText("   Welcome " + name + "! ");
	}

	// setter method for player points on hand label
	public void setPlayerPassword(int password) {
		lblPassword.setText("  Points in Hand : " + password + " ");
	}

	// setter method for player score label
	public void setScore(int score) {
		lblScore.setText("TotalScore: " + score + " ");
	}

}
