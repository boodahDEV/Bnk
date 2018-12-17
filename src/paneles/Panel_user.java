package paneles;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import principal.Bnk_GUI;

public class Panel_user extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel_user(Bnk_GUI main, String nombre,String apellido, String tipoc, double balance,String pass, String numc) {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Welcome '"+nombre+"' to the Bnk system");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Gothic", Font.PLAIN, 40));
		login.setBounds(125, 35, 800, 65);
		add(login);
		
		JLabel icon = new JLabel(" ");
		icon.setIcon(new ImageIcon(Panel_admin.class.getResource("/image/user.png")));
		icon.setBounds(473, 111, 64, 64);
		add(icon);
		
		JPanel panel_dato = new JPanel();
		panel_dato.setBackground(new Color(16,32,39));
		panel_dato.setBounds(10, 520, 496, 51);
		add(panel_dato);
		panel_dato.setLayout(null);

		JPanel panel_statu = new JPanel();
		panel_statu.setBackground(new Color(16,32,39));
		panel_statu.setBounds(529, 520, 496, 51);
		add(panel_statu);
		panel_statu.setLayout(null);
		
				JButton deposita = new JButton("");
				deposita.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						paneles.panel_addUser pu = new paneles.panel_addUser(main);				//---=== Se llama al panel_addUser
						new paneles.Cambia_paneles(main.principal,pu);
						pu.me(pu);
					}
				});
				deposita.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				deposita.setIconTextGap(-20);
				deposita.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/deposit.png")));
				deposita.setToolTipText("Deposit");
				deposita.setFocusable(false);
				deposita.setContentAreaFilled(false);
				deposita.setBorderPainted(false);
				deposita.setBounds(3, 5, 40, 40);
				main.dashboard.add(deposita);
				
				JButton retira = new JButton("");
				retira.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
		
					}
				});
				retira.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				retira.setIconTextGap(-20);
				retira.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/withdraw.png")));
				retira.setToolTipText("Withdraw");
				retira.setFocusable(false);
				retira.setContentAreaFilled(false);
				retira.setBorderPainted(false);
				retira.setBounds(3, 55, 40, 40);
				main.dashboard.add(retira);
				
				JButton bal = new JButton("");
				bal.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
		
					}
				});
				bal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				bal.setIconTextGap(-20);
				bal.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/bal.png")));
				bal.setToolTipText("Balance");
				bal.setFocusable(false);
				bal.setContentAreaFilled(false);
				bal.setBorderPainted(false);
				bal.setBounds(3, 105, 40, 40);
				main.dashboard.add(bal);
				
				JButton check = new JButton("");
				check.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
		
					}
				});
				check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				check.setIconTextGap(-20);
				check.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/ver.png")));
				check.setToolTipText("Check");
				check.setFocusable(false);
				check.setContentAreaFilled(false);
				check.setBorderPainted(false);
				check.setBounds(3, 155, 40, 40);
				main.dashboard.add(check);
				main.dashboard.repaint();
		
	}
}
