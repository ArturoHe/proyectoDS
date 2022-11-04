package logica;

import clases.personas.*;
import clases.proveedores.Proveedor;
import clases.vehiculos.*;
import estructuras.Usuarios.*;
import estructuras.aerolinea.*;

public class Datos {
//--------------------------------Usuarios--------------------------------------
//*******************************Atributos**************************************
    //----------------Listas para "persisitencia" de datos------------------ 

    private static ListaEnlazadaPasajeros listaUsuariosPrincipal = new ListaEnlazadaPasajeros();

    private static Pasajero temporal = new Pasajero();

    private static int indiceUser = -1;

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

    //--------------------------Aerolinea-----------------------------------
    //listas
    private static ListaEnlazadaEmpleados listaEmpleadosPrincipal = new ListaEnlazadaEmpleados();
    private static AvionesListaEnlazada listaAvionesPrincipal = new AvionesListaEnlazada();
    private static ProveedoresListaEnlazada listaProveedoresPrincipal = new ProveedoresListaEnlazada();

    //colas
    private static ColaAutos colaAutosPrincipal = new ColaAutos();
    private static ColaAviones colaAvionesPrincipal = new ColaAviones();
    private static ColaBuses colaBusesPrincipal = new ColaBuses();
    private static ColaCamiones colaCamionesPrincipal = new ColaCamiones();

    //pilas
    private static PilaAutos pilaAutosPrincipal = new PilaAutos();
    private static PilaBuses pilaBusesPrincipal = new PilaBuses();
    private static PilaCamiones pilaCamionesPrincipal = new PilaCamiones();

    private static int indiceEmpleado = -1;

    //************************Get&Set Aerolinea*********************************
    public static ListaEnlazadaEmpleados getListaEmpleadosPrincipal() {
        return listaEmpleadosPrincipal;
    }

    public static void setListaEmpleadosPrincipal(ListaEnlazadaEmpleados aListaEmpleadosPrincipal) {
        listaEmpleadosPrincipal = aListaEmpleadosPrincipal;
    }

    public static AvionesListaEnlazada getListaAvionesPrincipal() {
        return listaAvionesPrincipal;
    }

    public static void setListaAvionesPrincipal(AvionesListaEnlazada aListaAvionesPrincipal) {
        listaAvionesPrincipal = aListaAvionesPrincipal;
    }

    public static ProveedoresListaEnlazada getListaProveedoresPrincipal() {
        return listaProveedoresPrincipal;
    }

    public static void setListaProveedoresPrincipal(ProveedoresListaEnlazada aListaProveedoresPrincipal) {
        listaProveedoresPrincipal = aListaProveedoresPrincipal;
    }

    public static ColaAutos getColaAutosPrincipal() {
        return colaAutosPrincipal;
    }

    public static void setColaAutosPrincipal(ColaAutos aColaAutosPrincipal) {
        colaAutosPrincipal = aColaAutosPrincipal;
    }

    public static ColaAviones getColaAvionesPrincipal() {
        return colaAvionesPrincipal;
    }

    public static void setColaAvionesPrincipal(ColaAviones aColaAvionesPrincipal) {
        colaAvionesPrincipal = aColaAvionesPrincipal;
    }

    public static ColaBuses getColaBusesPrincipal() {
        return colaBusesPrincipal;
    }

    public static void setColaBusesPrincipal(ColaBuses aColaBusesPrincipal) {
        colaBusesPrincipal = aColaBusesPrincipal;
    }

    public static ColaCamiones getColaCamionesPrincipal() {
        return colaCamionesPrincipal;
    }

    public static void setColaCamionesPrincipal(ColaCamiones aColaCamionesPrincipal) {
        colaCamionesPrincipal = aColaCamionesPrincipal;
    }

    public static PilaAutos getPilaAutosPrincipal() {
        return pilaAutosPrincipal;
    }

    public static void setPilaAutosPrincipal(PilaAutos aPilaAutosPrincipal) {
        pilaAutosPrincipal = aPilaAutosPrincipal;
    }

    public static PilaBuses getPilaBusesPrincipal() {
        return pilaBusesPrincipal;
    }

