package clases;

public class Alumno {

    //1.-ATRIBUTOS    
    private String nombre;
    private String apellido;    
    private double dpi;
    private double  nit;        

    //2.-CONSTRUCTORES
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, double dpi, double nit) {        
        this.nombre = nombre;
        this.apellido = apellido;        
        this.dpi = dpi;               
        this.nit = nit;    }

    //3.-GETTERS


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getDPI() {
        return dpi;
    }

    public double getNIT() {
        return nit;
    }


    //4.-SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDPI(double dpi) {
        this.dpi = dpi;
    }

    public void setNIT(double nit) {
        this.nit = nit;
    }

    //5.-LISTADO DE ATRIBUTOS
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", dpi=" + dpi + ", nit=" + nit + '}';
    }
}
