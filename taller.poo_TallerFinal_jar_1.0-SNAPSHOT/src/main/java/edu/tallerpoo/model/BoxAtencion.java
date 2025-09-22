package edu.tallerpoo.model;

public class BoxAtencion {
    private  Registro registro;
    private int numeroBox;

    private Medico medico;

    public BoxAtencion(int numeroBox, Medico medico) {
        this.numeroBox = numeroBox;
        this.medico = medico;
    }

    public BoxAtencion(int numeroBox) {
        this.numeroBox = numeroBox;
    }

    public BoxAtencion(){
    }

    public int getNumeroBox() {
        return numeroBox;
    }

    public void setNumeroBox(int numeroBox) {
        this.numeroBox = numeroBox;
    }

    public void setMedico(Medico medico){
        this.medico = medico;
    }

    public Medico getMedico(){
        return this.medico;
    }

    public void setRegistro(Registro registro){
        this.registro = registro;
    }

    public Registro getRegistro(){
        return this.registro;
    }
}

