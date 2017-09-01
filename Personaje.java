import javafx.scene.image.Image;
/**
 * Clase Personaje.
 * @author (Luis Gonzalez Haro) 
 * @date (01-09-2017)
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
         * Inicializamos la variable edad en 0 y la aumentaremos (edad++) a medida que se mueva un personaje
         * Asignamos a cada jugador una imagen dependiendo del tipo de personaje.
         */
        this.dinoS=dinoS;
        edad=0;

        haMovido = false;

        String location = "imagenes/";
        String filename = this.getName() + ".gif";
        this.image = new Image(location + filename);
    }

    public String toString()
    {
        return (this.getName());
    }

    protected abstract MoveList[] getPieceMoves();

    protected abstract String getName();
}
