import java.util.*;
/**
 * Clase que lleva a cabo la simulacion de la aplicación.
 * 
 * @author (Luis Gonzalez Haro) 
 * @date (01-09-2017)
 */
public class Simulacion
{
    
    private Casillas[][] posicion;

    /**
     * Constructor for objects of class Simulacion
     */
    public Simulacion(){
        
       Random alea= new Random();
       Personaje din1 = new Dinosaurio(true);
       Personaje din2 = new Dinosaurio(true);
       Personaje din3 = new Dinosaurio(true);
       Personaje din4 = new Dinosaurio(true);
       Personaje din5 = new Dinosaurio(true);
       Personaje din6 = new Dinosaurio(true);
       Personaje hum1 = new Humano(false,false);
       Personaje hum2 = new Humano(false,false);
       Personaje hum3 = new Humano(false,true);
       Personaje hum4 = new Humano(false,true);
       
       
      
    }
    
}
