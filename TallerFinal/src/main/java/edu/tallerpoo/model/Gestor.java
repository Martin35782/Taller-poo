
package edu.tallerpoo.model;
import java.util.Date;
/**
 * La clase Gestor representa un miembro del personal administrativo que gestiona información médica y estadísticas.
 * Hereda atributos y métodos de la clase Administrativo.
 */
public class Gestor extends Administrativo {
    
    /**
     * Crea una instancia de Gestor con información personal y de usuario.
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
     * @param sector {@link Sector}-El sector al que pertenece el administrativo.
     * @param sexo {@link tipoSexo}-El sexo del administrador.
     */
    public Gestor(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, Sector sector, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol, sector, sexo);
    }

    /**
     * Crea una instancia de Gestor con atributos por defecto. (Constructor por defecto)
     */
    public Gestor() {
    }

    /**
     * Obtiene la cantidad de pacientes atendidos por un médico entre dos fechas.
     *
     * @param fecha1 {@link Date}-La fecha de inicio del período.
     * @param fecha2 {@link Date}-La fecha de fin del período.
     * 
     * @return {@link Integer}-La cantidad de pacientes atendidos por el médico.
     */
    public int getPacientesMedico(Date fecha1, Date fecha2) {
       
        return 0;
    }

    /**
     * Obtiene la cantidad de pacientes atendidos entre dos fechas y dos edades.
     *
     * @param fecha1{@link Date}-La fecha de inicio del período.
     * @param fecha2{@link Date}-La fecha de fin del período.
     * @param edad1 {@link Integer}-La edad mínima de los pacientes.
     * @param edad2 {@link Integer}-La edad máxima de los pacientes.
     * 
     * @return {@link int}-La cantidad de pacientes atendidos en ese rango de fechas y edades.
     */
    public int getPacientesAtendidos(Date fecha1, Date fecha2, int edad1, int edad2) {
        
        return 0;
    }

    /**
     * Obtiene información sobre los pacientes más recurrentes entre dos fechas.
     *
     * @param fecha1 {@link Date}-La fecha de inicio del período.
     * @param fecha2 {@link Date}-La fecha de fin del período.
     * 
     * @return {@link String}-Una cadena o una lista de objetos que representan a los pacientes más recurrentes.
     */
    public String getPacientesRecurrentes(Date fecha1, Date fecha2) {
        
        return "retornaría una cadena o una lista de objetos";
    }

    /**
     * Obtiene los datos del médico que atendió a más pacientes entre dos fechas.
     *
     * @param fecha1 {@link Date}-La fecha de inicio del período.
     * @param fecha2 {@link Date}-La fecha de fin del período.
     * 
     * @return {@link String}-Una cadena o la instancia del médico que atendió a más pacientes.
     */
    public String getMedicoMasPacientes(Date fecha1, Date fecha2) {
      
        return "retornaría una cadena o la instancia de Medico";
    }

    /**
     * Obtiene la cantidad de triajes realizados y la cantidad de cada color entre dos fechas.
     *
     * @param fecha1 {@link Date}-La fecha de inicio del período.
     * @param fecha2 {@link Date}-La fecha de fin del período.
     * 
     * @return {@link String}-Una cadena que contiene la información de los triajes realizados.
     */
    public String getTriagesRealizados(Date fecha1, Date fecha2) {
     
        return "retornaría una cadena concatenada con toda la información";
    }

    /**
     * Obtiene la cantidad de triajes cambiados, indicando quién realizó el cambio y los colores propuestos y asignados.
     *
     * @return {@link String}-Una cadena que contiene la información de los triajes cambiados.
     */
    public String getTriagesCambiados() {

        return "retornaría una cadena concatenada con la información";
    }
    
    /**
     * Devuelve una representación en cadena de la gestor.
     *
     * @return {@link String}-Una cadena que representa al gestor.
     */
    @Override
    public String toString() {
        return "Gestor{}";
    }
}
