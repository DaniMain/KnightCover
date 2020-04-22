package it.kg.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import it.kg.business.Controller;

public class EndWindow {

	private Controller controller;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				frame.setVisible(true);
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EndWindow(Controller controller) {
		this.controller = controller;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("You've done it!");
		frame.setBounds(530, 330, 300, 119);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel endLabel = new JLabel("Game is Ended!");
		endLabel.setFont(new Font("Old English Text MT", Font.PLAIN, 32));
		endLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(endLabel, BorderLayout.CENTER);
		
		JLabel complimentLabel = new JLabel("Compliments " + this.controller.getPlayerName() + "!");
		complimentLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(complimentLabel, BorderLayout.NORTH);
	}
	
	public JFrame getFrame() {
		return this.frame;
	}

}
