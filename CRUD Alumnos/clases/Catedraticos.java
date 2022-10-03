package clases;
/**
 *
 * @author gersoN
 */
public class Catedraticos {

    //1.-ATRIBUTOS    
    private String nombrecat;
    private String apellidocat;        

    //2.-CONSTRUCTORES
    public Catedraticos() {
    }

    public Catedraticos(String nombrecat, String apellidocat) {        
        this.nombrecat = nombrecat;
        this.apellidocat = apellidocat; }

    //3.-GETTERS


    public String getNombreCat() {
        return nombrecat;
    }

    public String getApellidoCat() {
        return apellidocat;
    }


    //4.-SETTERS
    public void setNombreCat(String nombre) {
        this.nombrecat = nombrecat;
    }

    public void setApellidoCat(String apellido) {
        this.apellidocat = apellidocat;
    }

    //5.-LISTADO DE ATRIBUTOS
    @Override
    public String toString() {
        return "Catedratico{" + "nombre=" + nombrecat + ", apellido=" + apellidocat +'}';
    }    
    
}
