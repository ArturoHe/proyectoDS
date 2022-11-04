/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.aerolinea;

import clases.vehiculos.Bus;

/**
 *
 * @author Arturo
 */
public class ColaBuses {

    private NodoProceso cabeza;
    private NodoProceso ultimo;
    private int longitud = 0;

    private class NodoProceso {

        public Bus buses;

        public NodoProceso siguiente;

        public NodoProceso(Bus buses) {
            this.buses = buses;
            this.siguiente = null;
        }

    }

    public void agregarALaCola(Bus buses) {

        NodoProceso nuevoNodo = new NodoProceso(buses);

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

    public Bus obtenerPrimeroDeLaCola() {

        if (cabeza == null) {

            return null;

        } else {

            return cabeza.buses;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean colaVacia() {

        return longitud == 0;

    }

}
