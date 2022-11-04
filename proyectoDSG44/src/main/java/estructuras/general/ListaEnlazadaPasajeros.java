/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.general;

import clases.personas.Pasajero;

/**
 *
 * @author Arturo
 */
public class ListaEnlazadaPasajeros {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {

        //Atributos Nodo
        public Pasajero pasajero;
        public Nodo siguiente = null;

        //Constructor Nodo
        public Nodo(Pasajero pasajero) {
            this.pasajero = pasajero;
        }

    }

    public void insetarInicioLista(Pasajero pasajero) {

        Nodo nodo = new Nodo(pasajero);
        nodo.siguiente = cabeza;
        cabeza = nodo;

        longitud++;
    }

    public void insertarFinLista(Pasajero pasajero) {

        Nodo nodo = new Nodo(pasajero);

        if (cabeza == null) {

            cabeza = nodo;

        } else {

            Nodo puntero = cabeza;

            while (puntero.siguiente != null) {

                puntero = puntero.siguiente;
            }

            puntero.siguiente = nodo;

        }

        longitud++;
    }

    public void insertarDespuesDe(int n, Pasajero pasajero) {

        Nodo nodo = new Nodo(pasajero);
        if (cabeza == null) {

            cabeza = nodo;

        } else {

            Nodo puntero = cabeza;

            int contador = 0;

            while (contador < n && puntero.siguiente != null) {

                puntero = puntero.siguiente;
                contador++;
            }
            nodo.siguiente = puntero.siguiente;
            puntero.siguiente = nodo;
        }
        longitud++;
    }

    public Pasajero obtener(int n) {

        if (cabeza == null) {

            return null;

        } else {

            Nodo puntero = cabeza;

            int contador = 0;

            while (contador < n && puntero.siguiente != null) {

                puntero = puntero.siguiente;
                contador++;
            }
            if (contador != n) {
                return null;
            } else {
                return puntero.pasajero;
            }

        }
    }

    public int longitud() {

        return longitud;

    }

    public boolean listaVacia() {

        return cabeza == null;

    }

    public void eliminarInicioLista() {

        if (cabeza != null) {
            Nodo primer = cabeza;
            cabeza = cabeza.siguiente;
            primer.siguiente = null;
        }
        longitud--;
    }

    public void eliminarFinLista() {///Falta eliminar 1 de longitud
        if (cabeza != null) {

            if (cabeza.siguiente == null) {

                cabeza = null;

                longitud--;

            } else {

                Nodo puntero = cabeza;
                while (puntero.siguiente.siguiente != null) {

                    puntero = puntero.siguiente;

                }

                puntero.siguiente = null;

                longitud--;
            }
        }
    }

    public void eliminarPosicion(int n) {
        if (cabeza != null) {

            if (n == 0) {

                Nodo primer = cabeza;
                cabeza = cabeza.siguiente;
                primer.siguiente = null;

                longitud--;

            } else if (n < longitud) {
                Nodo puntero = cabeza;
                int contador = 0;

                while (contador < (n - 1)) {

                    puntero = puntero.siguiente;
                    contador++;

                }
                Nodo temp = puntero.siguiente;
                puntero.siguiente = temp.siguiente;

                temp.siguiente = null;
                longitud--;
            }

        }
    }

}


