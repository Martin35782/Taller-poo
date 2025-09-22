
package edu.tallerpoo.model;
import java.util.Date;
import java.util.ArrayList;
/**
 * La clase Medico representa a un profesional médico que trabaja en un centro de salud.
 * Hereda atributos y métodos de la clase Funcionario.
 */
public class Medico extends Funcionario{
    private ArrayList<Triage> triages; 
    private int matricula; 
    private ArrayList<Especialidad> especialidades; 
    private ArrayList<HistoriaClinica> historiaClinica; 
    private ArrayList<BoxAtencion> boxAtencion; 
    private ArrayList<Registro> registros; 
     /**
     * Crea una instancia de Medico con información personal y de usuario.
     *
     * @param nombre{@link String}-El nombre del médico.
     * @param apellido {@link String}-El apellido del médico.
     * @param fechaNac {@link Date}-La fecha de nacimiento del médico.
     * @param domicilio {@link String}-El domicilio del médico.
     * @param documento {@link Integer}-El número de documento del médico.
     * @param telFijo {@link String}-El número de teléfono fijo del médico.
     * @param celular {@link String}-El número de teléfono celular del médico.
     * @param estadoCivil {@link tipoEstCivil}-El estado civil del médico.
     * @param email {@link String}-El correo electrónico del médico.
     * @param usuario {@link String}-El nombre de usuario del médico.
     * @param contrasena {@link String}-La contraseña del médico.
     * @param rol {@link tipoRol}-El rol del médico en el sistema.
     * @param matricula {@link Integer}-La matrícula del médico.
     * @param sexo {@link tipoSexo}-El sexo del médico.
     */
    public Medico(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, int matricula, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol, sexo);
        this.matricula = matricula;
        this.especialidades = new ArrayList<Especialidad>();
        this.historiaClinica = new ArrayList<HistoriaClinica>();
        this.boxAtencion = new ArrayList<BoxAtencion>();
        this.registros = new ArrayList<Registro>();
        this.triages = new ArrayList<Triage>();
    }
    /**
     * Crea una instancia de Medico sin asignar ningún valor. (Constructor por defecto)
     */
    public Medico() {
        // constructor por defecto
    }

    public Medico(String medico) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Obtiene la matrícula del médico.
     *
     * @return {@link Integer}-La matrícula del médico.
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del médico.
     *
     * @param matricula {@link Integer}-La matrícula a asignar.
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Agrega una especialidad al médico.
     *
     * @param especialidad {@link Especialidad}-La especialidad a agregar.
     */
    public void agregarEspecialidad(Especialidad especialidad) {
        this.especialidades.add(especialidad);
    }

    /**
     * Obtiene la lista de especialidades del médico.
     *
     * @return {@link ArrayList}-La lista de especialidades del médico.
     */
    public ArrayList<Especialidad> getEspecialidades() {
        return this.especialidades;
    }

    /**
     * Agrega una historia clínica al médico.
     *
     * @param historiaclinica {@link HistoriaClinica}-La historia clínica a agregar.
     */
    public void agregarHistoriaClinica(HistoriaClinica historiaclinica) {
        this.historiaClinica.add(historiaclinica);
    }

    /**
     * Obtiene la lista de historias clínicas relacionadas con el médico.
     *
     * @return {@link ArrayList}-La lista de historias clínicas.
     */
    public ArrayList<HistoriaClinica> gethistoriaClinica() {
        return this.historiaClinica;
    }

    /**
     * Agrega un box de atención al médico.
     *
     * @param boxAtencion {@link BoxAtencion}-El box de atención a agregar.
     */
    public void agregarBoxAtencion(BoxAtencion boxAtencion) {
        this.boxAtencion.add(boxAtencion);
    }

    /**
     * Obtiene la lista de boxes de atención asignados al médico.
     *
     * @return {@link ArrayList}-La lista de boxes de atención.
     */
    public ArrayList<BoxAtencion> getBoxAtencion() {
        return this.boxAtencion;
    }

    /**
     * Agrega un registro médico al médico.
     *
     * @param registro {@link Registro}-El registro médico a agregar.
     */
    public void agregarRegistro(Registro registro) {
        this.registros.add(registro);
    }

    /**
     * Obtiene la lista de registros médicos relacionados con el médico.
     *
     * @return {@link ArrayList}-La lista de registros médicos.
     */
    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }

    /**
     * Agrega un triage realizado por el médico.
     *
     * @param triage El triage a agregar.
     */
    public void agregarTriage(Triage triage) {
        this.triages.add(triage);
    }

    /**
     * Obtiene la lista de triages realizados por el médico.
     *
     * @return La lista de triages.
     */
    public ArrayList<Triage> getMedicos() {
        return this.triages;
    }

    /**
     * Realiza un cambio de triage.
     */
    public void cambiarTriage() {
        // Método para cambiar el triage
    }

    /**
     * Realiza un triage.
     */
    public void realizarTriage() {
        // Es necesario este método?
    }

    /**
     * Asigna un box a un paciente.
     */
    public void asignarBoxPaciente() {
        // Es necesario este método?
    }

    /**
     * Obtiene la historia clínica de un paciente.
     */
    public void getHistoriaClinica() {
        // Método para consultar historia clínica de paciente
    }

    /**
     * Devuelve una representación en cadena de la instancia de Medico.
     *
     * @return {@link String}Una cadena que representa al médico.
     */
    @Override
    public String toString() {
        return "Medico{" +
                "matricula=" + matricula +
                '}';
    }
}
