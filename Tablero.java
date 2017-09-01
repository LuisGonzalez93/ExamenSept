import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Tablero extends javax.swing.JPanel {
    private ImageIcon celda, mover, hombre, mujer, dino;
    private boolean tipoTablero;
    private Casillas[][] casillas ;
        
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
                casillas[i][j] = new Casillas(this); 
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
        this.celda = this.cargarFondo("celda.gif");
        this.mover = this.cargarFondo("mover.gif");
        this.hombre=this.cargarFondo("hombre.gif");
        this.mujer=this.cargarFondo("mujer.gif");
        this.dino=this.cargarFondo("dino.gif");
    }
    
    protected static ImageIcon cargarFondo(String ruta) {
        java.net.URL localizacion = Tablero.class.getResource(ruta);
        if (localizacion != null) {
            return new ImageIcon(localizacion);
        } else {
            System.err.println("No se ha encontrado el archivo: " + ruta);
            return null;
        }
    }
    
    public int[] getCoordenadas(Casillas casilla) {
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
    
    public Casillas[][] getCasillas() {
        return casillas;
    }
    
    public void setCasillas(Casillas[][] casillas) {
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