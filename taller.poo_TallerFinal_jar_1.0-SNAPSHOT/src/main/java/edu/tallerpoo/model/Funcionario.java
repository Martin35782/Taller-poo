package edu.tallerpoo.model;
import java.util.Date;

public class Funcionario extends Persona{
    private String usuario;
    private String contrasena;
    private tipoRol rol;

    public Funcionario(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Funcionario() {
        //Constructor por defecto
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public tipoRol getRol() {
        return rol;
    }

    public void setRol(tipoRol rol) {
        this.rol = rol;
    }

    /*@Override
    public String toString() {
        return "Funcionario{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", rol=" + rol +
                '}';
    }
    Es realmente necesario el metodo toString?
     */
}
