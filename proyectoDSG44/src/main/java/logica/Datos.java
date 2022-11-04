package logica;

import clases.personas.*;
import estructuras.Usuarios.ListaEnlazadaResponsables;
import estructuras.general.ListaEnlazadaPasajeros;

public class Datos {

//*******************************Atributos**************************************
    //----------------Listas para "persisitencia" de datos------------------ 
    private static ListaEnlazadaPasajeros listaUsuariosPrincipal = new ListaEnlazadaPasajeros();

    private static Pasajero temporal = new Pasajero();
    
    private static int indiceUser = -1;

    //--------------------------Aerolinea-----------------------------------
//*********************************Get&Set User*********************************
    public static ListaEnlazadaPasajeros getListaUsuariosPrincipal() {
        return listaUsuariosPrincipal;
    }

    public static void setListaUsuariosPrincipal(ListaEnlazadaPasajeros listaUsuariosPrincipal) {
        listaUsuariosPrincipal = listaUsuariosPrincipal;
    }

    public static Pasajero getTemporal() {
        return temporal;
    }

    public static void setTemporal(Pasajero temporal) {
        temporal = temporal;
    }

    public static int getIndiceUser() {
        return indiceUser;
    }

    public static void setIndiceUser(int aIndiceUser) {
        indiceUser = aIndiceUser;
    }

    public void iniciarDatosUsuarios() {
        //---------------------------Usuarios-----------------------------------
        //Aqui inicio una listas enlazadas
        ListaEnlazadaResponsables listaUserTest1 = new ListaEnlazadaResponsables();
        ListaEnlazadaResponsables listaUserTest2 = new ListaEnlazadaResponsables();
        ListaEnlazadaResponsables listaUserTest3 = new ListaEnlazadaResponsables();
        ListaEnlazadaResponsables listaUserTest4 = new ListaEnlazadaResponsables();
        ListaEnlazadaResponsables listaUserTest5 = new ListaEnlazadaResponsables();

        //Defino los datos que van a entrar a las listas para los User de prueba
        Contacto contactoUserTest1 = new Contacto(3156481563L, 11512, "juliana@correoreal.com", "Colombia", "Bogotá", "Cl. 79 #50-83", "Juliana Chacon", "Cedula de Ciudadanía", "105456651", 1994, 11, 20, false);
        Contacto contactoUserTest2 = new Contacto(3118884563L, 11120, "daniel@correoreal.com", "Estados Unidos", "Springfield", "742 Evergreen Terrace", "Daniel Vargas", "Pasaporte", "14489512", 1995, 3, 15, false);
        Contacto contactoUserTest3 = new Contacto(3206488463L, 10117, "enrich@correo.com", "Alemania", "Berlin", "Jägerstraße 10, 10117", "Enrich volkswagen", "DNI Extranjero", "5465465F81", 1990, 4, 22, false);
        Contacto contactoUserTest4 = new Contacto(3251453664L, 11156, "yuwo@correoreal.com", "Japon", "Tokio", "2-chōme-21-1 Kanda Jinbōchō", "Yuwo Suzuki", "DNI Extranjero", "49844F46S", 1984, 9, 10, false);
        Contacto contactoUserTest5 = new Contacto(3011645156L, 14655, "mark@correoreal.com", "Noruega", "Oslo", "Tollbugata 12, 0152", "Mark Goldberg", "Otro", "455564821", 2000, 12, 5, false);

        //Defino los User para las pruebas del programa
        Pasajero userTest1 = new Pasajero(true, true, "a", "a", "Rena Soxcey", "DNI extanjero", "1793917", 1966, 11, 20, false, listaUserTest1);
        Pasajero userTest2 = new Pasajero(true, true, "shazel1", "45xDE2PjYiRV", "Stacie Hazel", "Cedula de Ciudadania", "1446841", 2005, 1, 9, true, listaUserTest2);
        Pasajero userTest3 = new Pasajero(true, true, "fpridding2", "IWtRnPjko", "Fawnia Pridding", "Pasaporte", "1622368Sf", 1956, 3, 22, false, listaUserTest3);
        Pasajero userTest4 = new Pasajero(true, true, "ocraise3", "HiMPOPqoo", "Obie Craise", "Tarjeta de Identidad", "1727380", 2010, 7, 29, true, listaUserTest4);
        Pasajero userTest5 = new Pasajero(true, true, "wmathison4", "ZZqTXFbe", "Wilmar Mathison", "Pasaporte", "1532886", 1962, 11, 24, false, listaUserTest5);

        //ingreso los datos de contactos a las listas que usa cada pasajero
        listaUserTest1.insetarInicioLista(contactoUserTest1);
        listaUserTest1.insetarInicioLista(contactoUserTest5);
        listaUserTest2.insetarInicioLista(contactoUserTest2);
        listaUserTest2.insetarInicioLista(contactoUserTest4);
        listaUserTest3.insetarInicioLista(contactoUserTest3);
        listaUserTest3.insetarInicioLista(contactoUserTest5);
        listaUserTest4.insetarInicioLista(contactoUserTest4);
        listaUserTest4.insetarInicioLista(contactoUserTest1);
        listaUserTest5.insetarInicioLista(contactoUserTest5);
        listaUserTest5.insetarInicioLista(contactoUserTest2);

        //ingreso los datos de usuarios a la lista de pasajeros
        listaUsuariosPrincipal.insertarFinLista(userTest1);
        listaUsuariosPrincipal.insertarFinLista(userTest2);
        listaUsuariosPrincipal.insertarFinLista(userTest3);
        listaUsuariosPrincipal.insertarFinLista(userTest4);
        listaUsuariosPrincipal.insertarFinLista(userTest5);

    }

}
