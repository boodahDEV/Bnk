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
		
		
		JLabel login = new JLabel("Welcome ADMIN of the configure system");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		login.setBounds(125, 35, 800, 65);
		add(login);
		
		JLabel icon = new JLabel(" ");
		icon.setIcon(new ImageIcon(Panel_admin.class.getResource("/image/config.png")));
		icon.setBounds(473, 111, 64, 64);
		add(icon);
		

				JButton jbadd = new JButton("");
				jbadd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						paneles.panel_addUser pu = new paneles.panel_addUser(gui);				//---=== Se llama al panel_addUser
						new paneles.Cambia_paneles(gui.principal,pu);
						pu.me(pu);
					}
				});
				jbadd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				jbadd.setIconTextGap(-20);
				jbadd.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/add.png")));
				jbadd.setToolTipText("Exit");
				jbadd.setFocusable(false);
				jbadd.setContentAreaFilled(false);
				jbadd.setBorderPainted(false);
				jbadd.setBounds(3, 5, 40, 40);
				gui.dashboard.add(jbadd);
				
				JButton rep = new JButton("");
				rep.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
		
					}
				});
				rep.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				rep.setIconTextGap(-20);
				rep.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/reporte.png")));
				rep.setToolTipText("Exit");
				rep.setFocusable(false);
				rep.setContentAreaFilled(false);
				rep.setBorderPainted(false);
				rep.setBounds(3, 50, 40, 40);
				gui.dashboard.add(rep);
		
	}
	
}//---=== END CLASS 
