package edu.tallerpoo.model;

import java.util.Date;

/**
 * La clase Titulo representa la información sobre el título académico obtenido por un médico.
 * Cada título tiene una fecha de obtención, universidad donde se obtuvo, una especialidad asociada y el médico al que pertenece.
 */
public class Titulo {
    private Date fechaTitulo;
    private String universidad;
    private Especialidad esp;
    private Medico med;

    /**
     * Crea una instancia de la clase Titulo con una fecha de obtención, universidad, especialidad y médico asociado.
     *
     * @param fechaTitulo   {@link Date}-La fecha en que se obtuvo el título.
     * @param universidad    {@link String}-La universidad donde se obtuvo el título.
     * @param especialidad  {@link Especialidad}-La especialidad asociada al título.
     * @param medico        {@link Medico}-El médico al que pertenece el título.
     */
    public Titulo(Date fechaTitulo, String universidad, Especialidad especialidad, Medico medico) {
        this.fechaTitulo = fechaTitulo;
        this.universidad = universidad;
        this.esp = especialidad;
        this.med = medico;
    }

    /**
     * Crea una instancia de la clase Titulo con una fecha de obtención y universidad.
     *
     * @param fechaTitulo   {@link Date}-La fecha en que se obtuvo el título.
     * @param universidad    {@link String}-La universidad donde se obtuvo el título.
     */
    public Titulo(Date fechaTitulo, String universidad) {
        this.fechaTitulo = fechaTitulo;
        this.universidad = universidad;
    }

    /**
     * Crea una instancia de la clase Titulo con valores predeterminados.
     * La fecha de obtención y universidad se inicializan en null.
     */
    public Titulo() {
        // constructor por defecto
    }

    /**
     * Obtiene la fecha en que se obtuvo el título.
     *
     * @return {@link Date}-La fecha de obtención del título.
     */
    public Date getFechaTitulo() {
        return fechaTitulo;
    }

    /**
     * Establece la fecha en que se obtuvo el título.
     *
     * @param fechaTitulo {@link Date}-La fecha de obtención del título.
     */
    public void setFechaTitulo(Date fechaTitulo) {
        this.fechaTitulo = fechaTitulo;
    }

    /**
     * Obtiene el nombre de la universidad donde se obtuvo el título.
     *
     * @return {@link String}-El nombre de la universidad.
     */
    public String getUniversidad() {
        return universidad;
    }

    /**
     * Establece el nombre de la universidad donde se obtuvo el título.
     *
     * @param universidad {@link String}-El nombre de la universidad.
     */
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    /**
     * Obtiene la especialidad asociada al título.
     *
     * @return {@link Especialidad}-La especialidad asociada al título.
     */
    public Especialidad getEspecialidad() {
        return esp;
    }

    /**
     * Establece la especialidad asociada al título.
     *
     * @param especialidad {@link Especialidad}-La especialidad asociada al título.
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.esp = especialidad;
    }

    /**
     * Obtiene el médico al que pertenece el título.
     *
     * @return {@link Medico}-El médico al que pertenece el título.
     */
    public Medico getMedico() {
        return med;
    }

    /**
     * Establece el médico al que pertenece el título.
     *
     * @param medico {@link Medico}-El médico al que pertenece el título.
     */
    public void setMedico(Medico medico) {
        this.med = medico;
    }
    
    /**
     * Devuelve una representación en cadena de la instancia de la clase Titulo.
     * 
     * @return {@link String}-Una cadena que representa el nombre del titulo.
     */
    @Override
    public String toString() {
        return "Titulo{" +
                "fechaTitulo=" + fechaTitulo +
                ", universidad='" + universidad + '\'' +
                '}';
    }
}