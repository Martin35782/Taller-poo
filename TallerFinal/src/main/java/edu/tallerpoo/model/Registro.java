
package edu.tallerpoo.model;

import java.util.Date;
/**
 * La clase Registro representa un registro de atención médica.
 */
public class Registro {
    private BoxAtencion boxAtencion; 
    private Triage triage; 
    private HistoriaClinica historiaClinica; 
    private Date fecha;
    private Date hora; 
    private String motivo;
    private Paciente paciente;
    private tipoEstado estado;
    private int id;

    /**
     * Crea una instancia de Registro con información de fecha, hora, motivo, paciente y historia clínica.
     *
     * @param fecha {@link Date}-La fecha del registro.
     * @param hora {@link Date}-La hora del registro.
     * @param motivo {@link String}-El motivo de la atención médica.
     * @param paciente {@link Paciente}-El paciente asociado al registro.
     * @param historiaClinica {@link HistoriaClinica}-La historia clínica relacionada con el registro.
     */
    public Registro(Date fecha, Date hora, String motivo, Paciente paciente, HistoriaClinica historiaClinica) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.paciente = paciente;
        this.historiaClinica = historiaClinica;
    }

    /**
     * Crea una instancia de Registro con información de fecha, hora y motivo.
     *
     * @param fecha {@link Date}-La fecha del registro.
     * @param hora {@link Date}-La hora del registro.
     * @param motivo {@link String}-El motivo de la atención médica.
     */
    public Registro(Date fecha, Date hora, String motivo) {
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    /**
     * Crea una instancia de Registro sin asignar ningún valor. (Constructor por defecto)
     */
    public Registro() {
        this.boxAtencion = new BoxAtencion();
    }

    /**
     * Obtiene la fecha del registro.
     *
     * @return {@link String}-La fecha del registro.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Obtiene el box de atención asociado al registro.
     *
     * @return {@link BoxAtencion}-El box de atención asociado al registro.
     */
    public BoxAtencion getBoxAtencion() {
        return boxAtencion;
    }

    /**
     * Obtiene el triaje asociado al registro.
     *
     * @return {@link Triage}-El triaje asociado al registro.
     */
    public Triage getTriage() {
        return triage;
    }

    /**
     * Establece el triaje asociado al registro.
     *
     * @param triage {@link Triage}-El triaje a asignar.
     */
    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    /**
     * Establece el box de atención asociado al registro.
     *
     * @param boxAtencion {@link BoxAtencion}-El box de atención a asignar.
     */
    public void setBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion = boxAtencion;
    }

    /**
     * Establece la fecha del registro.
     *
     * @param fecha {@link Date}-La fecha a asignar.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora del registro.
     *
     * @return {@link Date}-La hora del registro.
     */
    public Date getHora() {
        return hora;
    }

    /**
     * Establece la hora del registro.
     *
     * @param hora {@link Date}-La hora a asignar.
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el motivo de la atención médica.
     *
     * @return {@link String}-El motivo de la atención médica.
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo de la atención médica.
     *
     * @param motivo {@link String}-El motivo a asignar.
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    /**
     * Establece el paciente asociado al registro.
     *
     * @param paciente {@link Paciente}-El paciente a asignar.
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * Obtiene el paciente asociado al registro.
     *
     * @return {@link Paciente}-El paciente asociado al registro.
     */
    public Paciente getPaciente() {
        return this.paciente;
    }

    /**
     * Establece la historia clínica relacionada con el registro.
     *
     * @param historiaClinica {@link HistoriaClinica}-La historia clínica a asignar.
     */
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    /**
     * Obtiene la historia clínica relacionada con el registro.
     *
     * @return {@link HistoriaClinica}-La historia clínica relacionada con el registro.
     */
    public HistoriaClinica getHistoriaClinica() {
        return this.historiaClinica;
    }

    /**
     * Obtiene la estado relacionado con el registro.
     * 
     * @return {@link tipoEstado}-Estado relacionado con el registro
     */
    public tipoEstado getEstado() {
        return estado;
    }

    /**
     * Establece el estado relacionado con el registro.
     * 
     * @param estado {@link tipoEstado}-Estado relacionad coon el registro
     */
    public void setEstado(tipoEstado estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la id relacionada con el registro
     * 
     * @return {@link Integer}-ID relacionada con el registro
     */
    public int getId() {
        return id;
    }

    /**
     * Establece la id relacionada con el registro
     * 
     * @param id {@link Integer}-ID relacionada con el registro
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Devuelve una representación en cadena de la instancia de Registro.
     *
     * @return {@link String}Una cadena que representa al registro.
     */

    @Override
    public String toString() {
        return "Registro{" + "boxAtencion=" + boxAtencion + ", triage=" + triage + ", historiaClinica=" + historiaClinica + ", fecha=" + fecha + ", hora=" + hora + ", motivo=" + motivo + ", paciente=" + paciente + ", estado=" + estado + '}';
    }

}