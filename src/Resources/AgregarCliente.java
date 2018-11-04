package Resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class AgregarCliente extends JFrame implements ActionListener{
	
	public static void main(String[] args) {
		AgregarCliente h = new AgregarCliente();
		h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		h.setVisible(true);
	}

	private JLabel jlMensaje;
	private JTextField jtfNombre, jtfApellido, jtfNumCuenta, jtfSaldoInicial, jtfContrasena;
	private JButton jbAdd, jbCancelar, jbCerrar;
	private JPanel jpBotones, jpBtMsj;	
	private String nombre, apellido, usuario, contrasena, tipoCuenta;
	private JComboBox<String> jcbTipoCuenta, jcbUsuario;
	private double saldoInicial;
	private String numCuenta;
	private ArrayList <ClientesDB> lista = new ArrayList<ClientesDB>();
	private boolean permitidoContrasena, permitidoNomApell;
	
	public AgregarCliente() {
		setTitle("Agregar Cliente");
		setResizable(false);
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(permitidoContrasena & permitidoNomApell){
			if(jbAdd == e.getSource()){
				
				//------------------Datos int y double---------------------
				try{
					if((jtfSaldoInicial.getText() == null || jtfSaldoInicial.getText().equals(""))) 
						saldoInicial = Double.parseDouble("0"); 
					else
						saldoInicial = Double.parseDouble(jtfSaldoInicial.getText());
				}catch(Exception e1){
					saldoInicial = Double.parseDouble("0");
				}
				//---------------------------------------------------------		
				
				agregandoClientes(nombre, apellido, usuario, numCuenta, saldoInicial, contrasena, tipoCuenta);
			}
			}
		
	}	
	
	@SuppressWarnings("unchecked")
	private void agregandoClientes(String nombre, String apellido, String usuario, String numCuenta, double saldoInicial,
			String contrasena, String tipoCuenta){
		try {
			ObjectInputStream leer_fichero = new ObjectInputStream(new FileInputStream("clientesBaseDatos.txt"));
			
			ArrayList<ClientesDB[]> personal_Recuperado = (ArrayList<ClientesDB[]>) leer_fichero.readObject();
			
			leer_fichero.close();
			
			ClientesDB []listaNueva = new ClientesDB[personal_Recuperado.size()];
			
			personal_Recuperado.toArray(listaNueva);
			
			for(ClientesDB e: listaNueva){
				lista.add(e);
			}
			
		}catch (Exception e1) { }
		
		lista.add(new ClientesDB(nombre, apellido, usuario, numCuenta, saldoInicial, contrasena, tipoCuenta));
		
		try{	
			ObjectOutputStream escribiendo_fichero = new ObjectOutputStream(new FileOutputStream("clientesBaseDatos.txt"));
			
			escribiendo_fichero.writeObject(lista);
			
			escribiendo_fichero.close();
			
		}catch(Exception e){ }	
		
	}	

}
