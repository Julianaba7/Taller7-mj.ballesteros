package uniandes.dpoo.taller7.interfaz4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import uniandes.dpoo.taller7.modelo.Tablero;

public class Derecho extends JPanel implements ActionListener{
	
	private JButton nuevo;
	private JButton reiniciar;
	private JButton top10;
	private JButton cambiar;
	
	private Tablero tablero;
	private PanelTablero panelTablero;
	
	private Superior superior;
	
    private Inferior inferior;
    
    private Top10Panel panelTop10;
	
	public Derecho(PanelTablero panelTablero, Superior superior, Inferior inferior) {
		
		this.panelTablero = panelTablero;
		this.superior = superior;
        this.inferior = inferior;
		
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
		nuevo.addActionListener(this);
		reiniciar.addActionListener(this);
		top10.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==nuevo) {
			
			int tamano = superior.getTamanoSeleccionado();
			int dificultad = superior.getDificultadSeleccionada();
			
			if (true) {
				
				inferior.jugadasTxt.setText("0");;
				tablero = new Tablero(tamano);
				tablero.desordenar(dificultad);
				panelTablero.nuevoPanel(tablero);
            }
			
		}else if(e.getSource()==reiniciar) {
			tablero.reiniciar();
			panelTablero.nuevoPanel(tablero);
			inferior.jugadasTxt.setText("0");
		}
		
		else if(e.getSource()== top10) {
			
			panelTop10.changeVisibility();
			
		}
		
	}
}
