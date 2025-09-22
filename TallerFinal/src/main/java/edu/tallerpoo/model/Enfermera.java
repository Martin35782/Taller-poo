
package edu.tallerpoo.model;
import java.util.Date;
/**
 * La clase Enfermera representa a un miembro del personal de enfermería en un entorno de atención médica.
 * Hereda atributos y métodos de la clase Funcionario.
 */
public class Enfermera extends Funcionario {
    private Triage triage;
    private BoxAtencion boxAtencion; 

    /**
     * Crea una instancia de Enfermera con información personal y de usuario.
     *
     * @param nombre {@link String}-El nombre del administrador.
     * @param apellido {@link String}-El apellido del administrador.
     * @param fechaNac {@link Date}-La fecha de nacimiento del administrador.
     * @param domicilio {@link String}-El domicilio del administrador.
     * @param documento {@link Integer}-El número de documento del administrador.
     * @param telFijo {@link String}-El número de teléfono fijo del administrador.
     * @param celular {@link String}-El número de teléfono celular del administrador.
     * @param estadoCivil {@link tipoEstCivil}-El estado civil del administrador.
     * @param email {@link String}-El correo electrónico del administrador.
     * @param usuario {@link String}-El nombre de usuario del administrador.
     * @param contrasena {@link String}-La contraseña del administrador.
     * @param rol {@link tipoRol}-El rol del administrador.
     * @param sexo {@link tipoSexo}-El sexo del administrador.
     */
    public Enfermera(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol, sexo);
    }

    /**
     * Crea una instancia de Enfermera con atributos por defecto. (Constructor por defecto)
     */
    public Enfermera() {
    }

    /**
     * Cambia el triage asignado a esta enfermera.
     */
    public void cambiarTriage() {
        // Método para cambiar el triage
    }

    /**
     * Asigna un box de atención a un paciente.
     */
    public void asignarBoxPaciente() {
        // Método para asignar un box a un paciente
    }

    /**
     * Establece el triage asignado a esta enfermera.
     *
     * @param triage {@link Triage}-El triage a asignar.
     */
    public void setTriage(Triage triage) {
        this.triage = triage;
    }

    /**
     * Obtiene el triage asignado a esta enfermera.
     *
     * @return {@link Triage}- El triage asignado a esta enfermera.
     */
    public Triage getTriage() {
        return this.triage;
    }

    /**
     * Devuelve una representación en cadena de la enfermera.
     *
     * @return {@link String}-Una cadena que representa la enfermera.
     */
    @Override
    public String toString() {
        return "Enfermera{" + '}';
    }
}


