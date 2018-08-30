package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.GamePanel;
import view.SSGameSystem;

/**
 * @author Rajarajeswari Rudhrakumar (S3725902)
 * 28 Aug. 2018
 */
public class exitActionListner implements ActionListener{
	/**
	 * @param frame
	 */
	private GamePanel frame;
	
	public exitActionListner(final GamePanel gamePanel) {
		super();
		this.frame = gamePanel;
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	}
}
