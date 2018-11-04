package Resources;

import java.util.*;
import java.io.*;

public class AgregarCliente{

	private ArrayList <ClientesDB> lista = new ArrayList<ClientesDB>();

	public AgregarCliente(String nombre, String apellido, String usuario, String numCuenta, double saldoInicial, String contrasena, String tipoCuenta) {
		agregandoClientes(nombre, apellido, usuario, numCuenta, saldoInicial, contrasena, tipoCuenta);
	}

				/*
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
			}*/

	

	private void agregandoClientes(String nombre, String apellido, String usuario, String numCuenta, double saldoInicial, String contrasena, String tipoCuenta){
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("data.txt"));
			ArrayList<ClientesDB[]> personal_Recuperado = (ArrayList<ClientesDB[]>) input.readObject();
			input.close();
			
			ClientesDB []listaNueva = new ClientesDB[personal_Recuperado.size()];
			personal_Recuperado.toArray(listaNueva);
			
			for(ClientesDB e: listaNueva)
				lista.add(e);
			
			
		}catch (Exception e1) { }
		
	lista.add(new ClientesDB(nombre, apellido, usuario, numCuenta, saldoInicial, contrasena, tipoCuenta));
		
		try{	
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.txt"));
			out.writeObject(lista);
			out.close();
		}catch(Exception e){ }	
		
	}		//---=== FIN METODO AGREGAR CLIENTES A LA LISTA DEL ARCHIVO	

}		//---=== END CLASS
