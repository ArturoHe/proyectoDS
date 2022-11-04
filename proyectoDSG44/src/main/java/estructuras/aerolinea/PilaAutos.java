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
public class PilaAutos {

    private Nodo punta = null;
    private int longitud;

    private class Nodo {

        public Automovil auto;
        public Nodo siguiente = null;

        public Nodo(Automovil auto) {
            this.auto = auto;
        }

    }

    public void apilar(Automovil auto) {

        Nodo nodo = new Nodo(auto);
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

    public Automovil obtenerElementoPila() {

        if (punta == null) {

            return null;

        } else {

            return punta.auto;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean pilaVacia() {

        return longitud == 0;
    }
}
