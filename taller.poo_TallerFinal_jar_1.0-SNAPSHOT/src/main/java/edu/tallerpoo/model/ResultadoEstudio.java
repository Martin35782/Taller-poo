package edu.tallerpoo.model;
import java.util.Date;

public class ResultadoEstudio {
    private Date fecha;
    private Date hora;
    private String tipoDeEstudio;
    private String informe;
    private HistoriaClinica historiaclinica;

    public ResultadoEstudio(Date fecha, Date hora,  String tipoDeEstudio, String informe, HistoriaClinica historiaClinica) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informe = informe;
        this.historiaclinica = historiaClinica;
    }
  
    public ResultadoEstudio(Date fecha, Date hora,  String tipoDeEstudio, String informe) {
        this.fecha = fecha;
        this.hora = hora;
        this.tipoDeEstudio = tipoDeEstudio;
        this.informe = informe;
    }

    public ResultadoEstudio(){

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

    public String getTipoDeEstudio() {
        return tipoDeEstudio;
    }

    public void setTipoDeEstudio(String tipoDeEstudio) {
        this.tipoDeEstudio = tipoDeEstudio;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica){
        this.historiaclinica = historiaClinica;
    }

    public HistoriaClinica getHistoriaclinica(){
        return this.historiaclinica;
    }

   /*@Override
    public String toString() {
        return "ResultadoEstudio{" +
                "fecha=" + fecha +
                ", hora=" + hora +

                ", tipoDeEstudio='" + tipoDeEstudio + '\'' +
                ", informe='" + informe + '\'' +
                '}';
    }

    */
}
