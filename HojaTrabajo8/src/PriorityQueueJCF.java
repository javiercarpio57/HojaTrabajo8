
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Queue;
import java.util.Vector;

import java.util.PriorityQueue;

/**
 *
 * @author javie
 * @param <E>
 */
public class PriorityQueueJCF<E>implements Iterable{

    /**
     *
     */
    protected PriorityQueue<E> datos;
    
    public PriorityQueueJCF() {
        datos = new PriorityQueue<>();
    }
    
    public boolean add(E e){
        return datos.add(e);
    }
    
    public boolean offer(E e){
        return datos.offer(e);
    }
    
    public E peek(){
        return datos.peek();
    }
    
    public int size(){
        return datos.size();
    }
    
    public void clear(){
        datos.clear();
    }
    
    public E poll(){
        if (datos.size()==0) 
        {
            System.out.println("Ya no hay mas pacientes! ");
            
        }
        return datos.poll();
    }

    @Override
    public Iterator iterator() 
    {
        return datos.iterator();
    }
    
    public String imprimirTodo(PriorityQueueJCF<Paciente> pacientesP)
        {
            String respuesta="";
            Iterator<Paciente> iterator = pacientesP.iterator();
            while(iterator.hasNext())
            {
                respuesta+=iterator.next().toString()+"\n";
                
            }
            return respuesta;
        }
    
    public String next(PriorityQueueJCF<Paciente> pacientesP)
        {
            
            Iterator<Paciente> iterator = pacientesP.iterator();
            String respuesta=iterator.next().toString();
            return respuesta;
            
        }
    
}