    public static void setPilaBusesPrincipal(PilaBuses aPilaBusesPrincipal) {
        pilaBusesPrincipal = aPilaBusesPrincipal;
    }

    public static PilaCamiones getPilaCamionesPrincipal() {
        return pilaCamionesPrincipal;
    }

    public static void setPilaCamionesPrincipal(PilaCamiones aPilaCamionesPrincipal) {
        pilaCamionesPrincipal = aPilaCamionesPrincipal;
    }

    public static int getIndiceEmpleado() {
        return indiceEmpleado;
    }

    public static void setIndiceEmpleado(int aIndiceEmpleado) {
        indiceEmpleado = aIndiceEmpleado;
    }

    public void iniciarDatosUsuarios() {
        //||||||||||||||||||||||||||||||Usuarios||||||||||||||||||||||||||||||||
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

    public void iniciarDatosAerolinea() {

        //|||||||||||||||||||||||||||Aerolinea||||||||||||||||||||||||||||||||||
        //Defino los empleados para pruebas
        Empleado trabajador1 = new Empleado("Director", 4487, 16670755, false, "b", "b", "Cyrus Sarvar", "DNI", "178036", 1981, 12, 31);
        Empleado trabajador2 = new Empleado("Operador", 4421, 9997676, false, "ibluett1", "w9K3la2", "Iver Bluett", "DNI", "172753", 1996, 8, 20);
        Empleado trabajador3 = new Empleado("Piloto", 4501, 10455252, true, "oshafier2", "KdIL71WXGoZ", "Oren Shafier", "DNI", "174959", 1954, 8, 19);
        Empleado trabajador4 = new Empleado("Director Marketing", 4726, 34493132, true, "dwitt3", "9ySpOr0VD", "De witt McCole", "DNI", "136956", 1985, 8, 26);
        Empleado trabajador5 = new Empleado("Pintor", 4386, 2560469, true, "psaywood4", "acvO5qB", "Phoebe Saywood", "DNI", "140396", 1996, 11, 3);
        Empleado trabajador6 = new Empleado("DirectorFinanzas", 4829, 23124115, false, "koliphard5", "JovkaCR", "Karly Oliphard", "DNI", "153555", 1987, 12, 16);
        Empleado trabajador7 = new Empleado("Supervisor", 4254, 3178079, true, "ftirkin6", "TaTDVvVOUH", "Fawn Tirkin", "DNI", "167515", 1961, 1, 22);
        Empleado trabajador8 = new Empleado("Promotor", 4803, 2689210, false, "cfibbitts7", "wgfyoSW", "Corney Fibbitts", "DNI", "153853", 1998, 10, 27);

        //ingreso los datos de empleados a la lista de empleados
        listaEmpleadosPrincipal.insertarFinLista(trabajador1);
        listaEmpleadosPrincipal.insertarFinLista(trabajador2);
        listaEmpleadosPrincipal.insertarFinLista(trabajador3);
        listaEmpleadosPrincipal.insertarFinLista(trabajador4);
        listaEmpleadosPrincipal.insertarFinLista(trabajador5);
        listaEmpleadosPrincipal.insertarFinLista(trabajador6);
        listaEmpleadosPrincipal.insertarFinLista(trabajador7);
        listaEmpleadosPrincipal.insertarFinLista(trabajador8);

        //Defino Autos para pruebas
        Automovil auto1 = new Automovil("Administracion", "JTDKDTB32C1074721", false, "Parqueado", "Buick", "Riviera", "SKBO", 3, 0, 11, 0, false);
        Automovil auto2 = new Automovil("Administracion", "1YVHZ8BH2D5062030", false, "Parqueado", "Dodge", "Intrepid", "SKBO", 4, 5, 11, 0, false);
        Automovil auto3 = new Automovil("Operacion General", "1GYS3HEFXBR460254", true, "Parqueado", "Ford", "Flex", "SKBO", 5, 0, 11, 0, false);
        Automovil auto4 = new Automovil("Administracion", "WBAWR33549P146363", true, "Parqueado", "Volkswagen", "Eos", "SKBO", 4, 2, 11, 0, false);
        Automovil auto5 = new Automovil("Operacion General", "5N1CR2MNXEC901673", true, "Parqueado", "Isuzu", "i-290", "SKBO", 3, 4, 10, 0, false);
        //insercion a pila (parqueadero)
        pilaAutosPrincipal.apilar(auto1);
        pilaAutosPrincipal.apilar(auto2);
        pilaAutosPrincipal.apilar(auto3);
        pilaAutosPrincipal.apilar(auto4);
        pilaAutosPrincipal.apilar(auto5);

        //Defino Aviones para pruebas
        Avion avion1 = new Avion("ET", "Jet A1", "N788AV", 2, 17, 98, "5J6TF2H55FL680647", true, "Parqueado", "Airbus", "A320", "SKBO", 121, 375, 160);
        Avion avion2 = new Avion("BR", "Jet A1", "S928AV", 1, 58, 58, "WAUVC58E25A000574", true, "Parqueado", "Boening", "787", "SKBO", 134, 118, 362);
        Avion avion3 = new Avion("MZ", "Av Gas", "E128AV", 1, 60, 66, "1G6KF57921U190728", true, "Parqueado", "Piper", "PA-31", "SKBO", 7, 720, 308);
        Avion avion4 = new Avion("TN", "Jet A1", "N358AV", 4, 66, 98, "WDDPK4HA7EF206438", true, "Parqueado", "Saab", "340", "SKBO", 54, 174, 366);
        Avion avion5 = new Avion("CN", "Jet A1", "W618AV", 1, 63, 140, "1G6DA5EG8A0932503", true, "Parqueado", "Airbus", "Beluga", "SKBO", 84, 524, 288);

        //Defino camiones para pruebas
        Camion camion1 = new Camion("Combustible Jet A1", "JN8AZ1FY9BW664217", true, "Parqueado", "Kia", "FMX", "SKBO", 2, 1000, 83);
        Camion camion2 = new Camion("Proveedor", "3D7JB1EPXAG817411", true, "Parqueado", "Volvo", "FH", "SKBO", 2, 1000, 73);
        Camion camion3 = new Camion("Combustible Av Gas", "KNAFU5A26B5247179", true, "Parqueado", "Kenworth", "FM", "SKBO", 2, 1000, 103);
        //insercion a pila (parqueadero)
        pilaCamionesPrincipal.apilar(camion1);
        pilaCamionesPrincipal.apilar(camion2);
        pilaCamionesPrincipal.apilar(camion3);

        //Defino buses para pruebas
        Bus bus1 = new Bus(5, "1FTEW1CM6CF151240", true, "Parqueado", "Blue Bird", "FH-500S", "SKBO", 39, 0, 46);
        Bus bus2 = new Bus(6, "1FMJK1G56EE060227", true, "Parqueado", "Volvo", "HT-600", "SKBO", 48, 0, 33);
        Bus bus3 = new Bus(4, "JH4KC1F58EC788958", true, "Parqueado", "Scania", "Super 50", "SKBO", 32, 0, 50);
        //insercion a pila (parqueadero)
        pilaBusesPrincipal.apilar(bus1);
        pilaBusesPrincipal.apilar(bus2);
        pilaBusesPrincipal.apilar(bus3);

        //Defino Proveedores para pruebas
        Proveedor proveedor1 = new Proveedor("Schmeler-Ullrich", "11104", "Catering", true, "Jueves");
        Proveedor proveedor2 = new Proveedor("Satterfield and Franecki", "11101", "Combustible", true, "Lunes");
        Proveedor proveedor3 = new Proveedor("Robel, Corwin and Rippin", "11103", "Limpieza", true, "Viernes");
        Proveedor proveedor4 = new Proveedor("Jakubowski LLC", "11100", "Limpieza", false, "Martes");
        Proveedor proveedor5 = new Proveedor("Wilkinson, Keebler and Johnston", "11108", "Personal", false, "Lunes");

        listaProveedoresPrincipal.insertarFinLista(proveedor1);
        listaProveedoresPrincipal.insertarFinLista(proveedor2);
        listaProveedoresPrincipal.insertarFinLista(proveedor3);
        listaProveedoresPrincipal.insertarFinLista(proveedor4);
        listaProveedoresPrincipal.insertarFinLista(proveedor5);

    }

}
