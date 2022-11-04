package clases.personas;

import estructuras.Usuarios.ListaEnlazadaResponsables;

/**
 *
 * @author Arturo
 */
public class Persona {
    
    private String usuario;
    private String password;
    private String nombre;
    private String tipoDeDocumento;
    private String numeroDeDocumento;
    private int añoDeNacimiento;
    private int mesDeNacimiento;
    private int diaDenacimiento;
    private boolean esMenor;
    private ListaEnlazadaResponsables responsables;
    
    //Constructores

    public Persona() {
    }

    public Persona(String usuario, String password, String nombre, String tipoDeDocumento, String numeroDeDocumento, int añoDeNacimiento, int mesDeNacimiento, int diaDenacimiento, boolean esMenor, ListaEnlazadaResponsables responsables) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.añoDeNacimiento = añoDeNacimiento;
        this.mesDeNacimiento = mesDeNacimiento;
        this.diaDenacimiento = diaDenacimiento;
        this.esMenor = esMenor;
        this.responsables = responsables;
    }

    public Persona(String nombre, String tipoDeDocumento, String numeroDeDocumento, int añoDeNacimiento, int mesDeNacimiento, int diaDenacimiento, boolean esMenor) {
        this.nombre = nombre;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.añoDeNacimiento = añoDeNacimiento;
        this.mesDeNacimiento = mesDeNacimiento;
        this.diaDenacimiento = diaDenacimiento;
        this.esMenor = esMenor;
    }
    
    
    
    //Get

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public int getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public int getMesDeNacimiento() {
        return mesDeNacimiento;
    }

    public int getDiaDenacimiento() {
        return diaDenacimiento;
    }

    public boolean isEsMenor() {
        return esMenor;
    }

    public ListaEnlazadaResponsables getResponsables() {
        return responsables;
    }
    
    //Set

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public void setAñoDeNacimiento(int añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public void setMesDeNacimiento(int mesDeNacimiento) {
        this.mesDeNacimiento = mesDeNacimiento;
    }

    public void setDiaDenacimiento(int diaDenacimiento) {
        this.diaDenacimiento = diaDenacimiento;
    }

    public void setEsMenor(boolean esMenor) {
        this.esMenor = esMenor;
    }

    public void setResponsables(ListaEnlazadaResponsables responsables) {
        this.responsables = responsables;
    }
    
    
    
    
    
    

}
