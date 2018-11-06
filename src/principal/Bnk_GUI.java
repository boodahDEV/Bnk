package principal;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import Animacion.*;
import java.awt.event.*;
import java.io.*;

public class Bnk_GUI extends JFrame{

	private JPanel contentPane,jpnorte,dashboard,jp_notify;
	protected JButton search,menu,user;
	protected JLabel up_dashboard,title;
	protected boolean bandera = true;
	protected Dashboar_listener dl =new Dashboar_listener();
	protected int x,y;
	
	public static void main(String[] args) {
			Bnk_GUI frame = new Bnk_GUI();
			frame.setVisible(true);
	}		//---=== END MAIN

	
	
	
	
	/**
	 * Create the frame.
	 */
	public Bnk_GUI() {
		setUndecorated(true);
		
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
				jp_notify.setBounds(300, -60, 500, 50);
				jpnorte.add(jp_notify);
		
				search = new JButton(" ");
				search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				search.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/search.png")));
				search.setIconTextGap(-10);
				search.setFocusable(false);
				search.setContentAreaFilled(false);
				search.setBorderPainted(false);
				search.setBounds(1011, 11, 30, 30);
				jpnorte.add(search);
				
				menu = new JButton(" ");
				menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				menu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
						if(bandera == true) {
							menu.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/menu_open.png")));
							dashboard.setBounds(10, 70, 190, 585);			//---=== HACE LA FUNCION DEL LISTENER
							dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
							dashboard.removeMouseListener(dl);				//---=== DESHABILITA EL ESCUCHA DEL DASHBOARD
							dashboard.removeMouseMotionListener(dl);		//---=== DESHABILITA EL ESCUCHA DEL DASHBOARD
							bandera=false;
						}else {
							menu.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/menu_close.png")));
							dashboard.setBounds(10, 70, 50, 585);
							dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
							dashboard.addMouseListener(dl);					//---=== VUELVE A ESTADO NORMAL LOS ESCUCHAS DE LA CLASE
							dashboard.addMouseMotionListener(dl);			//---=== VUELVE A ESTADO NORMAL LOS ESCUCHAS DE LA CLASE
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
				user.setToolTipText("User");
				user.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent a) {
						Animacion.bajar(-60, 10, 6, 2, jp_notify);
					}
				});
				user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				user.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/user_null.png")));
				user.setIconTextGap(-10);
				user.setFocusable(false);
				user.setContentAreaFilled(false);
				user.setBorderPainted(false);
				user.setBounds(1055, 9, 35, 35);
				jpnorte.add(user);
				
		dashboard = new JPanel();
		dashboard.setBackground(new Color(30,136,229));
		dashboard.setBounds(10, 70, 50, 585);
		dashboard.addMouseListener(dl);				//---=== DL ES EL DASHBOARD_LISTENER PARA PARA RE-AJUSTAR EL DASHBOARD A SU ESTADO NORMAL
		dashboard.addMouseMotionListener(dl);		//---=== DL ES EL DASHBOARD_LISTENER PARA MOVER POR ENCIMA DEL DASHBOARD
		contentPane.add(dashboard);
		dashboard.setLayout(null);
		
		up_dashboard = new JLabel(" ");
		up_dashboard.setFocusable(false);
		up_dashboard.setIcon(new ImageIcon(Bnk_GUI.class.getResource("/image/up.png")));
		up_dashboard.setBounds(12, 62, 25, 14);
		contentPane.add(up_dashboard);
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
	
	
/******************************************************************************************************************/	
	class Dashboar_listener extends MouseAdapter implements MouseMotionListener {
		public void mouseExited(MouseEvent a) {
			dashboard.setBounds(10, 70, 50, 585);
			dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		}		//---=== EVENTO AL MOVER EL DASHBOARD A SU ESATDO NORMAL
		
		public void mouseMoved(MouseEvent a) {
			dashboard.setBounds(10, 70, 190, 585);
			dashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		}		//---=== EVENTO AL MOVER POR ENCIMA DEL DASHBOARD
	}		//---=== END CLASS
}		//---=== END CLASS


