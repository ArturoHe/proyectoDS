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

    public Camion(String carga, String matricula, String operativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible, int capacidadDeEnergia, boolean esElectrico) {
        super(matricula, operativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible, capacidadDeEnergia, esElectrico);
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
