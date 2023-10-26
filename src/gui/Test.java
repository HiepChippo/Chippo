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
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Test extends JFrame {

	private JPanel contentPane;
	private JButton btnTrangChu;
	private GradientPanel panel;
	private JButton btnDangXuat;
	private JButton btnHoTro;
	private JButton btnTaiKhoan;
	private JButton btnNhanVien;
	private JButton btnCongNhan;
	private static Test mainFrame = new Test();

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
	public Test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1800, 800);
//		setExtendedState(Frame.MAXIMIZED_BOTH);
//		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new GradientPanel();
		panel.setLayout(null);
		panel.setBounds(0, 0, 282, 871);
		panel.setkStartColor(Color.decode("#3494E6"));
		panel.setkGradientFocus(200);
		panel.setkEndColor(Color.decode("#EC6EAD"));
		contentPane.add(panel);
		
		btnTrangChu = new JButton("Trang chủ");
		btnTrangChu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTrangChu.setOpaque(false);
		btnTrangChu.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnTrangChu.setBorder(null);
		btnTrangChu.setBackground(Color.WHITE);
		btnTrangChu.setBounds(10, 205, 260, 55);
		panel.add(btnTrangChu);
		
		btnCongNhan = new JButton("Công nhân");
		btnCongNhan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCongNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCongNhan.setOpaque(false);
		btnCongNhan.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnCongNhan.setBorder(null);
		btnCongNhan.setBackground(Color.WHITE);
		btnCongNhan.setBounds(10, 270, 260, 55);
		panel.add(btnCongNhan);
		
		btnNhanVien = new JButton("Nhân viên");
		btnNhanVien.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNhanVien.setOpaque(false);
		btnNhanVien.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnNhanVien.setBorder(null);
		btnNhanVien.setBackground(Color.WHITE);
		btnNhanVien.setBounds(10, 335, 260, 55);
		panel.add(btnNhanVien);
		
		btnTaiKhoan = new JButton("Tài khoản");
		btnTaiKhoan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTaiKhoan.setOpaque(false);
		btnTaiKhoan.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnTaiKhoan.setBorder(null);
		btnTaiKhoan.setBackground(Color.WHITE);
		btnTaiKhoan.setBounds(10, 400, 260, 55);
		panel.add(btnTaiKhoan);
		
		btnHoTro = new JButton("Hỗ trợ");
		btnHoTro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHoTro.setOpaque(false);
		btnHoTro.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnHoTro.setBorder(null);
		btnHoTro.setBackground(Color.WHITE);
		btnHoTro.setBounds(10, 465, 260, 55);
		panel.add(btnHoTro);
		
		btnDangXuat = new JButton("Đăng xuất");
		btnDangXuat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDangXuat.setIcon(new ImageIcon(Test.class.getResource("/icon/icons8_exit_40px_1.png")));
		btnDangXuat.setOpaque(false);
		btnDangXuat.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		btnDangXuat.setBorder(null);
		btnDangXuat.setBackground(Color.WHITE);
		btnDangXuat.setBounds(10, 737, 260, 55);
		panel.add(btnDangXuat);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(137, 135, 1, 1);
		panel.add(layeredPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(281, 0, 1252, 800);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(228, 228, 228));
		panel_1_1.setBounds(0, 0, 1252, 40);
		panel_1_1.setSize(panel_1.getMaximumSize().width, 40);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(1178, 10, 65, 21);
		panel_1_1.add(btnNewButton);
	}
}
