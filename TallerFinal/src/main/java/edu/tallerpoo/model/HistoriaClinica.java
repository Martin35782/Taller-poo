
package edu.tallerpoo.model;
import java.util.ArrayList;
import java.util.Date;
/**
 * La clase HistoriaClinica representa el registro médico de un paciente, que contiene información sobre su atención médica.
 */
public class HistoriaClinica{
    private Medico medico; 
    private String diagnostico; 
    private tipoAtencion lugarAtencion; 
    private String diagnosticoClinico;
    private int id;
    private Date fecha;
    private Date hora;


    private ArrayList<ResultadoEstudio> resultadoestudio; 
    private ArrayList<Registro> registros; 
    private Paciente paciente;
   

    /**
     * Crea una instancia de HistoriaClinica con información detallada.
     *
     * @param medico {@link Medico}-El médico responsable de la atención médica.
     * @param diagnostico {@link String}-El diagnóstico del paciente.
     * @param lugarAtencion {@link tipoAtencion}-El lugar de atención del paciente.
     * @param diagnosticoClinico {@link String}-El diagnóstico clínico del paciente.
     * @param paciente {@link Paciente}-El paciente al que pertenece esta historia clínica.
     */
    public HistoriaClinica(Medico medico, String diagnostico, tipoAtencion lugarAtencion, String diagnosticoClinico, Paciente paciente){
            this.medico = medico;
            this.diagnostico = diagnostico;
            this.lugarAtencion = lugarAtencion;
            this.diagnosticoClinico = diagnosticoClinico;
            this.resultadoestudio = new ArrayList<ResultadoEstudio>();
            this.registros = new ArrayList<Registro>();
            this.paciente = paciente;

    }

   /**
     * Crea una instancia de HistoriaClinica con información básica.
     * 
     * @param medico {@link Medico}-El médico responsable de la atención médica.
     * @param diagnostico {@link String}-El diagnóstico del paciente.
     * @param lugarAtencion {@link tipoAtencion}-El lugar de atención del paciente.
     * @param diagnosticoClinico {@link String}-El diagnóstico clínico del paciente.
     */
    public HistoriaClinica(Medico medico, String diagnostico, tipoAtencion lugarAtencion, String diagnosticoClinico) {
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.lugarAtencion = lugarAtencion;
        this.diagnosticoClinico = diagnosticoClinico;
        this.resultadoestudio = new ArrayList<ResultadoEstudio>();
        this.registros = new ArrayList<Registro>();
        this.paciente=new Paciente();
    }
    /**
     * Obtiene la lista de resultados de estudio relacionados con los resultados del estudio clinico.
     *
     * @return {@link ArrayList} - La lista de resultados de estudio.
     */
    public ArrayList<ResultadoEstudio> getResultadoestudio() {
        return resultadoestudio;
    }
    
    
    /**
     * Establece la lista de resultados de estudio relacionados con los resultados del estudio clinico.
     * 
     * @param resultadoestudio 
     */
    public void setResultadoestudio(ArrayList<ResultadoEstudio> resultadoestudio) {
        this.resultadoestudio = resultadoestudio;
    }

    /**
     * Crea una instancia de HistoriaClinica sin asignar ningún valor. (Constructor por defecto)
     */
    public HistoriaClinica() {
        this.paciente=new Paciente();
        this.medico = new Medico();
    }

    /**
     * Obtiene el médico responsable de la atención médica.
     *
     * @return {@link Medico}-El médico responsable.
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * Establece el médico responsable de la atención médica.
     *
     * @param medico {@link Medico}-El médico a asignar.
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * Obtiene el diagnóstico del paciente.
     *
     * @return {@link String}-El diagnóstico del paciente.
     */
    public String getDiagnostico() {
        return diagnostico;
    }

    /**
     * Establece el diagnóstico del paciente.
     *
     * @param diagnostico {@link String}-El diagnóstico a asignar.
     */
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * Obtiene el lugar de atención del paciente.
     *
     * @return {@link tipoAtencion}-El lugar de atención.
     */
    public tipoAtencion getLugarAtencion() {
        return lugarAtencion;
    }

    /**
     * Establece el lugar de atención del paciente.
     *
     * @param lugarAtencion {@link tipoAtencion}-El lugar de atención a asignar.
     */
    public void setLugarAtencion(tipoAtencion lugarAtencion) {
        this.lugarAtencion = lugarAtencion;
    }

    /**
     * Obtiene el diagnóstico clínico del paciente.
     *
     * @return {@link String}-El diagnóstico clínico del paciente.
     */
    public String getDiagnosticoClinico() {
        return diagnosticoClinico;
    }

    /**
     * Establece el diagnóstico clínico del paciente.
     *
     * @param diagnosticoClinico {@link String}-El diagnóstico clínico a asignar.
     */
    public void setDiagnosticoClinico(String diagnosticoClinico) {
        this.diagnosticoClinico = diagnosticoClinico;
    }

    /**
     * Obtiene el paciente al que pertenece esta historia clínica.
     *
     * @return {@link Paciente}-El paciente relacionado.
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Establece el paciente al que pertenece esta historia clínica.
     *
     * @param paciente {@link Paciente}-El paciente a asignar.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
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
    
    

    /**
     * Agrega un resultado de estudio a esta historia clínica.
     *
     * @param resultadoEstudio {@link ResultadoEstudio}-El resultado de estudio a agregar.
     */
    public void agregarResultadoEstudio(ResultadoEstudio resultadoEstudio) {
        this.resultadoestudio.add(resultadoEstudio);
    }

    /**
     * Obtiene la lista de resultados de estudio relacionados con esta historia clínica.
     *
     * @return {@link ArrayList}-La lista de resultados de estudio.
     */
    public ArrayList<ResultadoEstudio> getResultadoEstudio() {
        return this.resultadoestudio;
    }

    /**
     * Agrega un registro de atención médica a esta historia clínica.
     *
     * @param registros {@link Registro}-El registro de atención médica a agregar.
     */
    public void agregarRegistros(Registro registros) {
        this.registros.add(registros);
    }

    /**
     * Obtiene la lista de registros de atención médica relacionados con esta historia clínica.
     *
     * @return {@link ArrayList}-La lista de registros de atención médica.
     */
    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
}

