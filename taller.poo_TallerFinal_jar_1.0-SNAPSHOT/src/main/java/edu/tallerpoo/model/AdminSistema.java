package edu.tallerpoo.model;
import java.util.Date;

public class AdminSistema extends Funcionario{
    public AdminSistema(String nombre, String apellido, Date fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
    }

    public AdminSistema() {
    // constructor por defecto
    }

    public void getInfoAdministrativa(){
    // metodo para consultar informacion administrativa
    }
}
