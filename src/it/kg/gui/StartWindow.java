package it.kg.gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import it.kg.business.Controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartWindow {

	private Controller controller;
	private JFrame frame;
	private JTextField nameTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartWindow window = new StartWindow();
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
	public StartWindow() {
		this.controller = new Controller();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Welcome to KnightCover 1.0");
		frame.setBounds(400, 200, 375, 170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel nameLabel = new JLabel("Enter yor name:");
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		nameLabel.setBounds(10, 65, 78, 14);
		frame.getContentPane().add(nameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(98, 62, 245, 20);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		
		JTextArea txtrCanYouCover = new JTextArea();
		txtrCanYouCover.setLineWrap(true);
		txtrCanYouCover.setText("Can you cover the entire chessboard with only a knight?\nLet you show me!");
		txtrCanYouCover.setBounds(10, 11, 333, 40);
		frame.getContentPane().add(txtrCanYouCover);
		
		JButton startButton = new JButton("START");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.setPlayerName(nameTextField.getText());
				launchGamingWindow();
			}
		});
		startButton.setBounds(254, 93, 89, 23);
		frame.getContentPane().add(startButton);
	}
	
	private void launchGamingWindow() {
		this.frame.dispose();
		new GamingWindow(this.controller).main();
	}
	
}
