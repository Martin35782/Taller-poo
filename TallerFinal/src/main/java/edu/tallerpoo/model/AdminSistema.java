package edu.tallerpoo.model;
import java.util.Date;


    /**
     * Esta clase representa a un Administrador del Sistema.
     * AdminSistema hereda atributos y metodos de la clase "Funcionario"
     */

public class AdminSistema extends Funcionario{
    
    /**
     * Constructor que inicializa un objeto AdminSistema con la información proporcionada.
     * @param nombre {@link nombre}-El nombre del administrador.
     * @param apellido {@link apellido}-El apellido del administrador.
     * @param fechaNac {@link fechaNac}-La fecha de nacimiento del administrador.
     * @param domicilio {@link domicilio}-El domicilio del administrador.
     * @param documento {@link documento}-El número de documento del administrador.
     * @param telFijo {@link telFijo}-El número de teléfono fijo del administrador.
     * @param celular {@link celular}-El número de teléfono celular del administrador.
     * @param estadoCivil {@link estadoCivil}-El estado civil del administrador.
     * @param email {@link email}-El correo electrónico del administrador.
     * @param usuario {@link usuario}-El nombre de usuario del administrador.
     * @param contrasena {@link contrasena}-La contraseña del administrador.
     * @param rol {@link rol}-El rol del administrador.
     * @param sexo {@link sexo}-El sexo del administrador.
     */

    public AdminSistema(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, tipoSexo sexo) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol, sexo);
    }
    
    /**
     * Constructor por defecto de AdminSistema.
     * Utiliza el de la clase persona.
     */
    public AdminSistema() {
    // constructor por defecto
    }
    
     /**
     * Método para consultar información administrativa.
     * Este método proporciona detalles administrativos sobre el objeto AdminSistema.
     */
    public void getInfoAdministrativa(){
    // método para consultar información administrativa
    }
    
    /**
     * Devuelve una representación en cadena de la instancia de AdminSistema.
     *
     * @return {@link String}Una cadena que representa al AdminSistema.
     */
    @Override
    public String toString() {
        return "AdminSistema{" + '}';
    }
    
    
}
