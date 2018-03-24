
import java.util.Iterator;
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements Iterable, PriorityQueue<E> {

	protected Vector<E> data; // the data, kept in heap order

        /**
         * Constructor de VectorHeap
         * post: constructs a new priority queue
         */
	public VectorHeap()
	{
		data = new Vector<>();
	}
        
        /**
         * Metodo para imprimir todo el contenido del vector
         * @param pacientesV VectorHeap que contiene todos los pacientes
         * @return un string concatenado todos los pacientes
         */
        public String imprimirTodo(VectorHeap<Paciente> pacientesV)
        {
            String respuesta="";
            Iterator<Paciente> iterator = pacientesV.iterator();
            while(iterator.hasNext())
            {
                respuesta+=iterator.next().toString()+"\n";
                
            }
            return respuesta;
        }
        
        /**
         * Retorna el siguiente en la lista de pacientes
         * @param pacientesV VectorHeap donde contiene todos los pacientes
         * @return respuesta, el cual es el siguiente paciente
         */
        public String next(VectorHeap<Paciente> pacientesV)
        {
            
            Iterator<Paciente> iterator = pacientesV.iterator();
            String respuesta=iterator.next().toString();
            return respuesta;
            
        }
        

        /**
         * Constructor de un VectorHeap a partir de uno existente
         * @param v  VectorHeap existente
         * post: constructs a new priority queue from an unordered vector
         */
	public VectorHeap(Vector<E> v)
	// 
	{
            int i;
            data = new Vector<>(v.size()); // we know ultimate size
            for (i = 0; i < v.size(); i++){ // add elements to heap
                add(v.get(i));
            }
	}
        
        /**
         * Retorna el padre de un determinado nodo
         * @param i la posicion actual
         * @return el pafre del nodo
         * post: returns parent of node at location i
         * pre:0 mayor o igual i menor o igual
         */
	protected static int parent(int i)
	{
            return (i-1)/2;
	}

        /**
         * Retorna el nodo hijo izquierda de un determinado nodo
         * @param i posicion actual 
         * @return hijo izquierdo
         * post: returns index of left child of node at location i
         * pre: 0 mayor o igual i menor o igual
         */
	protected static int left(int i)
	{
            return 2*i+1;
	}

        /**
         * Retorna el nodo hijo derecho de un determinado nodo
         * @param i posicion actual 
         * @return hijo derecho
         * post: returns index of right child of node at location i
         * pre: 0 mayor o igual i menor o igual
         */
	protected static int right(int i)
	{
            return (2*i+1) + 1;
	}

        
        /**
         * Mueve el nodo en la hoja indicada hasta la posicion apropiada
         * @param leaf posicion de la hoja que se desea mover
         * post: moves node at index leaf up to appropriate position
         * pre: 0 mayor o igual i menor o igual
         */
	protected void percolateUp(int leaf)
	{
            int parent = parent(leaf);
            E value = data.get(leaf);
            
            while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)){
                data.set(leaf, data.get(parent));
                leaf = parent;
                parent = parent(leaf);
            }
            data.set(leaf, value);
	}

        /**
         * Agrega un valor al VectorHeap
         * @param value el valor que se desea guardar
         * pre: value is non-null comparable
         * post: value is added to priority queue
         */
        @Override
	public void add(E value)
	{
            data.add(value);
            percolateUp(data.size()-1);
	}

        /**
         * Mueve una raiz hasta su posicion apropiada
         * @param root posocion de la raiz
         * post: moves node at index root down
         * to appropriate position in subtree
         * pre: 0 mayor o igual i menor o igual
         */
	protected void pushDownRoot(int root)
	{
            int heapSize = data.size();
            E value = data.get(root);
            while (root < heapSize) {
                int childpos = left(root);
                if (childpos < heapSize){
                    if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos)) < 0)){
                        childpos++;
                    }
                    // Assert: childpos indexes smaller of two children

                    if ((data.get(childpos)).compareTo(value) < 0){
                        data.set(root,data.get(childpos));
                        root = childpos; // keep moving down
                    } else { // found right location
                        data.set(root,value);
                        return;
                    }
                } else { // at a leaf! insert and halt
                    data.set(root,value);
                    return;
                }
            }
        }

        /**
         * Remueve el minimo valor del VectorHeap
         * @return el minimovalor
         * pre: !isEmpty()
         * post: returns and removes minimum value from queue
         */
        @Override
	public E remove() 
	{
            E minVal=null; 
            if (data.size()!=0) 
            {
                minVal= getFirst();
                data.set(0, data.get(data.size()-1));
                data.setSize(data.size()-1);
                
            }
            
            if (data.size() >= 1){
                pushDownRoot(0);
            }else{
                System.out.println("Ya no hay pacientes para atender.");
            }
            return minVal;
	}

        /**
         * devuelve el primer elemento del vectorHeap
         * @return el elemento mas pequeno
         */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /**
     * verifica si esta vacia el VectorHeap
     * @return true si no contiene nada
     */
    @Override
    public boolean isEmpty() {
            return data.isEmpty();
    }

    /**
     * Retorna el largo del VectorHeap
     * @return largo del VH
     */
    @Override
    public int size() {
        return data.size();
    }

    /**
     * elimina todos los elementos de VH
     */
    @Override
    public void clear() {
        data.removeAllElements();
    }

    /**
     * Interador de VH
     * @return iterador
     */
    @Override
    public Iterator iterator() {
        return data.iterator();
    }
    
}
