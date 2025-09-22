package edu.tallerpoo.model;
import java.util.Date;


/**
 * Esta clase representa a un Funcionario en el sistema.
 * Un Funcionario es una herencia de la clase Persona con información adicional como usuario, contraseña y rol.
 */
public class Funcionario extends Persona{
    private String usuario;
    private String contrasena;
    private tipoRol rol;
 
    /**
     * Constructor que inicializa un objeto Funcionario con la información proporcionada.
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
    public Funcionario(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, sexo);
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    /**
     * Constructor por defecto de Funcionario.
     * Utiliza el de la clase "Persona"
     */    
    public Funcionario() {
        //Constructor por defecto
    }

    /**
     * Obtiene el nombre de usuario del funcionario.
     * 
     * @return {@link String}-El nombre de usuario del funcionario.
     */    
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * Establece el nombre de usuario del funcionario.
     * 
     * @param usuario {@link String}- El nombre de usuario a establecer.
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene la contraseña del funcionario.
     * 
     * @return {@link Strign}- La contraseña del funcionario.
     */    
    public String getContrasena() {
        return contrasena;
    }

     /**
     * Establece la contraseña del funcionario.
     * 
     * @param contrasena {@link String}-La contraseña a establecer.
     */
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    /**
     * Obtiene el rol del funcionario.
     * 
     * @return {@link tipoRol}-El rol del funcionario.
     */    
    public tipoRol getRol() {
        return rol;
    }
    
    /**
     * Establece el rol del funcionario.
     * @param rol {@link tipoRol}-El rol a establecer.
     */
    public void setRol(tipoRol rol) {
        this.rol = rol;
    }
   
    /**
     * Devuelve una representación en cadena de un funcionario.
     *
     * @return {@link Strign}-Una cadena que representa el funcionario.
     */
    @Override
    public String toString() {
        return  "Funcionario{" +
                "usuario='" + usuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", rol=" + rol +
                '}';
    }

     
}
