/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.aerolinea;

import clases.vehiculos.Avion;

/**
 *
 * @author Arturo
 */
public class ColaAviones {

    private NodoProceso cabeza;
    private NodoProceso ultimo;
    private int longitud = 0;

    private class NodoProceso {

        public Avion avion;

        public NodoProceso siguiente;

        public NodoProceso(Avion avion) {
            this.avion = avion;
            this.siguiente = null;
        }

    }

    public void agregarALaCola(Avion avion) {

        NodoProceso nuevoNodo = new NodoProceso(avion);

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

    public Avion obtenerPrimeroDeLaCola() {

        if (cabeza == null) {

            return null;

        } else {

            return cabeza.avion;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean colaVacia() {

        return longitud == 0;

    }

}
