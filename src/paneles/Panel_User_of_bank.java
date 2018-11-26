package paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Resources.MaterialButton;
import javax.swing.JPasswordField;

public class Panel_User_of_bank extends JPanel {
	private JPasswordField jpf_pass;

	/**
	 * Create the panel.
	 */
	public Panel_User_of_bank() {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel lblBnk = new JLabel("BNK ");
		lblBnk.setForeground(new Color(128, 128, 128));
		lblBnk.setFont(new Font("Century Schoolbook L", Font.BOLD, 40));
		lblBnk.setBounds(457, 48, 110, 40);
		add(lblBnk);
		
		JLabel lblBnk2 = new JLabel("The most reliable system.");
		lblBnk2.setFont(new Font("Century Schoolbook L", Font.BOLD, 25));
		lblBnk2.setBounds(340, 80, 340, 40);
		add(lblBnk2);
		
		jpf_pass = new JPasswordField();
		jpf_pass.setForeground(new Color(169, 169, 169));
		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
		jpf_pass.setBackground(new Color(16,32,39));
		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jpf_pass.setFont(new Font("Century Gothic", Font.BOLD, 18));
		jpf_pass.setEchoChar('*');
		jpf_pass.setBounds(423, 220, 170, 30);
		add(jpf_pass);
		
		MaterialButton jbnum_1 = new MaterialButton();
		jbnum_1.setText("1");
		jbnum_1.setColorNormal(new Color(66,66,66));
		jbnum_1.setColorHover(new Color(30,136,229));
		jbnum_1.setColorPressed(new Color(33,150,243));
		jbnum_1.setColorTextNormal(new Color(109,109,109));
		jbnum_1.setColorTextHover(new Color(255,255,255));
		jbnum_1.setColorTextPressed(new Color(255,255,255));
		jbnum_1.setFocusable(false);
		jbnum_1.setBounds(423, 275, 50, 35);
		add(jbnum_1);
		
		MaterialButton jbnum_2 = new MaterialButton();
		jbnum_2.setText("2");
		jbnum_2.setColorNormal(new Color(66,66,66));
		jbnum_2.setColorHover(new Color(30,136,229));
		jbnum_2.setColorPressed(new Color(33,150,243));
		jbnum_2.setColorTextNormal(new Color(109,109,109));
		jbnum_2.setColorTextHover(new Color(255,255,255));
		jbnum_2.setColorTextPressed(new Color(255,255,255));
		jbnum_2.setFocusable(false);
		jbnum_2.setBounds(483, 275, 50, 35);
		add(jbnum_2);
		
		MaterialButton jbnum_3 = new MaterialButton();
		jbnum_3.setText("3");
		jbnum_3.setColorNormal(new Color(66,66,66));
		jbnum_3.setColorHover(new Color(30,136,229));
		jbnum_3.setColorPressed(new Color(33,150,243));
		jbnum_3.setColorTextNormal(new Color(109,109,109));
		jbnum_3.setColorTextHover(new Color(255,255,255));
		jbnum_3.setColorTextPressed(new Color(255,255,255));
		jbnum_3.setFocusable(false);
		jbnum_3.setBounds(543, 275, 50, 35);
		add(jbnum_3);
		
		MaterialButton jbnum_4 = new MaterialButton();
		jbnum_4.setText("4");
		jbnum_4.setColorNormal(new Color(66,66,66));
		jbnum_4.setColorHover(new Color(30,136,229));
		jbnum_4.setColorPressed(new Color(33,150,243));
		jbnum_4.setColorTextNormal(new Color(109,109,109));
		jbnum_4.setColorTextHover(new Color(255,255,255));
		jbnum_4.setColorTextPressed(new Color(255,255,255));
		jbnum_4.setFocusable(false);
		jbnum_4.setBounds(423, 322, 50, 35);
		add(jbnum_4);
		
		MaterialButton jbnum_5 = new MaterialButton();
		jbnum_5.setText("5");
		jbnum_5.setColorNormal(new Color(66,66,66));
		jbnum_5.setColorHover(new Color(30,136,229));
		jbnum_5.setColorPressed(new Color(33,150,243));
		jbnum_5.setColorTextNormal(new Color(109,109,109));
		jbnum_5.setColorTextHover(new Color(255,255,255));
		jbnum_5.setColorTextPressed(new Color(255,255,255));
		jbnum_5.setFocusable(false);
		jbnum_5.setBounds(483, 322, 50, 35);
		add(jbnum_5);
		
		MaterialButton jbnum_6 = new MaterialButton();
		jbnum_6.setText("6");
		jbnum_6.setColorNormal(new Color(66,66,66));
		jbnum_6.setColorHover(new Color(30,136,229));
		jbnum_6.setColorPressed(new Color(33,150,243));
		jbnum_6.setColorTextNormal(new Color(109,109,109));
		jbnum_6.setColorTextHover(new Color(255,255,255));
		jbnum_6.setColorTextPressed(new Color(255,255,255));
		jbnum_6.setFocusable(false);
		jbnum_6.setBounds(543, 322, 50, 35);
		add(jbnum_6);
		
		MaterialButton jbnum_7 = new MaterialButton();
		jbnum_7.setText("7");
		jbnum_7.setColorNormal(new Color(66,66,66));
		jbnum_7.setColorHover(new Color(30,136,229));
		jbnum_7.setColorPressed(new Color(33,150,243));
		jbnum_7.setColorTextNormal(new Color(109,109,109));
		jbnum_7.setColorTextHover(new Color(255,255,255));
		jbnum_7.setColorTextPressed(new Color(255,255,255));
		jbnum_7.setFocusable(false);
		jbnum_7.setBounds(423, 369, 50, 35);
		add(jbnum_7);
		
		MaterialButton jbnum_8 = new MaterialButton();
		jbnum_8.setText("8");
		jbnum_8.setColorNormal(new Color(66,66,66));
		jbnum_8.setColorHover(new Color(30,136,229));
		jbnum_8.setColorPressed(new Color(33,150,243));
		jbnum_8.setColorTextNormal(new Color(109,109,109));
		jbnum_8.setColorTextHover(new Color(255,255,255));
		jbnum_8.setColorTextPressed(new Color(255,255,255));
		jbnum_8.setFocusable(false);
		jbnum_8.setBounds(483, 369, 50, 35);
		add(jbnum_8);
		
		MaterialButton jbnum_9 = new MaterialButton();
		jbnum_9.setText("9");
		jbnum_9.setColorNormal(new Color(66,66,66));
		jbnum_9.setColorHover(new Color(30,136,229));
		jbnum_9.setColorPressed(new Color(33,150,243));
		jbnum_9.setColorTextNormal(new Color(109,109,109));
		jbnum_9.setColorTextHover(new Color(255,255,255));
		jbnum_9.setColorTextPressed(new Color(255,255,255));
		jbnum_9.setFocusable(false);
		jbnum_9.setBounds(543, 369, 50, 35);
		add(jbnum_9);
		
		MaterialButton jbnum_0 = new MaterialButton();
		jbnum_0.setText("0");
		jbnum_0.setColorNormal(new Color(66,66,66));
		jbnum_0.setColorHover(new Color(30,136,229));
		jbnum_0.setColorPressed(new Color(33,150,243));
		jbnum_0.setColorTextNormal(new Color(109,109,109));
		jbnum_0.setColorTextHover(new Color(255,255,255));
		jbnum_0.setColorTextPressed(new Color(255,255,255));
		jbnum_0.setFocusable(false);
		jbnum_0.setBounds(483, 416, 50, 35);
		add(jbnum_0);
		
		MaterialButton jbaccept = new MaterialButton();
		jbaccept.setText("Accept");
		jbaccept.setColorNormal(new Color(66,66,66));
		jbaccept.setColorHover(new Color(30,136,229));
		jbaccept.setColorPressed(new Color(33,150,243));
		jbaccept.setColorTextNormal(new Color(109,109,109));
		jbaccept.setColorTextHover(new Color(255,255,255));
		jbaccept.setColorTextPressed(new Color(255,255,255));
		jbaccept.setFocusable(false);
		jbaccept.setBounds(593, 439, 67, 35);
		add(jbaccept);
		
	}
}
