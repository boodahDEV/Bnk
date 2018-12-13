package Resources;
import java.util.regex.*;
import javax.swing.JOptionPane;

import rojerusan.RSNotifyShadowFade;

public class Cuenta {
	private String Nombre, Apellido, tipo_cuenta,pass,NumCuenta;
	private double saldo;
	private int num_cuenta;
	
public Cuenta(String nombre,String apellido,String tipo_cuenta,String pass, double saldo) {
	this.Nombre = nombre;
	this.Apellido = apellido;
	this.tipo_cuenta = tipo_cuenta;
	this.saldo = saldo;
}//---=== ESTE CONSTRUCTOR EXISTE POR EL HECHO DE CARGAR TODO EN UN SOLO ENVIO
	
	public Cuenta() {
	// TODO Auto-generated constructor stub
}

	protected void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	protected void setApellido(String apellido) {
		this.Apellido = apellido;
	}
	protected void setTipo_cuenta(String tipo_cuenta) {
		this.tipo_cuenta = tipo_cuenta;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	/**/
	private final void Num_cuenta() {
		int num=Integer.parseInt(getGenerate()),numA = 0;
		String temp=""+num,	aguja; NumCuenta = ""+num;
		if (num!=numA) {
			//System.out.println("Numero de cuenta asignado: "+NumCuenta);
			aguja = temp.substring(0,4);
			pass = aguja;
			Pattern regex = Pattern.compile(Pattern.quote(aguja));
			Matcher match = regex.matcher(temp);
					if (match.find()) {
						//System.out.println("Encontrado, la contraseña es: "+pass);
					num_cuenta= Integer.parseInt(match.replaceAll("1000"));System.out.println("El numero de cuenta para es: "+num_cuenta);System.out.println("Contrasena: "+pass);}
					else {
					//System.out.println("Error en la busqueda y generacion de Numero de cuenta bancaria...");
					RSNotifyShadowFade b = new RSNotifyShadowFade("ERROR!","Error, la busqueda y generacion de Numero de cuenta bancaria a sido erronea, llame  al administrador...",
							3,RSNotifyShadowFade.PositionNotify.TopRight,RSNotifyShadowFade.TypeNotify.ERROR);
					 b.setVisible(true);
					}
		}else {
		RSNotifyShadowFade b = new RSNotifyShadowFade("ERROR Garrafal!","Error altamente garrafal!, Numero de cuenta bancaria repetida, consulte al administrador o gerencia bancaria. ",
					3,RSNotifyShadowFade.PositionNotify.TopRight,RSNotifyShadowFade.TypeNotify.ERROR);
			 b.setVisible(true);
		}
		numA = num;
	}
	/**/
	private final static String getGenerate() {
		return (""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+
				""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+""+(int)Math.floor(Math.random()*9)+
				""+(int)Math.floor(Math.random()*9));
	}
	/**/
	
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public String getTipo_cuenta() {
		return tipo_cuenta;
	}
	public String getPass() {
		return pass;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getNum_cuenta() {
		Num_cuenta();
		return num_cuenta;
	}
	public String getNumCuenAsos() {
		return NumCuenta;
	}
	/**/
	
	
}//fin clase
