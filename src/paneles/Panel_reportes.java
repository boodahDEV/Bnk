package paneles;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import Resources.*;
import principal.Bnk_GUI;

public class Panel_reportes extends JPanel {
	int f =0,s =0;
	private JScrollPane datos;
	private JTable jtDatos_1;
	MaterialButton cancel;
	
	/**
	 * Create the panel.
	 */
	public Panel_reportes(Bnk_GUI main) {
		this.setBounds(0, 0, 1035, 582);
		this.setBackground(new Color(16,32,39));
		setLayout(null);
		
		JTable jtTitulo = new JTable(1,6);
		JScrollPane datos = null;//= new JScrollPane(jtDatos);
		String[] titulo = {"Nombre","Apellido","# Cuenta","Saldo","Contrasena","Tipo Cuenta"};

		//------------recolectando datos---------------
		Object[][] tbBidimencional = null;
		try{
			ObjectInputStream leer_fichero = new ObjectInputStream(new FileInputStream("data_1.dll"));

			ArrayList<Data[]> personal_Recuperado = (ArrayList<Data[]>) leer_fichero.readObject();

			leer_fichero.close();

			s = personal_Recuperado.size();
			
			Data []listaNueva = new Data[personal_Recuperado.size()];
			personal_Recuperado.toArray(listaNueva);
			tbBidimencional = new Object[s][7];

			for(Data e: listaNueva){

				tbBidimencional[f][0] = e.getNombre();
				tbBidimencional[f][1] = e.getApellido();
				tbBidimencional[f][2] = e.getNumCuenta();
				tbBidimencional[f][3] = e.getSaldoInicial();
				tbBidimencional[f][4] = e.getContrasena();
				tbBidimencional[f][5] = e.getTipoCuenta();
				f++;
			}

			//-----------------------Acomodo y detalles en particular----------------------
			jtTitulo.setEnabled(false);
			
						jtDatos_1 = new JTable(tbBidimencional,titulo);
						jtDatos_1.setBackground(new Color(211, 211, 211));
						datos = new JScrollPane(jtDatos_1);
						datos.setBounds(422, 140, 578, 300);
						jtDatos_1.setEnabled(false);
						
									
									add(datos);
									
									JLabel tittle = new JLabel("Report sheet");
									tittle.setForeground(new Color(105, 105, 105));
									tittle.setFont(new Font("Century Gothic", Font.BOLD, 35));
									tittle.setBounds(637, 67, 218, 62);
									add(tittle);
		}catch(Exception e){
			System.out.println("Data no encontrada!");
		}
		
		JLabel label_fondo = new JLabel(" ");
		label_fondo.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		label_fondo.setIcon(new ImageIcon(Panel_login.class.getResource("/image/p_log_in.png")));
		label_fondo.setBounds(0, 0, 1035, 877);
		add(label_fondo);
		
		cancel = new MaterialButton();
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new paneles.Cambia_paneles(main.principal, new paneles.Panel_reportes(main));
				
			}////--== ESCUCHA DE cancela
		});
		cancel.setText("Back");
		cancel.setColorNormal(new Color(66,66,66));
		cancel.setColorHover(new Color(255,23,68));
		cancel.setColorPressed(new Color(255,23,68));
		cancel.setColorTextNormal(new Color(109,109,109));
		cancel.setColorTextHover(new Color(255,255,255));
		cancel.setColorTextPressed(new Color(255,255,255));
		cancel.setFocusable(false);
		cancel.setBounds(883, 512, 83, 35);
		add(cancel);
	}

}//---===End CLASS
