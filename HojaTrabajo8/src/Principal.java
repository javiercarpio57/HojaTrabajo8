
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


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
        
        Paciente paciente = new Paciente();
        
        String nombre = "";
        String sintoma = "";
        String prioridad = "";
        
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            
            nombre = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            sintoma = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            prioridad = linea.substring(0, linea.length());
            
            
        }
        fr.close();
        br1.close();
        
        
    }
    
}
