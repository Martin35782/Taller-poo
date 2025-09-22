package edu.tallerpoo.model;
import java.util.Date;


public class Registro {
    private BoxAtencion boxAtencion;
    private Triage triage;
    private HistoriaClinica historiaClinica;
    private Date fecha;
    private Date hora;
    private String motivo;
    private Paciente paciente;

    public Registro(Date fecha, Date hora, String motivo, Paciente paciente, HistoriaClinica historiaClinica){
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.historiaClinica = historiaClinica;
    }

    public Registro(Date fecha, Date hora, String motivo){
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public Registro(){

    }

    public Date getFecha() {
        return fecha;
    }

    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }

    public Triage getTriage() {
        return triage;
    }

    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setPaciente(Paciente paciente){
        this.paciente = paciente;
    }

    public Paciente getPaciente(){
        return this.paciente;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica){
        this.historiaClinica = historiaClinica;
    }

    public HistoriaClinica getHistoriaClinica(){
        return this.historiaClinica;
    }

}