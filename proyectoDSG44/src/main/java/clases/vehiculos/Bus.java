package clases.vehiculos;

/**
 *
 * @author Arturo
 */
public class Bus extends Vehiculo{
    
    private int PuertaAsignada;
    
    //constructores

    public Bus() {
    }

    public Bus(int PuertaAsignada, String matricula, String operativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible, int capacidadDeEnergia, boolean esElectrico) {
        super(matricula, operativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible, capacidadDeEnergia, esElectrico);
        this.PuertaAsignada = PuertaAsignada;
    }
    
    //Get

    public int getPuertaAsignada() {
        return PuertaAsignada;
    }
    
    //Set

    public void setPuertaAsignada(int PuertaAsignada) {
        this.PuertaAsignada = PuertaAsignada;
    }
    
    
}
