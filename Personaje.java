import javafx.scene.image.Image;
/**
 * Clase Personaje.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Personaje
{
    
    private int edad;
    private boolean haMovido;
    protected Image image;
    protected boolean dinoS;
    

    /**
     * Constructor for objects of class Personaje
     */
    public Personaje(boolean dinoS)
    {
        /**
         * Inicializamos la variable en 0
         */
        this.dinoS=dinoS;
        edad=0;
        
        haMovido = false;

        String location = "imagenes/";
        String filename = this.getPj() + "_" + this.getName() + ".gif";
        this.image = new Image(location + filename);
    }

    public String getPj()
    {
        String tmp="";
        
        if (this.dinoS == true)
            tmp="Dino";
        else
            tmp="Humano";
            
        return tmp;    
    }
    
    public String toString()
    {
        return (this.getName() + " " + this.getPj());
    }

    protected abstract MoveList[] getPieceMoves();
    protected abstract boolean usesSingleMove();
    protected abstract String getName();
}
