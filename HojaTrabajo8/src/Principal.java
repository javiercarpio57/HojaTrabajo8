
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
        
        Scanner teclado = new Scanner(System.in);
        String seleccion;
        
        
        String nombre;
        String sintoma;
        String prioridad;
        PriorityQueueJCF<Paciente> pacientesP=new PriorityQueueJCF<Paciente>();
        VectorHeap<Paciente> pacientesV=new VectorHeap<Paciente>();
        
        //Vector<Paciente> pacientes = new Vector<>();
        System.out.println("Ingrese 1 para realizar el programa implementando VectorHeap");
        System.out.println("Ingrese 2 para realizar el programa implementando PriorityQueueJCF");
        
        String objeto=teclado.nextLine();
        
        
        
        while (scanner.hasNextLine()) {
            linea = scanner.nextLine();
            
            nombre = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            sintoma = linea.substring(0, linea.indexOf(","));
            linea = linea.substring(linea.indexOf(",") + 2, linea.length());
            
            prioridad = linea.substring(0, linea.length());
            
            //System.out.println(nombre + "-" + sintoma + "-" + prioridad);
            
            if (objeto.equals("1")) 
            {
                pacientesV.add(new Paciente(nombre, sintoma, prioridad));
                
            }
            else if(objeto.equals("2"))
            {
                pacientesP.add(new Paciente(nombre, sintoma, prioridad));
                
            }
            
            
            
            fr.close();
            br1.close();
        }
        
        while (true)
        {
            System.out.println("1. Ver todos los pacientes");
            System.out.println("2. Ver siguiente en la lista");
            System.out.println("3. Atender al paciente");
            System.out.println("4. Salir");
            seleccion=teclado.nextLine();
            
            //OPCION 1
            if (seleccion.equals("1") && objeto.equals("1")) 
            {
                System.out.println(pacientesV.imprimirTodo(pacientesV));
                
            }
            else if (seleccion.equals("1") && objeto.equals("2")) 
            {
                System.out.println(pacientesP.imprimirTodo(pacientesP));
            }
            
            //OPCION 2
            if (seleccion.equals("2") && objeto.equals("1")) 
            {
                System.out.println(pacientesV.next(pacientesV));
                
            }
            else if (seleccion.equals("2") && objeto.equals("2")) 
            {
                System.out.println(pacientesP.next(pacientesP));
            }
            //OPCION 3
             if (seleccion.equals("3") && objeto.equals("1")) 
            {
                pacientesV.remove();
                
            }
            else if (seleccion.equals("3") && objeto.equals("2")) 
            {
                pacientesP.poll();
            }
            
            
            if (seleccion.equals("4")) 
            {
                break;
                
            }
               
        }
        
        
        
        
        
    }
    
}
