package clases.aerolineas;

import estructuras.aerolinea.ProveedoresListaEnlazada;
import estructuras.aerolinea.AvionesListaEnlazada;
import estructuras.general.ListaEnlazadaStrings;

/**
 *
 * @author Arturo
 */
public class Aerolinea {
    //Atributos

    private String nombre;
    private String codigoICAO;
    private String codigoIATA;
    private AvionesListaEnlazada aviones;
    private ProveedoresListaEnlazada proveedores;
    private String aeropuertoPrincipal;
    private ListaEnlazadaStrings aeropuertosOperados;

    //Constructor/es
    public Aerolinea() {
    }

    public Aerolinea(String nombre, String codigoICAO, String codigoIATA, AvionesListaEnlazada aviones, ProveedoresListaEnlazada proveedores, String aeropuertoPrincipal, ListaEnlazadaStrings aeropuertosOperados) {
        this.nombre = nombre;
        this.codigoICAO = codigoICAO;
        this.codigoIATA = codigoIATA;
        this.aviones = aviones;
        this.proveedores = proveedores;
        this.aeropuertoPrincipal = aeropuertoPrincipal;
        this.aeropuertosOperados = aeropuertosOperados;
    }

    //Get
    public String getNombre() {
        return nombre;
    }

    public String getCodigoICAO() {
        return codigoICAO;
    }

    public String getCodigoIATA() {
        return codigoIATA;
    }

    public AvionesListaEnlazada getAviones() {
        return aviones;
    }

    public ProveedoresListaEnlazada getProveedores() {
        return proveedores;
    }

    public String getAeropuertoPrincipal() {
        return aeropuertoPrincipal;
    }

    public ListaEnlazadaStrings getAeropuertosOperados() {
        return aeropuertosOperados;
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoICAO(String codigoICAO) {
        this.codigoICAO = codigoICAO;
    }

    public void setCodigoIATA(String codigoIATA) {
        this.codigoIATA = codigoIATA;
    }

    public void setAviones(AvionesListaEnlazada aviones) {
        this.aviones = aviones;
    }

    public void setProveedores(ProveedoresListaEnlazada proveedores) {
        this.proveedores = proveedores;
    }

    public void setAeropuertoPrincipal(String aeropuertoPrincipal) {
        this.aeropuertoPrincipal = aeropuertoPrincipal;
    }

    public void setAeropuertosOperados(ListaEnlazadaStrings aeropuertosOperados) {
        this.aeropuertosOperados = aeropuertosOperados;
    }

}
