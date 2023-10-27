package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import swing.PanelButton;
import swing.GradientPanel;
import swing.PanelButton;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Component;

public class Main_GUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private PanelButton btnTrangChu;
	private GradientPanel panel;
	private PanelButton btnDangXuat;
	private PanelButton btnHoTro;
	private PanelButton btnTaiKhoan;
	private PanelButton btnNhanVien;
	private PanelButton btnCongNhan;
	private int viTriButtonHienTai;
	private ArrayList<PanelButton> listItem;
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
		setResizable(false);
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
		
		btnTrangChu = new PanelButton();
		btnTrangChu.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setButtonColor(0);
			}
		});
		btnTrangChu.setBounds(0, 205, 282, 55);
		panel.add(btnTrangChu);
		
		btnCongNhan = new PanelButton();
		btnCongNhan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setButtonColor(1);
			}
		});
		btnCongNhan.setBounds(0, 270, 282, 55);
		panel.add(btnCongNhan);
		
		btnNhanVien = new PanelButton();
		btnNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setButtonColor(2);
			}
		});
		btnNhanVien.setBounds(0, 335, 282, 55);
		panel.add(btnNhanVien);
		
		btnTaiKhoan = new PanelButton();
		btnTaiKhoan.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setButtonColor(3);
			}
		});
		btnTaiKhoan.setBounds(0, 400, 282, 55);
		panel.add(btnTaiKhoan);
		
		btnHoTro = new PanelButton();
		btnHoTro.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				setButtonColor(4);
			}
		});
		btnHoTro.setBounds(0, 465, 282, 55);
		panel.add(btnHoTro);
		
		btnDangXuat = new PanelButton();
		btnDangXuat.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if((JOptionPane.showConfirmDialog(mainFrame, "Bạn có muốn thoát không?", "Hỏi nhắc", JOptionPane.YES_NO_OPTION))== JOptionPane.YES_NO_OPTION) {
					openLogin_GUI();
					mainFrame.dispose();
				}
			}
		});
		btnDangXuat.setBounds(0, 695, 282, 55);
		panel.add(btnDangXuat);
		
		JLabel lblDangXuat = new JLabel("Đăng xuất");
		lblDangXuat.setBounds(98, 14, 122, 27);
		lblDangXuat.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblDangXuat.setForeground(new Color(255, 255, 255));
		btnDangXuat.add(lblDangXuat);
		
		JLabel lblDangXuatIcon = new JLabel();
		lblDangXuatIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/icons8_exit_40px_1.png")));
		lblDangXuatIcon.setBounds(25, 8, 40, 40);
		btnDangXuat.add(lblDangXuatIcon);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(281, 0, 1252, 763);
		panel_1.setLayout(null);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(228, 228, 228));
		panel_1_1.setBounds(0, 0, 1252, 40);
//		panel_1_1.setSize(panel_1.getMaximumSize().width, 40);
		panel_1.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblTenNhanVien = new JLabel("-");
		lblTenNhanVien.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblTenNhanVien.setBounds(900, 0, 251, 40);
		panel_1_1.add(lblTenNhanVien);
		
		
		JLabel lblTrangChuIcon = new JLabel();
		lblTrangChuIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/home.png")));
		lblTrangChuIcon.setBounds(20, 8, 40, 40);
		btnTrangChu.add(lblTrangChuIcon);
		
		JLabel lblTrangChu = new JLabel("Trang chủ");
		lblTrangChu.setForeground(Color.WHITE);
		lblTrangChu.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblTrangChu.setBounds(100, 14, 122, 27);
		btnTrangChu.add(lblTrangChu);
		
		JLabel lblCongNhanIcon = new JLabel();
		lblCongNhanIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/worker.png")));
		lblCongNhanIcon.setBounds(20, 8, 40, 40);
		btnCongNhan.add(lblCongNhanIcon);
		
		JLabel lblCongNhan = new JLabel("Công nhân");
		lblCongNhan.setForeground(Color.WHITE);
		lblCongNhan.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblCongNhan.setBounds(100, 14, 122, 27);
		btnCongNhan.add(lblCongNhan);
		
		JLabel lblNhanVienIcon = new JLabel();
		lblNhanVienIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/person.png")));
		lblNhanVienIcon.setBounds(20, 8, 40, 40);
		btnNhanVien.add(lblNhanVienIcon);
		
		JLabel lblNhanVien = new JLabel("Nhân viên");
		lblNhanVien.setForeground(Color.WHITE);
		lblNhanVien.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblNhanVien.setBounds(100, 14, 122, 27);
		btnNhanVien.add(lblNhanVien);
		
		JLabel lblTaiKhoanIcon = new JLabel();
		lblTaiKhoanIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/user.png")));
		lblTaiKhoanIcon.setBounds(20, 8, 40, 40);
		btnTaiKhoan.add(lblTaiKhoanIcon);
		
		JLabel lblTaiKhoan = new JLabel("Tài khoản");
		lblTaiKhoan.setForeground(Color.WHITE);
		lblTaiKhoan.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblTaiKhoan.setBounds(100, 14, 122, 27);
		btnTaiKhoan.add(lblTaiKhoan);
		
		JLabel lblHoTroIcon = new JLabel();
		lblHoTroIcon.setIcon(new ImageIcon(Main_GUI.class.getResource("/icon/icons8_help_40px.png")));
		lblHoTroIcon.setBounds(20, 8, 40, 40);
		btnHoTro.add(lblHoTroIcon);
		
		JLabel lblHoTro = new JLabel("Hỗ trợ");
		lblHoTro.setForeground(Color.WHITE);
		lblHoTro.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 20));
		lblHoTro.setBounds(100, 14, 122, 27);
		btnHoTro.add(lblHoTro);
		
		// List button
		listItem = new ArrayList<PanelButton>();
		listItem.add(btnTrangChu);
		listItem.add(btnCongNhan);
		listItem.add(btnNhanVien);
		listItem.add(btnTaiKhoan);
		listItem.add(btnHoTro);
		
		JLabel lblLogo = new JLabel();
		Image logo = new ImageIcon(Main_GUI.class.getResource("/icon/logo.jpg")).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new ImageIcon(logo);
		lblLogo.setIcon(logoIcon);
		lblLogo.setBounds(10, 10, 150, 150);
		panel.add(lblLogo);

		viTriButtonHienTai = -1;
		
		
		// Đăng ký sự kiện

		
	}
	
	/**
	 * Mở login ui
	 */
	private void openLogin_GUI() {
		Login_GUI.openLogin_GUI();
	}
	
	private void setButtonColor(int viTri) {
		PanelButton menuItem = new PanelButton();
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
		
	}
}
