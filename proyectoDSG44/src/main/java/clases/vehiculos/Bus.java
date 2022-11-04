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

    public Bus(int PuertaAsignada, String matricula, boolean esOperativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible) {
        super(matricula, esOperativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible);
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
