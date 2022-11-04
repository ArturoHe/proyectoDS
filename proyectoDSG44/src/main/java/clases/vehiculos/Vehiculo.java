package clases.vehiculos;

/**
 *
 * @author Arturo
 */
public class Vehiculo {
    
    private String matricula;
    private boolean esOperativo;
    private String descripcionEstado;    
    private String fabricante;
    private String modelo;
    private String aeropuertoActual;
    private int capacidadDePasajeros;
    private int capacidadDeCarga;
    private int capacidadDeCombustible;
    private int capacidadDeEnergia;
    private boolean esElectrico;
    
    //Constructores

    public Vehiculo() {
    }

    public Vehiculo(String matricula, String operativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible, int capacidadDeEnergia, boolean esElectrico) {
        this.matricula = matricula;
        this.esOperativo = true;
        this.descripcionEstado = descripcionEstado;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.aeropuertoActual = aeropuertoActual;
        this.capacidadDePasajeros = capacidadDePasajeros;
        this.capacidadDeCarga = capacidadDeCarga;
        this.capacidadDeCombustible = capacidadDeCombustible;
        this.capacidadDeEnergia = capacidadDeEnergia;
        this.esElectrico = esElectrico;
    }
    
    //Get

    public String getMatricula() {
        return matricula;
    }

    public boolean getEsOperativo() {
        return esOperativo;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAeropuertoActual() {
        return aeropuertoActual;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public int getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public int getCapacidadDeCombustible() {
        return capacidadDeCombustible;
    }

    public int getCapacidadDeEnergia() {
        return capacidadDeEnergia;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }
    
    
    //Set

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEsOperativo(boolean esOperativo) {
        this.esOperativo = esOperativo;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAeropuertoActual(String aeropuertoActual) {
        this.aeropuertoActual = aeropuertoActual;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    public void setCapacidadDeCarga(int capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public void setCapacidadDeCombustible(int capacidadDeCombustible) {
        this.capacidadDeCombustible = capacidadDeCombustible;
    }

    public void setCapacidadDeEnergia(int capacidadDeEnergia) {
        this.capacidadDeEnergia = capacidadDeEnergia;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }
    

}
