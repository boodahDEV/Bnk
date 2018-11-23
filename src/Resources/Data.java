package Resources;

public class Data{
	
	private String nombre, apellido, contrasena, tipoCuenta;
	private double saldoInicial;
	private String numCuenta;
	

	public Data(String nombre, String apellido, String numCuenta, double saldoInicial,
			String contrasena, String tipoCuenta) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numCuenta = numCuenta;
		this.saldoInicial = saldoInicial;
		this.contrasena = contrasena; 
		this.tipoCuenta = tipoCuenta;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public String getContrasena() {
		return contrasena;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

}	//---=== END CLASS
