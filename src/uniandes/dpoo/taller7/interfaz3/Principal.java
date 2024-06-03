package uniandes.dpoo.taller7.interfaz3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Principal extends JFrame{
	
	private Superior superior;
	
	private Derecho derecho;
	
	private Inferior inferior;
	
	private PanelTablero panelTablero;
	
	
	
	public Principal() {
		
		setTitle("Juego de Lights Out ");
		setSize(new Dimension(700,400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		panelTablero = new PanelTablero(4); 
        superior = new Superior(panelTablero);
		derecho = new Derecho();
		inferior = new Inferior();
		
		
		add(superior, BorderLayout.NORTH);
		add(derecho, BorderLayout.EAST);
		add(inferior, BorderLayout.SOUTH);
		add(panelTablero, BorderLayout.CENTER);
		
		
		
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
			
			new Principal();
	
	}
	
	
	

}
