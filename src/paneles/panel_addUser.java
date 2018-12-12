package paneles;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;


public class panel_addUser extends JPanel {
	private JTextField jtf_lname,jtf_numac,jtf_name,jtf_opbal;
	private JPasswordField jpf_pass;
	private JCheckBox jcb_see;
	private JRadioButton jrb_corriente,jrb_ahorro;

	/**
	 * Create the panel ADD_USER.
	 */
	public panel_addUser() {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		
		JLabel jladd = new JLabel("Add User in the system");
		jladd.setForeground(new Color(169, 169, 169));
		jladd.setFont(new Font("Century Gothic", Font.PLAIN, 35));
		jladd.setBounds(511, 32, 480, 40);
		add(jladd);
		
		JLabel jl_name = new JLabel("Name:");
		jl_name.setForeground(new Color(128, 128, 128));
		jl_name.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jl_name.setBounds(446, 122, 83, 22);
		add(jl_name);
		
		jtf_name = new JTextField();
		jtf_name.setText("test text");
		jtf_name.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_name.setForeground(new Color(105, 105, 105));
		jtf_name.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_name.setBackground(new Color(16,32,39));
		jtf_name.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		jtf_name.setBounds(520, 142, 150, 30);
		add(jtf_name);
		
		JLabel jl_lastName = new JLabel("Last name:");
		jl_lastName.setForeground(Color.GRAY);
		jl_lastName.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jl_lastName.setBounds(670, 122, 130, 22);
		add(jl_lastName);
		
		jtf_lname = new JTextField();
		jtf_lname.setText("test text");
		jtf_lname.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_lname.setForeground(new Color(105, 105, 105));
		jtf_lname.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		jtf_lname.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_lname.setBackground(new Color(16, 32, 39));
		jtf_lname.setBounds(793, 142, 150, 30);
		add(jtf_lname);
		
		JLabel jl_numa = new JLabel("Account number:");
		jl_numa.setForeground(Color.GRAY);
		jl_numa.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jl_numa.setBounds(446, 229, 212, 22);
		add(jl_numa);
		
		jtf_numac = new JTextField();
		jtf_numac.setText("test text");
		jtf_numac.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_numac.setForeground(new Color(105, 105, 105));
		jtf_numac.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		jtf_numac.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_numac.setBackground(new Color(16, 32, 39));
		jtf_numac.setBounds(650, 232, 223, 30);
		add(jtf_numac);
		
		JLabel jl_opBal = new JLabel("Opening balance:");
		jl_opBal.setForeground(Color.GRAY);
		jl_opBal.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jl_opBal.setBounds(366, 281, 194, 35);
		add(jl_opBal);
		
		jtf_opbal = new JTextField();
		jtf_opbal.setText("test text");
		jtf_opbal.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_opbal.setForeground(SystemColor.controlDkShadow);
		jtf_opbal.setFont(new Font("Century Gothic", Font.PLAIN, 15));
		jtf_opbal.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_opbal.setBackground(new Color(16, 32, 39));
		jtf_opbal.setBounds(554, 286, 58, 30);
		add(jtf_opbal);
		
		JLabel jl_aviso = new JLabel("Min 30 $");
		jl_aviso.setForeground(Color.WHITE);
		jl_aviso.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		jl_aviso.setBounds(564, 319, 46, 14);
		add(jl_aviso);
		
		JLabel jl_pass = new JLabel("Pass: ");
		jl_pass.setForeground(Color.GRAY);
		jl_pass.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		jl_pass.setBounds(650, 317, 93, 30);
		add(jl_pass);
		
		jpf_pass = new JPasswordField();
		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jpf_pass.setBackground(new Color(16, 32, 39));
		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
		jpf_pass.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jpf_pass.setText("pass");
		jpf_pass.setForeground(SystemColor.controlDkShadow);
		jpf_pass.setBounds(730, 322, 120, 30);
		add(jpf_pass);
		
		jcb_see = new JCheckBox("See password");
		jcb_see.setBackground(new Color(16, 32, 39));
		jcb_see.setFocusable(false);
		jcb_see.setForeground(Color.WHITE);
		jcb_see.setFont(new Font("Century Gothic", Font.PLAIN, 10));
		jcb_see.setBounds(740, 355, 100, 23);
		add(jcb_see);
		
		JLabel jl_tac = new JLabel("Account type:");
		jl_tac.setForeground(Color.GRAY);
		jl_tac.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jl_tac.setBounds(353, 389, 150, 35);
		add(jl_tac);
		
		ButtonGroup group = new ButtonGroup();
				jrb_ahorro = new JRadioButton("Saving");
				jrb_ahorro.setBackground(new Color(16, 32, 39));
				jrb_ahorro.setFocusable(false);
				jrb_ahorro.setForeground(Color.WHITE);
				jrb_ahorro.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				
				jrb_ahorro.setBounds(503, 401, 110, 25);
				add(jrb_ahorro);
				group.add(jrb_ahorro);
				
				jrb_corriente = new JRadioButton("Current");
				jrb_corriente.setBackground(new Color(16, 32, 39));
				jrb_corriente.setFocusable(false);
				jrb_corriente.setForeground(Color.WHITE);
				jrb_corriente.setFont(new Font("Century Gothic", Font.PLAIN, 15));
				
				jrb_corriente.setBounds(503, 427, 110, 25);
				add(jrb_corriente);
				group.add(jrb_corriente);
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
	}
}
