package paneles;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.MatteBorder;

import Resources.MaterialButton;
import principal.Bnk_GUI;
import java.awt.event.*;

public class Panel_User_of_bank extends JPanel {
	
	private JPasswordField jpf_pass;
	public boolean band;
	MaterialButton jbnum_1,jbnum_2,jbnum_3,jbnum_4,jbnum_5,jbnum_6,jbnum_7,jbnum_8,jbnum_9,jbnum_0,jbaccept;
	
	/**
	 * Create the panel.
	 */
	
	public Panel_User_of_bank(Bnk_GUI main) {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		main.home.setVisible(true);
		main.log.setEnabled(false);
		
		JLabel lblBnk = new JLabel("BNK ");
		lblBnk.setForeground(new Color(128, 128, 128));
		lblBnk.setFont(new Font("Century Gothic", Font.BOLD, 40));
		lblBnk.setBounds(582, 25, 110, 40);
		add(lblBnk);
		
		JLabel lblBnk2 = new JLabel("The most reliable system.");
		lblBnk2.setForeground(new Color(105, 105, 105));
		lblBnk2.setFont(new Font("Century Gothic", Font.BOLD, 25));
		lblBnk2.setBounds(473, 76, 340, 40);
		add(lblBnk2);
		
		jpf_pass = new JPasswordField(1);
		jpf_pass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent a) {
				if(a.getKeyCode() == a.VK_ENTER) {
					char []text = jpf_pass.getPassword();
					String temp = String.valueOf(text);
					//---=== DEBO EVALUAR LAS CLAVES DENTRO DE MI TXT
					if(temp.equals("1234")) { //---=== EVALUA AL ADMINISTRADOR
						main.home.setVisible(false);
						main.home.setEnabled(false);
						main.jl_exit.setEnabled(true); //---=== AL INICIAR SESION SE HABILITA LA OPCION DE CERRAR SESSION
						main.up_dashboard.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/upRED.png")));
						main.dashboard.setBackground(new Color(255,23,68));							//---=== PARA CONSIDERAR ESTE CAMBIO DEBO DE ACOMODAR ICONOS
						main.contentPane.setBorder(new MatteBorder(1,1,1,1, new Color(255,23,68)));
						new paneles.Cambia_paneles(main.principal, new paneles.Panel_admin(main)); //---== AQUI EN SI SE LEVANTA EL PANEL DEL ADMINISTRADOR
							//---=== ESTO LO HAGO PORQUE CONOSCO LA EXISTENCIA DE ESE BOTON
							main.log.setEnabled(false);
							main.log.setVisible(false);
							//---===   ===---///
						if(band) {
							Animacion.Animacion.subir(10, -60, 2, 1, main.jp_notify);
							band=false;
						}
							
					}else {
						//---=== SI NO ES CORRECTA TOMAR EN CONCIDERACION LA BUSQUEDA DENTRO DE MI ARCHIVO
						jpf_pass.setText("");
						main.jl_text.setText("ERROR, Los credenciales de inicio de sesion son incorrectos!.");
						Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
						band=true;

						}		
				}
			}
		});
		jpf_pass.setForeground(new Color(169, 169, 169));
		jpf_pass.requestFocusInWindow(); 
		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
		jpf_pass.setBackground(new Color(16,32,39));
		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
		jpf_pass.setFont(new Font("Century Gothic", Font.BOLD, 18));
		jpf_pass.setEchoChar('*');
		jpf_pass.setBounds(536, 216, 170, 30);
		add(jpf_pass);
		
		jbnum_1 = new MaterialButton();
		jbnum_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("1");
			}
		});
		jbnum_1.setText("1");
		jbnum_1.setColorNormal(new Color(66,66,66));
		jbnum_1.setColorHover(new Color(30,136,229));
		jbnum_1.setColorPressed(new Color(33,150,243));
		jbnum_1.setColorTextNormal(new Color(109,109,109));
		jbnum_1.setColorTextHover(new Color(255,255,255));
		jbnum_1.setColorTextPressed(new Color(255,255,255));
		jbnum_1.setFocusable(false);
		jbnum_1.setBounds(536, 271, 50, 35);
		add(jbnum_1);
		
		jbnum_2 = new MaterialButton();
		jbnum_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("2");
			}
		});
		jbnum_2.setText("2");
		jbnum_2.setColorNormal(new Color(66,66,66));
		jbnum_2.setColorHover(new Color(30,136,229));
		jbnum_2.setColorPressed(new Color(33,150,243));
		jbnum_2.setColorTextNormal(new Color(109,109,109));
		jbnum_2.setColorTextHover(new Color(255,255,255));
		jbnum_2.setColorTextPressed(new Color(255,255,255));
		jbnum_2.setFocusable(false);
		jbnum_2.setBounds(596, 271, 50, 35);
		add(jbnum_2);
		
		jbnum_3 = new MaterialButton();
		jbnum_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("3");
			}
		});
		jbnum_3.setText("3");
		jbnum_3.setColorNormal(new Color(66,66,66));
		jbnum_3.setColorHover(new Color(30,136,229));
		jbnum_3.setColorPressed(new Color(33,150,243));
		jbnum_3.setColorTextNormal(new Color(109,109,109));
		jbnum_3.setColorTextHover(new Color(255,255,255));
		jbnum_3.setColorTextPressed(new Color(255,255,255));
		jbnum_3.setFocusable(false);
		jbnum_3.setBounds(656, 271, 50, 35);
		add(jbnum_3);
		
		jbnum_4 = new MaterialButton();
		jbnum_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("4");
			}
		});
		jbnum_4.setText("4");
		jbnum_4.setColorNormal(new Color(66,66,66));
		jbnum_4.setColorHover(new Color(30,136,229));
		jbnum_4.setColorPressed(new Color(33,150,243));
		jbnum_4.setColorTextNormal(new Color(109,109,109));
		jbnum_4.setColorTextHover(new Color(255,255,255));
		jbnum_4.setColorTextPressed(new Color(255,255,255));
		jbnum_4.setFocusable(false);
		jbnum_4.setBounds(536, 318, 50, 35);
		add(jbnum_4);
		
		jbnum_5 = new MaterialButton();
		jbnum_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("5");
			}
		});
		jbnum_5.setText("5");
		jbnum_5.setColorNormal(new Color(66,66,66));
		jbnum_5.setColorHover(new Color(30,136,229));
		jbnum_5.setColorPressed(new Color(33,150,243));
		jbnum_5.setColorTextNormal(new Color(109,109,109));
		jbnum_5.setColorTextHover(new Color(255,255,255));
		jbnum_5.setColorTextPressed(new Color(255,255,255));
		jbnum_5.setFocusable(false);
		jbnum_5.setBounds(596, 318, 50, 35);
		add(jbnum_5);
		
		jbnum_6 = new MaterialButton();
		jbnum_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("6");
			}
		});
		jbnum_6.setText("6");
		jbnum_6.setColorNormal(new Color(66,66,66));
		jbnum_6.setColorHover(new Color(30,136,229));
		jbnum_6.setColorPressed(new Color(33,150,243));
		jbnum_6.setColorTextNormal(new Color(109,109,109));
		jbnum_6.setColorTextHover(new Color(255,255,255));
		jbnum_6.setColorTextPressed(new Color(255,255,255));
		jbnum_6.setFocusable(false);
		jbnum_6.setBounds(656, 318, 50, 35);
		add(jbnum_6);
		
		jbnum_7 = new MaterialButton();
		jbnum_7.setText("7");
		jbnum_7.setColorNormal(new Color(66,66,66));
		jbnum_7.setColorHover(new Color(30,136,229));
		jbnum_7.setColorPressed(new Color(33,150,243));
		jbnum_7.setColorTextNormal(new Color(109,109,109));
		jbnum_7.setColorTextHover(new Color(255,255,255));
		jbnum_7.setColorTextPressed(new Color(255,255,255));
		jbnum_7.setFocusable(false);
		jbnum_7.setBounds(536, 365, 50, 35);
		add(jbnum_7);
		
	    jbnum_8 = new MaterialButton();
		jbnum_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("8");
			}
		});
		jbnum_8.setText("8");
		jbnum_8.setColorNormal(new Color(66,66,66));
		jbnum_8.setColorHover(new Color(30,136,229));
		jbnum_8.setColorPressed(new Color(33,150,243));
		jbnum_8.setColorTextNormal(new Color(109,109,109));
		jbnum_8.setColorTextHover(new Color(255,255,255));
		jbnum_8.setColorTextPressed(new Color(255,255,255));
		jbnum_8.setFocusable(false);
		jbnum_8.setBounds(596, 365, 50, 35);
		add(jbnum_8);
		
		jbnum_9 = new MaterialButton();
		jbnum_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("9");
			}
		});
		jbnum_9.setText("9");
		jbnum_9.setColorNormal(new Color(66,66,66));
		jbnum_9.setColorHover(new Color(30,136,229));
		jbnum_9.setColorPressed(new Color(33,150,243));
		jbnum_9.setColorTextNormal(new Color(109,109,109));
		jbnum_9.setColorTextHover(new Color(255,255,255));
		jbnum_9.setColorTextPressed(new Color(255,255,255));
		jbnum_9.setFocusable(false);
		jbnum_9.setBounds(656, 365, 50, 35);
		add(jbnum_9);
		
		jbnum_0 = new MaterialButton();
		jbnum_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				poner("0");
			}
		});
		jbnum_0.setText("0");
		jbnum_0.setColorNormal(new Color(66,66,66));
		jbnum_0.setColorHover(new Color(30,136,229));
		jbnum_0.setColorPressed(new Color(33,150,243));
		jbnum_0.setColorTextNormal(new Color(109,109,109));
		jbnum_0.setColorTextHover(new Color(255,255,255));
		jbnum_0.setColorTextPressed(new Color(255,255,255));
		jbnum_0.setFocusable(false);
		jbnum_0.setBounds(596, 412, 50, 35);
		add(jbnum_0);

		
		jbaccept = new MaterialButton();
		jbaccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char []text = jpf_pass.getPassword();
				String temp = String.valueOf(text);
				//---=== DEBO EVALUAR LAS CLAVES DENTRO DE MI TXT
				if(temp.equals("1234")) { //---=== EVALUA AL ADMINISTRADOR
					main.home.setVisible(false);
					main.home.setEnabled(false);
					main.jl_exit.setEnabled(true); //---=== AL INICIAR SESION SE HABILITA LA OPCION DE CERRAR SESSION
					main.up_dashboard.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/upRED.png")));
					main.dashboard.setBackground(new Color(255,23,68));							//---=== PARA CONSIDERAR ESTE CAMBIO DEBO DE ACOMODAR ICONOS
					main.contentPane.setBorder(new MatteBorder(1,1,1,1, new Color(255,23,68)));
					new paneles.Cambia_paneles(main.principal, new paneles.Panel_admin(main)); //---== AQUI EN SI SE LEVANTA EL PANEL DEL ADMINISTRADOR
						//---=== ESTO LO HAGO PORQUE CONOSCO LA EXISTENCIA DE ESE BOTON
						main.log.setEnabled(false);
						main.log.setVisible(false);
						//---===   ===---///
					if(band) {
						Animacion.Animacion.subir(10, -60, 2, 1, main.jp_notify);
						band=false;
					}
						
				}else {
					//---=== SI NO ES CORRECTA TOMAR EN CONCIDERACION LA BUSQUEDA DENTRO DE MI ARCHIVO
					jpf_pass.setText("");
					main.jl_text.setText("ERROR, Los credenciales de inicio de sesion son incorrectos!.");
					Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
					band=true;

					}		
			}//---=== END ACTIONPERFORMED
		});
		jbaccept.setText("Accept");
		jbaccept.setColorNormal(new Color(66,66,66));
		jbaccept.setColorHover(new Color(30,136,229));
		jbaccept.setColorPressed(new Color(33,150,243));
		jbaccept.setColorTextNormal(new Color(109,109,109));
		jbaccept.setColorTextHover(new Color(255,255,255));
		jbaccept.setColorTextPressed(new Color(255,255,255));
		jbaccept.setFocusable(false);
		jbaccept.setBounds(706, 435, 67, 35);
		add(jbaccept);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(Panel_User_of_bank.class.getResource("/image/p_log_in.png")));
		label.setBounds(0, 0, 1035, 877);
		add(label);
		
	}
	
	public void poner(String num){
		char []text = jpf_pass.getPassword();
		String temp = String.valueOf(text);
		jpf_pass.setText(""+temp+num);
	}
}
