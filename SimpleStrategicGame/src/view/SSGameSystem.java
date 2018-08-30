package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902)
 * 
 */
public class SSGameSystem extends JFrame {

	/*private ToolBar toolBar = new ToolBar(this);
	*/
	private JPanel loginPanel = new LoginForm();	

	/**
	 * Initialize the contents of the frame.
	 */
	public SSGameSystem() {
	    setBounds(200, 200, 625, 415);
		setTitle("Simple Strategy Game");
	//	setJMenuBar(menuBar);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());
	//	getContentPane().add(toolBar, BorderLayout.PAGE_START);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(loginPanel);
	}
	public static void main(String[] args) {
		new SSGameSystem();
	}

	
}
