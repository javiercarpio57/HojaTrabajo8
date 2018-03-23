
import static java.lang.Math.E;
import java.util.Vector;


/**
 *
 * @author javie
 */
public class Factory
{
    
    public static Object getMap(String opcion) 
    {

		if (opcion.equals("1")) 
                {
			return new VectorHeap();

		} else if (opcion.equals("2")) 
                {
			//return new ();
                    System.out.println("");
		}
                return null;
	

    }
    
    
    
}
