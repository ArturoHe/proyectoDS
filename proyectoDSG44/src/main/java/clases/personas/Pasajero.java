package clases.personas;

/**
 *
 * @author Arturo
 */
public class Pasajero extends Persona{

    private String estado;
    private String ruta;
    private String codigoCheckIn;
    private String vuelo;
    private int numeroPasajero;
    private boolean registrado;
    private boolean datosCompletos;
    
    //constructores

    public Pasajero() {
    }

    public Pasajero(int numeroPasajero, boolean registrado, boolean datosCompletos, String usuario, String password, String nombre, String tipoDeDocumento, String numeroDeDocumento, int añoDeNacimiento, int mesDeNacimiento, int diaDenacimiento, boolean esMenor, ListaEnlazadaResponsables responsables) {
        super(usuario, password, nombre, tipoDeDocumento, numeroDeDocumento, añoDeNacimiento, mesDeNacimiento, diaDenacimiento, esMenor, responsables);
        this.numeroPasajero = numeroPasajero;
        this.registrado = registrado;
        this.datosCompletos = datosCompletos;
    }
    
    //get

    public String getEstado() {
        return estado;
    }

    public String getRuta() {
        return ruta;
    }

    public String getCodigoCheckIn() {
        return codigoCheckIn;
    }

    public String getVuelo() {
        return vuelo;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public boolean isDatosCompletos() {
        return datosCompletos;
    }
    
    //Set

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setCodigoCheckIn(String codigoCheckIn) {
        this.codigoCheckIn = codigoCheckIn;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    public void setDatosCompletos(boolean datosCompletos) {
        this.datosCompletos = datosCompletos;
    }
    
    
    
    
    
}
