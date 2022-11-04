package estructuras.aerolinea;

import clases.vehiculos.Avion;

public class AvionesListaEnlazada {

    private Nodo cabeza = null;
    private int longitud = 0;

    private class Nodo {

        //Atributos Nodo
        public Avion avion;
        public Nodo siguiente = null;

        //Constructor Nodo
        public Nodo(Avion avion) {
            this.avion = avion;
        }

    }

    public void insetarInicioLista(Avion avion) {

        Nodo nodo = new Nodo(avion);
        nodo.siguiente = cabeza;
        cabeza = nodo;

        longitud++;
    }

    public void insertarFinLista(Avion avion) {

        Nodo nodo = new Nodo(avion);

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

    public void insertarDespuesDe(int n, Avion avion) {

        Nodo nodo = new Nodo(avion);
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

    public Avion obtener(int n) {

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
                return puntero.avion;
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
