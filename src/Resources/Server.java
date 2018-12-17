package Resources;

import java.security.MessageDigest;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;




public final class Server implements Encapsular{
	String Dpuerto=null;

//---=== METODO QEU GENERA LOS PUERTOS ALEATORIOS ===---//
private String generatePort() {
	int b1,b2,b3,b4,i=0;
	String puerto,P_ante = null;
	b1=8;b2=(int)(Math.random()*9);b3=(int)(Math.random()*9);b4=(int)(Math.random()*9); //---=== ESTO GENERA NUMEROS ALEATORIOS ALMACENADOS EN 4 VARIABLES TEMPORALES MANTENIENDO ESTATICO EL PRIMERO! OSEA DEL 8001 PARA ARRIBA!
	puerto = ""+b1+""+b2+""+b3+""+b4; //---=== CONCATENA LAS VARIABLES ALEATORIAS!

if (puerto.equals(P_ante) || puerto.equals("8000")) {
	JOptionPane.showMessageDialog(null, "Puerto "+puerto+" generador erroneamente...");
		}else {
			System.out.println("puerto generado para el cliente: "+puerto);
			Dpuerto = encriptar(puerto);
			return Dpuerto;
		}

	P_ante = puerto;
	return puerto=null;
}//END
//---=== METODO QEU GENERA LOS PUERTOS ALEATORIOS ===---//


protected String getPort() {
	return generatePort();
}//---=== RETORNA EL PUERTO GENERADO ENCRIPTADO


public String encriptar(String texto){
    String secretKey = "boodah"; //llave para encriptar datos
    String base64EncryptedString = "";
    try {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digestOfPassword = md.digest(secretKey.getBytes("utf-8"));
        byte[] keyBytes = Arrays.copyOf(digestOfPassword, 24);

        SecretKey key = new SecretKeySpec(keyBytes, "DESede");
        Cipher cipher = Cipher.getInstance("DESede");
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] plainTextBytes = texto.getBytes("utf-8");
        byte[] buf = cipher.doFinal(plainTextBytes);
        byte[] base64Bytes = Base64.encodeBase64(buf);
        base64EncryptedString = new String(base64Bytes);
    } catch (Exception ex) {}
    return base64EncryptedString;
}//---=== FIN DEL METODO PARA ENCRIPTAR!



public static void main(String args[]) {
	Server s = new Server();
	while(true) {
		System.out.println(s.generatePort());
	}
	
}//END MAIN

@Override
public String desencriptar(String texto) throws Exception {
    return null;
}//----==== METODO CARGADADO DE DESENCRIPTAR!


}//fin clase Firewall

