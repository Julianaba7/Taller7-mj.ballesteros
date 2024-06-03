package uniandes.dpoo.taller7.interfaz4;


import javax.swing.JPanel;

import uniandes.dpoo.taller7.modelo.Tablero;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;

public class PanelTablero extends JPanel {
    private int tamanoTablero;
    private Tablero tableroC;
	private boolean[][] tablero;
	private int largo;
	private int[][] matriz;
	private int cantidadJugadas;

    public PanelTablero(int tamanoInicial) {
        this.tamanoTablero = tamanoInicial;
        this.setPreferredSize(new Dimension(500, 500)); 
    }

    public void setTamanoTablero(int nuevoTamano) {
        this.tamanoTablero = nuevoTamano;
        this.repaint();
    }
    
    public void nuevoPanel(Tablero tableroC){
    	//cada panel nuevo
        this.removeAll();
        this.tablero = tableroC.darTablero();
        this.largo = tablero.length;
        this.matriz = new int[largo][largo];
        cantidadJugadas = 1;
        GridLayout l = new GridLayout(largo,largo);
        setLayout(l);
        actulizarPanel();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int cellSize = Math.min(width, height) / tamanoTablero;

        for (int i = 0; i < tamanoTablero; i++) {
            for (int j = 0; j < tamanoTablero; j++) {
                if ((i + j) % 2 == 0) {
                    g2d.setColor(Color.YELLOW);
                } else {
                    g2d.setColor(Color.YELLOW);
                }
                g2d.fillRect(i * cellSize, j * cellSize, cellSize, cellSize);
                g2d.setColor(Color.BLACK);
                g2d.drawRect(i * cellSize, j * cellSize, cellSize, cellSize);
            }
        }
    }
    
    public void actulizarPanel(){
        repaint();
    }
}
