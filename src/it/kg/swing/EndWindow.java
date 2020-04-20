package it.kg.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class EndWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndWindow window = new EndWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EndWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("You've done it!");
		frame.setBounds(530, 330, 300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel endLabel = new JLabel("Game is Ended!");
		endLabel.setFont(new Font("Old English Text MT", Font.PLAIN, 32));
		endLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(endLabel, BorderLayout.CENTER);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
