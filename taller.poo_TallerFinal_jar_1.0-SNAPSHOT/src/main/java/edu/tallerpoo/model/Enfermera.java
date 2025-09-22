package edu.tallerpoo.model;
import java.util.Date;

public class Enfermera extends Funcionario{
    private Triage triage;
    private BoxAtencion boxAtencion;

    public Enfermera(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
    }

    public Enfermera() {
    //Constructor por defecto
    }

    public void cambiarTriage(){
    // metodo para cambiar triage
    }

    public void asignarBoxPaciente(){
    // metodo para asignar box a paciente
    }

    public void setTriage(Triage triage){
        this.triage = triage;
    }

    public Triage getTriage(){
        return this.triage;
    }

}
