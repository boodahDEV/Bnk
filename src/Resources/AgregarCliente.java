package Resources;

import java.util.*;
import principal.Bnk_GUI;
import java.io.*;

public class AgregarCliente implements Serializable{
	boolean band;
	public static boolean addClient(String nombre, String apellido, String numCuenta, double saldoInicial, String contrasena, String tipoCuenta,Bnk_GUI main){
		ArrayList <Data> lista = new ArrayList<Data>();

		try {
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("data_1.dll"));
			@SuppressWarnings("unchecked")
			ArrayList<Data[]> data_recuperada = (ArrayList<Data[]>) input.readObject();
			
			input.close();	
			
			Data []listaNueva = new Data[data_recuperada.size()];
			data_recuperada.toArray(listaNueva);
			for(Data e: listaNueva)
				lista.add(e);
			
		}catch (Exception e1) {System.out.println("ERROR1\n"+e1);  }
		
		lista.add(new Data(nombre, apellido, numCuenta, saldoInicial, contrasena, tipoCuenta));
		
		try{	
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data_1.dll"));
			out.writeObject(lista);
			System.out.println("Los datos se han cargados con EXITO!");
				main.jl_text.setText("Los datos se han cargados con EXITO!");
				Animacion.Animacion.bajar(-60, 10, 2, 1, main.jp_notify);
				out.close();
			return true;
		}catch(Exception e){System.out.println("ERROR2\n"+e); }
		
		return false;		
	}//---=== FIN METODO AGREGAR CLIENTES A LA LISTA DEL ARCHIVO	
}		//---=== END CLASS
