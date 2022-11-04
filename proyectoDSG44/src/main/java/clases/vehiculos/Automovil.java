/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.vehiculos;

/**
 *
 * @author Arturo
 */
public class Automovil extends Vehiculo {

    private String departamentoAsignado;

    //constructor
    public Automovil() {
    }

    public Automovil(String departamentoAsignado, String matricula, boolean esOperativo, String descripcionEstado, String fabricante, String modelo, String aeropuertoActual, int capacidadDePasajeros, int capacidadDeCarga, int capacidadDeCombustible, int capacidadDeEnergia, boolean esElectrico) {
        super(matricula, esOperativo, descripcionEstado, fabricante, modelo, aeropuertoActual, capacidadDePasajeros, capacidadDeCarga, capacidadDeCombustible, capacidadDeEnergia, esElectrico);
        this.departamentoAsignado = departamentoAsignado;
    }

    //Get
    public String getDepartamentoAsignado() {
        return departamentoAsignado;
    }

    //Set
    public void setDepartamentoAsignado(String departamentoAsignado) {
        this.departamentoAsignado = departamentoAsignado;
    }

}
