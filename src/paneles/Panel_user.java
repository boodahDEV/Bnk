package paneles;

import java.awt.*;
import javax.swing.*;
import principal.Bnk_GUI;

public class Panel_user extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_user(Bnk_GUI main) {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Welcome to the Bnk system");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		login.setBounds(125, 35, 800, 65);
		add(login);
		
		JLabel icon = new JLabel(" ");
		icon.setIcon(new ImageIcon(Panel_admin.class.getResource("/image/user.png")));
		icon.setBounds(473, 111, 64, 64);
		add(icon);
	}

}
