package edu.tallerpoo.model;
import java.util.Date;

/**
 * Esta clase representa a un Administrativo en el sistema.
 * Administrativo hereda atributos y metodos de la clase "Funcionario"
 */
public class Administrativo extends Funcionario{
    // Atributos adicionales para Administrativo
    private Sector sector;
    
     /**
     * Constructor que inicializa un objeto Administrativo con la información proporcionada.
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
    public Administrativo(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, Sector sector, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol, sexo);
        this.sector = sector;
    }

     /**
     * Constructor por defecto de Administrativo.
     * No toma parámetros y no realiza ninguna acción específica.
     */ 
    public Administrativo() {
        //Constructor por defecto
    }
    
    
    /**
     * Establece el sector al que pertenece el administrativo.
     * @param sector {@link Sector} El sector del administrativo.
     */
    public void setSector(Sector sector){
        this.sector = sector;
    }

    /**
     * Obtiene el sector al que pertenece el administrativo.
     * @return {@link Sector}-El sector del administrativo.
     */
    public Sector getSector(){
        return this.sector;
    }

    /**
     * Metodo toString() de la clase
     * @return {@link String}
     */
    @Override
    public String toString() {
        return "Administrativo{" +
                "sector=" + sector +
                '}';
    }

     
}
