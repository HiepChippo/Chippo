package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import customdesign.ButtonCustom;
import customdesign.GradientPanel;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

public class Main_GUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private ButtonCustom btnTrangChu;
	private GradientPanel panel;
	private ButtonCustom btnDangXuat;
	private ButtonCustom btnHoTro;
	private ButtonCustom btnTaiKhoan;
	private ButtonCustom btnNhanVien;
	private ButtonCustom btnCongNhan;
	private int viTriButtonHienTai;
	private ArrayList<ButtonCustom> listItem;
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
//		setExtendedState(Frame.MAXIMIZED_BOTH);
//		setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		setUndecorated(true);
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
		
		btnTrangChu = new ButtonCustom();
		btnTrangChu.setFocusPainted(false);
		btnTrangChu.setText("Trang chủ");
		btnTrangChu.setClickColor(new Color(108, 166, 193));
		btnTrangChu.setOverColor(new Color(255, 74, 255));
		btnTrangChu.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/home.png")));
		btnTrangChu.setBounds(0, 205, 282, 55);
		panel.add(btnTrangChu);
		
		btnCongNhan = new ButtonCustom();
		btnCongNhan.setFocusPainted(false);
		btnCongNhan.setText("Công nhân");
		btnCongNhan.setClickColor(new Color(108, 166, 193));
		btnCongNhan.setOverColor(new Color(255, 74, 255));
		btnCongNhan.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/worker.png")));
		btnCongNhan.setBounds(0, 270, 282, 55);
		panel.add(btnCongNhan);
		
		btnNhanVien = new ButtonCustom();
		btnNhanVien.setFocusPainted(false);
		btnNhanVien.setText("Nhân viên");
		btnNhanVien.setClickColor(new Color(108, 166, 193));
		btnNhanVien.setOverColor(new Color(255, 74, 255));
		btnNhanVien.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/person.png")));
		btnNhanVien.setBounds(0, 335, 282, 55);
		panel.add(btnNhanVien);
		
		btnTaiKhoan = new ButtonCustom();
		btnTaiKhoan.setFocusPainted(false);
		btnTaiKhoan.setText("Tài khoản");
		btnTaiKhoan.setClickColor(new Color(108, 166, 193));
		btnTaiKhoan.setOverColor(new Color(255, 74, 255));
		btnTaiKhoan.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/user.png")));
		btnTaiKhoan.setBounds(0, 400, 282, 55);
		panel.add(btnTaiKhoan);
		
		btnHoTro = new ButtonCustom();
		btnHoTro.setFocusPainted(false);
		btnHoTro.setText("Hỗ trợ");
		btnHoTro.setClickColor(new Color(165, 200, 217));
		btnHoTro.setOverColor(new Color(255, 74, 255));
		btnHoTro.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/icons8_help_40px.png")));
		btnHoTro.setBounds(0, 465, 282, 55);
		panel.add(btnHoTro);
		
		btnDangXuat = new ButtonCustom();
		btnDangXuat.setFocusPainted(false);
		btnDangXuat.setClickColor(new Color(108, 166, 193));
		btnDangXuat.setOverColor(new Color(255, 74, 255));
		btnDangXuat.setText("Đăng xuất");
		btnDangXuat.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/icons8_exit_40px_1.png")));
		btnDangXuat.setBounds(0, 695, 282, 55);
		panel.add(btnDangXuat);

		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(281, 0, 1252, 800);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(228, 228, 228));
		panel_1_1.setBounds(0, 0, 1252, 40);
//		panel_1_1.setSize(panel_1.getMaximumSize().width, 40);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		// List button
		listItem = new ArrayList<ButtonCustom>();
		listItem.add(btnTrangChu);
		listItem.add(btnCongNhan);
		listItem.add(btnNhanVien);
		listItem.add(btnTaiKhoan);
		listItem.add(btnHoTro);

		viTriButtonHienTai = -1;
		
		
		// Đăng ký sự kiện
		btnTrangChu.addActionListener(this);
		btnCongNhan.addActionListener(this);
		btnNhanVien.addActionListener(this);
		btnTaiKhoan.addActionListener(this);
		btnHoTro.addActionListener(this);
		btnDangXuat.addActionListener(this);
		
		
	}
	
	/**
	 * Mở login ui
	 */
	private void openLogin_GUI() {
		Login_GUI.openLogin_GUI();
	}
	
	private void setButtonColor(int viTri) {
		ButtonCustom menuItem = new ButtonCustom();
		if(viTriButtonHienTai != -1) {
			menuItem = listItem.get(viTriButtonHienTai);
			menuItem.setSelected(false);
			repaint();
		}
		viTriButtonHienTai = viTri;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if(o.equals(btnTrangChu)) {
			setButtonColor(0);
		}
		else if(o.equals(btnCongNhan)){
			setButtonColor(1);
		}
		else if(o.equals(btnNhanVien)){
			setButtonColor(2);
		}
		else if(o.equals(btnTaiKhoan)){
			setButtonColor(3);
		}
		else if(o.equals(btnHoTro)){
			setButtonColor(4);
		}
		else if(o.equals(btnDangXuat)){
			btnDangXuat.setSelected(false);
			if((JOptionPane.showConfirmDialog(this, "Bạn có muốn đăng xuất không?", "Hỏi nhắc", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)){
				openLogin_GUI();
				this.dispose();
			}
		}
		
	}
}
