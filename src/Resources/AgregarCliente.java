package Resources;

import java.util.*;
import java.io.*;

public class AgregarCliente{

	private ArrayList <Data> lista = new ArrayList<Data>();

	public AgregarCliente(String nombre, String apellido, String numCuenta, double saldoInicial, String contrasena, String tipoCuenta) {
		addClient("admin","","",0.0,"12345","");
		//addClient(nombre, apellido, numCuenta, saldoInicial, contrasena, tipoCuenta);
	}	//---=== FIN CONSTRUCTOR

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

	

	private void addClient(String nombre, String apellido, String numCuenta, double saldoInicial, String contrasena, String tipoCuenta){
		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("data_1.dll"));
			@SuppressWarnings("unchecked")
			ArrayList<Data[]> data_recuperada = (ArrayList<Data[]>) input.readObject();
			input.close();
			
			Data []listaNueva = new Data[data_recuperada.size()];
			data_recuperada.toArray(listaNueva);
			
			for(Data e: listaNueva)
				lista.add(e);
			
			
		}catch (Exception e1) {System.out.println("ERROR1");  }
		
	lista.add(new Data(nombre, apellido, numCuenta, saldoInicial, contrasena, tipoCuenta));
		
		try{	
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data_1.dll"));
			out.writeObject(lista);
			out.close();
		}catch(Exception e){System.out.println("ERROR2"); }	
		
	}//---=== FIN METODO AGREGAR CLIENTES A LA LISTA DEL ARCHIVO	
	
	public static void main(String args[]) {
		AgregarCliente ac = new AgregarCliente(null, null, null, 0, null, null);
		System.out.println("SE ANADIO");
	}

}		//---=== END CLASS
