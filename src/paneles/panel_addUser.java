package paneles;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
import Resources.*;
import principal.Bnk_GUI;


public class panel_addUser extends JPanel {
	
	public JTextField jtf_lname,jtf_numac,jtf_name,jtf_opbal;
	public JPasswordField jpf_pass;
	public JRadioButton jrb_corriente,jrb_ahorro;
	public MaterialButton validar,cargar;
	public paneles.panel_addUser me;
	public Bnk_GUI main;
	public boolean band;
	String nombre,apellido,tipo_cuenta="",num_cuenta,pass;
	int balance;
	Cuenta cuenta = new Cuenta();
	
	/**
	 * Create the panel ADD_USER.
	 */
	
	public panel_addUser(Bnk_GUI main) {
		this.main=main;
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
		jtf_numac.setEnabled(false);
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
		jpf_pass.setEnabled(false);
		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jpf_pass.setBackground(new Color(16, 32, 39));
		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
		jpf_pass.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		jpf_pass.setForeground(SystemColor.controlDkShadow);
		jpf_pass.setBounds(730, 322, 120, 30);
		add(jpf_pass);
		
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
		
		validar = new MaterialButton();
		validar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decide();
			} //--== ESCUCHA DE VALIDA
		});
		validar.setText("Validate");
		validar.setColorNormal(new Color(66,66,66));
		validar.setColorHover(new Color(255,23,68));
		validar.setColorPressed(new Color(255,23,68));
		validar.setColorTextNormal(new Color(109,109,109));
		validar.setColorTextHover(new Color(255,255,255));
		validar.setColorTextPressed(new Color(255,255,255));
		validar.setFocusable(false);
		validar.setBounds(696, 512, 83, 35);
		add(validar);
		
		cargar = new MaterialButton();
		cargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}////--== ESCUCHA DE VALIDA
		});
		cargar.setText("Load up");
		cargar.setColorNormal(new Color(66,66,66));
		cargar.setColorHover(new Color(255,23,68));
		cargar.setColorPressed(new Color(255,23,68));
		cargar.setColorTextNormal(new Color(109,109,109));
		cargar.setColorTextHover(new Color(255,255,255));
		cargar.setColorTextPressed(new Color(255,255,255));
		cargar.setFocusable(false);
		cargar.setBounds(790, 512, 83, 35);
		add(cargar);
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
		
		
	}
	
	
	public void decide() {
		boolean bandera = generaCuenta();		//---=== METODO ENCARGADO DE GENERAR LA CUENTA ASOCIADA AL CLIENTE O USUARIO, ADEMAS DETERMINA EL BALANCE CORRECTO Y EL TIPO DE CUENTA ASOCIADO

		if(jtf_name.getText().trim().isEmpty() || jtf_lname.getText().trim().isEmpty() || jtf_opbal.getText().trim().isEmpty() || bandera == false) {

			main.jp_notify.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255,23,68)));
			main.jl_text.setText("Error, the fields are empty");
			Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
			band = true;
			
		}else {
			if(band) {
				Animacion.Animacion.subir(10, -60, 2, 1, main.jp_notify);
				band=false;
			}
			jtf_numac.setText(""+cuenta.getNum_cuenta());
			jpf_pass.setText(""+cuenta.getPass());
			validar.setColorNormal(new Color(0,112,26));
			validar.setColorHover(new Color(0,112,26));
			validar.setColorPressed(new Color(0,112,26));
			validar.setEnabled(false);	
		}// END ELSE
		
	}//---=== FIN DEL METODO DECIDE
	
	
	
	
	public void me( paneles.panel_addUser me) {
		this.me=me;
	}//---=== END
	
	
	
	public boolean generaCuenta() {
		try {
			
		nombre = jtf_name.getText();			//--== EXTRAE EL TEXTO DE LOS TEXTFIEL
		apellido = jtf_lname.getText();			//--== EXTRAE EL TEXTO DE LOS TEXTFIEL
		
		
		//---=== VERIFICA EL BALANCE INICIAL SEA CORRECTO ===---//
		if(Integer.parseInt(jtf_opbal.getText()) >= 30) {
			balance = Integer.parseInt(jtf_opbal.getText());
		}else {
			balance = Integer.parseInt(jtf_opbal.getText());
			main.jp_notify.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255,23,68)));
			main.jl_text.setText("Error, the balance must be greater than or equal to the indicated amount (Min. 30).");
			Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
			band = true; return false;
		}
		//---=== VERIFICA EL BALANCE INICIAL SEA CORRECTO ===---//
		
		//---=== VERIFICA EL TIPO DE CUENTA ===---//
		if(jrb_ahorro.isSelected()) {
			tipo_cuenta = "Ahorro";
			jrb_corriente.setEnabled(false);
		}else {
			if(jrb_corriente.isSelected()) {
				tipo_cuenta = "Corriente";
				jrb_ahorro.setEnabled(false);
			}else {
				
				tipo_cuenta = "";
				main.jp_notify.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255,23,68)));
				main.jl_text.setText("Error, account type unspecified.");
				Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
				band = true; return false;
			}
		}
		//---=== VERIFICA EL TIPO DE CUENTA ===---//

		}catch(Exception e) {
			main.jp_notify.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(255,23,68)));
			main.jl_text.setText("Error, in the system");
			Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
			band = true;
			return false;
		}
		return true;
	}//---=== END GENERACUENTA
}
