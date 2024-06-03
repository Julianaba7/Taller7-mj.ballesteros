package uniandes.dpoo.taller7.interfaz3;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Derecho extends JPanel{
	
	private JButton nuevo;
	private JButton reiniciar;
	private JButton top10;
	private JButton cambiar;
	
	public Derecho() {
		
		setLayout(new GridLayout(0,1,1,10));
		
		nuevo = new JButton("NUEVO");
		//nuevo.setPreferredSize(new Dimension(200, 5));
		
		reiniciar = new JButton("REINICIAR");
		//reiniciar.setPreferredSize(new Dimension(200, 5));
		
		top10 = new JButton("TOP-10");
		//top10.setPreferredSize(new Dimension(200, 5));
		
		cambiar = new JButton("CAMBIAR JUGADOR");
		//cambiar.setPreferredSize(new Dimension(200, 5));
		
		
		
		add(nuevo);
		add(reiniciar);
		add(top10);
		add(cambiar);
		
	}
}
