package clases.vehiculos;

/**
 *
 * @author Arturo
 */
public class Avion extends Vehiculo {

    private String paisDeRegistro;
    private String tipoDeCombustible;
    private String codigoDeVuelo;
    private int tiempoDeVuelo;
    private int tiempoDesdeRevision;

    //Constructores
    public Avion() {
    }

    public Avion(String paisDeRegistro, String tipoDeCombustible, String codigoDeVuelo, int tiempoDeVuelo, int tiempoDesdeRevision, String matricula, String operativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible, int capacidadDeEnergia, boolean esElectrico) {
        super(matricula, operativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible, capacidadDeEnergia, esElectrico);
        this.paisDeRegistro = paisDeRegistro;
        this.tipoDeCombustible = tipoDeCombustible;
        this.codigoDeVuelo = codigoDeVuelo;
        this.tiempoDeVuelo = tiempoDeVuelo;
        this.tiempoDesdeRevision = tiempoDesdeRevision;
    }

    //Get
    public String getPaisDeRegistro() {
        return paisDeRegistro;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public String getCodigoDeVuelo() {
        return codigoDeVuelo;
    }

    public int getTiempoDeVuelo() {
        return tiempoDeVuelo;
    }

    public int getTiempoDesdeRevision() {
        return tiempoDesdeRevision;
    }

    //Set
    public void setPaisDeRegistro(String paisDeRegistro) {
        this.paisDeRegistro = paisDeRegistro;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public void setCodigoDeVuelo(String codigoDeVuelo) {
        this.codigoDeVuelo = codigoDeVuelo;
    }

    public void setTiempoDeVuelo(int tiempoDeVuelo) {
        this.tiempoDeVuelo = tiempoDeVuelo;
    }

    public void setTiempoDesdeRevision(int tiempoDesdeRevision) {
        this.tiempoDesdeRevision = tiempoDesdeRevision;
    }

}
