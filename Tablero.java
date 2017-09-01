import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tablero extends javax.swing.JPanel {
    private ImageIcon celda, tocado;
    private boolean tipoTablero;
    private CasillasGUI[][] casillas ;
        
    public Tablero() {
        initComponents();
    }
    public Tablero( boolean tipo) {
        int size = 50;
        initComponents();
        int x,y;
        setLayout(new java.awt.GridLayout(size, size));
        this.tipoTablero = tipo;
        cargarImagenes();
        casillas = new Casillas[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                casillas[i][j] = new CasillasGUI(this); 
                casillas[i][j].setFondo(celda);
                x = (i * 35)+1;
                y = (j * 35)+1;
                casillas[i][j].setBounds(x, y, 34, 34);
                this.add(casillas[i][j]);
            }
        }
    }
    
    public boolean getTipoTablero(){
        return this.isTipoTablero();
    }
    
    private void cargarImagenes() {
        this.agua = this.cargarFondo("agua.gif");
        this.tocado = this.cargarFondo("tocado.gif");
    }
    
    protected static ImageIcon cargarFondo(String ruta) {
        java.net.URL localizacion = TableroGUI.class.getResource(ruta);
        if (localizacion != null) {
            return new ImageIcon(localizacion);
        } else {
            System.err.println("No se ha encontrado el archivo: " + ruta);
            return null;
        }
    }
    
    public int[] getCoordenadas(CasillasGUI casilla) {
        int [] coordenadas = new int[2];
        for (int i=0; i < this.casillas.length; i++) {
            for (int j=0; j < this.casillas.length; j++) {
                if (this.casillas[i][j] == casilla) {
                    coordenadas[0] = i;
                    coordenadas[1] = j;
                }
            }
        }
        return coordenadas;
    }
    
    public CasillasGUI[][] getCasillas() {
        return casillas;
    }
    
    public void setCasillas(CasillasGUI[][] casillas) {
        this.casillas = casillas;
    }
    
    public boolean isTipoTablero() {
        return tipoTablero;
    }    
    public void setTipoTablero(boolean tipoTablero) {
        this.tipoTablero = tipoTablero;
    }
                              
    private void initComponents() {
        setLayout(null);
        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setPreferredSize(new java.awt.Dimension(351, 351));
    }                      
                     
}