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
public class PilaCamiones {

    private Nodo punta = null;
    private int longitud;

    private class Nodo {

        public Camion camiones;
        public Nodo siguiente = null;

        public Nodo(Camion camiones) {
            this.camiones = camiones;
        }

    }

    public void apilar(Camion camiones) {

        Nodo nodo = new Nodo(camiones);
        nodo.siguiente = punta;
        punta = nodo;

        longitud++;
    }

    public void desapilar() {

        if (punta != null) {

            Nodo eliminar = punta;
            punta = punta.siguiente;
            eliminar = null;

        }

        longitud--;

    }

    public Camion obtenerElementoPila() {

        if (punta == null) {

            return null;

        } else {

            return punta.camiones;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean pilaVacia() {

        return longitud == 0;
    }
}
