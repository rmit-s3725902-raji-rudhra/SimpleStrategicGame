package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JPanel;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902)
 * 30 Aug. 2018
 */
public class GamePanel extends JPanel {
	private MenuBar menuBar = new MenuBar(this);
//	private ToolBar toolBar = new ToolBar(this);
	
	public GamePanel() {
	setJMenuBar(menuBar);
//	getContentPane().add(toolBar, BorderLayout.PAGE_START);
	DisablePlayButton(true);
	}
	/**
	 * @param menuBar2
	 */
	private void setJMenuBar(MenuBar menuBar2) {
		// TODO Auto-generated method stub
		
	}
	// Method to enable / disable add player button
		public void DisableRegisterButton(boolean flag) {
//			this.menuBar.DisableRegisterButton(flag);
			
		}

		// Method to enable / disable play game button
		public void DisableLoginButton(boolean flag) {
//			this.menuBar.DisableLoginButton(flag);
			
		}

		// Method to enable / disable play game button
		public void DisablePlayButton(boolean flag) {
//			this.menuBar.DisablePlayButton(flag);
			}

		// Setter method to set player name in the tool bar
		public void setPlayerName(String name) {
//			toolBar.setPlayerName(name);
		}

		// Setter method to set player score in the tool bar
		public void setScore(int score) {
//			toolBar.setScore(score);
		}
		/**
		 * @return
		 */
		public Container getContentPane() {
			// TODO Auto-generated method stub
			return null;
		}

}
