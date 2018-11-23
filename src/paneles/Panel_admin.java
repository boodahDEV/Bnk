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
		
		JLabel login = new JLabel("Welcome ADMIN madafaca :V");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setForeground(new Color(169, 169, 169));
		login.setFont(new Font("Century Schoolbook L", Font.PLAIN, 40));
		login.setBounds(445, 39, 300, 65);
		add(login);
		
//		JLabel jluser = new JLabel("User name:");
//		jluser.setForeground(new Color(105, 105, 105));
//		jluser.setFont(new Font("Century Schoolbook L", Font.PLAIN, 23));
//		jluser.setBounds(400, 160, 135, 30);
//		add(jluser);
//		
//		jtf_user = new JTextField();
//		jtf_user.setHorizontalAlignment(SwingConstants.CENTER);
//		jtf_user.setForeground(new Color(169, 169, 169));
//		jtf_user.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
//		jtf_user.setBackground(new Color(16,32,39));
//		jtf_user.setFont(new Font("Century Gothic", Font.PLAIN, 18));
//		jtf_user.setBounds(440, 195, 150, 30);
//		add(jtf_user);
//		
//		JLabel jlpass = new JLabel("Password:");
//		jlpass.setForeground(new Color(105,105,105));
//		jlpass.setFont(new Font("Century Schoolbook L", Font.PLAIN, 23));
//		jlpass.setBounds(400, 244, 127, 30);
//		add(jlpass);
//		
//		jpf_pass = new JPasswordField();
//		jpf_pass.setForeground(new Color(169, 169, 169));
//		jpf_pass.setHorizontalAlignment(SwingConstants.CENTER);
//		jpf_pass.setBackground(new Color(16,32,39));
//		jpf_pass.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(105, 105, 105)));
//		jpf_pass.setFont(new Font("Century Gothic", Font.BOLD, 18));
//		jpf_pass.setEchoChar('*');
//		jpf_pass.setBounds(440, 285, 150, 30);
//		add(jpf_pass);
//		
//		MaterialButton jblogin = new MaterialButton();
//		jblogin.addActionListener(new ActionListener() {		//---=== 
//			public void actionPerformed(ActionEvent e) {
//			String user = jtf_user.getText(); char [] pass = jpf_pass.getPassword();
//			String passConv = new String(pass);
//			if(user.equalsIgnoreCase("admin") && passConv.equals("12345")) {
//				//gui.dashboard.setBackground(new Color(255,23,68));
//				gui.contentPane.setBorder(new MatteBorder(1,1,1,1, new Color(255,23,68)));
//			}
//			
////				Data []listaNueva = null;
////				
////				try{
////					
////					ObjectInputStream leer_fichero = new ObjectInputStream(new FileInputStream("./Resources/data_1.dll"));
////					System.out.println("archivo abierto!");
////					ArrayList<Data[]> data_recuperada = (ArrayList<Data[]>) leer_fichero.readObject();
////					leer_fichero.close();
////					
////					listaNueva = new Data[data_recuperada.size()];
////					data_recuperada.toArray(listaNueva);			
////					
////				}catch(Exception e1){
////					System.out.println("fichero no encontrado");
////				}		
////				
////				
////				
////				for(int i = 0;i<listaNueva.length;i++) {
////					if((user.equals("admin") && user.equals(listaNueva[i].getApellido()) ) && passConv.equals("12345")){
////						System.out.println("dentro de admin.");
////					}
////						
////				}
//				
//				
//			}
//		});
//		jblogin.setText("Access");
//		jblogin.setColorNormal(new Color(66,66,66));
//		jblogin.setColorHover(new Color(30,136,229));
//		jblogin.setColorPressed(new Color(33,150,243));
//		jblogin.setColorTextNormal(new Color(109,109,109));
//		jblogin.setColorTextHover(new Color(255,255,255));
//		jblogin.setColorTextPressed(new Color(255,255,255));
//		jblogin.setFocusable(false);
//		jblogin.setBounds(350, 330, 150, 35);
//		add(jblogin);
//		
//		MaterialButton jbregist = new MaterialButton();
//		jbregist.setText("Users of Bank");
//		jbregist.setColorNormal(new Color(66,66,66));
//		jbregist.setColorHover(new Color(30,136,229));
//		jbregist.setColorPressed(new Color(33,150,243));
//		jbregist.setColorTextNormal(new Color(109,109,109));
//		jbregist.setColorTextHover(new Color(255,255,255));
//		jbregist.setColorTextPressed(new Color(255,255,255));
//		jbregist.setFocusable(false);
//		jbregist.setBounds(523, 330, 150, 35);
//		add(jbregist);
//		
//		JLabel label_fondo = new JLabel(" ");
//		label_fondo.setIcon(new ImageIcon(Panel_admin.class.getResource("/image/p_log_in.png")));
//		label_fondo.setBounds(0, 0, 1035, 877);
//		add(label_fondo);
	}
	
}//---=== END CLASS 
