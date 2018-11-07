package paneles;

import javax.swing.*;
public class Cambia_paneles {
	
	private JPanel contenedor;
	private JPanel contenido;
	
	public Cambia_paneles(JPanel contenedor, JPanel contenido) {
		this.contenedor= contenedor;
		this.contenido = contenido;
		
		contenedor.removeAll();
		contenedor.revalidate();
		contenedor.repaint();
		
		contenedor.add(contenido);
		contenedor.revalidate();
		contenedor.repaint();
	}
}