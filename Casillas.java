import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * Clase que define las casillas del tablero. 
 * Posee la interfaz MouseListener.
 */
public class Casillas extends javax.swing.JPanel implements MouseListener {
    
    private Tablero tablero;
    private ImageIcon fondo;
    private static int [] casillaMarcada = new int[2];
    
    
    /**
     * Se define por parámetro el dato de tipo tablero
     */
    public Casillas(Tablero t) {
        initComponents();        
        this.tablero = t;
        if(this.tablero.getTipoTablero()){// tablero responde a clics?
            this.addMouseListener(this);
        }
    }
    
    public void setFondo(ImageIcon fondo){
        this.fondo = fondo;
    }
    
    public ImageIcon getFondo(){        
        return this.fondo;
    }
    
    /**
     * Se inicializan los componentes.
     */
    
    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 161, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
    }                       
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(fondo.getImage(), 0,0,this.getWidth(),this.getHeight(),this);
    }
    
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    /**
     * La casilla queda marcada cuando se presiona con el ratón.
     */
    public void mousePressed(MouseEvent e){
            this.setCasillaMarcada(tablero.getCoordenadas((Casillas)e.getComponent())); 
            }
    public void mouseReleased(MouseEvent e){}
    
    public static int[] getCasillaMarcada() {
        return casillaMarcada;
    }
    public static void setCasillaMarcada(int[] aCasillaMarcada) {
        casillaMarcada = aCasillaMarcada;
    }                  
    
}