package uniandes.dpoo.taller7.interfaz1;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Principal extends JFrame{
	
	public Principal() {
		
		setTitle("Juego de Lights Out ");
		setSize(new Dimension(700,500));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
			
			new Principal();
	
	}
	
	
	

}
