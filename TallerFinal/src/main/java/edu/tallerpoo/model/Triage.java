package edu.tallerpoo.model;
import java.util.Date;
import java.util.ArrayList;

/**
 * La clase Triage representa la evaluación inicial de pacientes en una sala de emergencias.
 * Se utiliza para determinar la gravedad de la condición del paciente y asignar un nivel de prioridad.
 */
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
    private String pulso;
    private String lesionesLeves;
    private String sangrado;
    private String signosShock;
    private String dolorAbdominal;
    private String vomitos;
    private String fiebre;
    private String dolorPecho;
    private String lesionesGraves;
    private String conciencia;
    private String estadoMental;
    private String edad;
    private String respiracion;

    /**
     * Crea una instancia de la clase Triage con información detallada de evaluación inicial del paciente.
     *
     * @param medicos         {@link Arraylist-Lista de medicos que participaron en el triage
     * @param registro        {@link Registro}-
     * @param nivelpropuesto  {@link Integer}-El nivel de prioridad propuesto.
     * @param color           {@link String}-El color asignado al paciente (indicando gravedad).
     * @param tiempoMax       {@link String}-El tiempo máximo para la atención del paciente.
     * @param puntaje         {@link Integer}-El puntaje asignado durante la evaluación.
     * @param fecha           {@link Date}-La fecha de la evaluación.
     * @param nivelCambio     {@link Integer}-Nivel al cual se cambio el triage
     * @param motivoCambio    {@link String}-El motivo de cambio de nivel de prioridad.
     * @param pulso           {@link String}-El pulso del paciente.
     * @param lesionesLeves   {@link String}-La cantidad de lesiones leves.
     * @param sangrado        {@link String}-La cantidad de sangrado.
     * @param signosShock     {@link String}-La presencia de signos de shock.
     * @param dolorAbdominal  {@link String}-La presencia de dolor abdominal.
     * @param vomitos         {@link String}-La presencia de vómitos.
     * @param fiebre          {@link String}-La presencia de fiebre.
     * @param dolorPecho      {@link String}-La presencia de dolor en el pecho.
     * @param lesionesGraves  {@link String}-La cantidad de lesiones graves.
     * @param conciencia      {@link String}-El nivel de conciencia del paciente.
     * @param estadoMental    {@link String}-El estado mental del paciente.
     * @param edad
     * @param respiracion
     */
    public Triage(ArrayList<Medico> medicos, Registro registro, int nivelpropuesto, String color, String tiempoMax, int puntaje, Date fecha, int nivelCambio, String motivoCambio, String pulso, String lesionesLeves, String sangrado, String signosShock, String dolorAbdominal, String vomitos, String fiebre, String dolorPecho, String lesionesGraves, String conciencia, String estadoMental,String edad,String respiracion) {   
        this.medicos = medicos;
        this.registro = registro;
        this.nivelpropuesto = nivelpropuesto;
        this.color = color;
        this.tiempoMax = tiempoMax;
        this.puntaje = puntaje;
        this.fecha = fecha;
        this.nivelCambio = nivelCambio;
        this.motivoCambio = motivoCambio;
        this.pulso = pulso;
        this.lesionesLeves = lesionesLeves;
        this.sangrado = sangrado;
        this.signosShock = signosShock;
        this.dolorAbdominal = dolorAbdominal;
        this.vomitos = vomitos;
        this.fiebre = fiebre;
        this.dolorPecho = dolorPecho;
        this.lesionesGraves = lesionesGraves;
        this.conciencia = conciencia;
        this.estadoMental = estadoMental;
        this.edad=edad;
        this.respiracion=respiracion;
        // constructor por defecto
    }

    /**
     * Crea una instancia de la clase Triage con valores predeterminados.
     * La mayoría de los campos se inicializan en 0 o null.
     */
    public Triage() {
    }

    /**
     * Agrega un médico a la lista de médicos que realizan la evaluación de triage.
     *
     * @param medico {@link Medico}-El médico que realiza la evaluación.
     */
    public void agregarMedicos(Medico medico) {
        this.medicos.add(medico);
    }

    /**
     * Obtiene la lista de médicos que participaron en la evaluación de triage.
     *
     * @return {@link ArrayList}-La lista de médicos involucrados en la evaluación.
     */
    public ArrayList<Medico> getMedicos() {
        return this.medicos;
    }

    /**
     * 
     * 
     * @return 
     */
    public Registro getRegistro() {
        return registro;
    }

    /**
     * 
     * @param registro 
     */
    public void setRegistro(Registro registro) {
        this.registro = registro;
    }
    
    /**
     * Establece el nivel propuesto para la prioridad del paciente durante la evaluación de triage.
     *
     * @return {@link Integer}-El nivel de prioridad propuesto.
     */
    public int getNivelpropuesto() {
        return nivelpropuesto;
    }
    
    /**
     * Obtiene el nivel propuesto para la prioridad del paciente durante la evaluación de triage.
     *
     * @param nivelpropuesto {@link Integer}-El nivel de prioridad propuesto.
     */
    public void setNivelpropuesto(int nivelpropuesto) {
        this.nivelpropuesto = nivelpropuesto;
    }
    

    /**
     * Obtiene el color de prioridad del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-Color del triage
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color de prioridad del paciente durante la evaluación de triage.
     * 
     * @param color {@link String}-Color del triage
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Obtiene el tiempo maximo que puede esperar un paciente para ser atendido
     * 
     * @return {@link String}-Tiempo maximo de espera
     */
    public String getTiempoMax() {
        return tiempoMax;
    }

    /**
     * Establece el tiempo maximo que puede esperar un paciente para ser atendido
     * 
     * @param tiempoMax {@link String}-Tiempo maximo de espera
     */
    public void setTiempoMax(String tiempoMax) {
        this.tiempoMax = tiempoMax;
    }

    /**
     * Obtiene el puntaje asignado al paciente durante la evaluacion de triage
     * 
     * @return {@link Integer}-Puntaje del paciente
     */
    public int getPuntaje() {
        return puntaje;
    }

    /**
     * Establece el puntaje asignado al paciente durante la evaluacion de triage
     * 
     * @param puntaje {@link Integer}-Puntaje del paciente
     */
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    /**
     * Obtiene la fecha en la cual se realizo la evaluacion del triage
     * 
     * @return {@link Date}-fecha de realizacion
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha en la cual se realizo la evaluacion del triage
     * 
     * @param fecha {@link Date}-fecha de realizacion
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Establece el nivel de cambio en la prioridad del paciente durante la evaluación de triage.
     *
     * @param nivel {@link Integer}-El nivel de cambio de prioridad.
     */
    public void setNivelCambio(int nivel){
        this. nivelCambio = nivel;
    }

    /**
     * Obtiene el nivel de cambio en la prioridad del paciente durante la evaluación de triage.
     *
     * @return {@link Integer}-El nivel de cambio de prioridad.
     */
    public int getNivelCambio(){
        return this.nivelCambio;
    }
    
    /**
     * Obtiene el motivo del cambio de prioridad del paciente durante la evaluación de triage.
     *
     * @return {@link String}-El motivo del cambio de prioridad.
     */
    public String getMotivoCambio() {
        return motivoCambio;
    }

    /**
     * Obtiene el motivo del cambio de prioridad del paciente durante la evaluación de triage.
     *
     * @return {@link String}-El motivo del cambio de prioridad.
     */
    /**
     * Establece el motivo del cambio de prioridad del paciente durante la evaluación de triage.
     *
     * @param motivoCambio {@link String}-El motivo del cambio de prioridad.
     */
    public void setMotivoCambio(String motivoCambio) {
        this.motivoCambio = motivoCambio;
    }

    /**
     * Obtiene el nivel de pulso del paciente durante la evaluación de triage.
     *
     * @return {@link String}-El nivel de pulso del paciente
     */
    public String getPulso() {
        return pulso;
    }

    /**
     * Establece el nivel de pulso del paciente durante la evaluación de triage.
     *
     * @param pulso {@link String}-El nivel de pulso del paciente.
     */
    public void setPulso(String pulso) {
        this.pulso = pulso;
    }

    /**
     * Obtiene el nivel de las lesiones leves del paciente durante la evaluación de triage.
     *
     * @return {@link String}-nivel de pulso del paciente
     */
    public String getLesionesLeves() {
        return lesionesLeves;
    }

    /**
     * Establece el nivel de las lesiones leves del paciente durante la evaluación de triage.
     * 
     * @param lesionesLeves {@link String}-nivel de las lesiones leves del paciente
     */
    public void setLesionesLeves(String  lesionesLeves) {
        this.lesionesLeves = lesionesLeves;
    }

    /**
     * Obtiene el nivel de sangrado del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de sangrado del paciente
     */
    public String getSangrado() {
        return sangrado;
    }

    /**
     * Establece el nivel de sangrado del paciente durante la evaluación de triage.
     * 
     * @param sangrado {@link String}-nivel de sangrado del paciente
     */
    public void setSangrado(String sangrado) {
        this.sangrado = sangrado;
    }

    /**
     * Obtiene el nivel de shock del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de shock del paciente
     */
    public String getSignosShock() {
        return signosShock;
    }

    /**
     * Establece el nivel de shock del paciente durante la evaluación de triage.
     * 
     * @param signosShock {@link String}-nivel de shock del paciente
     */
    public void setSignosShock(String signosShock) {
        this.signosShock = signosShock;
    }

    /**
     * Obtiene el nivel de dolor abdominal del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de dolor abdominal del paciente
     */
    public String  getDolorAbdominal() {
        return dolorAbdominal;
    }

    /**
     * Establece el nivel de dolor abdominal del paciente durante la evaluación de triage.
     * 
     * @param dolorAdominal {@link String}-nivel de dolor abdominal del paciente
     */
    public void setDolorAbdominal(String dolorAdominal) {
        this.dolorAbdominal = dolorAdominal;
    }

    /**
     * Obtiene el nivel de vomitos del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de vomitos del paciente
     */
    public String getVomitos() {
        return vomitos;
    }

    /**
     * Establece el nivel vomitos del paciente durante la evaluación de triage.
     * 
     * @param vomitos {@link String}-nivel de vomitos del paciente
     */
    public void setVomitos(String vomitos) {
        this.vomitos = vomitos;
    }

    /**
     * Obtiene el nivel de fiebre del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de fiebre del paciente
     */
    public String getFiebre() {
        return fiebre;
    }

    /**
     * Establece el de nivel fiebre del paciente durante la evaluación de triage.
     * 
     * @param fiebre {@link String}-nivel de fiebre del paciente
     */
    public void setFiebre(String fiebre) {
        this.fiebre = fiebre;
    }

    /**
     * Obtiene el nivel de dolor de pecho del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de dolor de pecho del paciente
     */
    public String getDolorPecho() {
        return dolorPecho;
    }

    /**
     * Establece el nivel de dolor de pecho del paciente durante la evaluación de triage.
     * 
     * @param dolorPecho {@link String}-nivel de dolor de pecho del paciente
     */
    public void setDolorPecho(String dolorPecho) {
        this.dolorPecho = dolorPecho;
    }

    /**
     * Obtiene el nivel de lesiones graves del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de lesiones graves del paciente
     */
    public String getLesionesGraves() {
        return lesionesGraves;
    }

    /**
     * Establece el nivel de lesiones graves del paciente durante la evaluación de triage.
     * 
     * @param lesionesGraves {@link String}-nivel de lesiones graves del paciente 
     */
    public void setLesionesGraves(String lesionesGraves) {
        this.lesionesGraves = lesionesGraves;
    }

    /**
     * Obtiene el nivel de conciencia del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de conciencia del paciente
     */
    public String getConciencia() {
        return conciencia;
    }

    /**
     * Establece el nivel conciencia del paciente durante la evaluación de triage.
     * 
     * @param conciencia {@link String}-nivel de conciencia del paciente
     */
    public void setConciencia(String conciencia) {
        this.conciencia = conciencia;
    }

    /**
     * Obtiene el nivel de estado mental del paciente durante la evaluación de triage.
     * 
     * @return {@link String}-nivel de estado mental del paciente
     */
    public String getEstadoMental() {
        return estadoMental;
    }

    /**
     * Establece el nivel de estado mental del paciente durante la evaluación de triage.
     * 
     * @param estadoMental {@link String}-nivel de estado mental del paciente
     */
    public void setEstadoMental(String estadoMental) {
        this.estadoMental = estadoMental;
    }

    /**
     * Obtiene el nivel de edad del paciente durante la evaluación de triage.
     * 
     * @return  {@link String}-nivel de estado mental del paciente
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Establece el nivel de edad del paciente durante la evaluación de triage.
     * 
     * @param edad {@link String}-nivel de edad del paciente
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el nivel de respiracion paciente durante la evaluación de triage.
     * 
     * @return 
     */
    public String getRespiracion() {
        return respiracion;
    }

    /**
     * Establece el nivel de respiracion del paciente durante la evaluación de triage.
     * 
     * @param respiracion 
     */
    public void setRespiracion(String respiracion) {
        this.respiracion = respiracion;
    }

    /**
     * Devuelve una representación en cadena de la instancia de la clase triage.
     * 
     * @return {@link String}-Cadena con los datos de triage.
     */
    @Override
    public String toString() {
        return "Triage{" + "medicos=" + medicos + ", registro=" + registro + ", nivelpropuesto=" + nivelpropuesto + ", color=" + color + ", tiempoMax=" + tiempoMax + ", puntaje=" + puntaje + ", fecha=" + fecha + ", nivelCambio=" + nivelCambio + ", motivoCambio=" + motivoCambio + ", pulso=" + pulso + ", lesionesLeves=" + lesionesLeves + ", sangrado=" + sangrado + ", signosShock=" + signosShock + ", dolorAbdominal=" + dolorAbdominal + ", vomitos=" + vomitos + ", fiebre=" + fiebre + ", dolorPecho=" + dolorPecho + ", lesionesGraves=" + lesionesGraves + ", conciencia=" + conciencia + ", estadoMental=" + estadoMental + ", edad=" + edad + ", respiracion=" + respiracion + '}';
    }
  
  
}
