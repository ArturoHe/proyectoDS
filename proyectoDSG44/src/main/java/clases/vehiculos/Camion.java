package clases.vehiculos;

/**
 *
 * @author Arturo
 */
public class Camion extends Vehiculo {

    private String carga;

    //constructor
    public Camion() {
    }

    public Camion(String carga, String matricula, boolean esOperativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible) {
        super(matricula, esOperativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible);
        this.carga = carga;
    }

    //Get
    public String getCarga() {
        return carga;
    }

    //Set
    public void setCarga(String carga) {
        this.carga = carga;
    }

}
