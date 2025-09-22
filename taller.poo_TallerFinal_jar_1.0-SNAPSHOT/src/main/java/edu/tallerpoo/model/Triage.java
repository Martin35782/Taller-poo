package edu.tallerpoo.model;
import java.util.Date;
import java.util.ArrayList;

public class Triage {
    private ArrayList<Medico> medicos;
    private Registro registro;
    private int nivelpropuesto;
    private String color;
    private String tiempoMax;
    private int puntaje;
    private Date fecha;
    private int nivelCambio;
    private String motivoCambio;
    private int pulso;
    private int lesionesLeves;
    private int sangrado;
    private int signosShock;
    private int dolorAdominal;
    private int vomitos;
    private int fiebre;
    private int dolorPecho;
    private int lesionesGraves;
    private int conciencia;
    private int estadoMental;

    public Triage(int nivelpropuesto, String color, String tiempoMax, int puntaje, Date fecha, String motivoCambio, int pulso, int lesionesLeves, int sangrado, int signosShock, int dolorAdominal, int vomitos, int fiebre, int dolorPecho, int lesionesGraves, int conciencia, int estadoMental) {
        this.nivelpropuesto = nivelpropuesto;
        this.color = color;
        this.tiempoMax = tiempoMax;
        this.puntaje = puntaje;
        this.fecha = fecha;
        this.motivoCambio = motivoCambio;
        this.pulso = pulso;
        this.lesionesLeves = lesionesLeves;
        this.sangrado = sangrado;
        this.signosShock = signosShock;
        this.dolorAdominal = dolorAdominal;
        this.vomitos = vomitos;
        this.fiebre = fiebre;
        this.dolorPecho = dolorPecho;
        this.lesionesGraves = lesionesGraves;
        this.conciencia = conciencia;
        this.estadoMental = estadoMental;
        this.medicos = new ArrayList<Medico>();
    }

    public Triage(){

    }

    public void agregarMedicos(Medico medico){this.medicos.add(medico);}

    public ArrayList<Medico> getMedicos(){return this.medicos;}

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public int getNivelpropuesto() {
        return nivelpropuesto;
    }

    public void setNivelpropuesto(int nivelpropuesto) {
        this.nivelpropuesto = nivelpropuesto;
    }

    public int getNivelPropuesto() {
        return nivelpropuesto;
    }

    public void setNivelPropuesto(int nivelpropuesto) {
        this.nivelpropuesto = nivelpropuesto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTiempoMax() {
        return tiempoMax;
    }

    public void setTiempoMax(String tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setNivelCambio(int nivel){
        this. nivelCambio = nivel;
    }

    public int getNivelCambio(){
        return this.nivelCambio;
    }

    public String getMotivoCambio() {
        return motivoCambio;
    }

    public void setMotivoCambio(String motivoCambio) {
        this.motivoCambio = motivoCambio;
    }

    public int getPulso() {
        return pulso;
    }

    public void setPulso(int pulso) {
        this.pulso = pulso;
    }

    public int getLesionesLeves() {
        return lesionesLeves;
    }

    public void setLesionesLeves(int lesionesLeves) {
        this.lesionesLeves = lesionesLeves;
    }

    public int getSangrado() {
        return sangrado;
    }

    public void setSangrado(int sangrado) {
        this.sangrado = sangrado;
    }

    public int getSignosShock() {
        return signosShock;
    }

    public void setSignosShock(int signosShock) {
        this.signosShock = signosShock;
    }

    public int getDolorAdominal() {
        return dolorAdominal;
    }

    public void setDolorAdominal(int dolorAdominal) {
        this.dolorAdominal = dolorAdominal;
    }

    public int getVomitos() {
        return vomitos;
    }

    public void setVomitos(int vomitos) {
        this.vomitos = vomitos;
    }

    public int getFiebre() {
        return fiebre;
    }

    public void setFiebre(int fiebre) {
        this.fiebre = fiebre;
    }

    public int getDolorPecho() {
        return dolorPecho;
    }

    public void setDolorPecho(int dolorPecho) {
        this.dolorPecho = dolorPecho;
    }

    public int getLesionesGraves() {
        return lesionesGraves;
    }

    public void setLesionesGraves(int lesionesGraves) {
        this.lesionesGraves = lesionesGraves;
    }

    public int getConciencia() {
        return conciencia;
    }

    public void setConciencia(int conciencia) {
        this.conciencia = conciencia;
    }

    public int getEstadoMental() {
        return estadoMental;
    }

    public void setEstadoMental(int estadoMental) {
        this.estadoMental = estadoMental;
    }

    /*@Override
    public String toString() {
        return "Triage{" +
                "nivel=" + nivel +
                ", color='" + color + '\'' +
                ", tiempoMax=" + tiempoMax +
                ", puntaje=" + puntaje +
                ", fecha=" + fecha +
                ", motivoCambio='" + motivoCambio + '\'' +
                ", pulso=" + pulso +
                ", lesionesLeves=" + lesionesLeves +
                ", sangrado=" + sangrado +
                ", signosShock=" + signosShock +
                ", dolorAdominal=" + dolorAdominal +
                ", vomitos=" + vomitos +
                ", fiebre=" + fiebre +
                ", dolorPecho=" + dolorPecho +
                ", lesionesGraves=" + lesionesGraves +
                ", conciencia=" + conciencia +
                ", estadoMental=" + estadoMental +
                '}';
    }

     */

    private void setTriage(){
        //cambiar triage
    }
    private void realizarTriage(int puntaje){
        //realizar triage
    }

}
