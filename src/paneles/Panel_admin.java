package paneles;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

import Resources.*;
import principal.Bnk_GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_admin extends JPanel {
	private JTextField jtf_user;
	private JPasswordField jpf_pass;

	/**
	 * Create the panel.
	 */
	public Panel_admin(Bnk_GUI gui) {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Welcome ADMIN madafaca :V");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		login.setBounds(445, 39, 300, 65);
		add(login);
		
	}
	
}//---=== END CLASS 
