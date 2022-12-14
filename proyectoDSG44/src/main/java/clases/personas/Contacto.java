package clases.personas;

import estructuras.Usuarios.ListaEnlazadaResponsables;

/**
 *
 * @author Arturo
 */
public class Contacto extends Persona {

    private long telefono;
    private int codigoPostal;
    private String correo;
    private String pais;
    private String ciudad;
    private String direccion;

    //constructores
    public Contacto() {
    }

    public Contacto(long telefono, int codigoPostal, String correo, String pais, String ciudad, String direccion, String nombre, String tipoDeDocumento, String numeroDeDocumento, int añoDeNacimiento, int mesDeNacimiento, int diaDenacimiento, boolean esMenor) {
        super(nombre, tipoDeDocumento, numeroDeDocumento, añoDeNacimiento, mesDeNacimiento, diaDenacimiento, esMenor);
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.correo = correo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    //Get

    public long getTelefono() {
        return telefono;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }
    
    //Set

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    

}
