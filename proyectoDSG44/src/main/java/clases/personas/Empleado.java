package clases.personas;

import estructuras.Usuarios.ListaEnlazadaResponsables;

/**
 *
 * @author Arturo
 */
public class Empleado extends Persona{
    
    private String cargo;
    private int codigo;
    private int sueldoMensual;
    private boolean esActivo;
    
    //Constructores

    public Empleado() {
    }

    public Empleado(String cargo, int codigo, int sueldoMensual, boolean esActivo, String usuario, String password, String nombre, String tipoDeDocumento, String numeroDeDocumento, int añoDeNacimiento, int mesDeNacimiento, int diaDenacimiento) {
        super(usuario, password, nombre, tipoDeDocumento, numeroDeDocumento, añoDeNacimiento, mesDeNacimiento, diaDenacimiento);
        this.cargo = cargo;
        this.codigo = codigo;
        this.sueldoMensual = sueldoMensual;
        this.esActivo = esActivo;
    }
    
    //Getlast_name

    public String getCargo() {
        return cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getSueldoMensual() {
        return sueldoMensual;
    }

    public boolean isEsActivo() {
        return esActivo;
    }
    
    //Set

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSueldoMensual(int sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public void setEsActivo(boolean esActivo) {
        this.esActivo = esActivo;
    }
    
    

}
