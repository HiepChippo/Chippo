package swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.plaf.ComponentUI;

public class PanelButton extends JPanel {
	private Color mainColor;
	private Color overColor;
	private Color clickColor;
	private boolean over;
	private boolean selected;
	
	public PanelButton() {
		super();
		setButton();
	}
	
	public void setButton() {
		mainColor = new Color(0, 0, 0);
		overColor = new Color(236, 236, 236);
		
		setBorder(null);
		setLayout(null);
		setOpaque(false);
		setBackground(mainColor);
		setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setFont(new Font("Segoe UI", Font.PLAIN, 20));
		setForeground(Color.WHITE);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				over = true;
				repaint();
			}
			@Override
			public void mouseExited(MouseEvent e) {
				over = false;
				repaint();
			}
			@Override
			public void mousePressed(MouseEvent e) {
				selected = true;
				repaint();
			}
		});
	}
	
	public Color getMainColor() {
		return mainColor;
	}
	public void setMainColor(Color mainColor) {
		this.mainColor = mainColor;
	}
	public Color getOverColor() {
		return overColor;
	}
	public void setOverColor(Color overColor) {
		this.overColor = overColor;
	}
	public Color getClickColor() {
		return clickColor;
	}
	public void setClickColor(Color clickColor) {
		this.clickColor = clickColor;
	}
	public boolean isOver() {
		return over;
	}
	public void setOver(boolean flag) {
		this.over = flag;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
    protected void paintComponent(Graphics grphcs) {
        if (selected || over) {
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            if (selected) {
                g2.setColor(new Color(255, 255, 255, 80));
            } else {
                g2.setColor(new Color(255, 255, 255, 40));
            }
            g2.fillRoundRect(10, 0, getWidth() - 20, getHeight(), 5, 5);
        }
        super.paintComponent(grphcs);
    }
}