package clases;
/**
 *
 * @author gersoN
 */
public class Alumno {

    //1.-ATRIBUTOS    
    private String nombre;
    private String apellido;    
    private String grado;    

    //2.-CONSTRUCTORES
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, String grado) {        
        this.nombre = nombre;
        this.apellido = apellido;        
        this.grado = grado; }

    //3.-GETTERS


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGrado() {
        return grado;
    }


    //4.-SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setgrado(double dpi) {
        this.grado = grado;
    }

    //5.-LISTADO DE ATRIBUTOS
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", grado=" + grado +'}';
    }
}
