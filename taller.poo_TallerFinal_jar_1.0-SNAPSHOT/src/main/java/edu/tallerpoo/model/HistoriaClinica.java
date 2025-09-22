package edu.tallerpoo.model;
import java.util.ArrayList;

public class HistoriaClinica{
    private Medico medico;
    private String diagnostico;
    private tipoAtencion lugarAtencion;
    private String diagnosticoClinico;
    private ArrayList<ResultadoEstudio> resultadoestudio;
    private ArrayList<Registro> registros;
    private Paciente paciente;

    public HistoriaClinica(Medico medico, String diagnostico, tipoAtencion lugarAtencion, String diagnosticoClinico, Paciente paciente){
            this.medico = medico;
            this.diagnostico = diagnostico;
            this.lugarAtencion = lugarAtencion;
            this.diagnosticoClinico = diagnosticoClinico;
            this.resultadoestudio = new ArrayList<ResultadoEstudio>();
            this.registros = new ArrayList<Registro>();
            this.paciente = paciente;

    }

    public HistoriaClinica(Medico medico, String diagnostico, tipoAtencion lugarAtencion, String diagnosticoClinico) {
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.lugarAtencion = lugarAtencion;
        this.diagnosticoClinico = diagnosticoClinico;
        this.resultadoestudio = new ArrayList<ResultadoEstudio>();
        this.registros = new ArrayList<Registro>();
    }

    public HistoriaClinica() {

    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public tipoAtencion getLugarAtencion() {
        return lugarAtencion;
    }

    public void setLugarAtencion(tipoAtencion lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }

    public String getDiagnosticoClinico() {
        return diagnosticoClinico;
    }

    public void setDiagnosticoClinico(String diagnosticoClinico) {
        this.diagnosticoClinico = diagnosticoClinico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void agregarResultadoEstudio(ResultadoEstudio resultadoEstudio){
        this.resultadoestudio.add(resultadoEstudio);
    }

    public ArrayList<ResultadoEstudio> getResultadoEstudio() {
        return this.resultadoestudio;

    }
    public void agregarRegistros(Registro registros){
        this.registros.add(registros);
    }

    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
}

