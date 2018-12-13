package paneles;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import principal.Bnk_GUI;

public class Panel_principal extends JPanel {
	public JLabel titulo;
	/**
	 * Create the panel.
	 */
	public Panel_principal() {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		titulo = new JLabel("Welcome to the Bnk  system");
		titulo.setForeground(new Color(105, 105, 105));
		titulo.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		titulo.setBounds(59, 115, 651, 302);
		add(titulo);
		
		JLabel arrow_left = new JLabel(" ");
		arrow_left.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/senal.png")));
		arrow_left.setBounds(0, 57, 35, 35);
		add(arrow_left);
		
		JLabel text_sign = new JLabel("Sign in");
		text_sign.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		text_sign.setForeground(new Color(105, 105, 105));
		text_sign.setBounds(38, 67, 51, 21);
		add(text_sign);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/wallpaper1.png")));
		label.setBounds(568, -34, 590, 655);
		add(label);
	}

}
