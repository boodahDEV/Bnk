package principal;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Bnk_GUI extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
			Bnk_GUI frame = new Bnk_GUI();
			frame.setVisible(true);
	}		//---=== END MAIN

	
	
	
	
	/**
	 * Create the frame.
	 */
	public Bnk_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}		//---=== END CONSTRUCTOR FRAME

}		//---=== END CLASS
