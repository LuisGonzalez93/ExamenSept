
/**
 * Write a description of class Dinosaurio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dinosaurio extends Personaje
{
    // instance variables - replace the example below with your own
    private int edadMaxima;

    /**
     * Constructor for objects of class Dinosaurio
     */
    public Dinosaurio(boolean dinoS)
    {
        super(dinoS);
        edadMaxima=50;
        
    }
    
     protected MoveList[] getPieceMoves()
    {
        MoveList[] m =
            {
                MoveList.UP,
                MoveList.UP_RIGHT,
                MoveList.UP_LEFT,
                MoveList.LEFT,
                MoveList.RIGHT,
                MoveList.DOWN_LEFT,
                MoveList.DOWN_RIGHT,
                MoveList.DOWN,
                
            };
        return m;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    protected boolean usesSingleMove(){return false;}
    protected String getName(){return "Dino";}
}
