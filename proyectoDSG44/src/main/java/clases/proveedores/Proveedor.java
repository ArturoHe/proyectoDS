package clases.proveedores;

/**
 *
 * @author Arturo
 */
public class Proveedor {
    
    private String nombre;
    private String codigoInterno;
    private String servicio;
    private boolean activo;
    private ListaEnlazadaStrings diasDeServicio;
    
    
    //Constructores

    public Proveedor() {
    }

    public Proveedor(String nombre, String codigoInterno, String servicio, boolean activo, ListaEnlazadaStrings diasDeServicio) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.servicio = servicio;
        this.activo = activo;
        this.diasDeServicio = diasDeServicio;
    }
    
    //Get

    public String getNombre() {
        return nombre;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getServicio() {
        return servicio;
    }

    public boolean isActivo() {
        return activo;
    }

    public ListaEnlazadaStrings getDiasDeServicio() {
        return diasDeServicio;
    }
    
    //Set

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setDiasDeServicio(ListaEnlazadaStrings diasDeServicio) {
        this.diasDeServicio = diasDeServicio;
    }
    
    

}
