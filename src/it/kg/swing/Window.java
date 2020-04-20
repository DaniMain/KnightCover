package it.kg.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.plaf.metal.MetalToggleButtonUI;

import it.kg.business.Controller;

public class Window {

	private JLabel displayLabel;
	private JFrame frame;
	private Controller controller;
	private HashMap<String, JToggleButton> buttons;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
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
	public Window() {
		this.controller = new Controller();
		this.buttons = new HashMap<>();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Knight Cover 1.0");
		frame.setBounds(400, 200, 538, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel eightLabel = new JLabel("8");
		GridBagConstraints gbc_eightLabel = new GridBagConstraints();
		gbc_eightLabel.insets = new Insets(0, 0, 5, 5);
		gbc_eightLabel.gridx = 1;
		gbc_eightLabel.gridy = 1;
		panel.add(eightLabel, gbc_eightLabel);

		JToggleButton a8 = new JToggleButton(" ");
		implementJToogleButton(a8, "a8");
		a8.setBackground(Color.WHITE);
		a8.setForeground(Color.WHITE);
		GridBagConstraints gbc_a8 = new GridBagConstraints();
		gbc_a8.insets = new Insets(0, 0, 5, 5);
		gbc_a8.gridx = 2;
		gbc_a8.gridy = 1;
		panel.add(a8, gbc_a8);

		JToggleButton b8 = new JToggleButton(" ");
		implementJToogleButton(b8, "b8");
		b8.setBackground(Color.BLACK);
		b8.setForeground(Color.BLACK);
		GridBagConstraints gbc_b8 = new GridBagConstraints();
		gbc_b8.insets = new Insets(0, 0, 5, 5);
		gbc_b8.gridx = 3;
		gbc_b8.gridy = 1;
		panel.add(b8, gbc_b8);

		JToggleButton c8 = new JToggleButton(" ");
		implementJToogleButton(c8, "c8");
		c8.setBackground(Color.WHITE);
		c8.setForeground(Color.WHITE);
		GridBagConstraints gbc_c8 = new GridBagConstraints();
		gbc_c8.insets = new Insets(0, 0, 5, 5);
		gbc_c8.gridx = 4;
		gbc_c8.gridy = 1;
		panel.add(c8, gbc_c8);

		JToggleButton d8 = new JToggleButton(" ");
		implementJToogleButton(d8, "d8");
		d8.setForeground(Color.BLACK);
		d8.setBackground(Color.BLACK);
		GridBagConstraints gbc_d8 = new GridBagConstraints();
		gbc_d8.insets = new Insets(0, 0, 5, 5);
		gbc_d8.gridx = 5;
		gbc_d8.gridy = 1;
		panel.add(d8, gbc_d8);

		JToggleButton e8 = new JToggleButton(" ");
		implementJToogleButton(e8, "e8");
		e8.setBackground(Color.WHITE);
		e8.setForeground(Color.WHITE);
		GridBagConstraints gbc_e8 = new GridBagConstraints();
		gbc_e8.insets = new Insets(0, 0, 5, 5);
		gbc_e8.gridx = 6;
		gbc_e8.gridy = 1;
		panel.add(e8, gbc_e8);

		JToggleButton f8 = new JToggleButton(" ");
		implementJToogleButton(f8, "f8");
		f8.setForeground(Color.BLACK);
		f8.setBackground(Color.BLACK);
		GridBagConstraints gbc_f8 = new GridBagConstraints();
		gbc_f8.insets = new Insets(0, 0, 5, 5);
		gbc_f8.gridx = 7;
		gbc_f8.gridy = 1;
		panel.add(f8, gbc_f8);

		JToggleButton g8 = new JToggleButton(" ");
		implementJToogleButton(g8, "g8");
		g8.setBackground(Color.WHITE);
		g8.setForeground(Color.WHITE);
		GridBagConstraints gbc_g8 = new GridBagConstraints();
		gbc_g8.insets = new Insets(0, 0, 5, 5);
		gbc_g8.gridx = 8;
		gbc_g8.gridy = 1;
		panel.add(g8, gbc_g8);

		JToggleButton h8 = new JToggleButton(" ");
		implementJToogleButton(h8, "h8");
		h8.setForeground(Color.BLACK);
		h8.setBackground(Color.BLACK);
		GridBagConstraints gbc_h8 = new GridBagConstraints();
		gbc_h8.insets = new Insets(0, 0, 5, 5);
		gbc_h8.gridx = 9;
		gbc_h8.gridy = 1;
		panel.add(h8, gbc_h8);

		JLabel sevenLabel = new JLabel("7");
		GridBagConstraints gbc_sevenLabel = new GridBagConstraints();
		gbc_sevenLabel.insets = new Insets(0, 0, 5, 5);
		gbc_sevenLabel.gridx = 1;
		gbc_sevenLabel.gridy = 2;
		panel.add(sevenLabel, gbc_sevenLabel);

		JToggleButton a7 = new JToggleButton(" ");
		implementJToogleButton(a7, "a7");
		a7.setBackground(Color.BLACK);
		a7.setForeground(Color.BLACK);
		GridBagConstraints gbc_a7 = new GridBagConstraints();
		gbc_a7.insets = new Insets(0, 0, 5, 5);
		gbc_a7.gridx = 2;
		gbc_a7.gridy = 2;
		panel.add(a7, gbc_a7);

		JToggleButton b7 = new JToggleButton(" ");
		implementJToogleButton(b7, "b7");
		b7.setBackground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		GridBagConstraints gbc_b7 = new GridBagConstraints();
		gbc_b7.insets = new Insets(0, 0, 5, 5);
		gbc_b7.gridx = 3;
		gbc_b7.gridy = 2;
		panel.add(b7, gbc_b7);

		JToggleButton c7 = new JToggleButton(" ");
		implementJToogleButton(c7, "c7");
		c7.setForeground(Color.BLACK);
		c7.setBackground(Color.BLACK);
		GridBagConstraints gbc_c7 = new GridBagConstraints();
		gbc_c7.insets = new Insets(0, 0, 5, 5);
		gbc_c7.gridx = 4;
		gbc_c7.gridy = 2;
		panel.add(c7, gbc_c7);

		JToggleButton d7 = new JToggleButton(" ");
		implementJToogleButton(d7, "d7");
		d7.setBackground(Color.WHITE);
		d7.setForeground(Color.WHITE);
		GridBagConstraints gbc_d7 = new GridBagConstraints();
		gbc_d7.insets = new Insets(0, 0, 5, 5);
		gbc_d7.gridx = 5;
		gbc_d7.gridy = 2;
		panel.add(d7, gbc_d7);

		JToggleButton e7 = new JToggleButton(" ");
		implementJToogleButton(e7, "e7");
		e7.setForeground(Color.BLACK);
		e7.setBackground(Color.BLACK);
		GridBagConstraints gbc_e7 = new GridBagConstraints();
		gbc_e7.insets = new Insets(0, 0, 5, 5);
		gbc_e7.gridx = 6;
		gbc_e7.gridy = 2;
		panel.add(e7, gbc_e7);

		JToggleButton f7 = new JToggleButton(" ");
		implementJToogleButton(f7, "f7");
		f7.setBackground(Color.WHITE);
		f7.setForeground(Color.WHITE);
		GridBagConstraints gbc_f7 = new GridBagConstraints();
		gbc_f7.insets = new Insets(0, 0, 5, 5);
		gbc_f7.gridx = 7;
		gbc_f7.gridy = 2;
		panel.add(f7, gbc_f7);

		JToggleButton g7 = new JToggleButton(" ");
		implementJToogleButton(g7, "g7");
		g7.setForeground(Color.BLACK);
		g7.setBackground(Color.BLACK);
		GridBagConstraints gbc_g7 = new GridBagConstraints();
		gbc_g7.insets = new Insets(0, 0, 5, 5);
		gbc_g7.gridx = 8;
		gbc_g7.gridy = 2;
		panel.add(g7, gbc_g7);

		JToggleButton h7 = new JToggleButton(" ");
		implementJToogleButton(h7, "h7");
		h7.setBackground(Color.WHITE);
		h7.setForeground(Color.WHITE);
		GridBagConstraints gbc_h7 = new GridBagConstraints();
		gbc_h7.insets = new Insets(0, 0, 5, 5);
		gbc_h7.gridx = 9;
		gbc_h7.gridy = 2;
		panel.add(h7, gbc_h7);

		JLabel sixLabel = new JLabel("6");
		GridBagConstraints gbc_sixLabel = new GridBagConstraints();
		gbc_sixLabel.insets = new Insets(0, 0, 5, 5);
		gbc_sixLabel.gridx = 1;
		gbc_sixLabel.gridy = 3;
		panel.add(sixLabel, gbc_sixLabel);

		JToggleButton a6 = new JToggleButton(" ");
		implementJToogleButton(a6, "a6");
		a6.setBackground(Color.WHITE);
		a6.setForeground(Color.WHITE);
		GridBagConstraints gbc_a6 = new GridBagConstraints();
		gbc_a6.insets = new Insets(0, 0, 5, 5);
		gbc_a6.gridx = 2;
		gbc_a6.gridy = 3;
		panel.add(a6, gbc_a6);

		JToggleButton b6 = new JToggleButton(" ");
		implementJToogleButton(b6, "b6");
		b6.setForeground(Color.BLACK);
		b6.setBackground(Color.BLACK);
		GridBagConstraints gbc_b6 = new GridBagConstraints();
		gbc_b6.insets = new Insets(0, 0, 5, 5);
		gbc_b6.gridx = 3;
		gbc_b6.gridy = 3;
		panel.add(b6, gbc_b6);

		JToggleButton c6 = new JToggleButton(" ");
		implementJToogleButton(c6, "c6");
		c6.setBackground(Color.WHITE);
		c6.setForeground(Color.WHITE);
		GridBagConstraints gbc_c6 = new GridBagConstraints();
		gbc_c6.insets = new Insets(0, 0, 5, 5);
		gbc_c6.gridx = 4;
		gbc_c6.gridy = 3;
		panel.add(c6, gbc_c6);

		JToggleButton d6 = new JToggleButton(" ");
		implementJToogleButton(d6, "d6");
		d6.setForeground(Color.BLACK);
		d6.setBackground(Color.BLACK);
		GridBagConstraints gbc_d6 = new GridBagConstraints();
		gbc_d6.insets = new Insets(0, 0, 5, 5);
		gbc_d6.gridx = 5;
		gbc_d6.gridy = 3;
		panel.add(d6, gbc_d6);

		JToggleButton e6 = new JToggleButton(" ");
		implementJToogleButton(e6, "e6");
		e6.setBackground(Color.WHITE);
		e6.setForeground(Color.WHITE);
		GridBagConstraints gbc_e6 = new GridBagConstraints();
		gbc_e6.insets = new Insets(0, 0, 5, 5);
		gbc_e6.gridx = 6;
		gbc_e6.gridy = 3;
		panel.add(e6, gbc_e6);

		JToggleButton f6 = new JToggleButton(" ");
		implementJToogleButton(f6, "f6");
		f6.setForeground(Color.BLACK);
		f6.setBackground(Color.BLACK);
		GridBagConstraints gbc_f6 = new GridBagConstraints();
		gbc_f6.insets = new Insets(0, 0, 5, 5);
		gbc_f6.gridx = 7;
		gbc_f6.gridy = 3;
		panel.add(f6, gbc_f6);

		JToggleButton g6 = new JToggleButton(" ");
		implementJToogleButton(g6, "g6");
		g6.setBackground(Color.WHITE);
		g6.setForeground(Color.WHITE);
		GridBagConstraints gbc_g6 = new GridBagConstraints();
		gbc_g6.insets = new Insets(0, 0, 5, 5);
		gbc_g6.gridx = 8;
		gbc_g6.gridy = 3;
		panel.add(g6, gbc_g6);

		JToggleButton h6 = new JToggleButton(" ");
		implementJToogleButton(h6, "h6");
		h6.setForeground(Color.BLACK);
		h6.setBackground(Color.BLACK);
		GridBagConstraints gbc_h6 = new GridBagConstraints();
		gbc_h6.insets = new Insets(0, 0, 5, 5);
		gbc_h6.gridx = 9;
		gbc_h6.gridy = 3;
		panel.add(h6, gbc_h6);

		JLabel fiveLabel = new JLabel("5");
		GridBagConstraints gbc_fiveLabel = new GridBagConstraints();
		gbc_fiveLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fiveLabel.gridx = 1;
		gbc_fiveLabel.gridy = 4;
		panel.add(fiveLabel, gbc_fiveLabel);

		JToggleButton a5 = new JToggleButton(" ");
		implementJToogleButton(a5, "a5");
		a5.setForeground(Color.BLACK);
		a5.setBackground(Color.BLACK);
		GridBagConstraints gbc_a5 = new GridBagConstraints();
		gbc_a5.insets = new Insets(0, 0, 5, 5);
		gbc_a5.gridx = 2;
		gbc_a5.gridy = 4;
		panel.add(a5, gbc_a5);

		JToggleButton b5 = new JToggleButton(" ");
		implementJToogleButton(b5, "b5");
		b5.setBackground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		GridBagConstraints gbc_b5 = new GridBagConstraints();
		gbc_b5.insets = new Insets(0, 0, 5, 5);
		gbc_b5.gridx = 3;
		gbc_b5.gridy = 4;
		panel.add(b5, gbc_b5);

		JToggleButton c5 = new JToggleButton(" ");
		implementJToogleButton(c5, "c5");
		c5.setForeground(Color.BLACK);
		c5.setBackground(Color.BLACK);
		GridBagConstraints gbc_c5 = new GridBagConstraints();
		gbc_c5.insets = new Insets(0, 0, 5, 5);
		gbc_c5.gridx = 4;
		gbc_c5.gridy = 4;
		panel.add(c5, gbc_c5);

		JToggleButton d5 = new JToggleButton(" ");
		implementJToogleButton(d5, "d5");
		d5.setBackground(Color.WHITE);
		d5.setForeground(Color.WHITE);
		GridBagConstraints gbc_d5 = new GridBagConstraints();
		gbc_d5.insets = new Insets(0, 0, 5, 5);
		gbc_d5.gridx = 5;
		gbc_d5.gridy = 4;
		panel.add(d5, gbc_d5);

		JToggleButton e5 = new JToggleButton(" ");
		implementJToogleButton(e5, "e5");
		e5.setForeground(Color.BLACK);
		e5.setBackground(Color.BLACK);
		GridBagConstraints gbc_e5 = new GridBagConstraints();
		gbc_e5.insets = new Insets(0, 0, 5, 5);
		gbc_e5.gridx = 6;
		gbc_e5.gridy = 4;
		panel.add(e5, gbc_e5);

		JToggleButton f5 = new JToggleButton(" ");
		implementJToogleButton(f5, "f5");
		f5.setBackground(Color.WHITE);
		f5.setForeground(Color.WHITE);
		GridBagConstraints gbc_f5 = new GridBagConstraints();
		gbc_f5.insets = new Insets(0, 0, 5, 5);
		gbc_f5.gridx = 7;
		gbc_f5.gridy = 4;
		panel.add(f5, gbc_f5);

		JToggleButton g5 = new JToggleButton(" ");
		implementJToogleButton(g5, "g5");
		g5.setForeground(Color.BLACK);
		g5.setBackground(Color.BLACK);
		GridBagConstraints gbc_g5 = new GridBagConstraints();
		gbc_g5.insets = new Insets(0, 0, 5, 5);
		gbc_g5.gridx = 8;
		gbc_g5.gridy = 4;
		panel.add(g5, gbc_g5);

		JToggleButton h5 = new JToggleButton(" ");
		implementJToogleButton(h5, "h5");
		h5.setBackground(Color.WHITE);
		h5.setForeground(Color.WHITE);
		GridBagConstraints gbc_h5 = new GridBagConstraints();
		gbc_h5.insets = new Insets(0, 0, 5, 5);
		gbc_h5.gridx = 9;
		gbc_h5.gridy = 4;
		panel.add(h5, gbc_h5);
		
		this.displayLabel = new JLabel("");
		displayLabel.setText("");
		GridBagConstraints gbc_displayLabel = new GridBagConstraints();
		gbc_displayLabel.insets = new Insets(0, 0, 5, 0);
		gbc_displayLabel.gridx = 10;
		gbc_displayLabel.gridy = 4;
		panel.add(displayLabel, gbc_displayLabel);

		JLabel fourLabel = new JLabel("4");
		GridBagConstraints gbc_fourLabel = new GridBagConstraints();
		gbc_fourLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fourLabel.gridx = 1;
		gbc_fourLabel.gridy = 5;
		panel.add(fourLabel, gbc_fourLabel);

		JToggleButton a4 = new JToggleButton(" ");
		implementJToogleButton(a4, "a4");
		a4.setBackground(Color.WHITE);
		a4.setForeground(Color.WHITE);
		GridBagConstraints gbc_a4 = new GridBagConstraints();
		gbc_a4.insets = new Insets(0, 0, 5, 5);
		gbc_a4.gridx = 2;
		gbc_a4.gridy = 5;
		panel.add(a4, gbc_a4);

		JToggleButton b4 = new JToggleButton(" ");
		implementJToogleButton(b4, "b4");
		b4.setForeground(Color.BLACK);
		b4.setBackground(Color.BLACK);
		GridBagConstraints gbc_b4 = new GridBagConstraints();
		gbc_b4.insets = new Insets(0, 0, 5, 5);
		gbc_b4.gridx = 3;
		gbc_b4.gridy = 5;
		panel.add(b4, gbc_b4);

		JToggleButton c4 = new JToggleButton(" ");
		implementJToogleButton(c4, "c4");
		c4.setBackground(Color.WHITE);
		c4.setForeground(Color.WHITE);
		GridBagConstraints gbc_c4 = new GridBagConstraints();
		gbc_c4.insets = new Insets(0, 0, 5, 5);
		gbc_c4.gridx = 4;
		gbc_c4.gridy = 5;
		panel.add(c4, gbc_c4);

		JToggleButton d4 = new JToggleButton(" ");
		implementJToogleButton(d4, "d4");
		d4.setForeground(Color.BLACK);
		d4.setBackground(Color.BLACK);
		GridBagConstraints gbc_d4 = new GridBagConstraints();
		gbc_d4.insets = new Insets(0, 0, 5, 5);
		gbc_d4.gridx = 5;
		gbc_d4.gridy = 5;
		panel.add(d4, gbc_d4);

		JToggleButton e4 = new JToggleButton(" ");
		implementJToogleButton(e4, "e4");
		e4.setBackground(Color.WHITE);
		e4.setForeground(Color.WHITE);
		GridBagConstraints gbc_e4 = new GridBagConstraints();
		gbc_e4.insets = new Insets(0, 0, 5, 5);
		gbc_e4.gridx = 6;
		gbc_e4.gridy = 5;
		panel.add(e4, gbc_e4);

		JToggleButton f4 = new JToggleButton(" ");
		implementJToogleButton(f4, "f4");
		f4.setForeground(Color.BLACK);
		f4.setBackground(Color.BLACK);
		GridBagConstraints gbc_f4 = new GridBagConstraints();
		gbc_f4.insets = new Insets(0, 0, 5, 5);
		gbc_f4.gridx = 7;
		gbc_f4.gridy = 5;
		panel.add(f4, gbc_f4);

		JToggleButton g4 = new JToggleButton(" ");
		implementJToogleButton(g4, "g4");
		g4.setBackground(Color.WHITE);
		g4.setForeground(Color.WHITE);
		GridBagConstraints gbc_g4 = new GridBagConstraints();
		gbc_g4.insets = new Insets(0, 0, 5, 5);
		gbc_g4.gridx = 8;
		gbc_g4.gridy = 5;
		panel.add(g4, gbc_g4);

		JToggleButton h4 = new JToggleButton(" ");
		implementJToogleButton(h4, "h4");
		h4.setForeground(Color.BLACK);
		h4.setBackground(Color.BLACK);
		GridBagConstraints gbc_h4 = new GridBagConstraints();
		gbc_h4.insets = new Insets(0, 0, 5, 5);
		gbc_h4.gridx = 9;
		gbc_h4.gridy = 5;
		panel.add(h4, gbc_h4);
		
		JButton deleteMove = new JButton("DELETE LAST MOVE");
		deleteMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> coordinates = controller.getCoordinates();
				if(!coordinates.isEmpty()) {
					String coordinateRemoved = coordinates.remove(coordinates.size()-1);
					buttons.get(coordinateRemoved).setSelected(false);
					displayLabel.setText("");
					for(String coordinate: coordinates) {
						buttons.get(coordinate).setUI(new MetalToggleButtonUI() {
							@Override
							protected Color getSelectColor() {
								return Color.GREEN;
							}
						});
					}
					if(!coordinates.isEmpty()) {
						buttons.get(coordinates.get(coordinates.size()-1)).setUI(new MetalToggleButtonUI() {
							@Override
							protected Color getSelectColor() {
								return Color.RED;
							}
						});
					}
				}
			}
		});
		GridBagConstraints gbc_deleteMove = new GridBagConstraints();
		gbc_deleteMove.insets = new Insets(0, 0, 5, 0);
		gbc_deleteMove.gridx = 10;
		gbc_deleteMove.gridy = 5;
		panel.add(deleteMove, gbc_deleteMove);

		JLabel threeLabel = new JLabel("3");
		GridBagConstraints gbc_threeLabel = new GridBagConstraints();
		gbc_threeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_threeLabel.gridx = 1;
		gbc_threeLabel.gridy = 6;
		panel.add(threeLabel, gbc_threeLabel);

		JToggleButton a3 = new JToggleButton(" ");
		implementJToogleButton(a3, "a3");
		a3.setForeground(Color.BLACK);
		a3.setBackground(Color.BLACK);
		GridBagConstraints gbc_a3 = new GridBagConstraints();
		gbc_a3.insets = new Insets(0, 0, 5, 5);
		gbc_a3.gridx = 2;
		gbc_a3.gridy = 6;
		panel.add(a3, gbc_a3);

		JToggleButton b3 = new JToggleButton(" ");
		implementJToogleButton(b3, "b3");
		b3.setBackground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		GridBagConstraints gbc_b3 = new GridBagConstraints();
		gbc_b3.insets = new Insets(0, 0, 5, 5);
		gbc_b3.gridx = 3;
		gbc_b3.gridy = 6;
		panel.add(b3, gbc_b3);

		JToggleButton c3 = new JToggleButton(" ");
		implementJToogleButton(c3, "c3");
		c3.setForeground(Color.BLACK);
		c3.setBackground(Color.BLACK);
		GridBagConstraints gbc_c3 = new GridBagConstraints();
		gbc_c3.insets = new Insets(0, 0, 5, 5);
		gbc_c3.gridx = 4;
		gbc_c3.gridy = 6;
		panel.add(c3, gbc_c3);

		JToggleButton d3 = new JToggleButton(" ");
		implementJToogleButton(d3, "d3");
		d3.setBackground(Color.WHITE);
		d3.setForeground(Color.WHITE);
		GridBagConstraints gbc_d3 = new GridBagConstraints();
		gbc_d3.insets = new Insets(0, 0, 5, 5);
		gbc_d3.gridx = 5;
		gbc_d3.gridy = 6;
		panel.add(d3, gbc_d3);

		JToggleButton e3 = new JToggleButton(" ");
		implementJToogleButton(e3, "e3");
		e3.setForeground(Color.BLACK);
		e3.setBackground(Color.BLACK);
		GridBagConstraints gbc_e3 = new GridBagConstraints();
		gbc_e3.insets = new Insets(0, 0, 5, 5);
		gbc_e3.gridx = 6;
		gbc_e3.gridy = 6;
		panel.add(e3, gbc_e3);

		JToggleButton f3 = new JToggleButton(" ");
		implementJToogleButton(f3, "f3");
		f3.setBackground(Color.WHITE);
		f3.setForeground(Color.WHITE);
		GridBagConstraints gbc_f3 = new GridBagConstraints();
		gbc_f3.insets = new Insets(0, 0, 5, 5);
		gbc_f3.gridx = 7;
		gbc_f3.gridy = 6;
		panel.add(f3, gbc_f3);

		JToggleButton g3 = new JToggleButton(" ");
		implementJToogleButton(g3, "g3");
		g3.setForeground(Color.BLACK);
		g3.setBackground(Color.BLACK);
		GridBagConstraints gbc_g3 = new GridBagConstraints();
		gbc_g3.insets = new Insets(0, 0, 5, 5);
		gbc_g3.gridx = 8;
		gbc_g3.gridy = 6;
		panel.add(g3, gbc_g3);

		JToggleButton h3 = new JToggleButton(" ");
		implementJToogleButton(h3, "h3");
		h3.setBackground(Color.WHITE);
		h3.setForeground(Color.WHITE);
		GridBagConstraints gbc_h3 = new GridBagConstraints();
		gbc_h3.insets = new Insets(0, 0, 5, 5);
		gbc_h3.gridx = 9;
		gbc_h3.gridy = 6;
		panel.add(h3, gbc_h3);

		JLabel twoLabel = new JLabel("2");
		GridBagConstraints gbc_twoLabel = new GridBagConstraints();
		gbc_twoLabel.insets = new Insets(0, 0, 5, 5);
		gbc_twoLabel.gridx = 1;
		gbc_twoLabel.gridy = 7;
		panel.add(twoLabel, gbc_twoLabel);

		JToggleButton a2 = new JToggleButton(" ");
		implementJToogleButton(a2, "a2");
		a2.setBackground(Color.WHITE);
		a2.setForeground(Color.WHITE);
		GridBagConstraints gbc_a2 = new GridBagConstraints();
		gbc_a2.insets = new Insets(0, 0, 5, 5);
		gbc_a2.gridx = 2;
		gbc_a2.gridy = 7;
		panel.add(a2, gbc_a2);

		JToggleButton b2 = new JToggleButton(" ");
		implementJToogleButton(b2, "b2");
		b2.setForeground(Color.BLACK);
		b2.setBackground(Color.BLACK);
		GridBagConstraints gbc_b2 = new GridBagConstraints();
		gbc_b2.insets = new Insets(0, 0, 5, 5);
		gbc_b2.gridx = 3;
		gbc_b2.gridy = 7;
		panel.add(b2, gbc_b2);

		JToggleButton c2 = new JToggleButton(" ");
		implementJToogleButton(c2, "c2");
		c2.setBackground(Color.WHITE);
		c2.setForeground(Color.WHITE);
		GridBagConstraints gbc_c2 = new GridBagConstraints();
		gbc_c2.insets = new Insets(0, 0, 5, 5);
		gbc_c2.gridx = 4;
		gbc_c2.gridy = 7;
		panel.add(c2, gbc_c2);

		JToggleButton d2 = new JToggleButton(" ");
		implementJToogleButton(d2, "d2");
		d2.setForeground(Color.BLACK);
		d2.setBackground(Color.BLACK);
		GridBagConstraints gbc_d2 = new GridBagConstraints();
		gbc_d2.insets = new Insets(0, 0, 5, 5);
		gbc_d2.gridx = 5;
		gbc_d2.gridy = 7;
		panel.add(d2, gbc_d2);

		JToggleButton e2 = new JToggleButton(" ");
		implementJToogleButton(e2, "e2");
		e2.setBackground(Color.WHITE);
		e2.setForeground(Color.WHITE);
		GridBagConstraints gbc_e2 = new GridBagConstraints();
		gbc_e2.insets = new Insets(0, 0, 5, 5);
		gbc_e2.gridx = 6;
		gbc_e2.gridy = 7;
		panel.add(e2, gbc_e2);

		JToggleButton f2 = new JToggleButton(" ");
		implementJToogleButton(f2, "f2");
		f2.setForeground(Color.BLACK);
		f2.setBackground(Color.BLACK);
		GridBagConstraints gbc_f2 = new GridBagConstraints();
		gbc_f2.insets = new Insets(0, 0, 5, 5);
		gbc_f2.gridx = 7;
		gbc_f2.gridy = 7;
		panel.add(f2, gbc_f2);

		JToggleButton g2 = new JToggleButton(" ");
		implementJToogleButton(g2, "g2");
		g2.setBackground(Color.WHITE);
		g2.setForeground(Color.WHITE);
		GridBagConstraints gbc_g2 = new GridBagConstraints();
		gbc_g2.insets = new Insets(0, 0, 5, 5);
		gbc_g2.gridx = 8;
		gbc_g2.gridy = 7;
		panel.add(g2, gbc_g2);

		JToggleButton h2 = new JToggleButton(" ");
		implementJToogleButton(h2, "h2");
		h2.setForeground(Color.BLACK);
		h2.setBackground(Color.BLACK);
		GridBagConstraints gbc_h2 = new GridBagConstraints();
		gbc_h2.insets = new Insets(0, 0, 5, 5);
		gbc_h2.gridx = 9;
		gbc_h2.gridy = 7;
		panel.add(h2, gbc_h2);

		JLabel oneLabel = new JLabel("1");
		GridBagConstraints gbc_oneLabel = new GridBagConstraints();
		gbc_oneLabel.insets = new Insets(0, 0, 5, 5);
		gbc_oneLabel.gridx = 1;
		gbc_oneLabel.gridy = 8;
		panel.add(oneLabel, gbc_oneLabel);

		JToggleButton a1 = new JToggleButton(" ");
		implementJToogleButton(a1, "a1");
		a1.setForeground(Color.BLACK);
		a1.setBackground(Color.BLACK);
		GridBagConstraints gbc_a1 = new GridBagConstraints();
		gbc_a1.insets = new Insets(0, 0, 5, 5);
		gbc_a1.gridx = 2;
		gbc_a1.gridy = 8;
		panel.add(a1, gbc_a1);

		JToggleButton b1 = new JToggleButton(" ");
		implementJToogleButton(b1, "b1");
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.WHITE);
		GridBagConstraints gbc_b1 = new GridBagConstraints();
		gbc_b1.insets = new Insets(0, 0, 5, 5);
		gbc_b1.gridx = 3;
		gbc_b1.gridy = 8;
		panel.add(b1, gbc_b1);

		JToggleButton c1 = new JToggleButton(" ");
		implementJToogleButton(c1, "c1");
		c1.setForeground(Color.BLACK);
		c1.setBackground(Color.BLACK);
		GridBagConstraints gbc_c1 = new GridBagConstraints();
		gbc_c1.insets = new Insets(0, 0, 5, 5);
		gbc_c1.gridx = 4;
		gbc_c1.gridy = 8;
		panel.add(c1, gbc_c1);

		JToggleButton d1 = new JToggleButton(" ");
		implementJToogleButton(d1, "d1");
		d1.setBackground(Color.WHITE);
		d1.setForeground(Color.WHITE);
		GridBagConstraints gbc_d1 = new GridBagConstraints();
		gbc_d1.insets = new Insets(0, 0, 5, 5);
		gbc_d1.gridx = 5;
		gbc_d1.gridy = 8;
		panel.add(d1, gbc_d1);

		JToggleButton e1 = new JToggleButton(" ");
		implementJToogleButton(e1, "e1");
		e1.setForeground(Color.BLACK);
		e1.setBackground(Color.BLACK);
		GridBagConstraints gbc_e1 = new GridBagConstraints();
		gbc_e1.insets = new Insets(0, 0, 5, 5);
		gbc_e1.gridx = 6;
		gbc_e1.gridy = 8;
		panel.add(e1, gbc_e1);

		JToggleButton f1 = new JToggleButton(" ");
		implementJToogleButton(f1, "f1");
		f1.setBackground(Color.WHITE);
		f1.setForeground(Color.WHITE);
		GridBagConstraints gbc_f1 = new GridBagConstraints();
		gbc_f1.insets = new Insets(0, 0, 5, 5);
		gbc_f1.gridx = 7;
		gbc_f1.gridy = 8;
		panel.add(f1, gbc_f1);

		JToggleButton g1 = new JToggleButton(" ");
		implementJToogleButton(g1, "g1");
		g1.setForeground(Color.BLACK);
		g1.setBackground(Color.BLACK);
		GridBagConstraints gbc_g1 = new GridBagConstraints();
		gbc_g1.insets = new Insets(0, 0, 5, 5);
		gbc_g1.gridx = 8;
		gbc_g1.gridy = 8;
		panel.add(g1, gbc_g1);

		JToggleButton h1 = new JToggleButton(" ");
		implementJToogleButton(h1, "h1");
		h1.setBackground(Color.WHITE);
		h1.setForeground(Color.WHITE);
		GridBagConstraints gbc_h1 = new GridBagConstraints();
		gbc_h1.insets = new Insets(0, 0, 5, 5);
		gbc_h1.gridx = 9;
		gbc_h1.gridy = 8;
		panel.add(h1, gbc_h1);

		JLabel aLabel = new JLabel("A");
		GridBagConstraints gbc_aLabel = new GridBagConstraints();
		gbc_aLabel.insets = new Insets(0, 0, 5, 5);
		gbc_aLabel.gridx = 2;
		gbc_aLabel.gridy = 9;
		panel.add(aLabel, gbc_aLabel);

		JLabel bLabel = new JLabel("B");
		GridBagConstraints gbc_bLabel = new GridBagConstraints();
		gbc_bLabel.insets = new Insets(0, 0, 5, 5);
		gbc_bLabel.gridx = 3;
		gbc_bLabel.gridy = 9;
		panel.add(bLabel, gbc_bLabel);

		JLabel cLabel = new JLabel("C");
		GridBagConstraints gbc_cLabel = new GridBagConstraints();
		gbc_cLabel.insets = new Insets(0, 0, 5, 5);
		gbc_cLabel.gridx = 4;
		gbc_cLabel.gridy = 9;
		panel.add(cLabel, gbc_cLabel);

		JLabel dLabel = new JLabel("D");
		GridBagConstraints gbc_dLabel = new GridBagConstraints();
		gbc_dLabel.insets = new Insets(0, 0, 5, 5);
		gbc_dLabel.gridx = 5;
		gbc_dLabel.gridy = 9;
		panel.add(dLabel, gbc_dLabel);

		JLabel eLabel = new JLabel("E");
		GridBagConstraints gbc_eLabel = new GridBagConstraints();
		gbc_eLabel.insets = new Insets(0, 0, 5, 5);
		gbc_eLabel.gridx = 6;
		gbc_eLabel.gridy = 9;
		panel.add(eLabel, gbc_eLabel);

		JLabel fLabel = new JLabel("F");
		GridBagConstraints gbc_fLabel = new GridBagConstraints();
		gbc_fLabel.insets = new Insets(0, 0, 5, 5);
		gbc_fLabel.gridx = 7;
		gbc_fLabel.gridy = 9;
		panel.add(fLabel, gbc_fLabel);

		JLabel gLabel = new JLabel("G");
		GridBagConstraints gbc_gLabel = new GridBagConstraints();
		gbc_gLabel.insets = new Insets(0, 0, 5, 5);
		gbc_gLabel.gridx = 8;
		gbc_gLabel.gridy = 9;
		panel.add(gLabel, gbc_gLabel);

		JLabel hLabel = new JLabel("H");
		GridBagConstraints gbc_hLabel = new GridBagConstraints();
		gbc_hLabel.insets = new Insets(0, 0, 5, 5);
		gbc_hLabel.gridx = 9;
		gbc_hLabel.gridy = 9;
		panel.add(hLabel, gbc_hLabel);
	}

	public void implementJToogleButton(JToggleButton button, String coordinate) {
		buttons.put(coordinate, button);
		button.setUI(new MetalToggleButtonUI() {
			@Override
			protected Color getSelectColor() {
				return Color.RED;
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!controller.move(coordinate)) {
					displayLabel.setText("INVALID MOVE: " + coordinate);
					if (controller.getStatus() == Controller.STATUS_LAST_MOVE) {
						button.setSelected(true);
					} else if (controller.getStatus() == Controller.STATUS_INVALID_MOVE) {
						button.setSelected(false);
					}
				} else {
					if (controller.getStatus().equals(Controller.STATUS_END)) {
						launchEndWindow();
					}
					for(String c: controller.getCoordinates()){
						JToggleButton b = buttons.get(c);
						b.setUI(new MetalToggleButtonUI() {
							@Override
							protected Color getSelectColor() {
								return Color.GREEN;
							}
						});
					}
					button.setUI(new MetalToggleButtonUI() {
						@Override
						protected Color getSelectColor() {
							return Color.RED;
						}
					});
					displayLabel.setText("");
				}
			}
		});
	}

	private void launchEndWindow() {
		EndWindow end = new EndWindow();
		end.main();
		this.frame.setVisible(false);
	}

}
