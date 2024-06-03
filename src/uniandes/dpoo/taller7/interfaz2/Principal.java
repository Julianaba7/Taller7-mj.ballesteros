package uniandes.dpoo.taller7.interfaz2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Principal extends JFrame{
	
	private Superior superior;
	
	private Derecho derecho;
	
	private Inferior inferior;
	
	public Principal() {
		
		setTitle("Juego de Lights Out ");
		setSize(new Dimension(700,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		superior = new Superior();
		derecho = new Derecho();
		inferior = new Inferior();
		
		add(superior, BorderLayout.NORTH);
		add(derecho, BorderLayout.EAST);
		add(inferior, BorderLayout.SOUTH);
		
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
			
			new Principal();
	
	}
	
	
	

}
