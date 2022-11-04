/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.aerolinea;

import clases.vehiculos.Camion;

/**
 *
 * @author Arturo
 */
public class ColaCamiones {

    private NodoProceso cabeza;
    private NodoProceso ultimo;
    private int longitud = 0;

    private class NodoProceso {

        public Camion camiones;

        public NodoProceso siguiente;

        public NodoProceso(Camion camiones) {
            this.camiones = camiones;
            this.siguiente = null;
        }

    }

    public void agregarALaCola(Camion camiones) {

        NodoProceso nuevoNodo = new NodoProceso(camiones);

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

    public Camion obtenerPrimeroDeLaCola() {

        if (cabeza == null) {

            return null;

        } else {

            return cabeza.camiones;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean colaVacia() {

        return longitud == 0;

    }

}
