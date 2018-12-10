package principal;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import Animacion.*;
import java.awt.event.*;
import java.io.*;
import Resources.MaterialButton;

public class Bnk_GUI extends JFrame{

	public JPanel contentPane,jpnorte,dashboard,jp_notify,principal,jp_registro;
	public JButton search,menu,user,exit_min;
	public JLabel up_dashboard,title,jl_login,up_registro,jl_exit,jl_text;
	public boolean bandera = true;
	public MaterialButton exit;
	public int x,y;
	public Bnk_GUI me;
	
	
	
	public static void main(String[] args) {
			Bnk_GUI frame = new Bnk_GUI();
			frame.setVisible(true);
			frame.addME(frame);
	}		//---=== END MAIN

	
	
	
	
	/**
	 * Create the frame.
	 */
	public Bnk_GUI() {
		setUndecorated(true);
		setLocationRelativeTo(null);
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1115, 665);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(16,32,39));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, new Color(30,136,229)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jpnorte = new JPanel();
				jpnorte.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent a) {
						x = a.getX(); y = a.getY();
					}
				});
				jpnorte.addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent a) {
						int xx=a.getXOnScreen(), yy=a.getYOnScreen(); 
						setLocation(xx-x,yy-y);
					}
				});
		
		jpnorte.setBounds(2, 2, 1110, 60);
		jpnorte.setBackground(new Color(16,32,39));
		contentPane.add(jpnorte);
		jpnorte.setLayout(null);
				
				jp_notify = new JPanel();
				jp_notify.setBounds(300, -60, 500, 50);		//---=== POSICION DEL PANEL DE NOTIFICACIONES normalmente debe estar en la altura (-60), al editar se pondra en 10.
				jpnorte.add(jp_notify);
				jp_notify.setLayout(null);
						jl_text = new JLabel();				//---=== LABEL DE NOTIFICACIONES.
						jl_text.setBounds(5, 5, 450, 45);
						jl_text.setFont(new Font("Century Gothic", Font.BOLD, 11));
						jl_text.setHorizontalAlignment(SwingConstants.CENTER);
						jl_text.setFocusable(false);
						jp_notify.add(jl_text);
						
				search = new JButton(" ");
				search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				search.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/search.png")));
				search.setIconTextGap(-10);
				search.setFocusable(false);
				search.setContentAreaFilled(false); 
				search.setBorderPainted(false);
				search.setBounds(1011, 15, 30, 30);
				jpnorte.add(search);
				
				menu = new JButton(" ");
				menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				menu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
						if(bandera == true) {
							menu.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/menu_open.png")));
							dashboard.setBounds(10, 70, 190, 585);			//---=== HACE LA FUNCION DEL LISTENER
							dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//							dashboard.removeMouseListener(dl);				//---=== DESHABILITA EL ESCUCHA DEL DASHBOARD						LOS ESCUCHAS DEL DASHBOAR SON DESHABILITADOS
//							dashboard.removeMouseMotionListener(dl);		//---=== DESHABILITA EL ESCUCHA DEL DASHBOARD
							bandera=false;
						}else {
							menu.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/menu_close.png")));
							dashboard.setBounds(10, 70, 50, 585);
							dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//							dashboard.addMouseListener(dl);					//---=== VUELVE A ESTADO NORMAL LOS ESCUCHAS DE LA CLASE
//							dashboard.addMouseMotionListener(dl);			//---=== VUELVE A ESTADO NORMAL LOS ESCUCHAS DE LA CLASE
							bandera=true;
						}
					}
				});
				menu.setToolTipText("click to open the dashboard");
				menu.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/menu_close.png")));
				menu.setIconTextGap(-10);
				menu.setFocusable(false);
				menu.setContentAreaFilled(false);
				menu.setBorderPainted(false);
				menu.setBounds(10, 15, 40, 40);
				jpnorte.add(menu);
				
				title = new JLabel("");
				controlDeVersion("version.txt");	//--=== METODO QUE BUSCA EL ARCHIVO VERSIONES.TXT PARA DETERMINAR PORQUE VERSION VA LA APLICACION!
				title.setForeground(new Color(55,71,79));
				title.setFont(new Font("Century Gothic", Font.BOLD, 15));
				title.setBounds(60, 23, 119, 21);
				jpnorte.add(title);
				
				user = new JButton(" ");
				user.setToolTipText("User");//---=== eliminar en futuras versiones
				user.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
						//Animacion.bajar(-60, 10, 6, 2, jp_notify);		//---=== MUEVE EL PANEL DE NOTIFICACIONES HACIA ABAJO! ESTO TOMARLO EN CUANTA EN EXCEPCIONES
						if(bandera==true){
							Animacion.bajar(2, 70, 4, 2, jp_registro);		//---=== MUEVE EL REGISTRO HACIA ABAJO
							jp_registro.setBounds(945, 70, 145, 110);		//---=== SETEA UNA NUEVA ALTURA AL REGISTRO
							up_registro.setVisible(true);
							
							bandera=false;
						}else {
							Animacion.subir(70, 2, 4, 2, jp_registro);		//---=== MUEVE EL REGISTRO HACIA ARRIBA
							jp_registro.setBounds(945, 2, 145, 60);			//---=== SETEA LA ALTURA ORIGINAL DEL PANERL DE REGISTRO
							up_registro.setVisible(false);
							bandera=true;
						}
					}		//---=== END LISTENER
				});
				user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				user.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/user_null.png")));
				user.setIconTextGap(-10);
				user.setFocusable(false);
				user.setContentAreaFilled(false);
				user.setBorderPainted(false);
				user.setBounds(1055, 12, 35, 35);
				jpnorte.add(user);
				
		dashboard = new JPanel();
		dashboard.setBackground(new Color(30,136,229));
		dashboard.setBounds(10, 70, 50, 585);			//---=== EL DASHBOARD TIENE UNA POSICION ORIGINAL PARA EL FUNCIONAMIENTO CORRECTO DE ( 10,70,50,585 ) SE CAMBIA A MODO DISENO.
		contentPane.add(dashboard);
		dashboard.setLayout(null);

				exit_min = new JButton("");
				exit_min.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						System.exit(0);
					}
				});
				exit_min.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				exit_min.setIconTextGap(-20);
				exit_min.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/exit.png")));
				exit_min.setToolTipText("Exit");
				exit_min.setFocusable(false);
				exit_min.setContentAreaFilled(false);
				exit_min.setBorderPainted(false);
				exit_min.setBounds(3, 545, 40, 40);
				dashboard.add(exit_min);
				
				
				up_dashboard = new JLabel(" ");			//--== ESTO ES MAS QUE LA SIMPLE ESQUINA QUE ESTA LOCALIZADA EN EL DASHBOARD EN LA PARTE SUPERIOR
				up_dashboard.setFocusable(false);
				up_dashboard.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/up.png")));
				up_dashboard.setBounds(12, 62, 25, 14);
				contentPane.add(up_dashboard);
		
		up_registro = new JLabel(" ");
		up_registro.setBounds(1062, 62, 25, 14);		//---=== altura normal es de 14 y la posicion era de 62
		up_registro.setVisible(false);
		up_registro.setIconTextGap(-10);
		up_registro.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/down_user.png")));
		up_registro.setFocusable(false);
		contentPane.add(up_registro);
		
		jp_registro = new JPanel();
		jp_registro.setBounds(945, 2, 145, 60);			//---=== altura normal es de 110 y la posicion era de 70
	//	jp_registro.setBounds(945,70,145,110);
		contentPane.add(jp_registro);
		jp_registro.setLayout(null);
		
		principal = new JPanel();						//---=== ESTE PANEL ES EL PRINCIPAL DONDE IRAN LOS DEMAS GENERADOS POR EL LOGIN
		principal.setLayout(null);
		principal.setBounds(70, 70, 1035, 585);
		principal.setBackground(new Color(16,32,39));
		contentPane.add(principal);
				
				jl_login = new JLabel("   Log in");
						jl_login.addMouseListener(new MouseAdapter() {
							public void mouseExited(MouseEvent a) {						//---=== DEVUELVE EL LABEL A SU ESTADO ORIGINAL ANTES DEL HOVER
								jl_login.setForeground(new Color(0,0,0));
							}
							public void mouseClicked(MouseEvent a) {
								new paneles.Cambia_paneles(principal, new paneles.Panel_User_of_bank(me)); //---=== EJECUTA EL PANEL_LOGIN 
								Animacion.subir(70, 2, 4, 2, jp_registro);				//---=== MUEVE EL REGISTRO HACIA ARRIBA
								jp_registro.setBounds(945, 2, 145, 60);					//---=== SETEA LA ALTURA ORIGINAL DEL PANERL DE REGISTRO
								up_registro.setVisible(false);	
								jl_login.setEnabled(false);
								bandera=true;
							}
						});
						jl_login.addMouseMotionListener(new MouseMotionAdapter() {		//---=== HACE LA FUNCION DE UN HOBER SOBRE EL LABEL
							public void mouseMoved(MouseEvent a) {
								jl_login.setForeground(new Color(55,71,79));
							}
						});
				
				jl_login.setFont(new Font("Century Gothic", Font.PLAIN, 11));
				jl_login.setFocusable(false);
				jl_login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				jl_login.setBounds(5, 60, 135, 20);
				jp_registro.add(jl_login);
				
				jl_exit = new JLabel("   Exit");
				jl_exit.addMouseListener(new MouseAdapter() {
					public void mouseExited(MouseEvent a) {						//---=== DEVUELVE EL LABEL A SU ESTADO ORIGINAL ANTES DEL HOVER
						jl_exit.setForeground(new Color(0,0,0));
					}
					
					public void mouseClicked(MouseEvent a) {
						dispose();
						System.exit(1);											//---=== EXIT A LA APLICACION
					}
					
				});
				jl_exit.addMouseMotionListener(new MouseMotionAdapter() {		//---=== HACE LA FUNCION DE UN HOBER SOBRE EL LABEL
					public void mouseMoved(MouseEvent a) {
						jl_exit.setForeground(new Color(55,71,79));
					}
				});
				jl_exit.setFont(new Font("Century Gothic", Font.BOLD, 11));
				jl_exit.setFocusable(false);
				jl_exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				jl_exit.setBounds(5, 85, 135, 20);
				jp_registro.add(jl_exit);
				
				JSeparator separator = new JSeparator();
				separator.setForeground(new Color(169, 169, 169));
				separator.setBounds(0, 80, 145, 2);
				jp_registro.add(separator);
				
	}		//---=== END CONSTRUCTOR FRAME
	
	
	void controlDeVersion(String archivo){
		try {
		      File ruta = new File (archivo);
		      FileReader f = new FileReader(ruta);
		      BufferedReader b = new BufferedReader(f);
		      String lines;
		      while((lines=b.readLine())!=null){
		             title.setText(lines+"\n");
		        }
		      b.close();
		}catch(Exception e) {System.out.println("ERROR File! \n"+e);}
	}		//---=== METODO EN EL CUAL CONTROLA LAS VERSIONES DEL PROGRAMA
	
	public void addME(Bnk_GUI me) {
		this.me=me;
	}// END METODO
}		//---=== END CLASS


