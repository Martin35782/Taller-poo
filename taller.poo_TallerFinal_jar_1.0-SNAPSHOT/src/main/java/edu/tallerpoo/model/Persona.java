package edu.tallerpoo.model;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNac;
    private String domicilio;
    private int documento;
    private String telFijo;
    private String celular;
    private tipoEstCivil estadoCivil;
    private String email;

    public Persona(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telFijo = telFijo;
        this.celular = celular;
        this.estadoCivil = estadoCivil;
        this.email = email;
    }

    public Persona(){
   //Constructor por defecto
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getTelFijo() {
        return telFijo;
    }

    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public tipoEstCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(tipoEstCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /*@Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNac=" + fechaNac +
                ", domicilio='" + domicilio + '\'' +
                ", documento=" + documento +
                ", telFijo='" + telFijo + '\'' +
                ", celular='" + celular + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", email='" + email + '\'' +
                '}';
    }
    Es realmente necesario el metodo toString?*/
}
