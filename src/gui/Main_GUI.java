package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import customdesign.GradientPanel;

import java.awt.Font;

public class Main_GUI extends JFrame {

	private JPanel contentPane;
	private JButton btnTrangChu;
	private GradientPanel panel;
	private static Main_GUI mainFrame = new Main_GUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			mainFrame.setVisible(true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void openMain_GUI() {
		mainFrame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Main_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new GradientPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 280, 763);
		contentPane.add(panel);
		
		btnTrangChu = new JButton("Trang chủ");
		btnTrangChu.setOpaque(false);
		btnTrangChu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnTrangChu.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnTrangChu.setBackground(Color.WHITE);
		btnTrangChu.setBounds(10, 205, 260, 55);
		panel.add(btnTrangChu);
	}

}
