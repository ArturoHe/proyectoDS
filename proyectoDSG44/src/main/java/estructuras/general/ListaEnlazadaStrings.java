/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras.general;

/**
 *
 * @author Arturo
 */
public class ListaEnlazadaStrings {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {

        //Atributos Nodo
        public String cadenaa;
        public Nodo siguiente = null;

        //Constructor Nodo
        public Nodo(String cadenaa) {
            this.cadenaa = cadenaa;
        }

    }

    public void insetarInicioLista(String cadenaa) {

        Nodo nodo = new Nodo(cadenaa);
        nodo.siguiente = cabeza;
        cabeza = nodo;

        longitud++;
    }

    public void insertarFinLista(String cadenaa) {

        Nodo nodo = new Nodo(cadenaa);

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

    public void insertarDespuesDe(int n, String cadenaa) {

        Nodo nodo = new Nodo(cadenaa);
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

    public String obtener(int n) {

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
                return puntero.cadenaa;
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

