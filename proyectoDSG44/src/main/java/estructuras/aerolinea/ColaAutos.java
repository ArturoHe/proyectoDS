/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.aerolinea;

import clases.vehiculos.Automovil;

/**
 *
 * @author Arturo
 */
public class ColaAutos {

    private NodoProceso cabeza;
    private NodoProceso ultimo;
    private int longitud = 0;

    private class NodoProceso {

        public Automovil auto;

        public NodoProceso siguiente;

        public NodoProceso(Automovil auto) {
            this.auto = auto;
            this.siguiente = null;
        }

    }

    public void agregarALaCola(Automovil auto) {

        NodoProceso nuevoNodo = new NodoProceso(auto);

        if (cabeza == null) {

            cabeza = nuevoNodo;

        } else {

            ultimo.siguiente = nuevoNodo;

        }

        ultimo = nuevoNodo;

        longitud++;
    }

    public void eliminarDeLaCola() {

        if (cabeza != null) {

            NodoProceso eliminar = cabeza;
            cabeza = cabeza.siguiente;
            eliminar.siguiente = null;

            if (cabeza == null) {

                ultimo = null;

            }

        }
        longitud--;
    }

    public Automovil obtenerPrimeroDeLaCola() {

        if (cabeza == null) {

            return null;

        } else {

            return cabeza.auto;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean colaVacia() {

        return longitud == 0;

    }

}
