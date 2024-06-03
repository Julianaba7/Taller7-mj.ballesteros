package uniandes.dpoo.taller7.interfaz3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Superior extends JPanel{
	
	private JLabel tamaño;
	
	private JLabel dificultad;
	
	private JComboBox<String> comB;
	
	private JRadioButton facil, medio, dificil;
	
	private PanelTablero panelTablero;
	
	public Superior(PanelTablero panelTablero) {
		
		this.panelTablero = panelTablero;
		
		tamaño = new JLabel("Tamaño");
		
		dificultad = new JLabel("Dificultad");
		
		comB = new JComboBox<String>();
		
		//comB.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		
		comB.addItem("4x4");
		
		comB.addItem("5x5");
		
		comB.addItem("6x6");
		
		comB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSize = (String) comB.getSelectedItem();
                int newSize = Integer.parseInt(selectedSize.substring(0, 1));
                panelTablero.setTamanoTablero(newSize);
            }
        });
		
		
		facil = new JRadioButton("Fácil");
		
		medio = new JRadioButton("Medio");
		
		dificil = new JRadioButton("Dificl");
		
		
		//JPanel auxArriba = new JPanel();
		
		//auxArriba.setLayout(new GridLayout(0,6));
		
		add(tamaño);
		add(comB);
		add(dificultad);
		add(facil);
		add(medio);
		add(dificil);
		
		
	}

}
