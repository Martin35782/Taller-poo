package edu.tallerpoo.model;

import java.util.Date;

public class Titulo {
    private Date fechaTitulo;
    private String universidad;
    private Especialidad esp;
    private Medico med;

    public Titulo(Date fechaTitulo, String universidad, Especialidad especialidad, Medico medico) {
        this.fechaTitulo = fechaTitulo;
        this.universidad = universidad;
        this.esp = especialidad;
        this.med = medico;
    }

    public Titulo(Date fechaTitulo, String universidad){
        this.fechaTitulo = fechaTitulo;
        this.universidad = universidad;
    }

    public Titulo(){

    }

    public Date getFechaTitulo() {
        return fechaTitulo;
    }

    public void setFechaTitulo(Date fechaTitulo) {
        this.fechaTitulo = fechaTitulo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setEspecialidad(Especialidad especialidad){
        this.esp = especialidad;
    }

    public Especialidad getEspecialidad(){
        return this.esp;
    }

    public void setMedico(Medico medico){
        this.med = medico;
    }

    public Medico getMedico(){
        return this.med;
    }

    /*@Override
    public String toString() {
        return "Titulo{" +
                "fechaTitulo=" + fechaTitulo +
                ", universidad='" + universidad + '\'' +
                '}';
    }

     */
}