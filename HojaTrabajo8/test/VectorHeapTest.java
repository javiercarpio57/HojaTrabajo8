
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author javie
 */
public class VectorHeapTest {
    
    public VectorHeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of parent method, of class VectorHeap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        int result = paciente.parent(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of left method, of class VectorHeap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 1;
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        int result = paciente.left(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of right method, of class VectorHeap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 2;
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        int result = paciente.right(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of percolateUp method, of class VectorHeap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 0;
        VectorHeap instance = new VectorHeap();
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        paciente.percolateUp(leaf);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of add method, of class VectorHeap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        VectorHeap instance = new VectorHeap();
        
        Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        
        
        String expectedNombre = paciente.remove().getNombre();
        String value = "Maria Ramirez";
        
        assertEquals(expectedNombre, value);
    }

    /**
     * Test of pushDownRoot method, of class VectorHeap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        VectorHeap instance = new VectorHeap();
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        paciente.pushDownRoot(root);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of remove method, of class VectorHeap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        VectorHeap instance = new VectorHeap();
        String expResult = "Maria Ramirez -- apendicitis -- A";
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        Object result = paciente.remove();
        assertEquals(expResult, result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getFirst method, of class VectorHeap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        VectorHeap instance = new VectorHeap();
        String expResult = "Maria Ramirez -- apendicitis -- A";
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        Paciente result = paciente.getFirst();
        
        assertEquals(expResult, result.toString());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isEmpty method, of class VectorHeap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        VectorHeap instance = new VectorHeap();
        boolean expResult = false;
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        boolean result = paciente.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of size method, of class VectorHeap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        VectorHeap instance = new VectorHeap();
        int expResult = 2;
        Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        int result = paciente.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of clear method, of class VectorHeap.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        VectorHeap instance = new VectorHeap();
         Paciente pac2 = new Paciente("Maria Ramirez", "apendicitis", "A");
        Paciente pac1 = new Paciente("Juan Perez", "fractura de pierna", "C");
        
        
        VectorHeap<Paciente> paciente = new VectorHeap<>();
        paciente.add(pac2);
        paciente.add(pac1);
        paciente.clear();
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
