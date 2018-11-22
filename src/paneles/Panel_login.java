package paneles;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Panel_login extends JPanel {
	private JTextField jtf_user;
	private JPasswordField jpf_pass;

	/**
	 * Create the panel.
	 */
	public Panel_login() {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Log in ");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		login.setBounds(445, 39, 137, 65);
		add(login);
		
		JLabel jluser = new JLabel("User name:");
		jluser.setForeground(new Color(105, 105, 105));
		jluser.setFont(new Font("Century Gothic", Font.PLAIN, 23));
		jluser.setBounds(400, 160, 127, 30);
		add(jluser);
		
		jtf_user = new JTextField();
		jtf_user.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_user.setForeground(new Color(169, 169, 169));
		jtf_user.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_user.setBackground(new Color(16,32,39));
		jtf_user.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		jtf_user.setBounds(440, 195, 150, 30);
		add(jtf_user);
		
		JLabel jlpass = new JLabel("Password:");
		jlpass.setForeground(SystemColor.controlDkShadow);
		jlpass.setFont(new Font("Century Gothic", Font.PLAIN, 23));
		jlpass.setBounds(400, 244, 127, 30);
		add(jlpass);
		
		jpf_pass = new JPasswordField();
		jpf_pass.setForeground(new Color(169, 169, 169));
		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
		jpf_pass.setBackground(new Color(16,32,39));
		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jpf_pass.setFont(new Font("Century Gothic", Font.BOLD, 18));
		jpf_pass.setEchoChar('*');
		jpf_pass.setBounds(440, 285, 150, 30);
		add(jpf_pass);
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
	}
}
