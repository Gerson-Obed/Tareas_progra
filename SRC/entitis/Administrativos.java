package clases;

/**
 *
 * @author gerson
 */
public class Administrativos {

    //1.-ATRIBUTOS    
    private String nombreadmins;
    private String apellidoadmins;        

    //2.-CONSTRUCTORES
    public Administrativos() {
    }

    public Administrativos(String nombrecat, String apellidocat) {        
        this.nombreadmins = nombreadmins;
        this.apellidoadmins = apellidoadmins; }

    //3.-GETTERS


    public String getNombreAd() {
        return nombreadmins;
    }

    public String getApellidoAd() {
        return apellidoadmins;
    }


    //4.-SETTERS
    public void setNombreAd(String nombre) {
        this.nombreadmins = nombreadmins;
    }

    public void setApellidoAd(String apellido) {
        this.apellidoadmins = apellidoadmins;
    }

    //5.-LISTADO DE ATRIBUTOS
    @Override
    public String toString() {
        return "Administradores{" + "nombre=" + nombreadmins + ", apellido=" + apellidoadmins +'}';
    }    
    
    
}
