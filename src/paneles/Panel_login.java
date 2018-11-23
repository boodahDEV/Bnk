package paneles;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

import Resources.*;
import principal.Bnk_GUI;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel_login extends JPanel {
	private JTextField jtf_user;
	private JPasswordField jpf_pass;
	protected Bnk_GUI gui;
	private String type_login;
	/**
	 * Create the panel.
	 */
	public Panel_login(Bnk_GUI gui) {
		this.gui=gui;
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JLabel login = new JLabel("Log in ");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		login.setBounds(445, 39, 158, 65);
		add(login);
		
		JLabel jluser = new JLabel("User name:");
		jluser.setForeground(new Color(105, 105, 105));
		jluser.setFont(new Font("Century Schoolbook L", Font.PLAIN, 23));
		jluser.setBounds(400, 160, 135, 30);
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
		jlpass.setForeground(new Color(105,105,105));
		jlpass.setFont(new Font("Century Schoolbook L", Font.PLAIN, 23));
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
		
		MaterialButton jblogin = new MaterialButton();
		jblogin.addActionListener(new ActionListener() {									//---=== ESCUCHA DEL BOTON DE INICIAR SESION
			boolean band = false;
			public void actionPerformed(ActionEvent e) {
			String user = jtf_user.getText(); char [] pass = jpf_pass.getPassword();
			String passConv = new String(pass);
			
			if(user.equals("admin") && passConv.equals("12345")) {
				//gui.dashboard.setBackground(new Color(255,23,68));						//---=== PARA CONSIDERAR ESTE CAMBIO DEBO DE ACOMODAR ICONOS
				type_login = "admin";														//---=== ESTA BANDERA DEBE SER SOLO, ADMIN O USER.
				gui.contentPane.setBorder(new MatteBorder(1,1,1,1, new Color(255,23,68)));
				type_login();	//DETERMINA EL TIPO DE PANEL
				if(band)
					Animacion.Animacion.subir(10, -60, 2, 1, gui.jp_notify);
				
					
			}else {
				
				jtf_user.setText("");
				jpf_pass.setText("");
				gui.jl_text.setText("ERROR, Los credenciales de inicio de sesion son incorrectos!.");
				Animacion.Animacion.bajar(-60, 10, 2, 1, gui.jp_notify);
				band=true;

			}
//				Data []listaNueva = null;
//				
//				try{
//					
//					ObjectInputStream leer_fichero = new ObjectInputStream(new FileInputStream("./Resources/data_1.dll"));
//					System.out.println("archivo abierto!");
//					ArrayList<Data[]> data_recuperada = (ArrayList<Data[]>) leer_fichero.readObject();
//					leer_fichero.close();
//					
//					listaNueva = new Data[data_recuperada.size()];
//					data_recuperada.toArray(listaNueva);			
//					
//				}catch(Exception e1){
//					System.out.println("fichero no encontrado");
//				}		
//				
//				
//				
//				for(int i = 0;i<listaNueva.length;i++) {
//					if((user.equals("admin") && user.equals(listaNueva[i].getApellido()) ) && passConv.equals("12345")){
//						System.out.println("dentro de admin.");
//					}
//						
//				}
				
			
			}
		});
		jblogin.setText("Access");
		jblogin.setColorNormal(new Color(66,66,66));
		jblogin.setColorHover(new Color(30,136,229));
		jblogin.setColorPressed(new Color(33,150,243));
		jblogin.setColorTextNormal(new Color(109,109,109));
		jblogin.setColorTextHover(new Color(255,255,255));
		jblogin.setColorTextPressed(new Color(255,255,255));
		jblogin.setFocusable(false);
		jblogin.setBounds(350, 330, 150, 35);
		add(jblogin);
		
		MaterialButton jbregist = new MaterialButton();
		jbregist.setText("Users of Bank");
		jbregist.setColorNormal(new Color(66,66,66));
		jbregist.setColorHover(new Color(30,136,229));
		jbregist.setColorPressed(new Color(33,150,243));
		jbregist.setColorTextNormal(new Color(109,109,109));
		jbregist.setColorTextHover(new Color(255,255,255));
		jbregist.setColorTextPressed(new Color(255,255,255));
		jbregist.setFocusable(false);
		jbregist.setBounds(523, 330, 150, 35);
		add(jbregist);
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
	}
	
	public void type_login() {//---=== ESTA FUNCION DEL LOGIN DETERMINA QUE TIPO DE PANEL DEBE MOSTRAR LUEGO DEL LOGIN
		if(type_login.equals("admin")) {
			paneles.Panel_admin pa = new paneles.Panel_admin(gui);
			new paneles.Cambia_paneles(gui.principal, pa);				//---=== EJECUTA EL PANEL ADMIN
		}else {
			if(type_login.isEmpty()) {
				System.out.println("ERROR- tipo incorrecto");
			}else {
				//---=== SI ES EL CASO DE QUE EL TIPO_LOGIN SEA USER -> LANZO EL PANEL DE LOS USUARIOS.
			}
			
		}	
	}
}//---=== END CLASS 
