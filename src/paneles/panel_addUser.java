package paneles;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;

public class panel_addUser extends JPanel {
	private JTextField jtf_lname;
	private JTextField jtf_numac;

	/**
	 * Create the panel.
	 */
	public panel_addUser() {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		
		JLabel jladd = new JLabel("Add User in the system");
		jladd.setForeground(new Color(169, 169, 169));
		jladd.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		jladd.setBounds(463, 37, 480, 40);
		add(jladd);
		
		JLabel jl_name = new JLabel("Name:");
		jl_name.setForeground(new Color(128, 128, 128));
		jl_name.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		jl_name.setBounds(446, 122, 83, 22);
		add(jl_name);
		
		JTextField jtf_name = new JTextField();
		jtf_name.setText("test text");
		jtf_name.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_name.setForeground(new Color(105, 105, 105));
		jtf_name.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_name.setBackground(new Color(16,32,39));
		jtf_name.setFont(new Font("Century Schoolbook L", Font.PLAIN, 20));
		jtf_name.setBounds(520, 142, 150, 30);
		add(jtf_name);
		
		JLabel jl_lastName = new JLabel("Last name:");
		jl_lastName.setForeground(Color.GRAY);
		jl_lastName.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		jl_lastName.setBounds(670, 122, 130, 22);
		add(jl_lastName);
		
		jtf_lname = new JTextField();
		jtf_lname.setText("test text");
		jtf_lname.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_lname.setForeground(new Color(105, 105, 105));
		jtf_lname.setFont(new Font("Century Schoolbook L", Font.PLAIN, 20));
		jtf_lname.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_lname.setBackground(new Color(16, 32, 39));
		jtf_lname.setBounds(793, 142, 150, 30);
		add(jtf_lname);
		
		JLabel jl_numa = new JLabel("Account number:");
		jl_numa.setForeground(Color.GRAY);
		jl_numa.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		jl_numa.setBounds(446, 229, 212, 22);
		add(jl_numa);
		
		jtf_numac = new JTextField();
		jtf_numac.setText("test text");
		jtf_numac.setHorizontalAlignment(SwingConstants.CENTER);
		jtf_numac.setForeground(new Color(105, 105, 105));
		jtf_numac.setFont(new Font("Century Schoolbook L", Font.BOLD, 25));
		jtf_numac.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jtf_numac.setBackground(new Color(16, 32, 39));
		jtf_numac.setBounds(650, 232, 223, 30);
		add(jtf_numac);
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
		
		JLabel lblOpeningBalance = new JLabel("Opening balance:");
		lblOpeningBalance.setForeground(Color.GRAY);
		lblOpeningBalance.setFont(new Font("Century Schoolbook L", Font.PLAIN, 25));
		lblOpeningBalance.setBounds(351, 318, 83, 22);
		add(lblOpeningBalance);
	}
}
