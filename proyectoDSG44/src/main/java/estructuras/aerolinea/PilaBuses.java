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
public class PilaBuses {

    private Nodo punta = null;
    private int longitud;

    private class Nodo {

        public Bus busEmp;
        public Nodo siguiente = null;

        public Nodo(Bus busEmp) {
            this.busEmp = busEmp;
        }

    }

    public void apilar(Bus busEmp) {

        Nodo nodo = new Nodo(busEmp);
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

    public Bus obtenerElementoPila() {

        if (punta == null) {

            return null;

        } else {

            return punta.busEmp;

        }

    }

    public int longitud() {

        return longitud;

    }

    public boolean pilaVacia() {

        return longitud == 0;
    }
}
