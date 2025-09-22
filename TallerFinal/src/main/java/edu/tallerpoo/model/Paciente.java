
package edu.tallerpoo.model;

import java.util.Date;
import java.util.ArrayList;
/**
 * La clase Paciente representa a un paciente en un centro de salud.
 * Hereda atributos y métodos de la clase Persona.
 */
public class Paciente extends Persona {
    private String nombrePersonaContacto; 
    private String domicilioPersonaContacto;
    private String celularPersonaContacto; 
    private ArrayList<HistoriaClinica> historiaclinica; 
    private ArrayList<Registro> registros; 
    /**
     * Crea una instancia de Paciente con información personal y de contacto.
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
     * @param nombrePersonaContacto {@link String}-El nombre de la persona de contacto del paciente.
     * @param domicilioPersonaContacto {@link String}-El domicilio de la persona de contacto del paciente.
     * @param celularPersonaContacto {@link String}-El número de celular de la persona de contacto del paciente.
     * @param sexo {@link tipoSexo}-El sexo del paciente.
     */
    public Paciente(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String nombrePersonaContacto, String domicilioPersonaContacto, String celularPersonaContacto, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, sexo);
        this.nombrePersonaContacto = nombrePersonaContacto;
        this.domicilioPersonaContacto = domicilioPersonaContacto;
        this.celularPersonaContacto = celularPersonaContacto;
        this.historiaclinica = new ArrayList<HistoriaClinica>();
        this.registros = new ArrayList<Registro>();
    }

    /**
     * Crea una instancia de Paciente sin asignar ningún valor. (Constructor por defecto)
     */
    public Paciente() {
        // Constructor por defecto
    }

    /**
     * Obtiene el nombre de la persona de contacto del paciente.
     *
     * @return {@link String}-El nombre de la persona de contacto.
     */
    public String getNombrePersonaContacto() {
        return nombrePersonaContacto;
    }

    /**
     * Establece el nombre de la persona de contacto del paciente.
     *
     * @param nombrePersonaContacto {@link String}-El nombre de la persona de contacto a asignar.
     */
    public void setNombrePersonaContacto(String nombrePersonaContacto) {
        this.nombrePersonaContacto = nombrePersonaContacto;
    }

    /**
     * Obtiene el domicilio de la persona de contacto del paciente.
     *
     * @return {@link String}-El domicilio de la persona de contacto.
     */
    public String getDomicilioPersonaContacto() {
        return domicilioPersonaContacto;
    }

    /**
     * Establece el domicilio de la persona de contacto del paciente.
     *
     * @param domicilioPersonaContacto {@link String}-El domicilio de la persona de contacto a asignar.
     */
    public void setDomicilioPersonaContacto(String domicilioPersonaContacto) {
        this.domicilioPersonaContacto = domicilioPersonaContacto;
    }

    /**
     * Obtiene el número de celular de la persona de contacto del paciente.
     *
     * @return {@link String}-El número de celular de la persona de contacto.
     */
    public String getCelularPersonaContacto() {
        return celularPersonaContacto;
    }

    /**
     * Establece el número de celular de la persona de contacto del paciente.
     *
     * @param celularPersonaContacto {@link String}-El número de celular de la persona de contacto a asignar.
     */
    public void setCelularPersonaContacto(String celularPersonaContacto) {
        this.celularPersonaContacto = celularPersonaContacto;
    }

    /**
     * Agrega una historia clínica al paciente.
     *
     * @param historiaclinica {@link HistoriaClinica}-La historia clínica a agregar.
     */
    public void agregarHistoriaClinca(HistoriaClinica historiaclinica) {
        this.historiaclinica.add(historiaclinica);
    }

    /**
     * Obtiene la lista de historias clínicas del paciente.
     *
     * @return {@link ArrayList}-La lista de historias clínicas del paciente.
     */
    public ArrayList<HistoriaClinica> getHistoriaClinica() {
        return this.historiaclinica;
    }

    /**
     * Agrega un registro médico al paciente.
     *
     * @param registro {@link Registro}-El registro médico a agregar.
     */
    public void agregarRegistro(Registro registro) {
        this.registros.add(registro);
    }

    /**
     * Obtiene la lista de registros médicos del paciente.
     *
     * @return {@link ArrayList}-La lista de registros médicos del paciente.
     */
    public ArrayList<Registro> getRegistros() {
        return this.registros;
    }
    
    /**
     * Devuelve una representación en cadena de la instancia de Paciente.
     *
     * @return {@link String}Una cadena que representa al Paciente.
     */
    @Override
    public String toString() {
        return "Paciente{ "+ super.toString() + "nombrePersonaContacto=" + nombrePersonaContacto + ", domicilioPersonaContacto=" + domicilioPersonaContacto + ", celularPersonaContacto=" + celularPersonaContacto + '}';
    }
    
}
