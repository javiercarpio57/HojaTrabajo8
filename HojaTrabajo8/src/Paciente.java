
/**
 *
 * @author javie
 */
public class Paciente implements Comparable<Paciente>{
    
    private String nombre;
    private String sintoma;
    private String prioridad;

    public Paciente() {
    }

    public Paciente(String nombre, String sintoma, String prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    @Override
    public String toString() {
        String cadena = "";
        cadena = nombre + " -- " + sintoma + " -- " + prioridad;
        
        return cadena;
    }

    @Override
    public int compareTo(Paciente o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
