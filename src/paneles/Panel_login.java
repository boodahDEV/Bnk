package paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Panel_login extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Panel_login() {
		this.setBounds(70, 70, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Log in ");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		login.setBounds(445, 39, 137, 65);
		add(login);
		
		textField = new JTextField();
		textField.setBackground(new Color(16,32,39));
		textField.setFocusable(false);
		textField.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		textField.setBounds(440, 195, 150, 30);
		add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setFocusable(false);
		passwordField.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		passwordField.setEchoChar('*');
		passwordField.setBounds(440, 285, 150, 30);
		add(passwordField);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label.setBounds(0, 0, 1035, 877);
		add(label);
	}
}
