package gui;

import java.awt.Button;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1163, 10, 367, 48);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(280, 0, 77, 48);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(256, 10, 101, 22);
		panel.add(menuBar);
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setBounds(0, 0, 143, 100);
		panel.add(popupMenu);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(234, 0, 111, 24);
		menuBar.add(mnNewMenu);
		menuBar.add(mnNewMenu);
		
		mnNewMenu.add(new JMenuItem("huh"));
		

	}
}
