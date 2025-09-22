package edu.tallerpoo.model;

public class Especialidad {
    private String especialidad;

    public Especialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Especialidad(){

    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /*@Override
    public String toString() {
        return "Especialidad{" +
                "especialidad='" + especialidad + '\'' +
                '}';
    }

     */
}
