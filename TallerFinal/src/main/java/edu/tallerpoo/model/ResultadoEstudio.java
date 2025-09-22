
package edu.tallerpoo.model;

import java.util.Date;
/**
 * La clase ResultadoEstudio representa los resultados de un estudio médico.
 */
public class ResultadoEstudio {
    private Date fecha; 
    private Date hora; 
    private String tipoDeEstudio; 
    private String informe; 
    private HistoriaClinica historiaclinica; 
    private int id;
    /**
     * Crea una instancia de ResultadoEstudio con información de fecha, hora, tipo de estudio, informe y la historia clínica relacionada.
     *
     * @param fecha {@link Date}-La fecha en que se obtuvieron los resultados del estudio.
     * @param hora {@link Date}-La hora en que se obtuvieron los resultados del estudio.
     * @param tipoDeEstudio {@link String}-El tipo de estudio médico.
     * @param informe {@link String}-El informe de los resultados del estudio.
     * @param historiaClinica {@link HistoriaClinica}-La historia clínica relacionada con los resultados del estudio.
     */
    public ResultadoEstudio(Date fecha, Date hora, String tipoDeEstudio, String informe, HistoriaClinica historiaClinica) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informe = informe;
        this.historiaclinica = historiaClinica;
    }

    /**
     * Crea una instancia de ResultadoEstudio con información de fecha, hora, tipo de estudio y informe.
     *
     * @param fecha {@link Date}-La fecha en que se obtuvieron los resultados del estudio.
     * @param hora {@link Date}-La hora en que se obtuvieron los resultados del estudio.
     * @param tipoDeEstudio {@link String}-El tipo de estudio médico.
     * @param informe {@link String}-El informe de los resultados del estudio.
     */
    public ResultadoEstudio(Date fecha, Date hora, String tipoDeEstudio, String informe) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informe = informe;
    }
    

    /**
     * Crea una instancia de ResultadoEstudio solo con el dato del ID
     * 
     * @param id {@link Integer}-ID del estudio medico
     */
    public ResultadoEstudio(int id) {
        this.id = id;
    }


    /**
     * Crea una instancia de ResultadoEstudio sin asignar ningún valor. (Constructor por defecto)
     */
    public ResultadoEstudio() {
        // Constructor por defecto
    }

    /**
     * Obtiene la ID del estudio
     * 
     * @return {@link Integer}-ID del estuido
     */
    public int getId() {
        return id;
    }

    /**
     * Establece la ID del estudio
     * 
     * @param id {@link Integer}-ID del estado
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Obtiene la fecha en que se obtuvieron los resultados del estudio.
     *
     * @return {@link Date}-La fecha de los resultados del estudio.
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en que se obtuvieron los resultados del estudio.
     *
     * @param fecha {@link Date}-La fecha a asignar.
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora en que se obtuvieron los resultados del estudio.
     *
     * @return {@link Date}-La hora de los resultados del estudio.
     */
    public Date getHora() {
        return hora;
    }

    /**
     * Establece la hora en que se obtuvieron los resultados del estudio.
     *
     * @param hora {@link Date}-La hora a asignar.
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el tipo de estudio médico.
     *
     * @return {@link String}-El tipo de estudio médico.
     */
    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    /**
     * Establece el tipo de estudio médico.
     *
     * @param tipoDeEstudio {@link String}-El tipo de estudio a asignar.
     */
    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    /**
     * Obtiene el informe de los resultados del estudio.
     *
     * @return {@link String}-El informe de los resultados del estudio.
     */
    public String getInforme() {
        return informe;
    }

    /**
     * Establece el informe de los resultados del estudio.
     *
     * @param informe {@link String}-El informe a asignar.
     */
    public void setInforme(String informe) {
        this.informe = informe;
    }

    /**
     * Establece la historia clínica relacionada con los resultados del estudio.
     *
     * @param historiaClinica {@link HistoriaClinica}-La historia clínica a asignar.
     */
    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaclinica = historiaClinica;
    }

    /**
     * Obtiene la historia clínica relacionada con los resultados del estudio.
     *
     * @return {@link HistoriaClinica}-La historia clínica relacionada con los resultados del estudio.
     */
    public HistoriaClinica getHistoriaclinica() {
        return this.historiaclinica;
    }
    
    /**
     * Devuelve una representación en cadena de este objeto ResultadoEstudio.
     *
     * @return {@link String}-Una cadena que incluye la fecha, hora, tipo de estudio y el informe de los resultados del estudio.
     */
    @Override
    public String toString() {
        return "ResultadoEstudio{" + "fecha=" + fecha + ", hora=" + hora + ", tipoDeEstudio=" + tipoDeEstudio + ", informe=" + informe + ", historiaclinica=" + historiaclinica + ", id=" + id + '}';
    }
    
 
}
