package uniandes.dpoo.taller7.interfaz2;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Superior extends JPanel{
	
	private JLabel tama�o;
	
	private JLabel dificultad;
	
	private JComboBox<String> comB;
	
	private JRadioButton facil, medio, dificil;
	
	public Superior() {
		
		tama�o = new JLabel("Tama�o");
		
		dificultad = new JLabel("Dificultad");
		
		comB = new JComboBox<String>();
		
		//comB.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		comB.addItem("4x4");
		
		comB.addItem("5x5");
		
		comB.addItem("6x6");
		
		facil = new JRadioButton("F�cil");
		
		medio = new JRadioButton("Medio");
		
		dificil = new JRadioButton("Dificl");
		
		
		//JPanel auxArriba = new JPanel();
		
		//auxArriba.setLayout(new GridLayout(0,6));
		
		add(tama�o);
		add(comB);
		add(dificultad);
		add(facil);
		add(medio);
		add(dificil);
		
		
	}
}
