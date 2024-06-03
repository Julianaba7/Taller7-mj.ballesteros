package uniandes.dpoo.taller7.interfaz2;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Inferior extends JPanel{
	
	private JLabel jugadas;
	
	private JTextField jugadasTxt;
	
	private JLabel jugador;
	
	private JTextField jugadorTxt;
	
	
	public Inferior() {
		
		setLayout(new GridLayout(1,4));
		
		jugadas = new JLabel("Jugadas");
		
		jugadasTxt = new JTextField();
		
		jugador = new JLabel("Jugador");
		
		jugadorTxt = new JTextField();
		
		add(jugadas);
		add(jugadasTxt);
		add(jugador);
		add(jugadorTxt);
	}
}
