package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902)
 * 
 */
public class MenuBar extends JMenuBar {
	private JMenu fileMenu = new JMenu("File");
	private JMenuItem registerItem = new JMenuItem("Register");
	private JMenuItem loginItem = new JMenuItem("Login");
	private JMenuItem playItem = new JMenuItem("Play");
	private JMenuItem exitItem = new JMenuItem("Exit");

	// Constructor
	public MenuBar(final GamePanel gamePanel) {
		add(fileMenu);
		fileMenu.add(registerItem);
		fileMenu.add(loginItem);
		fileMenu.add(playItem);
		fileMenu.add(exitItem);

		// Register button listener displays the panel to receive player
		// information
		registerItem.addActionListener(new controller.RegisterActionListener(gamePanel));
		// login button listener
		//loginItem.addActionListener(new controller.LoginActionListner(frame));

		// play button listener
		playItem.addActionListener(new controller.PlayActionListner(gamePanel));

		// exit game button listener
		exitItem.addActionListener(new controller.exitActionListner(gamePanel));
	}

	// disable or enable the Register item
	public void DisableRegisterButton(boolean flag) {
		registerItem.setEnabled(!flag);
	}

	// disable or enable the Login item
	public void DisableLoginButton(boolean flag) {
		loginItem.setEnabled(!flag);
	}

	// disable or enable the Play item
	public void DisablePlayButton(boolean flag) {
		playItem.setEnabled(!flag);
	}
}
