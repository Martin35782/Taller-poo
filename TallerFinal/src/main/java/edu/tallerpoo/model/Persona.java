
package edu.tallerpoo.model;

import java.util.Date;
/**
 * La clase Persona representa a una persona en el sistema.
 */
public class Persona {
    private String nombre; 
    private String apellido; 
    private Date fechaNac; 
    private String domicilio; 
    private int documento; 
    private String telFijo;
    private String celular;
    private tipoEstCivil estadoCivil; 
    private String email; 
    private tipoSexo sexo; 

    /**
     * Crea una instancia de Persona con información personal.
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
     * @param sexo {@link tipoSexo}-El sexo del paciente.
     */
    public Persona(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, tipoSexo sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.domicilio = domicilio;
        this.documento = documento;
        this.telFijo = telFijo;
        this.celular = celular;
        this.estadoCivil = estadoCivil;
        this.email = email;
        this.sexo = sexo;
    }

    /**
     * Crea una instancia de Persona sin asignar ningún valor. (Constructor por defecto)
     */
    public Persona() {
        // Constructor por defecto
    }

    /**
     * Obtiene el sexo de la persona.
     *
     * @return {@link tipoSexo}-El sexo de la persona.
     */
    public tipoSexo getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo de la persona.
     *
     * @param sexo {@link tipoSexo}-El sexo de la persona a asignar.
     */
    public void setSexo(tipoSexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return {@link String}-El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre {@link String}-El nombre de la persona a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return {@link String}-El apellido de la persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido {@link String}-El apellido de la persona a asignar.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     *
     * @return {@link Date}-La fecha de nacimiento de la persona.
     */
    public Date getFechaNac() {
        return fechaNac;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param fechaNac {@link Date}-La fecha de nacimiento de la persona a asignar.
     */
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    /**
     * Obtiene el domicilio de la persona.
     *
     * @return {@link String}-El domicilio de la persona.
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio de la persona.
     *
     * @param domicilio {@link String}-El domicilio de la persona a asignar.
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Obtiene el número de documento de la persona.
     *
     * @return {@link Integer}-El número de documento de la persona.
     */
    public int getDocumento() {
        return documento;
    }

    /**
     * Establece el número de documento de la persona.
     *
     * @param documento {@link Integer}-El número de documento de la persona a asignar.
     */
    public void setDocumento(int documento) {
        this.documento = documento;
    }

    /**
     * Obtiene el número de teléfono fijo de la persona.
     *
     * @return {@link String}-El número de teléfono fijo de la persona.
     */
    public String getTelFijo() {
        return telFijo;
    }

    /**
     * Establece el número de teléfono fijo de la persona.
     *
     * @param telFijo {@link String}-El número de teléfono fijo de la persona a asignar.
     */
    public void setTelFijo(String telFijo) {
        this.telFijo = telFijo;
    }

    /**
     * Obtiene el número de teléfono celular de la persona.
     *
     * @return {@link String}-El número de teléfono celular de la persona.
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Establece el número de teléfono celular de la persona.
     *
     * @param celular {@link String}-El número de teléfono celular de la persona a asignar.
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * Obtiene el estado civil de la persona.
     *
     * @return {@link tipoEstCivil}-El estado civil de la persona.
     */
    public tipoEstCivil getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Establece el estado civil de la persona.
     *
     * @param estadoCivil {@link tipoEstCivil}-El estado civil de la persona a asignar.
     */
    public void setEstadoCivil(tipoEstCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * Obtiene el correo electrónico de la persona.
     *
     * @return {@link String}-El correo electrónico de la persona.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico de la persona.
     *
     * @param email {@link String}-El correo electrónico de la persona a asignar.
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Devuelve una representación en cadena de la instancia de Persona.
     *
     * @return {@link String}-Una cadena que representa los atributos de la persona.
     */
    
    @Override
    public String toString() {
        return  "nombre=" + nombre + ", apellido=" + apellido + ", fechaNac=" + fechaNac + ", domicilio=" + domicilio + ", documento=" + documento + ", telFijo=" + telFijo + ", celular=" + celular + ", estadoCivil=" + estadoCivil + ", email=" + email + ", sexo=" + sexo + '}';
    }
}
