
/**
 * Write a description of class Humano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Humano extends Personaje
{
    // instance variables - replace the example below with your own
    private int edadMaxima;
    private boolean hombre;
    /**
     * Constructor for objects of class Humano
     */
    public Humano  (boolean dinoS, boolean hombre)
    {
        super(dinoS);
        this.hombre=hombre;
        edadMaxima=60;
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
    
    
    
    protected String getName(){
        String vtmp ="";
        if(hombre){
        vtmp="Humano";
        }
        else{
        vtmp="Humana";
        }
        return vtmp;
    }
}
