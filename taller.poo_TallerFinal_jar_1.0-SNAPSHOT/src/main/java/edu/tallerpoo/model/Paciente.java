package edu.tallerpoo.model;

import java.util.Date;
import java.util.ArrayList;

public class Paciente extends Persona{
    private String personaContacto;
    private ArrayList<HistoriaClinica> historiaclinica;
    private ArrayList<Registro> registros;

    public Paciente(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String personaContacto) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email);
        this.personaContacto = personaContacto;
        this.historiaclinica = new ArrayList<HistoriaClinica>();
        this.registros = new ArrayList<Registro>();
    }

    public Paciente(){
        //Constructor por defecto
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public void agregarHistoriaClinca(HistoriaClinica historiaclinica){
        this.historiaclinica.add(historiaclinica);
    }

    public ArrayList<HistoriaClinica> getHistoriaClinica(){
        return this.historiaclinica;
    }

    public void agregarRegistro(Registro registro){
        this.registros.add(registro);
    }

    public ArrayList<Registro> getRegistros(){
        return this.registros;
    }

    /*@Override
    public String toString() {
        return "Paciente{" +
                "personaContacto='" + personaContacto + '\'' +
                '}';
    }
    Es realmente necesario el metodo toString?
     */
}
