
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
public class PriorityQueueJCF<E>{

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
        return datos.poll();
    }
}
