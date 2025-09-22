package edu.tallerpoo.model;
import java.util.Date;
import java.util.ArrayList;

public class Medico extends Funcionario{
    private ArrayList<Triage> triages;
    private int matricula;
    private ArrayList<Especialidad> especialidades;
    private ArrayList<HistoriaClinica> historiaClinica;
    private ArrayList<BoxAtencion> boxAtencion;
    private ArrayList<Registro> registros;

    public Medico(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, int matricula) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
        this.matricula = matricula;
        this.especialidades = new ArrayList<Especialidad>();
        this.historiaClinica = new ArrayList<HistoriaClinica>();
        this.boxAtencion = new ArrayList<BoxAtencion>();
        this.registros = new ArrayList<Registro>();
        this.triages = new ArrayList<Triage>();
    }

    public Medico(){
    // constructor por defecto
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }

    public ArrayList<Especialidad> getEspecialidades(){
        return this.especialidades;
    }

    public void agregarHistoriaClinica(HistoriaClinica historiaclinica){
        this.historiaClinica.add(historiaclinica);
    }

    public ArrayList<HistoriaClinica> gethistoriaClinica(){
        return this.historiaClinica;
    }

    public void agregarBoxAtencion(BoxAtencion boxAtencion){
        this.boxAtencion.add(boxAtencion);
    }

    public ArrayList<BoxAtencion> getBoxAtencion(){
        return this.boxAtencion;
    }

    public void agregarRegistro(Registro registro){
        this.registros.add(registro);
    }

    public ArrayList<Registro> getRegistros(){
        return this.registros;
    }

    public void agregarTriage(Triage triage){
        this.triages.add(triage);
    }

    public ArrayList<Triage> getMedicos(){
        return this.triages;
    }

    public void cambiarTriage(){
    // metodo para cambiar el triage
    }

    public void realizarTriage(){
    // Es necesario este metodo?
    }

    public void asignarBoxPaciente(){
    // Es necesario este metodo?
    }

    public void getHistoriaClinica(){
    // metodo para consultar historia clinica de paciente
    }

   /* @Override
    public String toString() {
        return "Medico{" +
                "matricula=" + matricula +
                '}';
    }
    Es realmente necesario el metodo toString?
    */




}
