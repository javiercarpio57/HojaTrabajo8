
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;


/**
 *
 * @author javie
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        File archivo = new File ("pacientes.txt");

        FileReader fr = new FileReader(archivo);
        BufferedReader br1 = new BufferedReader(fr);
        String linea = "";
        Scanner scanner = new Scanner(fr);
        
        
        String nombre;
        String sintoma;
        String prioridad;
        
        //Vector<Paciente> pacientes = new Vector<>();
        VectorHeap<Paciente> pacientes = new VectorHeap<>();
        
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            
            nombre = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            sintoma = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            prioridad = linea.substring(0, linea.length());
            
            //System.out.println(nombre + "-" + sintoma + "-" + prioridad);
            
            pacientes.add(new Paciente(nombre, sintoma, prioridad));
        }
        
        fr.close();
        br1.close();
           
        //Imprime el VectorHeap
        Iterator<Paciente> iterator = pacientes.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        
    }
    
}
